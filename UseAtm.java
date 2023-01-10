package day9Functionn;

public class UseAtm {
	public static void main(String[]args) {
		Atm atm=new Atm();
		atm.bankname="Canara";
		atm.depositAmount=20000;
		atm.mainBalance=250000;
		
		Atm atm1=new Atm();
		atm1.bankname="Sbi";
		atm1.depositAmount=24000;
		atm1.mainBalance=280000;
		System.out.println(atm.findCredit(atm.mainBalance,atm.depositAmount));
		System.out.println(atm1.findDebit(atm1.mainBalance,atm1.depositAmount));
		System.out.println(atm1.findCredit(atm1.mainBalance,atm1.depositAmount));
		System.out.println(atm.findDebit(atm.mainBalance,atm.depositAmount));
		
		
		
	}

}
class Atm {
	String bankname;
	int mainBalance;
	int depositAmount;
	public int findCredit(int mainBalance,int depositAmount) {
		return mainBalance+depositAmount;
	}
	public int findDebit(int mainBalance,int depositAmount) {
		return mainBalance-depositAmount;
}
}
