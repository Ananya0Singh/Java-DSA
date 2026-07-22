package Patterns;

import java.util.Scanner;

public class starplus {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter odd no.");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int n=(r/2)+1;

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==n || j==n )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
