package day9Functionn;

public class UseFindMaximum {
	public static void main(String[]args) {
		FindMaximum findmaximum=new FindMaximum();
		findmaximum.findMax(8, 4, 2);
		
	}

}
class FindMaximum {
	public void findMax(int a,int b,int c) {
		if(a>b&&a>c) {
			System.out.println(a+" is max");
		}
		else if(b>a&&b>c){
		System.out.println(b +"is max");
	}
		else {
			System.out.println(c+"is max");
		}
}
}
