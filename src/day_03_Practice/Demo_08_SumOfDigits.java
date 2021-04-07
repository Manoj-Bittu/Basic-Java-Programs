package day_03_Practice;

import java.util.Scanner;

public class Demo_08_SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int num = sc.nextInt();
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
			
		}
		
		System.out.println(sum);

	}

}
