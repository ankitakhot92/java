import java.util.Scanner;

public class Solution4 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int j;
        
        while(i <= n){
            j = 1;
            int start = i;
            while(j <= i){
                System.out.print(start);
                start--;
                j++;
            }
            System.out.println();
            i++;
        }

		
	}

}