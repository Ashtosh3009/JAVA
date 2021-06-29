//Write a program in Java to display the n terms of square natural number and their sum.
import java.util.*;
public class Square_Numbers
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(i*i);
            sum+=i*i;
        }
        System.out.println("Sum = "+sum);
    }
}