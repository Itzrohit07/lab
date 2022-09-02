package com.packages;
import java.util.Scanner;
class AdvancedArithmetic{
    int divisorsum(int n) {
        int sum=1;
        for(int j=2; j<=(n/2); j++) {
            if(n%j==0)sum+=j;
        }
        if(n!=4)return sum+n;
        else return sum;
    }
}
public class mycalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AdvancedArithmetic ag = new AdvancedArithmetic();
        int sum = ag.divisorsum(n);
        System.out.println("increse advance arithmetic\n" + sum);
        System.out.println("integer is less than 1000");

    }
}


