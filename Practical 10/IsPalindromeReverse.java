import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 900) + 100;
        System.out.print("Enter the reverse of " + randomNumber + ": ");
        int userInput = input.nextInt();  

        while (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + randomNumber + ": ");
            userInput = input.nextInt();  
        }
        boolean isPal = isPalindrome(randomNumber, userInput);
        System.out.println("The digit " + userInput + " is palindrome of " + randomNumber + " is " + isPal + ".");
    }
    public static int revNumber(int number) {
        int numbA = number % 10;
        int numbB = number / 10 % 10;
        int numbC = number / 100;
        int reversed = (numbA * 100) + (numbB * 10) + numbC;
        return reversed;
    }
    public static boolean isPalindrome(int number, int userReverse) {
        int actualReverse = revNumber(number);  
        return userReverse == actualReverse;
    }
}