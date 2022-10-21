/*Create a class MyCalculator which consists of a single method long power(int, int).
        This method takes two integers, n and p, as parameters and finds n^p . If either n or
        p is negative, then the method must throw an exception which says "n or p should
        not be negative.". Also, if both n and p are zero, then the method must throw an
        exception which says "n and p should not be zero."*/
package Testprogram;
import java.util.Scanner;
public class MyCalculator {
    public int power(int n,int p)
        throws Exception{
         if (n<0 ||p<0){
             throw new Exception("n and b not are negative");
         }
         else if (n==0 && p==0){
             throw new Exception("n and p are not be zero");
         }
         else{
             return(int)Math.pow(n,p);}}}

 class solution {
    public static void main(String[] args) {
    MyCalculator sc=new MyCalculator();
    Scanner st=new Scanner(System.in);
        while (st.hasNextInt()){
            int n=st.nextInt();
            int p=st.nextInt();
            try {
                System.out.println(sc.power(n,p));
            }
            catch(Exception e){
                System.out.println(e);}}
        st.close();}}


