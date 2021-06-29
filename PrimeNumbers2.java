/**
 * Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the 
 * number is a prime number.
 */
import java.util.*;
public class PrimeNumbers2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,c=0,i;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        System.out.println("Prime Number");
        else
        System.out.println("Not Prime Number");
    }
}
