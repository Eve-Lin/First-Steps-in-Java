import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double vegetables = Double.parseDouble(scanner.nextLine());
        double fruits = Double.parseDouble(scanner.nextLine());
        int kgVegtables = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        System.out.print((vegetables *kgVegtables + fruits * kgFruits)/1.94);

    }
}
