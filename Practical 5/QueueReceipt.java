import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) throws IOException {
    String filename = "C:/Practical 5/QReceipt.txt";
        FileWriter fw = new FileWriter(filename); 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        String upperName = name.toUpperCase();

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateTime = now.format(dtf);

        Random rand = new Random();
        int queueNumber = rand.nextInt(100) +1;

        fw.write(dateTime + "\n");
        fw.write("Hi, " +upperName+ "\n");
        fw.write("Your Queue No is : " +queueNumber+ "\n");

        fw.close();   
    }
}
