//Write a program in Java to display the cube of the number upto given an integer.
import java.util.*;
public class Cubes {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i;
        System.out.print("Enter a number :");
        n=sc.nextInt();
        System.out.println("Cubes : ");
        for(i=1;i<=n;i++)
        {
            System.out.println(i*i*i);
        }
    }
}
