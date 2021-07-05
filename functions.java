import java.util.*;

public class functions{
    public static void main(String[]args){
        Scanner obj =new Scanner (System.in);
        int a =obj.nextInt();
        int b =obj.nextInt();
        int c =obj.nextInt();
        int d =obj.nextInt();
        int result=maxof(a ,b);//passing and calling
        System.out.println(result);
        int resultcd=maxof(c ,d);//passing and calling 
        System.out.println(resultcd);
        for(int i=0;i<5;i++)
        {
            hello();
        } 

    }
     static int maxof(int a,int b){
        if(a>b)
        {
            return a;
        } 
        else{
            return b;
        }       
    }
    static void hello(){
        System.out.println("say hello!");
    }

}
