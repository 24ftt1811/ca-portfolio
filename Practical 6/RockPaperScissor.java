import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rock (0), paper (1), scissor (2)");
        int user = input.nextInt();                                  
        int cpu = (int)(Math.random()*100 % 3);

        if (user==0 && cpu==0){
            System.out.println("The computer is rock. You are rock. It is a draw.");
        }
        else if (user==1 && cpu==1){
            System.out.println("The computer is paper. You are rock. It is a paper.");
        }
        else if (user==2 && cpu==2){
            System.out.println("The computer is scissor. You are rock. It is a scissor.");
        }
        else if (user==0 && cpu==1){
            System.out.println("The computer is paper. You are rock. You win.");
        }
        else if (user==1 && cpu==2){
            System.out.println("The computer is paper. You are scissor. You win.");
        }
        else if (user==2 && cpu==0){
            System.out.println("The computer is scissor. You are rock. You win.");
        }
        else if (user==0 && cpu==1){
            System.out.println("The computer is paper. You are rock. You lose.");
        }
        else if (user==2 && cpu==1){
            System.out.println("The computer is scissor. You are paper. You lose.");
        }
        else if (user==0 && cpu==1){
            System.out.println("The computer is rock. You are scissor. You lose.");
        }

        
        
        
    }
    
}
