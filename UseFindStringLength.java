package day9Functionn;

public class UseFindStringLength {
	public static void main(String[]args) {
		FindStringLength stringlength=new FindStringLength();
		String[] a= {"RAM","raja","samew"};
		stringlength.findmax(a);
		}
	}
	


class FindStringLength {
	public void findmax(String []a) {
		int max=a[1].length();
		String name=" ";
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>=max) {
			max=a[i].length();
			name=a[i];
		}
		}
	System.out.println(max+name);
}
}


