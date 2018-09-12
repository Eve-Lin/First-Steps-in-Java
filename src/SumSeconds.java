import java.util.Scanner;

public class SumSeconds {

    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);

        int firstCompetitor = Integer.parseInt(scanner.nextLine());
        int secondCompetitor = Integer.parseInt(scanner.nextLine());
        int thirdCompetitor = Integer.parseInt(scanner.nextLine());

        int sumMin = (firstCompetitor + secondCompetitor + thirdCompetitor) / 60;
        int sumSeconds = (firstCompetitor + secondCompetitor + thirdCompetitor) % 60;

        if (sumSeconds > 9) {
            System.out.println(sumMin + ":" + sumSeconds);
        } else {
            System.out.println(sumMin + ":" + "0" + sumSeconds);
        }
    }
}
