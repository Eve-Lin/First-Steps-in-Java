import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double wardrobeSide = Double.parseDouble(scanner.nextLine());
        double bench = length * width / 10;
        double dancer = 0.004 + 0.7;

        double area = length * width - (Math.pow(wardrobeSide,2)+ bench);
        double dancers = Math.floor(area/dancer);

        System.out.printf("%.0f", dancers);
    }
}
