package day_03_Practice;

import java.util.Scanner;

public class Demo_09_StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String st=sc.next();
		String rev="";
		char arr[]=st.toCharArray();
		for(int i=st.length()-1;i>=0;i--)
		{
			rev=rev+arr[i];
		}
		System.out.println(rev);
		}

}
