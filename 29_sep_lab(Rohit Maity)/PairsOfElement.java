//4.write a java program to find all pairs of elements in an array whose sum is equal to specified number.
package testprogram;

public class PairsOfElement {

	public static void main(String[] args) {
	array(new int[]{10,20,30,40,50,60,70},110);
	
	}
static void array(int[] arr,int number)
{
	System.out.println("array are:");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			
			if(arr[i]+arr[j]== number) {
				System.out.println(arr[i]+" "+arr[j]+"="+number);
			}
		}
	}
}
	}


