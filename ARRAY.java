import java.util.*;
    public  class ARRAY{
       
        public static void main(String[] args)
        {
            Scanner obj =new Scanner (System.in);
            int n;
            int a[]=new int[100];
            n=obj.nextInt(); 
            for(int i=0;i<n;i++)
            {
                a[i]=obj.nextInt();
            }
            int i=0;
            while(i<n)
            {
                System.out.print(a[i]+"");
                i++;
            }
    
           
        }
    
    }
       

