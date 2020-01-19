import java.util.Scanner;

public class Solution5{
    public static void main(String[]args){
        int positives = 0, negatives = 0, count = 0;
        double avg,total = 0;

        System.out.println("Enter integer or 0 to exit: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number == 0){
            System.out.println("No number entered except 0");
            System.exit(1);
        }

        while(number != 0){
            if (number%2 == 0)
                positives++;
            else 
                negatives++;
            
            count++;
            total = total + number;
            number = sc.nextInt();
        }
        avg = total/count;

        System.out.println("The number of Positives : " + positives +
                            "\nThe number of Negatives : " + negatives +
                            "\ntotal : " + total +
                            "\naverage : " + avg);
    }
}