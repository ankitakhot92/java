import java.util.Scanner;

public class Solution1 {
    public static void main(String[]args){
        System.out.println("Enter the temperature in celcius: ");
        Scanner sc = new Scanner(System.in);
        double celcius = sc.nextDouble();
        //double fahrenhiet = 9/5 * celcius + 32;
        double fahrenhiet = 9.0/5 * celcius + 32;
        System.out.println("temperature in fahrenhiet = " + fahrenhiet);
        sc.close();
    }
}