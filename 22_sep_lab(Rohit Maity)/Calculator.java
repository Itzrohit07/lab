package testprogram;

import java.util.Scanner;

public class Calculator {
       int s1=0;
       int s2=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		  int s1=sc.nextInt();
		 System.out.println("enter second number");
		  int s2=sc.nextInt();
		 
	System.out.println("sum of addition is:"+addition(s1,s2));
	System.out.println("substraction is:"+substraction(s1,s2));
	System.out.println("multiplication is:"+multiplication(s1,s2));
	} 
		 public static int addition(int s1,int s2) {
			 return s1+s2;
		 }
		 public static int substraction(int s1,int s2) {
			 return s1-s2;
		 }
		 public static int multiplication(int s1,int s2) {
			 return s1*s2;
		 }
		 
	}
	

