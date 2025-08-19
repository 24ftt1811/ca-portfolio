import java.util.Scanner;

public class ReverseOfIntegar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 100 and 999: ");
        int number = input.nextInt();
        int numbA = number % 10;
        int numbB = number / 10 % 10;
        int numbC = number / 100;
        System.out.println("The reverse of " +number+ " is " +numbA+numbB+numbC);
        

    }
}
