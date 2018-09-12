import java.util.Scanner;

public class VacationMoney {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int bitCoin = Integer.parseInt(scanner.nextLine());
        double yuan = Double.parseDouble(scanner.nextLine());
        double sumCom = Double.parseDouble(scanner.nextLine());

        double convertedSum = ((1168 * bitCoin) + (yuan * 0.15 * 1.76)) / 1.95;

        System.out.print(convertedSum - (convertedSum * sumCom)/100);
    }
}
