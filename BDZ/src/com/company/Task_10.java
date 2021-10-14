package com.company;

import java.util.Scanner;

public class Task_10 {

    public static int sum(int a, int b){
        int res, c;
        do{
            res=a^b;
            c=(a&b)<<1;
            a=res;
            b=c;
        }while (b!=0);
        return res;
    }
    public static void main(String[] argc){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(), b=in.nextInt();
        System.out.println(sum(a, b));
    }
}
