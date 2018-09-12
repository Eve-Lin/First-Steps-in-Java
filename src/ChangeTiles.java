import java.util.Scanner;

public class ChangeTiles {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int square = Integer.parseInt(scanner.nextLine());
        double tileWidth = Double.parseDouble(scanner.nextLine());
        double tileLength = Double.parseDouble(scanner.nextLine());
        int benchWidth = Integer.parseInt(scanner.nextLine());
        int benchLength = Integer.parseInt(scanner.nextLine());

        double tiles = (square * square - (benchLength * benchWidth))/ (tileLength * tileWidth);
        double time = tiles * 0.2;

        System.out.println(tiles);
        System.out.println(time);
    }
}
