import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String student = scanner.nextLine();
        double counter = 1;
        double sum = 0;
        int retake = 0;
        while (counter <= 12 && retake < 2) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4) {
                sum += grade;
                counter += 1;
            } else if (grade < 4) {
                retake += 1;
            }
        }
        if (retake > 1) {
            System.out.printf("%s has been excluded at %.0f grade",student, counter);
        } else {
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", student, average);
        }
    }
}
