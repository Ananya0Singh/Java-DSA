package Patterns;

import java.util.Scanner;

public class floydpattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        //int c=sc.nextInt();
        int n=0;
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                n++;
               // if(i==1 || i==r || j==1 || j==c)
                    System.out.print(n+" ");
               // else
                   // System.out.print("  ");
            }
            System.out.println();
        }
    }
}
