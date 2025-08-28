import java.util.Scanner;

public class Reverse5Letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 5 letters word: ");
        String word = input.nextLine();
        
        if(word.length()==5){
           char c1 = word.charAt(0);
           char c2 = word.charAt(1);
           char c3 = word.charAt(2);
           char c4 = word.charAt(3);
           char c5 = word.charAt(4);
           System.out.println("The reverse of the word " +word+ " is " +c5+c4+c3+c2+c1);
        }
        else{
        }
    }
    
}
