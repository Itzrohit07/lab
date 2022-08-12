//swapping two variables refers to mutually exchanging the values of the variables.generally,this is done with the data in memory.

public class example2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        System.out.println("Before swapping : a, b = " + a + ", " + +b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = " + a + ", " + +b);
    }
}
