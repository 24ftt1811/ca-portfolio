public class LoopsLoopsLoops {
    public static void main(String[] args) {
        System.out.println("Below is generated using while loop: ");
        int i = 0;
        while (i<20) {
            i++;
            System.out.print(i+ " ");
        }
        System.out.println("\n");

        System.out.println("Below is generated using dowhile loop: ");
        i = 50;
        do {
            System.out.print(i+" ");
            i--;
        }
        while (i>=35);   
        
        System.out.println("\n");
        System.out.println("Below is generated using for loop: ");
        for(char j = 'a'; j <= 'z'; j++){
            System.out.print(j+ " ");
        }
        

    
}
}
