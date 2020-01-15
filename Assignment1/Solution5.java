import java.lang.Math;

public class Solution5 {
    public static void main(String[]args){
        double radius = 5.5f;
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;
        System.out.println("Perimeter of circle = " + perimeter);
        System.out.println("Area of circle = " + area);
    }
}