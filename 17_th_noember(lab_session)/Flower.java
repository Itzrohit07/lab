//Q.6 Write a Java program to replace an element in a linked list.
package TestProgram;
import java.util.LinkedList;
public class Flower {//create a class

	public static void main(String[] args) {//main method created
		 LinkedList<String> A = new LinkedList<String>();
	      A.add("Lotus");
	      A.add("Tulip");
	      A.add("Rose");
	      A.add("Marry Gold");
	      A.add("Lily");
	      System.out.println("The LinkedList is: " + A);
	      A.set(2, "Jasmin");
	      System.out.println("The LinkedList is: " + A);
	   }
	}

	
