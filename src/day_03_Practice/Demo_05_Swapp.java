package day_03_Practice;

import java.util.Scanner;

public class Demo_05_Swapp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number :");
		int num1=sc.nextInt();
		System.out.print("Enter Second Number :");
		int num2=sc.nextInt();
		System.out.println("Before Swapping :"+num1+ " " +num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping :"+num1+ " " +num2);
		
	}

}
