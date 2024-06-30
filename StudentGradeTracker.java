import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student grades (type -1 to finish):");

        // Input grades
        while (true) {
            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }
            grades.add(grade);
        }

        // Calculate average, highest, and lowest scores
        double average = grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        int highest = Collections.max(grades);
        int lowest = Collections.min(grades);

        // Output results
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}
