//Write a Java program to find common elements from three
//sorted (in non-decreasing order) arrays.
package testprogram;
import java.util.*;
public class Lab_29_Program5 {

	public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60,70};
	int b[]= {90,40,80,20,60,40,20};
	int c[]= {70,30,10,90,50,80,40};
	int i=0;
	int j=0;
	int x=0;
	 System.out.println("common elements are:");
	 while(i<a.length && j<b.length && x<c.length) {
		 if(a[i]==b[j] && b[j]==c[x]) {
			 System.out.println(a[i]+" ");
			 i++;
			 j++;
			 x++;
			  }
		 else if(a[i] <a[j]) {
			 i++;
		 }
		 else if(b[j] <b[x]) {
			 j++;
		 }
		 else {
			 x++;}}}}
		 
