package basics;

import java.util.Scanner;

public class Fibonacci {

	public void fibo(int n) {
		int num1=0,num2=1,sum;
		System.out.print(num1+" "+num2+" ");
		for(int i=2;i<n;i++) {
			sum=num1+num2;
			if(sum>n) {
				break;
			}
			System.out.print(sum+" ");
			num1=num2;
			num2=sum;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Input N:");
		int num=scan.nextInt();
		Fibonacci f=new Fibonacci();
		f.fibo(num);
	}

}
