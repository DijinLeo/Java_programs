package module1;
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Score (0 to 100): ");
        int score = sc.nextInt();
        String grade;
        if (score >= 90 && score <= 100) {
            grade = "S";
        }
         else if (score >= 85) {
            grade = "A+";
        }
        else if (score >= 80) {
            grade = "A";
        } 
        else if (score >= 70) {
            grade = "B";
        } 
        else if (score >= 60) {
            grade = "C";
        } 
        else if (score >= 50) {
            grade = "D";
        } 
        else if (score >= 0) {
            grade = "F";
        } 
        else {
            grade = "Invalid Score";
        }
        System.out.println("\nGrade Card");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
    }
}
