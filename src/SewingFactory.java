import java.util.Scanner;

public class SewingFactory {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int tables = Integer.parseInt(scanner.nextLine());

        double tableLength = Double.parseDouble(scanner.nextLine());
        double tableWidth = Double.parseDouble(scanner.nextLine());

        double tablecloth = (tableLength + 0.6) * (tableWidth + 0.6) * tables;

        double tableCover = tableLength * tableLength/4 * tables;

        double sumDollars = tablecloth * 7 + tableCover * 9;

        double sumLv = sumDollars*1.85;

        System.out.printf("%.2f USD %n",sumDollars);
        System.out.printf("%.2f BGN",sumLv);

    }
}
