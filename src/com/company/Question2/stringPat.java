package com.company.Question2;

import java.util.Scanner;

public class stringPat {
    public static void main(String[] args) {

        System.out.println("Enter the pattern string:");
        Scanner n=new Scanner(System.in);
        String pattern=n.nextLine();
        String str="";



        do{
            System.out.println("Enter a string:");
            Scanner n1=new Scanner(System.in);
            str=n.nextLine();

                if(occursIn(pattern,str)){
                    System.out.println(pattern+" occurs in "+str);
                }
                else{
                    System.out.println(pattern+" does NOT occur in "+str);
                }

          }while(!str.equals("exit"));

        System.out.println("Bye");

    }

    public static boolean occursIn(String pattern,String str){
         String[] pChar=pattern.split("\\*");
         String pt="";

            for (int i = 0; i < pChar.length; i++) {
                pt+=pChar[i]+".*";
            }

            if(str.matches(pt)) {
                return true;
            }
            else{
                return false;
            }
    }

}
