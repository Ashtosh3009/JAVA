// Write a program to print the factorial of any given number.
import java.util.*;
public class Factorial {
    public static void main (String arg[])
    {
        int n,i,m=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            m = m * i;
        }
        System.out.println("Factorial = " + m);
        sc.close();
    }
}
