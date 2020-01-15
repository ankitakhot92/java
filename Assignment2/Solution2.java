import java.util.Scanner;
import java.lang.Math;

public class Solution2 {
    public static void main(String[]args){
        //Creating a new scanner object
        Scanner sc = new Scanner(System.in);

        //prompt user for inputs
        System.out.println("Enter the radius of Cylinder: ");
        double radius = sc.nextDouble();
        System.out.println("Enter length of Cylinder: ");
        double length = sc.nextDouble();

        //computing area and volume of cylinder
        double area = radius * radius * Math.PI;
        double volume = area * length;

        //Displaying the outputs
        System.out.println("area = " + area);
        System.out.println("volume = " + volume);
        
        sc.close();
    }
}