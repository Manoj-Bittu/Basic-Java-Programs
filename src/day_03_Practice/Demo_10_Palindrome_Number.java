package day_03_Practice;

import java.util.Scanner;

public class Demo_10_Palindrome_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		int orgNum=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		if(orgNum==rev)
		{
			System.out.println("Given Number is Palindrome ");
		}
		else
		{
			System.out.println("Given Number is Not Palindrome ");
		}

	}

}
