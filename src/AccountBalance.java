import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int transactions = Integer.parseInt(scanner.nextLine());
        int count = 1;
        double sum = 0;

        while (count <=transactions) {
            double money = Double.parseDouble(scanner.nextLine());
            if (money >= 0) {
                System.out.printf("Increase: %.2f %n", money);
                sum += money;
                count += 1;

            } else {
                System.out.println("Invalid operation!");
                break;
            }
        }
        System.out.printf("Total: %.2f", sum);
    }
}