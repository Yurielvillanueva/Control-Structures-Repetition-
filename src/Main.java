import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        boolean randomnum = true;
        int i = 0;

        int randomNumber = random.nextInt(20);
        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I've selected a random number between 1 and 100.");
        System.out.println("The Random Number is: " +randomNumber);

        while (randomnum) {
            System.out.print("Enter your guess: ");
            int guess = scn.nextInt();
            i++;
            if (guess > randomNumber) {
                System.out.println("Try Lower.");
            }else if(guess < randomNumber){
                System.out.println("Try Higher.");
            }
            else{
                System.out.println("Congratulations! You've guessed the number in " +i+ " Attempt");
                break;
            }
        }
    }
}