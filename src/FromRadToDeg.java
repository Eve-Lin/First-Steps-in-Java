import java.util.Scanner;

public class FromRadToDeg {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double radian = Double.parseDouble(scanner.nextLine());

        System.out.println(Math.round(180 /Math.PI * radian));
    }
}
