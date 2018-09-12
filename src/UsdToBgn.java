import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = Math.round(usd * 1.79549 *100);

        System.out.print(bgn/100);
    }
}
