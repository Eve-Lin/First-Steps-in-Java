import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = Math.round((a * h / 2) *100);


        System.out.print("Triangle area = " + area/ 100);
    }
}
