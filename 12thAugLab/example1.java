//write a java program that takes five numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;
public class example1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("input the first number:");
        int a=sc.nextInt();
        System.out.println("input the second number:");
        int b=sc.nextInt();
        System.out.println("input the third number:");
        int c=sc.nextInt();
        System.out.println("input the fourth number:");
        int d=sc.nextInt();
        System.out.println("input the fifth number:");
        int e=sc.nextInt();
        System.out.println("calculate the average number of five is:" + (a+b+c+d+e)/5);

    }
}
