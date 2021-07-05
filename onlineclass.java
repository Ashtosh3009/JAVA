import java.util.*;
public class onlineclass {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner (System.in);
        System.out.println("enter a nuumber\n");
        int n =obj.nextInt();
        int evensum=0,oddsum=0;
        while(n>0)
        {
            if(n%2==0)
            {
                evensum+=n;
            }
            else{
                oddsum+=n;
            }
            n=obj.nextInt();
        }
        System.out.println(evensum);
        System.out.println(oddsum);
        
        



    }
}