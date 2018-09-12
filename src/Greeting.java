import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
