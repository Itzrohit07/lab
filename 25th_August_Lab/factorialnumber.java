//write a java program to find a factorial number.
import java.util.*;
public class factorialnumber {
    public static void main(String[] args) {
        int i;
         int fact =1;
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        num=sc.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
            System.out.println("factorial is"+fact);
        }
    }
}
