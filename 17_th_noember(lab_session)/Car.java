//Q.5 Write a Java program to insert the specified element at the front of a linked list.
package TestProgram;
import java.util.LinkedList;
public class Car {//create a class

	public static void main(String[] args) {//main method create
			  
			     LinkedList<String> A_list = new LinkedList<String>();
			 //add element in array  
			          A_list.add("BMW");
			          A_list.add("Lamborgini");
			          A_list.add("Jaquer");
			     System.out.println("Original linked list:" + A_list);    
			 
			     A_list.offerFirst("BMW");
			     System.out.println("BMW is the best");
			     System.out.println("Best linked list:" + A_list);  
			 }	
				
	}


