import java.io.IOException;
import java.util.Random;
import java.io.FileWriter;


public class ModulusQuestion {
    public static void main(String[] args) throws IOException {
    String filename = "C:/Practical 5/Modulus Questions.txt";
        FileWriter fw = new FileWriter(filename, true); 
        Random rand = new Random();
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);
        String question = num1 + " % " + num2 + " = ?\r\n";
        System.out.println("A new question is added\n");  
        fw.write(question); 
        
        
        fw.close();
    }
    }
