import java.util.Scanner;

public class Charity {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int confectioners = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int wafers = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double sumCakes = cakes * 45;
        double sumWafers = wafers * 5.80;
        double sumPancakes = pancakes * 3.20;

        double totalSum = days * confectioners * (sumCakes + sumWafers + sumPancakes);
        double realSum = totalSum-totalSum/8;
        System.out.printf("%.2f",realSum);
    }
}
