import java.util.*;
public class jp25juneq6 {
    public static void main(String[] args)
    {
        Scanner obj =new Scanner (System.in);
        System.out.println("enter a charactr");
        char ch= obj.next().charAt(0);
        switch(ch)
        {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
            System.out.println("Vowel");
            break;
            default: System.out.println(" you entered a consonant");
            break;

        }
    
    }
}