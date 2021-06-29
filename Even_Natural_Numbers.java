//Write a program in Java to display the n terms of even natural number and their sum.
import java.util.*;
public class Even_Natural_Numbers {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,i,m=2,sum=0;
        System.out.print("Enter a number : ");
        n=sc.nextInt();
        System.out.println("Even Number : ");
        for(i=1;i<=n;i++)
        {
            System.out.println(m);
            sum+=m;
            m+=2;
        }
        System.out.println("Sum = "+sum);
    }
}
