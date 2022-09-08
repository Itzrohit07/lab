/*Q2.Develop a public java class and make sure nobody can create 
any object of this class from outside the class
*/
package testprogram;

 class test{
	private test() {
}
public class Question2 {
	public static void main(String[] args) {
		test obj=new test();

	}

}
 }
