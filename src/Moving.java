import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthSpace = Integer.parseInt(scanner.nextLine());
        int lengthSpace = Integer.parseInt(scanner.nextLine());
        int heightSpace = Integer.parseInt(scanner.nextLine());
        int volumeFree = widthSpace * lengthSpace * heightSpace;
        int volumeBoxes = 0;

        while (volumeBoxes < volumeFree) {
            String command = scanner.nextLine();
            if (command.equals("Done")) {
                break;
            } else {
                int numberBoxes = Integer.parseInt(command);
                volumeBoxes += numberBoxes;
            }
        }
        if(volumeBoxes <= volumeFree){
            System.out.printf("%d Cubic meters left.",volumeFree - volumeBoxes);
        }else{
            System.out.printf("No more free space! You need %d Cubic meters more.", volumeBoxes - volumeFree);
        }
    }
}