import java.util.Scanner;

class product_det {
     int[] productIds = {1, 2, 3, 4, 5};
     String[] productNames = {"Product 1", "Product 2", "Product 3", "Product 4", "Product 5"};
     double[] productPrices = {99.90, 20.20, 6.87, 45.50, 40.49};
     int[] productQuantities = new int[5];

     public double productcosts(){
         Scanner sc = new Scanner(System.in);
         while (true) {
             System.out.println("Enter product ID (1-5) or 0 to finish:");//exit loop if product is zero
             int productId = sc.nextInt();
             if (productId == 0) {
                 break;
             }
             if (productId < 1 || productId > 5) {
                 System.out.println("Invalid Product ID. Please enter a valid product ID between 1 and 5.");
                 continue;
             }
             System.out.println("Enter quantity sold of " + productNames[productId - 1] + ":");
             int quantitySold = sc.nextInt();
             productQuantities[productId - 1] += quantitySold;
         }
         double TotalCost = 0;
         for (int i = 0; i < productIds.length; i++) {
             if (productQuantities[i] > 0) {
                 double productTotal = productQuantities[i] * productPrices[i];
                 TotalCost+= productTotal;
                 System.out.println(productNames[i] + " sold are : " + productQuantities[i] + " items. Total: Rs. " + productTotal);
             }
         }
         return TotalCost;
     }
}
public class Product {
    public static void main(String[] args) {

        product_det obj=new product_det();
        double totalcost=obj.productcosts();
        System.out.println("Total retail value of all products sold: Rs. " + totalcost);
    }
}
