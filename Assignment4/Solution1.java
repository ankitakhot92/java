import java.util.Scanner;

public class Solution1 {
    public static void main(String[]args){
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        int i = n;
        while(i>0){
            fact = fact *(i);
            i--;
        }
        System.out.println(n + "! = " + fact);
    }
}