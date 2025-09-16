import java.util.Random;
import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int random1 = rand.nextInt(100);
        int random2 = rand.nextInt(100); 
        int random3 = rand.nextInt(100);   
        int random4 = rand.nextInt(100); 

        int sum = random1 + random2 + random3 + random4;  
        
        System.out.println("What is " +random1+ " + " +random2+ " + " +random3+ " + " +random4+ " ?");
        int userAnswer = input.nextInt();         
        
        if(userAnswer != sum){
            System.out.println("Nice try, the sum should be "+sum);
        }
        else{
            System.out.println("Well done, you are correct!");
        }
        
    }
    
}
