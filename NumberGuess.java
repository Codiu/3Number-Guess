import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int num = (int) (Math.random() * 10);
        System.out.println("DEBUG: number generated: " + num);

        for (int i = 5; i > 0; i--) {
            System.out.println("Hi there, Guess the number? 1 to 10 ");
            int guess = myObj.nextInt();

            if (guess > num) {
                System.out.println("Too high");
                if (i == 1) System.out.println("You failed");
            }
            else if (guess < num) {
                System.out.println("Too low");
                if (i == 1) System.out.println("You failed");
            }
            else {
                System.out.println("You got my attention");
                break;
            }
        }
    }
}
