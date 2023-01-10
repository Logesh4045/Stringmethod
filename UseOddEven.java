package day9Functionn;

public class UseOddEven {
	public static void main(String[]args) {
		OddEven oddeven=new OddEven() ;
			System.out.println(oddeven.findOddEven(8));
		}
	}


class OddEven {
	public String findOddEven(int a) {
		if(a%2==0) {
	return "even";
		}
		else {
			return "Odd";
		}
}
}
