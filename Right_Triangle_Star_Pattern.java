/**
 * Right Triangle Star Pattern
 * *
 * **
 * ***
 * ****
 * *****
 */
import java.util.*;
public class Right_Triangle_Star_Pattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int i,j;
        for (i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
