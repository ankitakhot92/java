public class Solution3{
    public static void main(String[]args){
        int x = 0;
        int y = 1;
        System.out.print(x + "," + y + ",");
        int z = 10;
        while(z != 21){
        z = x + y;
        x = y;
        y = z;
        System.out.print(z + ",");
        }
        System.out.print("...");
    }
}