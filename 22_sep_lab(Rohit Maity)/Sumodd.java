//1.write a java program to print sum of odd numbers up to N?

package testprogram;
import java.util.*;
class Sumodd{
	public static void main(String[]args) {
	int n;
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	     n=sc.nextInt();
		
			for(int i=0;i<=n;i++) {
				if(i%2!=1) {
					sum=+i;
					System.out.println(sum);
				}
			}
		}
	}
	
