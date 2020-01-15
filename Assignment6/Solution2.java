import java.util.Scanner;
import java.time.DayOfWeek;

public class Solution2{
    public static void main(String[]args){
        System.out.println("Enter todays day of week: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter number of days from today for future day: ");
        int num2 = sc.nextInt();
        num1 = (num1 + num2)%7;
        String day = DayOfWeek.of(num1).toString();
        System.out.println("Day: " + day);
    }
}