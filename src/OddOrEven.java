import java.util.Scanner;

public class OddOrEven {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int num = Integer.parseInt(scanner.nextLine());
            int sumOdd = 0;
            int sumEven = 0;

            for(int i = 1; i <=num ; i++) {
                int nextNum = Integer.parseInt(scanner.nextLine());
               if(i%2==0){
                   sumEven += nextNum;
            }else{
                   sumOdd += nextNum;

               }
            }

            int equalOrDiff = Math.abs(sumEven - sumOdd);
            if(equalOrDiff == 0){
                System.out.println("Yes");
                System.out.println("Sum = " + sumOdd);
            }else {
                System.out.println("No");
                System.out.println("Diff = " + equalOrDiff);
            }

        }
    }

