import java.util.Scanner;
import java.lang.Math;

public class Solution4{
    public static void main(String[]args){
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //Number of digits

        //digits=1+(int)Math.floor(Math.log10(n));(could be used)

        int q = num;
        int count = 0;
        if(q == 0){
            count = 1;
        }
        while(q != 0){
            count++;
            q=q/10;
        }
        
        System.out.println("number of digits: " + count);

        //check for armstrong number
        int sum = 0;
        int p = num;
        while(p != 0){
            sum = sum + (int)Math.pow((p%10),count);
            p = p/10;
        }
        if(sum == num)
            System.out.println("Its an Armstrong Number");
        else
            System.out.println("Its not an Armstrong Number");
    }
}