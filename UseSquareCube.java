package day9Functionn;

public class UseSquareCube {
	public static void main(String[]args) {
		SquareCube squarecube=new SquareCube();
		System.out.println(squarecube.findSquare(5));
		System.out.println(squarecube.findCube(8));
	}

}
class SquareCube {
	public int findSquare(int a) {
		return a*a;
	}
	public int findCube(int a) {
		return a*a*a;
		
	}
	

}
	
