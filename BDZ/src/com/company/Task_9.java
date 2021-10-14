package com.company;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a=n;
        int size=0;
        int s[]=new int[15];
        while(a!=0){
            s[size]=(int)(a%10);
            a/=10;
            size++;
        }
        boolean flag=true;
        for(int i=0;i<size/2;i++){
            if(s[i]!=s[size-i-1]){
                flag=false;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}
