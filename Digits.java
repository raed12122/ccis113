
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userInputValue, currentDigit, digitCounter;
        digitCounter = 1;
        
        System.out.print("Enter a number (-1 to end): ");
        userInputValue = userInput.nextInt();
        
        while (userInputValue != -1) {
            while (userInputValue > 0) {
                currentDigit = userInputValue % 10;
                System.out.println("Digit " + digitCounter++ + " = " + currentDigit);
                userInputValue = userInputValue / 10;
            }
            
            System.out.print("Enter a number: ");
            digitCounter = 1;
            userInputValue = userInput.nextInt();
        }
    }
}
