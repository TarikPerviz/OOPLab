
package org.example;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner newNum=new Scanner(System.in);
        int firstNum;
        int secondNum;
        System.out.print("First: ");
        firstNum = newNum.nextInt();
        System.out.print("Second: ");
        secondNum = newNum.nextInt();
        if(firstNum<secondNum) for (int i = firstNum + 1; i < secondNum; i++) {
            System.out.println(i);
        }
    }
}
