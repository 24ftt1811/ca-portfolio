import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userScored = 0;
        int cpuScored = 0;
        int count = 1;

        while (true) {
        System.out.print("Enter rock (0), paper (1), scissor (2): ");
        int user = input.nextInt();                                  
        int cpu = (int)(Math.random()*100 % 3);
        
        
        if (user==0 && cpu==0){
            System.out.println("The computer is rock. You are rock. It is a draw.");
        }
        else if (user==1 && cpu==1){
            System.out.println("The computer is paper. You are rock. It is a draw.");
        }
        else if (user==2 && cpu==2){
            System.out.println("The computer is scissor. You are rock. It is a draw.");
        }
        else if (user==0 && cpu==1){
            System.out.println("The computer is paper. You are rock. You win.");
            userScored++;
        }
        else if (user==1 && cpu==2){
            System.out.println("The computer is paper. You are scissor. You win.");
            userScored++;
        }
        else if (user==2 && cpu==0){
            System.out.println("The computer is scissor. You are rock. You win.");
            userScored++;
        }
        else if (user==0 && cpu==1){
            System.out.println("The computer is paper. You are rock. You lose.");
            cpuScored++;
        }
        else if (user==2 && cpu==1){
            System.out.println("The computer is scissor. You are paper. You lose.");
            cpuScored++;
        }
        else if (user==0 && cpu==1){
            System.out.println("The computer is rock. You are scissor. You lose.");
            cpuScored++;
        }
        System.out.print("Enter y to play again: ");
        input.nextLine();
        String play = input.nextLine();
        if(play.equals("y")){
            count++;
        }
        else{
            break;
        }
    }
    System.out.println("In the total of " +count+ " round(s), You scored " +userScored+ ", Computer scored " +cpuScored);
        
      
    }
    
}
