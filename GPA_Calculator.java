import java.util.Scanner;

public class GPA_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCredits = 0;
        double totalPoints = 0.0;

        System.out.print("Enter number of courses: ");
        int numCourses = scanner.nextInt();

        for (int i = 1; i <= numCourses; i++) {
            System.out.print("Enter numeric grade for course " + i + " (e.g. 4.0 for A): ");
            double grade = scanner.nextDouble();

            System.out.print("Enter credit hours for course " + i + ": ");
            int credits = scanner.nextInt();

            totalPoints += grade * credits;
            totalCredits += credits;
        }

        double gpa = totalPoints / totalCredits;
        System.out.printf("Your GPA is: %.2f\n", gpa);

        scanner.close();
    }
}
