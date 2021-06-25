/**
 * Question No-5
A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */
import java.util.*;
public class Ques5 {
    public static void main(String args[])
    {
        int m;
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks : ");
        m=sc.nextInt();
        if(m<25)
        c='F';
        else if(m<45)
        c='E';
        else if(m<50)
        c='D';
        else if(m<60)
        c='C';
        else if(m<80)
        c='B';
        else
        c='A';
        System.out.println("Grade = "+c);
    }
}
