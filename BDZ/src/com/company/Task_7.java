package com.company;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m=in.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print((i+1)*(j+1) + "   ");
            }
            System.out.println();
        }
    }
}
