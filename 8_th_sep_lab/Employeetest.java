/*
 * Write a java class to develop an employee class object using 
constructor.
The constructor hold initialized the emp name & emp Id for 5 Emp
now write another class having name and from this class you have to 
create 5 employee objects but 
you are not allowed to use new keyword.
 */

package testprogram;

 class Employee {
	static void test(int id,String name) {
		System.out.println("Employee id:" + id+" "+ name);
	}
}
		
	
	
public class Employeetest{	

	public static void main(String[] args) {
		
		Employee.test(10,"Rohit");
		Employee.test(20,"Pritam");
		Employee.test(30,"Arnab");
		Employee.test(44,"Chanchal");
		Employee.test(55,"Ritam ");
		
		
	}

}
