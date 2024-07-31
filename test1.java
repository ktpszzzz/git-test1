import java.util.Scanner;
/**
 * Tn1
 */
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a score");
        int score = scanner.nextInt();
        char grade;
        if (score >= 80) {
            grade = 'A';            
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(" Your grade is " + grade);
    }
}