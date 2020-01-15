import java.util.Scanner;

public class Solution5 {
    public static void main(String[]args){
        //Creating a new scanner object
        Scanner sc =  new Scanner(System.in);

        //prompt user for input minutes
        System.out.println("Enter minutes: ");
        int minutes = sc.nextInt();

        //computing number of years and days
        int years = (((minutes/60)/24)/365);
        int days = (minutes%(60*24*365))/(60*24);

        //Displaying the results
        System.out.println("aprroximately " + years + " years and " + days + " days");

        sc.close();
    }
}