import java.util.Scanner;

public class Solution6 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        
        while(i <= n){
            int j = 1;
            char start = (char)('A' + i - 1);
            while(j <= i){
                System.out.print(start);
                start = (char)(start + 1);
                j++;
            }
            System.out.println();
            i++;
        }

		
	}

}