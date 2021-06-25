/*
Write a Java program to input a number from the user
1. print whether it is positive or negative.
2. check whether it is even or odd number.
3. Add two no’s and print them
*/
import java.util.*;
public class Ques1
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        
        if(a>=0)
        System.out.println("Positive");
        else
        System.out.println("Negative");

        if(a%2==0)
        System.out.println("Even Number");
        else
        System.out.println("Odd Number");

        int sum=a+b;
        System.out.println("Sum = "+sum);
    }
}