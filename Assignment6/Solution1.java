import java.util.Random;
import java.time.Month;

public class Solution1 {
    public static void main(String[]args){
        Random r = new Random();
        int num = r.nextInt(13);
        //Create a Month instance
        Month month =  Month.of(num);
        System.out.println("Month: " + month);
    }
}