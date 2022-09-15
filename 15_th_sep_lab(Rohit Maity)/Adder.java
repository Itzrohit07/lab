package Kognet;
class Arithmetic{
	int add(int x,int y) {
		return x+y;
	}
}
public class Adder extends Arithmetic {

	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println(a.add(23,35));

	}

}
