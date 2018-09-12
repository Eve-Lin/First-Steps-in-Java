import java.util.Scanner;

public class NewCurrencyConverter {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String firstCur = scanner.nextLine();
        String secondCur = scanner.nextLine();
        double converetedSum=0;



        if (firstCur.equals("BGN") && secondCur.equals("USD")) {
            converetedSum = Math.round(money *1/ 1.79549 *100);
            System.out.println(converetedSum/100 + secondCur);

        }else if(firstCur.equals("BGN") && secondCur.equals("EUR")) {
            converetedSum = Math.round(money * 1/ 1.95583 *100);
            System.out.println(converetedSum/100 + secondCur);

        }else if(firstCur.equals("BGN") && secondCur.equals("GBP")) {
            converetedSum = Math.round(money * 1/2.53405*100);
            System.out.println(converetedSum/100 + secondCur);

        }else if(firstCur.equals("USD") && secondCur.equals("BGN")) {
            converetedSum = Math.round(money * 1.79549*100);
            System.out.println(converetedSum/100 + secondCur);

        }else if(firstCur.equals("USD") && secondCur.equals("EUR")) {
            converetedSum = Math.round(money * 1.79549/1.95583*100) ;
            System.out.println(converetedSum/100 + secondCur);

        }else if(firstCur.equals("USD") && secondCur.equals("GBP")) {
            converetedSum =  Math.round(money * 1.79549/2.53405*100) ;
            System.out.println(converetedSum/100 + secondCur);

        }else if(firstCur.equals("EUR") && secondCur.equals("BGN")) {
            converetedSum = Math.round(money * 1.95583*100);
            System.out.println(converetedSum/100 + secondCur);

        }else if(firstCur.equals("EUR") && secondCur.equals("USD")) {
            converetedSum = Math.round(money * 1.95583/1.79549*100) ;
            System.out.println(converetedSum/100 + secondCur);

        }else if(firstCur.equals("EUR") && secondCur.equals("GBP")) {
            converetedSum =  Math.round(money * 1.95583/2.53405*100);
            System.out.println(converetedSum/100 + secondCur);

        }else if(firstCur.equals("GBP") && secondCur.equals("BGN")) {
            converetedSum = Math.round(money * 2.53405*100);
            System.out.println(converetedSum/100 + secondCur);

        }else if(firstCur.equals("GBP") && secondCur.equals("USD")) {
            converetedSum = Math.round(money * 2.53405/1.79549*100);
            System.out.println(converetedSum/100 + secondCur);

        }else if(firstCur.equals("GBP") && secondCur.equals("EUR")) {
            converetedSum = Math.round(money * 2.53405/1.95583*100);
            System.out.println(converetedSum/100 + secondCur);

        }

    }
}
