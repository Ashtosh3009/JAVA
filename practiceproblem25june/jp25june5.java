import java.util.*;
public class jp25june5 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner (System.in);
        System.out.println("Enter ur marks");
        int a =obj.nextInt();
        if(a<25)
        {
            System.out.println("ur grade is : F");
        }
        if(a>=25&&a<45)
        {
            System.out.println("ur grade is : E");
        }
        if(a<50&&a>=45)
        {
            System.out.println("ur grade is : D");
        }
        if(a>=50&&a<60)
        {
            System.out.println("ur grade is : C");
        }
        if(a<80&&a>=60)
        {
            System.out.println("ur grade is : B");
        }
        if(a>=80)
        {
            System.out.println("ur grade is : A");
        }
        
        
    }
}
