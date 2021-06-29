//Sum of positive numbers only through do-while Loop.
import java.util.*;
public class Do_While {
    public static void main(String args[])
    {
        int i,m,n,sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter total numbers to be inputed : ");
        m = sc.nextInt();
        i=1;
        do
        {
            System.out.print("Enter a number : ");
            n = sc.nextInt();
            if(n>0)
            {
                sum = sum + i;
            }
            i++;
        }while(i<=m);
        System.out.println("Sum = "+sum);
    }
}
