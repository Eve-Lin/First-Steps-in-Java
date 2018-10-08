import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("n - ");
            int num = scanner.nextInt();
            System.out.println("Enter the numbers: ");
            int minNum = Integer.MAX_VALUE;
            for (int i = 1; i <=num ; i++) {

                int nextNum = scanner.nextInt();
                if(nextNum <= minNum){
                    minNum = nextNum;
                }
            }
            System.out.println(minNum);
        }


}
