package org.example;

public class Task7 {
    private static void printStars(int amount){
        String str="*";
        System.out.println(str.repeat(amount));

    }
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

    }
}
