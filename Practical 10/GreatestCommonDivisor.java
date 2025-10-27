import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int first = input.nextInt();
        System.out.print("Enter second integer: ");
        int second = input.nextInt();

        int gcd = commonDivisor(first, second); 
        System.out.println("The greatest common divisor for " + first + " and " + second + " is " + gcd);
    }
    
    public static int commonDivisor(int first, int second) {
        int gcd = 1;
        int divisor;
    
        if (first < second) {
            divisor = first;
        } else {
            divisor = second;
        }
        
        for (int i = divisor; i >= 1; i--) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd; 

        // DEBUNK
        // for (int i = first; i >= 1; i++) {
        //     if(first % i == 0 && second % i == 0){
        //         return i;
        //     }
            
        // }
        // return 1;


        /* Euclidean Alogorithm is a method for finding 
        * the greatest common divisor (GCD) of two integers.
        */
        // while (second != 0) {            
        //     int divisor = second;
        //     second = first % second;
        //     first = divisor;
        // }
        // return first; 
    }
}


