/*Create two threads to print even numbers and odd numbers from 1 to 100?
        note: after printing of all even numbers only odd numbers should print*/
class A extends Thread{//create  own class
        public void run() {// create a first method
            System.out.println(" The Even numbers are :");
            for (int i = 0; i<=100; i++) {//using first for loop for i
                if (i%2==0) {
                    System.out.print(" "+ i);
                }}}}
    class B extends Thread{// creating second thread
        public void run() {//create a method
            System.out.println(" The Odd numbers are : ");
            for (int j = 0; j <=100; j++) {//using for loop for second j
                if (j%2!=0) {
                    System.out.print(" " +j);
                }}}}
     class ThreadTest {// create a main class
        public static void main(String[] args) {// create a main method
            A sc = new A();  //creating an object 1
            B st = new B();//creating an object 2
            sc.run();
            st.run();
        }
    }

