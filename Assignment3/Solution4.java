import java.util.Scanner;

public class Solution4 {
    public static void main(String[]args){
        //creating a new Scanner object
        Scanner sc = new Scanner(System.in);

        //prompt and get user inputs
        System.out.println("Enter values of variables x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        //computing to swap without using 3rd variable
        int z = ((x + y) + (x - y)) / 2;
        x = ((x + y) - (x - y)) / 2;
        y = z;
        //displaying the results
        System.out.println("After Swapping x = " + x + " and y = " + y);

        sc.close();
    }
}