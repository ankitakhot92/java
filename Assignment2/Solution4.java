import java.util.Scanner;

public class Solution4 {
    public static void main(String[]args){
        //creating a new scanner object
        Scanner sc = new Scanner(System.in);

        //getting user input
        System.out.println("Enter a integer between 0 and 1000: ");
        int number = sc.nextInt();

        //computing sum of digits
        int sum = 0;
        while(number != 0){
            sum = sum + (number%10);
            number = number/10;
        }

        //Displaying the results
        System.out.println("sum = " + sum);
        
        sc.close();
    }
}