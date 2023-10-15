package org.example;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = reader.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=(int)Math.pow(2,i);
        }
        System.out.println("The result is "+sum);
    }
}
