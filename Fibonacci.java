import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {

        int count, num1 = 1, num2 = 1, countb, num3 = 1, num4 = 1, countc, num5 = 1, num6 = 1;
        System.out.print("Enter n: ");
        Scanner scan1 = new Scanner(System.in);
        count = scan1.nextInt();
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------");


        
       
        System.out.print("Enter n: ");
        Scanner scan2 = new Scanner(System.in);
        countb = scan2.nextInt();
        System.out.print("Fibonacci Series of "+countb+" numbers:");

        int u=1;
        while(u<=countb)
        {
            System.out.print(num3+" ");
            int sumbOfPrevTwo = num3 + num4;
            num3 = num4;
            num4 = sumbOfPrevTwo;
            u++;
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        
        System.out.print("Enter n: ");
        Scanner scan3 = new Scanner(System.in);
        countc = scan3.nextInt();
        System.out.print("Fibonacci Series of "+countc+" numbers:");

        int m=1;
        while(m<=countc)
        {
            System.out.print(num5+" ");
            int sumcOfPrevTwo = num5 + num6;
            num5 = num6;
            num6 = sumcOfPrevTwo;
            m++;
        }

        
    }
}