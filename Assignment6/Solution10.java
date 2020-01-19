import java.util.Scanner;

public class Solution10{
    public static void main(String[]args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=2;
        int count = 0;
        while(num != 1){
            if(num % i == 0){
                System.out.print(i + ",");
                num = num/i;
                i = 2;
                count++;
            }else{
                i++;
                num = num;
            }
        }
        System.out.print(".");
    }
    
}