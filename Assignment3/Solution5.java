import java.util.Scanner;
import java.lang.Math;

public class Solution5 {
    public static void main(String[]args){
        //Creating a new Scanner object
        Scanner sc = new Scanner(System.in);

        //getting user inputs
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        //computer whether prime or not
        boolean isPrime = false;

        for(int i=2;i<Math.ceil(Math.sqrt(num));i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        } 
        if(isPrime){
            System.out.println("Prime Number");
        }   
        else {
            System.out.println("Not a Prime Number");
        }    
        sc.close();
    }
}