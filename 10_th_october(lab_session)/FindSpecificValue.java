//Q.1 Write a Java program to test if an array contains a specific value.
package testprogram;
import java.util.*;
public class FindSpecificValue {
    public static boolean specific(int []arr,int car) {
    	for(int c:arr) {
    		if(car==c) {
    			return true;
    		}
    	}
    	return false;
    }
    	
    
	public static void main(String[] args) {
		System.out.println("enter a specific number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[]arr1= {2002,3003,2017,4032,7016};
		System.out.println(specific(arr1,a));

	}

}
