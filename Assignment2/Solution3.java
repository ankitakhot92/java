import java.util.Scanner;

public class Solution3 {
    public static void main(String[]args){
        //creating a new scanner class
        Scanner sc = new Scanner(System.in);

        //getting user inputs
        System.out.println("Enter Subtotal and gratuity rate: ");
        double subtotal = sc.nextDouble();
        double gratuityRate = sc.nextDouble();

        //computing gratuity and total
        double gratuity = gratuityRate/100 * subtotal;
        double total = gratuity + subtotal;

        //Displaying the results
        System.out.println("gratuity = " + gratuity);
        System.out.println("total = " + total);

        sc.close();
    }
}