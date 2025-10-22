public class ProductingRating {
    public static void main(String[] args) {
        int[][] ratings = {
            {4, 5, 4}, 
            {3, 5, 3}, 
            {4, 5, 3}, 
            {1, 2, 1}  
        };

        System.out.println("Rating \t Product\tPackaging \tDelivery");

        double productSum = 0;
        double packagingSum = 0;
        double deliverySum = 0;

        for (int i = 0; i < ratings.length; i++) {
            productSum += ratings[i][0];
            packagingSum += ratings[i][1];
            deliverySum += ratings[i][2];
        }

        double avgProduct = productSum / ratings.length;
        double avgPackaging = packagingSum / ratings.length;
        double avgDelivery = deliverySum / ratings.length;

        System.out.printf("Average\t%.2f\t\t%.2f\t\t%.2f%n",
                avgProduct, avgPackaging, avgDelivery);

        for (int i = 0; i < ratings.length; i++) {
            double total = 0;
            for (int j = 0; j < ratings[i].length; j++) {
                total += ratings[i][j];
            }
            double avg = total / ratings[i].length;
            System.out.printf("Customer %d provide the average rating %.2f%n", (i + 1), avg);
        }
    }
}   
   
