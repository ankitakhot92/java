public class Solution12 {
	public static void diamondOfStars(int n) {
		int i = 1;
	        
	        int m = n/2 + 1;
	        while(i <= m){
	            int j = 1;
	            while(j <= m - i){
	                System.out.print(" ");
	                j++;
	            }
	            j = 1;
	            while(j <= 2*i - 1){
	                System.out.print("*");
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
	        int p = n - m;
	        i = 1;
	        while(i <= p){
	            int j = 1;
	            while(j <= i){
	               System.out.print(" ");
	               j++; 
	            }
	            j = 1;
	            int stars = n - 2*i;
	            while(j <= stars){
	                System.out.print("*");
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
	        
		}
	}