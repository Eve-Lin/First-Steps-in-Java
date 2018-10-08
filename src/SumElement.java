import java.util.Scanner;

public class SumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int maxNum =0;
        int sum = 0;
        for (int i = 0; i < num ; i++) {
             int nextNum = Integer.parseInt(scanner.nextLine());
             sum +=nextNum;
             if(nextNum >=maxNum){
                 maxNum = nextNum;
             }
        }
        int difference = Math.abs(sum - 2 *maxNum);
        if(sum - maxNum ==maxNum){
            System.out.println("Yes");
            System.out.println("Sum = " + maxNum);
        }else{
            System.out.println("No");
            System.out.println("Diff = " +difference);
        }
    }
}
