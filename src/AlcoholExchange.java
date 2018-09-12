import java.util.Scanner;

public class AlcoholExchange {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double whiskyPrice = Double.parseDouble(scanner.nextLine());

    double beer = Double.parseDouble(scanner.nextLine());
    double wine = Double.parseDouble(scanner.nextLine());
    double rakia = Double.parseDouble(scanner.nextLine());
    double whisky = Double.parseDouble(scanner.nextLine());

    double rakiaPrice = whiskyPrice/2;
    double winePrice = rakiaPrice * 0.60;
    double beerPrice = rakiaPrice*0.20;

    double totalSum = beer * beerPrice + wine * winePrice + rakia*rakiaPrice + whisky*whiskyPrice;
    System.out.printf("%.2f",totalSum);
    }
}
