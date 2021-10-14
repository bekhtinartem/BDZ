package com.company;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] argc){
        Scanner in = new Scanner(System.in);
        int a=0, sum=0;
        do{
            a=in.nextInt();
            sum+=a;
        }while(a!=0);
        System.out.println((int)(Math.sqrt(sum)));
    }
}
