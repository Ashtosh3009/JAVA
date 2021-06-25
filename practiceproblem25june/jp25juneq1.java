import java.util.*;
public class jp25juneq1 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner (System.in);
        int a =obj.nextInt();
        int b=obj.nextInt(); 
        if(a>=0)
        {
            System.out.println("positive");
        
        }
        else{
            System.out.println("negative\n");
        }
        if(a%2==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        System.out.println(a+b);
        
    }    

    
}
