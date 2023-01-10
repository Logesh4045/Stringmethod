package day9Functionn;

public class StudentMarks {
	public static void main(String[]args) {
		
		Student student=new Student();
		System.out.println(student.avg());

	}
}
	
	
	
class Student {
	public int avg() {
		int tamil=95;
		int english=58;
		int maths=69;
		int science=75;
		int social=95;
		return (tamil+english+maths+science+social)/5;
	}
}
