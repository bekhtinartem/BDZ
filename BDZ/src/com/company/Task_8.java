package com.company;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] argc){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n==1){
            System.out.println(1);
        }
        boolean flag=false;
        int i=2;
        while(n!=1){
            if(n%i==0){
                if(!flag){
                    flag=true;
                    System.out.print(i);
                }else{
                    System.out.print("*"+i);
                }
                n/=i;
            }else{
                i++;
            }
        }

    }
}
