
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner inp =  new Scanner(System.in);
        float  price, kdv1, kdv2, totalPrice, kdvAmount;

        kdv1 = 0.18f;
        kdv2 = 0.08f;

        System.out.print("Pleas, enter the price: ");
        price = inp.nextFloat();

        if ( 0 <= price && price <= 1000){
            kdvAmount = price*kdv1;
            totalPrice = kdvAmount + price;
            System.out.println("price: " + price);
            System.out.println("KDV amount: " + kdvAmount);
            System.out.println("total price: " + totalPrice);
        } else if (price > 1000) {
            kdvAmount = price*kdv2 ;
            totalPrice = kdvAmount + price;
            System.out.println("price: " + price);
            System.out.println("KDV amount: " + kdvAmount);
            System.out.println("total price: " + totalPrice);
        } else {
            System.out.println(" incorrect type  ");
        }






    }
}
