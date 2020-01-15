import java.util.Scanner;

public class Solution2 {
    public static void main(String[]args){
        //creating a new Scanner object
        Scanner sc = new Scanner(System.in);

        //getting user input
        System.out.println("Enter a integer: ");
        int num = sc.nextInt();

        //computing even or odd
        if(num%2.0 == 0)
            System.out.println("Even Number");
        else System.out.println("Odd Number");

        sc.close();
    }
}