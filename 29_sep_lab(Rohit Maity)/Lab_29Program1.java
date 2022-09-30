//1.write a java method to check whether every digit of a given integer is even. return true if every digit is odd otherwise false?
package testprogram;
import java.util.*;
public class Lab_29Program1 {

	 public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input an integer:");
	        int a = in.nextInt();
	        System.out.print("Check the given integer is even or not!\n");
	        System.out.print(temp(a));
	        }
	  public static boolean temp(int a){
	    final int f = 10;
	    if (a == 0){
	        return false;
	    }
	    while(a != 0){
	        if((a % f) % 2 != 0){
	            return false;
	        }
	        a /= 10;
	    }
	     return true;
	   }
	}

