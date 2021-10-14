package com.company;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if(a%100==11  && a>max){
                max=a;
            }
        }
        System.out.println(max);
    }
}
