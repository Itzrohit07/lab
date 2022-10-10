//Q.3 we need to print the elements of the array which are present in odd positions. This can 
//be accomplished by looping through the array and printing the elements of an array by 
//incrementing i by 2 till the end of the array is reached.
package testprogram;

import java.util.Scanner;

public class FindOodInArray {

	public static void main(String[] args) {
		System.out.println("enter the element");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
	
  int[]arr=new int[a];
  System.out.println("enter the element");
  for(int i=0;i<arr.length;i++){
	   arr[i]=sc.nextInt();
	  
  }
  System.out.println("the odd numbers are ");
  for(int i=0;i<arr.length;i=i+2){
	  System.out.println(arr[i]);
  }

}
	}

