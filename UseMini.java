package day9Functionn;

public class UseMini {
	public static void main(String[]args) {
		Mini minim=new Mini();
		int[] a= {25,54,89,58};
		minim.findmini(a);
		}
	}
	


 class Mini {
	public void findmini(int[]a) {
		int mini=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]<=mini) {
			mini=a[i];
			
		}
	}
	System.out.println(mini+": is High");
}
 }
