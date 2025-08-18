import java.util.Scanner;

public class CharacterToUnicode {
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    int alpha=input.next().charAt(0);
    String character=Character.toString(alpha);
    System.out.println("The Unicode for  "  +character+ "  is  " +alpha);
    }
}
