import java.math.BigInteger;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double area = a * b;
        System.out.print(area);
        }
    }
