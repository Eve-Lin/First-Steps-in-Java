import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sumLeft = 0;
        int sumRight = 0;

        for(int i = 1; i <=num ; i++) {
           int leftNum = Integer.parseInt(scanner.nextLine());
           sumLeft += leftNum;
        }
        for(int i = 1; i <=num ; i++) {
            int rightNum = Integer.parseInt(scanner.nextLine());
            sumRight += rightNum;
        }
        int equalOrDiff = Math.abs(sumLeft - sumRight);
        if(equalOrDiff == 0){
            System.out.println("Yes, sum = " + sumLeft);
        }else {
            System.out.println("No, diff = " + equalOrDiff);
        }

    }
}
