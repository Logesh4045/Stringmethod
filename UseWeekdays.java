package day9Functionn;

public class UseWeekdays {
	public static void main(String[]args) {
		Weekdays weekdays=new Weekdays();
		weekdays.finday(2);
		
	}

}
class Weekdays {
	public void finday(int day) {
		switch(day) {
		case 1: System.out.println("Saturday");break;
		case 2: System.out.println("Sunday");break;
		case 3: System.out.println("Monday");break;
		case 4: System.out.println("Tuesday");break;
		case 5: System.out.println("Wednesday");break;
		case 6: System.out.println("Thursday");break;
		case 7: System.out.println("Friday");break;
		}
	}
}
