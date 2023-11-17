package gradecalculator;
import java.util.Scanner;

public class Studentgradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        double score = scanner.nextDouble();

        char grade = calculateGrade(score);

        System.out.println("The student's grade is: " + grade);

        scanner.close();
    }

    public static char calculateGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}