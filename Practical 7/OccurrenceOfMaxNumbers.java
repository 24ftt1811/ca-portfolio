import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largestNum = 0;
        int countNum = 0;

        System.out.println("Enter numbers, the input ends with 0 entered: ");
    
        while (true) {
            int number = input.nextInt();
            if(number > largestNum){        // e.g 1 > 0, therefore it is now the biggest number 
                largestNum = number;        // it will replace
                countNum = 0;               // reset 
            }
            if(number == largestNum){
                countNum++;
            }
            if(number==0){
            break;
            }
        }
        System.out.println("The largest number is " +largestNum);
        System.out.println("The occurence count of the largest number is " +countNum);
}
}
