//Q.1 Write a Java program to find the value of specified expression. 
//a) (101 + 0) / 3
//b) 3.0e-6 * 10000000.1
//c) true && true
//d) false && true
//e) (false && false) || (true && true)
//f) (false || false) && (true && true)

package testprogram;

import java.util.Scanner;


public class Example1 {
	public static void main(String[]args) {
		int a1=30,a2=20,a=(a1+a2)/5;
		float b=70.3f,c=101.5f;
		boolean c1=true , c2=true;
		boolean c3=false , c4=true;
		boolean d1=false , d2=false , d3=true , d4=true;
		boolean e1=false , e2=false , e3=true , e4=true;
		
		System.out.println(a);
		System.out.println(b*c);
		System.out.println(c1&&c2);
		System.out.println(c3&&c4);
		System.out.println(d1&&d2 || d3&&d4);
		System.out.println(e1&&e2 || e3&e4);
	}
}

	


