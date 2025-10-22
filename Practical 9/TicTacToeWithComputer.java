import java.util.Scanner;

public class TicTacToeWithComputer {
    static char[][] board = new char[3][3];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        initializeBoard();
        
        boolean gameEnded = false;
        boolean playerTurn = true;
        char player = 'X';
        char computer = 'O';
        char empty = ' ';
        
        System.out.println("Tic-Tac-Toe Game: Player (X) vs Computer (O)");
        printBoard();
        
        while (!gameEnded) {
            if (playerTurn) {
                System.out.println("Player's turn");
                int row, col;
                
                do {
                    System.out.print("Enter a row (0,1 or 2): ");
                    row = input.nextInt();
                    System.out.print("Enter a column (0,1 or 2): ");
                    col = input.nextInt();
                } while (!isValidMove(row, col));
                
                makeMove(row, col, player);
                printBoard();
                
                if (checkWinner(player)) {
                    System.out.println("Game ended, Player Win");
                    gameEnded = true;
                } else if (isBoardFull()) {
                    System.out.println("Game ended, It's a tie!");
                    gameEnded = true;
                } else {
                    playerTurn = false;
                }
            } else {
                System.out.println("Computer's turn");
                makeComputerMove(computer, empty);
                printBoard();
                
                if (checkWinner(computer)) {
                    System.out.println("Game ended, CPU Win");
                    gameEnded = true;
                } else if (isBoardFull()) {
                    System.out.println("Game ended, It's a tie!");
                    gameEnded = true;
                } else {
                    playerTurn = true;
                }
            }
        }
       
    }
    
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("-----------");
            }
        }
        System.out.println();
    }
    
    public static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid position! Please enter values between 0-2.");
            return false;
        }
        if (board[row][col] != ' ') {
            System.out.println("Position already occupied! Choose another position.");
            return false;
        }
        return true;
    }
    
    public static void makeMove(int row, int col, char player) {
        board[row][col] = player;
    }
    
    public static void makeComputerMove(char computer, char empty) {
        int row, col;
        
        // Keep generating random moves until we find an empty spot
        do {
            row = (int)(Math.random() * 3);
            col = (int)(Math.random() * 3);
        } while (board[row][col] != empty);
        
        makeMove(row, col, computer);
    }
    
    public static boolean checkWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        
        return false;
    }
    
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}