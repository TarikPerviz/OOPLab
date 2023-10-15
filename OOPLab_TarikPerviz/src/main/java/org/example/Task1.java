package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner pass= new Scanner(System.in);
        String password="apple";
        while(true){
            String newpass=pass.nextLine();
            if(newpass.equals(password)){
                System.out.println("Right!");
                break;
            }
            System.out.println("Wrong!");
        }
        System.out.println("The secret is: Fruit!");
    }
}