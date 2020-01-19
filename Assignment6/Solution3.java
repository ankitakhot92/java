import java.util.Scanner;
public class Solution3 {
    public static void main(String[]args){
        System.out.println("Enter three integers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int temp;
        if(num1>num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }if(num1>num3){
            temp = num1;
            num1 = num3;
            num3 = temp;
        }if(num2>num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        
        System.out.println(num1 + "," + num2 + "," + num3);
    }
}