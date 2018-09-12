import java.util.Scanner;

public class BonusScore {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

            int num = Integer.parseInt(scanner.nextLine());

            double bonus = 0;
            if(num % 2 ==0){
                bonus=1;
            }else if(num % 10 == 5){
                bonus =2;
            }

            if(num <=100){
                bonus +=5;
            }else if(num >100 && num < 1000){
                bonus += 0.2 * num;
            } else if(num >=1000){
                bonus+=0.1 * num;
            }
          System.out.println(bonus);
            System.out.println(num+bonus);
        }
    }
