/*3… Class A serves as a base class for the derived class B, which in turn 
serves as a base class for the derived class C. (Which type Of Inheritance 
explain with an example)*/
package testprogram;
class A{
	void show() {
		System.out.println("THis is the base class");
	}
}
class B extends A{
	void show() {
		System.out.println("first child class");
	}
}
class C extends B{
	void show() {
		System.out.println("second child class");
	}
}
public class Fastage {

	public static void main(String[] args) {
		C xt=new C();
		xt. show();
	}

}
