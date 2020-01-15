import java.util.Scanner;

public class Solution4{
    public static void main(String[]args){
        System.out.println("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*r - 2*i - 1);k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}