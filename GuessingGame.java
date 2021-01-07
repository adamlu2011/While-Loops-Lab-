import java.util.Scanner;

public class GuessingGame {
    public static void main() {
        Scanner input = new Scanner( System.in ); 
        int randomNumber = 38;
        int guessedNumber;
        System.out.println ("Please guess a number");
        guessedNumber = input.nextInt();
        
        while (randomNumber != guessedNumber)
        {
            if(randomNumber > guessedNumber)
            {
                System.out.println ("To low... guess again");
                guessedNumber = input.nextInt();
            }
            if(randomNumber < guessedNumber)
            {
                System.out.println ("To high... guess again");
                guessedNumber = input.nextInt();
            }
        }
        
        while (randomNumber == guessedNumber)
        {
            System.out.println ("Finally... you guessed right!");
            break;
        }
    }
}