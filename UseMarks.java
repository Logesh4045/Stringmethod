package day9Functionn;

public class UseMarks {
	public static void main(String[] args) {

		Marks marks=new Marks();
		marks.displayMark(85,48,58);
		marks.findTotal(58,95,84);

	}
		
	
		
	
	
}




class Marks {
	public void displayMark(int tam,int eng,int mat) {
		System.out.println(tam+eng+mat);
	}
	public void findTotal(int tam,int eng,int mat) {
		System.out.println(tam+eng+mat);
	}
	

}
