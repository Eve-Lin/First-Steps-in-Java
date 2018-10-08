import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPoorMarks = Integer.parseInt(scanner.nextLine());
        double grade = 0;
        int counter = 0;
        int counterPoor = 0;
        double sum = 0;
        String problem = "";

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Enough")) {
                System.out.printf("Average score: %.2f%n", sum / counter);
                System.out.printf("Number of problems: %d%n", counter);
                System.out.printf("Last problem: %s", problem);
                break;
            } else {
                grade = Integer.parseInt(scanner.nextLine());
                sum += grade;
                counter++;
                problem = command;
            }
            if (grade <= 4) {
                counterPoor++;

            }
            if (counterPoor == numPoorMarks) {
                System.out.printf("You need a break, %d poor grades.", numPoorMarks);
                break;
            }
        }

    }

    }
