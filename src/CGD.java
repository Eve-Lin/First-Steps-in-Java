import java.util.Scanner;

public class CGD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int biggerNum = Math.max(a,b);
        int smallerNum = Math.min(a,b);
        int modulus = biggerNum % smallerNum;

        while(modulus >0){
            biggerNum = smallerNum;
            smallerNum = modulus;
            modulus = biggerNum % smallerNum;

        }
        System.out.println(smallerNum);
    }
}
