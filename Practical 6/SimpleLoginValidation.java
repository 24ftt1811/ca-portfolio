import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctUsername = "Ahmad Ali";
        String correctPassword = "12345";

        System.out.print("Please enter your username: ");
        String username = input.nextLine();
        System.out.print("Please enter your password: ");
        String password = input.nextLine();

        if(username.equalsIgnoreCase(correctUsername)){
            if(password.equalsIgnoreCase(correctPassword)){
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                String formattedTime = formatter.format(new Date());

                System.out.println("Welcome " +username+ " The time now is " +formattedTime);
            }else{
                System.out.println("Error: Password does not match.");
            }
        }else{
            System.out.println("Error: Invalid Username.");
        }
    }
    
}
