<<<<<<< HEAD
package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int rnd=new Random().nextInt(101);
        int guess;
        int counter=0;
        while(true){
            System.out.print("Enter a number: ");
            guess= reader.nextInt();
            counter++;
            if(rnd==guess){
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            if(rnd>guess){
                System.out.println("The number is greater, guesses made: "+counter);
            }
            else {
                System.out.println("The number is lesser, guesses made: "+counter);
            }
        }
    }
}
=======
package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int rnd=new Random().nextInt(101);
        int guess;
        int counter=0;
        while(true){
            System.out.print("Enter a number: ");
            guess= reader.nextInt();
            counter++;
            if(rnd==guess){
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            if(rnd>guess){
                System.out.println("The number is greater, guesses made: "+counter);
            }
            else {
                System.out.println("The number is lesser, guesses made: "+counter);
            }
        }
    }
}
>>>>>>> 7d94d097f1baa70d69cae2204980554dcf7aa9ac
