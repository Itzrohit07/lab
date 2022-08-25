//write a pattern program output in showing pyramid "*".
    import java.util.*;
    public class pyramidpattern {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a digit");
            int a=sc.nextInt();
            for(int  i=1; i<=a;i++) {
                for(int j=1; j<=a-i;j++) {
                    System.out.print(" ");
                }
                for( int k=1;k<=2*i-1;k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

