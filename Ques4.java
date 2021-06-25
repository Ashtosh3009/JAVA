/**
 * A shop will give discount of 10% if the cost of purchased quantity is more than
1000. Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
 */
import java.util.Scanner;
 public class Ques4 {
    public static void main(String args[])
    {
        int n,m;
        double cost;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter quantity : ");
        n=sc.nextInt();
        m = n*100;
        if(m>1000)
        cost=m-m*0.10;
        else
        cost=m;
        System.out.println("Total cost = "+cost);
    }
}
