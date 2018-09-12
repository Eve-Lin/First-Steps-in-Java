import java.util.Scanner;

public class GreaterNummber {

    public static void main(String[] args){

        System.out.println("Enter two integers:");
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (a >=b){
            System.out.println("Greater number: " + a);
        } else{
            System.out.println("Greater number: " + b);
        }
    }
}
