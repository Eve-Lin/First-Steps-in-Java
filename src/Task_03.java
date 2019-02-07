import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Write a program which creates 2 arrays.
// You will be given an integer n. On the next n lines you get 2 integers.
// Form 2 arrays as shown below.

public class Task_03 {
    public static void main (String [] args) throws IOException
    {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(reader.readLine());

    int [] firstArray = new int[n];
    int [] secondArray = new int[n];



        for (int i = 0; i < n; i++) {

            int [] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if(i % 2 == 0) {
                firstArray[i] = numbers[0];
                secondArray[i] = numbers[1];
            }else {
                firstArray[i] = numbers[1];
                secondArray[i] = numbers [0];
            }
        }

        for (int i = 0; i < firstArray.length ; i++) {

            System.out.print(firstArray[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < firstArray.length ; i++) {

            System.out.print(secondArray[i] + " ");

        }

    }
}
