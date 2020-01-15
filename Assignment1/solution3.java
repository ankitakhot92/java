import java.lang.Math;

public class Solution3 {
    public static void main(String[]args){
        System.out.println("a     a^2     a^3");
        for(int i=1;i<=4;i++){
            System.out.println(i+"     "+ (int)Math.pow(i,2) +"       "+ (int)Math.pow(i,3));
        }
    }
}