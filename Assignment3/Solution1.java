import java.util.Scanner;

public class Solution1 {
    public static void main(String[]args){
        //creating a new Scanner object
        Scanner sc = new Scanner(System.in);

        //Getting user inputs
        System.out.println("Enter two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        //displaying the results
        System.out.println("Sum = " + (num1 + num2));

        sc.close();
    }
}