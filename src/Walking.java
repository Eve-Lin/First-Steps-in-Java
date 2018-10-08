import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        while(true){
        String command = scanner.nextLine();
        if(command.equals("Going home")){
            command = scanner.nextLine();
            int steps =Integer.parseInt(command);
            sum +=steps;
            break;
        }else{
            int steps =Integer.parseInt(command);
            sum +=steps;
        }
            if (sum >=10000){
                break;
            }
        }
        if (sum >=10000){
            System.out.println("Goal reached! Good job!");
        }else{
            int difference = 10000 - sum;
            System.out.printf("%d more steps to reach goal.", difference);
        }
    }
}
