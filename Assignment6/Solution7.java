import java.util.Scanner;

public class Solution7{
    public static void main(String[]args){
        System.out.println("Enter number of students: ");
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        System.out.println("Enter Student name and score: ");
        int temp2_score = 0,temp1_score = 0;
        String temp2_name="abc",temp1_name = "abc";

        while(total != 0){
            String name = sc.next();
            int score = sc.nextInt();
            if(score > temp1_score){
                temp2_name = temp1_name;
                //temp2_score = temp1_score;
                temp1_name = name;
                temp1_score = score;
            }else if(score > temp2_score){
                temp2_name = name;
                temp2_score = score;
            }
            total--;
        }
        System.out.println("Name of student with highest score: " + temp1_name + 
                            "\n Name of student with second highest score: " + temp2_name);
    }
}