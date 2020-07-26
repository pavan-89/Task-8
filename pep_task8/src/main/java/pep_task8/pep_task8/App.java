package pep_task8.pep_task8;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.next();
        if(s.charAt(1)=='a' || s.charAt(1)=='A')
        {
        	s=s.charAt(0)+s.substring(2);
        }
        if(s.charAt(0)=='a' || s.charAt(0)=='A')
        {
        	s=s.substring(1);
        }
        System.out.println(s);
    }
}
