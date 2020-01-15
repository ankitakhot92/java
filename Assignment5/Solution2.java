import java.util.Scanner;

public class Solution2{
    public static void main(String[]args){
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num=num1;
        int rem = 0;
        while(num != 0){
            rem = rem * 10 + num%10;
            num = num/10;
        }
        if(rem == num1){
            System.out.println("Its a Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}