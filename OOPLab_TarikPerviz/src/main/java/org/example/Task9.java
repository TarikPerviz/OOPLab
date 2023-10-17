
package org.example;

public class Task9 {
    private static void drawStarsPiramid(int amount){
        String str="*";
        for(int i=1;i<=amount;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        drawStarsPiramid(10);

    }
}
