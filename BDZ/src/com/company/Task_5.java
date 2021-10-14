package com.company;

import java.util.Scanner;

public class Task_5 {
    public static int f(int a){
        while(a>=10){
            a/=10;
        }
        return a;
    }
    public static void main(String[] argc){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            int b=in.nextInt();
            a[i]=f(b);
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
}
