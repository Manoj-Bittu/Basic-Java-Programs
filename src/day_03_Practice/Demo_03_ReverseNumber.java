package day_03_Practice;

import java.util.Scanner;

public class Demo_03_ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int num = sc.nextInt();
		int rev=0;
		while(num>0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println("Reverse of Number is :" +rev);
		
	}

}
