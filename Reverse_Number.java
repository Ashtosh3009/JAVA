// Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example,
// if the input is 12345, the output should be 54321.
import java.util.*;
public class Reverse_Number {
    public static void main (String args[])
    {
        int d, rev = 0, t, n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        t=n;
        while( t > 0 )
        {
            d = t % 10;
            rev = rev * 10 + d;
            t = t / 10;
        }
        System.out.println("Reversed Number : " + rev);
        sc.close();
    }
}
