import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double povNumber = 0;
        double negNumber = 0;
        int total = 0;
        int average = 0;
        boolean isZero = false;

        System.out.println("Enter an integar, the input ends if it is 0: ");
        while (true) {
            int integar = input.nextInt();
            if(integar > 0){
                isZero = true;
                total+=integar;
                povNumber++;
                
            }
            else if(integar < 0){
                isZero = true;
                total+=integar;
                negNumber++;
            }
            if(integar == 0){
                break;
            }    
        }
        if(isZero){
        System.out.println("The number of positive is " +povNumber);
        System.out.println("The number of negative is " +negNumber);
        System.out.println("The total is " +total);
        System.out.printf("The average %.2f",(total / (povNumber+negNumber)));    
    }
    else{
        System.out.println("No number is entered except for 0 to end the program");
    }
        
    
    }    
}
