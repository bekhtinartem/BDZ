package com.company;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] argc){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int sum=0, min=0, max=0;
        for(int i=0;i<n;i++){
            int a=in.nextInt();
            if(i==0){
                max=a;
                min=a;
                sum+=a;
            }else{
                if(a>max){
                    max=a;
                }
                if(a<min){
                    min=a;

                }
                sum+=a;
            }
        }
        System.out.println("MAX: "+ max);
        System.out.println("MIN: " + min);
        System.out.println("AVERAGE: " + 1.0*sum/n);
    }
}
