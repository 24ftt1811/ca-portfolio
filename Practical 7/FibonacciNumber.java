import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f0 = 0;
        int f1 = 1;
        System.out.print("Please enter the term: ");
        int term = input.nextInt();
        for (int i = 1; i < term ; i++) {
          f1 = f0 + f1;  
          f0 = f1 - f0;
        }
        System.out.println("At the term " + term + " the number is " +f1);
    }
    
}
