import java.util.Scanner;

public class Solution5 {
    public static void main(String[]args){
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int greatest;
        if(num1 > num2){
            greatest = num1;
            if(num3 > num1){
                greatest = num3;
            }
        }
        else{
            greatest = num2;
            if(num3 > num2){
                greatest = num3;
            }
        }
        System.out.println("Greatest: " + greatest);
    }
}