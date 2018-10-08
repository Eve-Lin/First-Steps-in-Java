import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n - ");
        int num = scanner.nextInt();
        System.out.println("Enter the numbers: ");
        int biggestNum = Integer.MIN_VALUE;
        for (int i = 1; i <=num ; i++) {

            int nextNum = scanner.nextInt();
            if(nextNum >= biggestNum){
                biggestNum = nextNum;
            }
        }
        System.out.println(biggestNum);
    }

}
