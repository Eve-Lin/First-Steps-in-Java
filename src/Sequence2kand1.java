import java.util.Scanner;

public class Sequence2kand1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int count = 1;

        while(count <=num){
            System.out.println(count);
            count = 2 * count + 1;
        }
    }
}
