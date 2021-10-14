package com.company;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] argc){
        Scanner in = new Scanner(System.in);
        int a[]=new int[5], b;
        for(int i=0;i<5;i++){
            a[i]=0;
        }
        do{
            b=in.nextInt();
            if(b>a[0]){
                a[0]=b;
                for(int i=0;i<5;i++){
                    for(int j=i+1;j<5;j++){
                        if(a[j]<a[i]){
                            int c=a[i];
                            a[i]=a[j];
                            a[j]=c;
                        }
                    }
                }
            }

        }while(b!=0);
        System.out.println(a[0]+ " " + a[1] + " " +a[2]+ " " + a[3] + " " +a[4]);
    }
}
