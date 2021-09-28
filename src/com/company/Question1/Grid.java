package com.company.Question1;

import java.util.Scanner;

public class Grid {
    public static void main(String[] args) {
        System.out.println("Enter an N value: ");
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();

        MakeCheckerBoard(N);
    }

    public static void MakeCheckerBoard(int N){
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(i==1 || i==N || j==1 || j==N){
                    System.out.print("*");
                }
                else {
                    if(i%2==0) {
                        if (j % 2 == 0) {
                            System.out.print("+");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    if(i%2==1){
                        if (j % 2 == 0) {
                            System.out.print(" ");
                        }
                        else{
                            System.out.print("+");
                        }
                    }


                }
            }
            System.out.println();
        }
    }
}
