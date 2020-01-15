import java.util.Scanner;
import java.lang.Math;

public class Solution8 {
    public static void main(String[]args){
        System.out.println("a       b       pow(a,b)");
        for(float i=1; i<6; i++){
            System.out.println((int)i + "       " + (int)(i+1) + "       " + (int)Math.pow(i,i+1));
        }
    }
}