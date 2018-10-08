import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        int bookCapacity = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean bookFound = false;
        String nextBook = "";


        while(counter < bookCapacity){
            nextBook = scanner.nextLine();

            if(nextBook.equals(book)){
                bookFound = true;
                break;
            }else{
                bookFound = false;
                counter ++;

            }
        }
        if (bookFound) {
            System.out.printf("You checked %d books and found it.", counter);

        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);

        }
    }
}
