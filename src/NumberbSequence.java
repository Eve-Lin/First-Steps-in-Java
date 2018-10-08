import java.util.Scanner;

public class NumberbSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while(true){
            String command = scanner.nextLine();
            if(command.equals("END")){
                break;
            }
           int nextNum = Integer.parseInt(command);
           if(nextNum >max){
               max = nextNum;
           }
           if(nextNum < min){
               min = nextNum;
           }
        }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
