import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String message = input.nextLine();

        System.out.print("Enter the substring to replace: ");
        String message2 = input.nextLine();

        
        System.out.print("Enter the replacement string: ");
        String message3 = input.nextLine();

        System.out.println("The updated message is: " +message.replace(message2, message3));
        

        
    }
}
