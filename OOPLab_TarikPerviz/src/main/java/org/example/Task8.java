package org.example;

public class Task8 {
    private static void drawStarsPiramid(int amount){
        String str="*";
        for(int i=1;i<=amount;i++){
            System.out.println(str.repeat(i));

        }
    }
    public static void main(String[] args) {
        drawStarsPiramid(5);

    }
}
