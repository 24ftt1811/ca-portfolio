import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("How many numbers are there?");
       int size = input.nextInt();

       int[] numbers = new int[size];

       System.out.println("Enter the " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

       System.out.println("Enter number of left shift:");
       int shift = input.nextInt();
        for (int s = 0; s < shift; s++) {
            int first = numbers[0]; 
            for (int i = 0; i < size - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[size - 1] = first; 
        }
       System.out.println("The shifted arrangement is:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        } 
    }
    
}
