package basics;

import java.util.Scanner;

public class Factorial {

	public int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("N = ");
		int num=scan.nextInt();
		Factorial f=new Factorial();
		System.out.println(num+"! = "+f.fact(num));
		
	}

}
