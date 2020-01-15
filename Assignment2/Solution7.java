import java.util.Scanner;
import java.lang.Math;

public class Solution7 {
    public static void main(String[]args){
        //creating a new scanner object
        Scanner sc = new Scanner(System.in);

        //prompt to get user input
        System.out.println("Enter x and y cordinates of two points: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        //computing the distance between two points
        double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        //displaying the results
        System.out.println("distance = " + distance);

        sc.close(); 
    }
}