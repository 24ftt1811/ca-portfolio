import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double random1 = Math.random()*100;
        double random2 = Math.random()*100;
        int randomONE = (int)random1;
        int randomTWO = (int)random2;
        // System.out.println("What is " +randomONE+ " + " +randomTWO);
        System.out.println("What is " +randomONE+ " % " +randomTWO);
        int user=input.nextInt(); 
        // int sum = randomONE + randomTWO;
        // String randomSum = user==sum?"True":"False";
        // System.out.println(randomONE+ " + " +randomTWO+ " = " +user+ " is " +randomSum);

        

        // Modulus (Division - finding the remainder)

        
    }
    
}
