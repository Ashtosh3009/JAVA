/* Write a Java program that takes a year from user and print whether that year is a
leap year or not */
import java.util.*;
public class Ques2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year : ");
        int y = sc.nextInt();
        if((y%4==0 && y%100!=0) || (y%400==0))
        System.out.println("Leap Year");
        else
        System.out.println("Not Leap Year");
    }
}
