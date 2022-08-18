//Q.3 Write a Java program that accepts two integers from the user and then 
//prints the sum, the difference, the product, the average, the distance (the 
//difference between integer), the maximum (the larger of the two integers), the 
//minimum (smaller of the two integers).




package testprogram;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("sum of two number is:"+(a+b));
		System.out.println("differnce of two numbers;"+(a-b));
		System.out.println("product of two numbers:"+(a*b));
		System.out.println("Average of two numbers:"+(a+b)/2);
		
		
		if(a>b) 
		{
			System.out.println("large number is:"+a);
		}
		else if(a<b)
		{
			System.out.println("large number is:"+b);
		}
	    
		
		if(a<b) 
		{
			System.out.println("small number is:"+a);
		}
		else if(a>b)
		{
			System.out.println("small number is:"+b);
		
		}
	}
}

