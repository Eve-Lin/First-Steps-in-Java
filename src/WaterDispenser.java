import java.util.Scanner;

public class WaterDispenser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());

        int filledVolume = 0;
        int count =0;

        while(filledVolume <volume){
            String button = scanner.nextLine();
            if(button .equals("Easy")){
                filledVolume +=50;
                count +=1;
            }else if(button .equals("Medium")){
                filledVolume +=100;
                count +=1;
            }else if(button .equals("Hard")){
                filledVolume +=200;
                count +=1;
            }
        }
         if(filledVolume == volume){
             System.out.printf("The dispenser has been tapped %d times.", count);
         } else if(filledVolume > volume){
             System.out.printf("%dml has been spilled.",filledVolume - volume);
         }
    }
}
