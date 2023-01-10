package day9Functionn;

public class UseCollege {
	public static void main(String[] args) {
		College college1 = new College();
		college1.name = "CIET";
		college1.fees = 2140000;
		college1.grade = 'B';

		College college2 = new College();
		college2.name = "CIT";
		college2.fees = 2550000;
		college2.grade = 'A';

		College college3 = new College();
		college3.name = "Siet";
		college3.fees = 2990000;
		college3.grade = 'C';

		College[] college = { college1, college2, college3 };
		college2.findMaxFeesCollege(college);
		college1.findMiniFeesCollege(college);
	}

}

class College {
	String name;
	int fees;
	char grade;
	String location;
	String place;
	int age;

	public void findMaxFeesCollege(College[] a) {
		int max = a[0].fees;
		String temp1 = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i].fees >= max) {
				max = a[i].fees;
				temp1 = a[i].name;
			}
		}
		System.out.println(temp1);
	}

	public void findMiniFeesCollege(College[] b) {
		int min = b[0].fees;
		String temp = "";
		for (int i = 0; i < b.length; i++) {
			if (b[i].fees <= min) {
				min = b[i].fees;
				temp = b[i].name;
			}
		}
		System.out.println(temp);
	}
}
