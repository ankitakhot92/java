import java.util.Scanner;
import java.lang.Math;

public class Solution11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        
        while(i <= n){
            int j = 1;
            while(j <= n-i){
                System.out.print(" ");
                j++;
            }
            int p = i;
            j = 1;
            while(j <= i){
                System.out.print(p);
                p++;
                j++;
            }
            p = p-2;
            j = 1;
            while(j <= i-1){
                System.out.print(p);
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
	}
}
