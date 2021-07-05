import java.util.*;

public class string {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        String str= sc.nextLine();   
        int n= str.length();
        System.out.println((int)str.charAt(0));
        for (int i=0;i<n;i++)
        {
            System.out.print((int)str.charAt(i+0)+" ");//print puts them with each other
        }
    }
}

    