import java.util.Scanner;

public class Solution8 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        
        while(i <= n){
            int j = 1;
            int start = 1;
            while(j <= (n-i)){
                System.out.print(" ");
                j++;
            }
            j = 1;
            while(j <= i){
                System.out.print(start);
                start++;
                j++;
            }
            System.out.println();
            i++;
        }
		
	}

}
