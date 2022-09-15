package testprogram;

class Bank{
	int gaterateofInterest() {
		return 0;
	}
}
class SBI extends Bank{
	int gaterateofInterest() {
		return 8;	
	}
}
class ICICI extends Bank{
	int gaterateofInterest(){
		return 7;
	}
}
class AXIS extends Bank{
	int gaterateofInterest(){
		return 9;
	}
}

public class Testage {

	public static void main(String[] args) {
		SBI A=new SBI();
		ICICI B=new ICICI();
		AXIS C=new AXIS();
		System.out.println("SBI Bank rateofInterest:"+A.gaterateofInterest());
		System.out.println("ICICI Bank rateofInterst:"+B.gaterateofInterest());
        System.out.println("AXIC Bank rateofInterest:"+C.gaterateofInterest());
	}

}
