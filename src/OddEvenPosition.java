import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        double oddSum = 0;
        double maxOdd = Double.MIN_VALUE;
        double minOdd = Double.MAX_VALUE;
        double evenSum = 0;
        double maxEven = Double.MIN_VALUE;
        double minEven = Double.MAX_VALUE;


        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                double nextOddNum = Double.parseDouble(scanner.nextLine());
                oddSum += nextOddNum;
                if (nextOddNum <= minOdd) {
                    minOdd = nextOddNum;
                }
                if (nextOddNum >= maxOdd) {
                    maxOdd = nextOddNum;
                }
            } else if (i % 2 == 0) {
                double nextEvenNum = Double.parseDouble(scanner.nextLine());
                evenSum += nextEvenNum;
                if (nextEvenNum <= minEven) {
                    minEven = nextEvenNum;
                }
                if (nextEvenNum >= maxEven) {
                    maxEven = nextEvenNum;
                }
            }
        }
        System.out.println("OddSum = " + oddSum);
        if (minOdd != maxOdd) {
            System.out.println("OddMin = " + minOdd);
            System.out.println("OddMax = " + maxOdd);
        } else if (minOdd==maxOdd){
            System.out.println("OddMin = No");
            System.out.println("OddMax = No");
        }

        System.out.println("EvenSum = " + evenSum);
        if (minEven != maxEven) {
            System.out.println("EvenMin = " + minEven);
            System.out.println("EvenMax = " + maxEven);
        } else if(minEven==maxEven) {
            System.out.println("EvenMin = No");
            System.out.println("EvenMax = No");

        }
    }
}

