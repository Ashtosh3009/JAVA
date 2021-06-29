//Write a program that reads a set of integers, and then prints the sum of the positive even and odd integers.
import java.util.*;
public class Sum_Even_Odd {
    public static void main(String args[])
    {
        int m,i,n,e=0,o=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of integers to be inputed : ");
        m = sc.nextInt();
        for(i = 1 ; i <= m ; i++)
        {
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            if(n%2==0)
            e+=n;
            else
            o+=n;
        }
        System.out.println("Sum of Even Integers = "+e);
        System.out.println("Sum of Odd Integers = "+o);
        sc.close();
    }
}
