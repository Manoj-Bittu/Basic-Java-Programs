package day_03_Practice;

import java.util.Scanner;

public class Demo_06_Fibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Count :");
		int count = sc.nextInt();
		int num1=0,num2=1,num3;
		System.out.print(num1+" "+num2);
		for (int i = 2; i <= count; i++) {
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}

	}

}
