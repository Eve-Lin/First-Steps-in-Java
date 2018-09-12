import java.util.Scanner;

public class FromCelsiusToFarenheit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double celsius = Double.parseDouble(scanner.nextLine());
        double farenheit =  Math.round((celsius * 1.8 + 32)*100);
        System.out.println(farenheit / 100);
    }
}
