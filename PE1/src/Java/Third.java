package java;

import java.util.Scanner;
import java.io.*;

public class Third {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int flag=0;

        if(!str.matches ("[a-zA-Z]+"))
        {
            System.out.println("Error! Given Input is not alphabet");
        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' ||str.charAt(i)=='E' || str.charAt(i)=='I' ||str.charAt(i)=='O' || str.charAt(i)=='U'){
                    System.out.println(str.charAt(i)+ "-->Vowel");

                }
                else
                {
                    System.out.println(str.charAt(i)+ "-->Consonant");
                }

            }
        }

        }
    }



