import java.util.Scanner;

public class DailyEarnings {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double dollarBglev = Double.parseDouble(scanner.nextLine());

         double earnings = (days * moneyPerDay * 12) + (2.5 * days * moneyPerDay);
         double taxes = earnings * 0.25;
         double pureIncome = Math. round((earnings - taxes) * dollarBglev/365 *100);
        System.out.print(pureIncome/100);
    }
}
