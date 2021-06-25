/**
 * Question No-7
Write a Java program that takes a number from the user and generates an integer
between 1 and 7 and displays the name of the weekday.(Using Switch Case)
 */
import java.util.*;
 public class Ques7 {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7 : ");
        n=sc.nextInt();
        switch(n)
        {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("Wrong Choice");
        }
    }
}
