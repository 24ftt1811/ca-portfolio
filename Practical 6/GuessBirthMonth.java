import java.util.Scanner;

public class GuessBirthMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is your birth month in Set 1?");
        System.out.println("1 3 5 7 9 11");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int set1 = input.nextInt();

        System.out.println("Is your birth month in Set 2?");
        System.out.println("2 3 6 7 10 11");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int set2 = input.nextInt();

        System.out.println("Is your birth month in Set 3?");
        System.out.println("4 5 6 7 12");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int set3 = input.nextInt();

        System.out.println("Is your birth month in Set 4?");
        System.out.println("8 9 10 11 12");
        System.out.print("Enter 0 for No and 1 for Yes: ");
        int set4 = input.nextInt();

        String choices = "" +set4+ +set3+ +set2+ +set1;

        switch (choices) {
            case "0001": System.out.println("You are born in January");
                break;
            case "0010": System.out.println("You are born in February");
                break;
            case "0011": System.out.println("You are born in March");
                break;
            case "0100": System.out.println("You are born in April");
                break;
            case "0101": System.out.println("You are born in May");
                break;
            case "0110": System.out.println("You are born in June");
                break;
            case "0111": System.out.println("You are born in July");
                break;
            case "1000": System.out.println("You are born in August");
                break;
            case "1001": System.out.println("You are born in September");
                break;
            case "1010": System.out.println("You are born in October");
                break;
            case "1011": System.out.println("You are born in November");
                break;
            case "1100": System.out.println("You are born in December");
                break;
            
            default:System.out.println("Invalid");
                break;
        }

        

    }
    
}
