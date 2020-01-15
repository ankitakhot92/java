import java.util.Scanner;

public class Solution2 {
    public static void main(String[]args){
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while(num != 0){
            rev = 10 * rev + num%10;
            num = num/10;
        }
        System.out.println("Reverse number: " + rev);
    }
}