import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int j;
        
        while(i<n){
            j = 1;
            while(j < n){
                System.out.print(n);
                j++;
            }
            System.out.println();
            i++;
        }

		
	}

}