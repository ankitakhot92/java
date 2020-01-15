import java.util.Scanner;
import java.lang.Math;

public class Solution6 {
    public static void main(String[]args) {
        //Creating a new scanner object
        Scanner sc = new Scanner(System.in);
        
        //prompting user to get inputs as weight and height
        System.out.println("Enter weight in pounds and height in inches: ");
        double weightPounds = sc.nextDouble();
        double heightInches = sc.nextDouble();

        //Computing BMI
        double bmi = (weightPounds * 0.45359237) / (Math.pow((heightInches * 0.0254),2));

        //Displaying the results
        System.out.println("BMI = " + bmi);

        sc.close();
    }
}