import java.util.Scanner;

public class Solution3 {
    public static void main(String[]args){
        //Creating a new Scanner object
        Scanner sc = new Scanner(System.in);

        //getting user inputs
        System.out.println("Enter values of variables x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();

        //computing to swap two variables
        int temp = x;
        x = y;
        y = temp;

        //Displaying the results
        System.out.println("After Swapping x = " + x + " y = " + y);

        sc.close();
    }
}