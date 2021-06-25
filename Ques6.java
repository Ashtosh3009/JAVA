/**
 * Write a java program to check whether an alphabet is vowel or consonant using
switch case.
 */
import java.util.*;

import jdk.javadoc.internal.doclets.toolkit.resources.doclets;
public class Ques6 {
    public static void main(String args[])
   {
       char ch;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a character : ");
       ch=sc.next().charAt(0);
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
           default:
           System.out.println("Consonant");
       }
   } 
}
