//Write a program in Java to display the n terms of odd natural and their sum.
import java.util.*;
public class Odd_Numbers {
    public static void main(String args[])
    {
        int n,i,sum=0,m=1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number = ");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            System.out.println(m);
            sum+=m;
            m+=2;
        }
        System.out.println("Sum = "+sum);
        sc.close();     
    }
}
