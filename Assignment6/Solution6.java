import java.util.Scanner;

public class Solution6{
    public static void main(String[]args){
        System.out.println("Enter number of students: ");
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        System.out.println("Enter Student name and score: ");
        int temp_score = 0;
        String temp_name = "abc";

        while(total != 0){
            String name = sc.next();
            int score = sc.nextInt();
            if(score > temp_score){
                temp_name = name;
                temp_score = score;
            }
            total--;
        }
        System.out.println("Name of student with highest score: " + temp_name);
    }
}