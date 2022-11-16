package games;

import java.util.Random;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        boolean status = true;
        int count = 0;
        int hiddenNumber = rm.nextInt(50);
        System.out.println("Guess the number between 1 to 50 ");
        while (status) {
            System.out.print("Enter  your number :");
            int userInput = sc.nextInt();
            if (userInput != hiddenNumber) {
                if (count == 2) {
                    System.out.println();
                    System.out.print(" 💡 Hints for noob !!! ");
                    if (hiddenNumber > 40) {
                        System.out.println("answer is greater than 40");
                    } else if (hiddenNumber < 40 && hiddenNumber > 20) {
                        System.out.println("answer is between 40 and 20");
                    } else if (hiddenNumber < 20 && hiddenNumber > 0) {
                        System.out.println("answer is between 20 and 1");
                    }
                }
                if (count >= 6) {
                    System.out.println();
                    System.out.print(" 💡💡 Hints for stupid :3!!  ");

                    if (hiddenNumber > 40) {
                        System.out.println("answer is greater than 40");
                    }
                    if (hiddenNumber < 40 && hiddenNumber > 30) {
                        System.out.println("answer is between 40 to 30");
                    } else if (hiddenNumber < 30 && hiddenNumber > 20) {
                        System.out.println("answer is between 30 to 20");
                    } else if (hiddenNumber < 10) {
                        System.out.println("answer is less than 10");
                    }
                }
            }
            if (userInput == hiddenNumber) {
                System.out.println("Correct ✔✔✔ ");
                status = false;
                if (count < 3) {
                    System.out.println("You are godLevel 🧕 :");
                }
                if (count > 3 && count < 7) {
                    System.out.println("You are Intelligent 🦸‍ :");
                }
                if (count > 7) {
                    System.out.println("You are good enough  🧝 :");
                }
            }
            count++;
        }
    }
}
