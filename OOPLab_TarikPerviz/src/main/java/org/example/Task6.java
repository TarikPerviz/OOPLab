package org.example;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("How many times would you like to print the string?");
        int num= reader.nextInt();
        for(int i=0;i<num;i++){
            printText();
        }

    }
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
