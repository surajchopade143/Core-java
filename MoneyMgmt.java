package basics;

import java.util.Scanner;

public class MoneyMgmt {
	
	private float salary;
	
	public void Calculate(float salary) {
		System.out.println("NEC: "+ salary*55/100 + "\t LTSS: "+salary*10/100);
		System.out.println("FFA: "+ salary*10/100 + "\t PLAY: "+salary*10/100);
		System.out.println("EDU: "+ salary*55/100 + "\t GIVE: "+salary*5/100);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your income this month:");
		float f=scan.nextFloat();
		MoneyMgmt m=new MoneyMgmt();
		m.Calculate(f);
	}

}
