package Patterns;

import java.util.Scanner;

public class ButterflyPattern  {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int s=sc.nextInt();

        for(int i=1;i<=s;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            int space=2*(s-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=s;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            int space=2*(s-i);
            for(int j=space;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
