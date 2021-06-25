/**
 * Question No-3
Take values of length and breadth of a rectangle from user and check if it is
square or not.
 */
import java.util.*;
public class Ques3 {
    public static void main(String args[])
    {
        int l,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length and bredth of rectangle : ");
        l=sc.nextInt();
        b=sc.nextInt();
        if(l==b)
        System.out.println("It's a rectangle");
        else
        System.out.println("It's not a rectangle");

    }
}
