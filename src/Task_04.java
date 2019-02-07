import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Rotating an array n times

public class Task_04 {
    public static void main (String [] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] numberArr = Arrays.stream(reader.readLine()
        .split(" "))
        .mapToInt(Integer::parseInt)
                .toArray();



        int n = Integer.parseInt(reader.readLine());

        int rotationNum = n % numberArr.length;


        for (int i = 0; i < rotationNum; i++) {

             int firstDigit = numberArr[0];

            for (int j = 0; j < numberArr.length; j++) {

                if ((j != (numberArr.length -1))) {

                    numberArr[j] = numberArr[j + 1];

                } else if(j== numberArr.length -1) {
                    numberArr[numberArr.length -1] = firstDigit;
                }

            }
        }
        for (Integer num: numberArr) {
            System.out.print(num + " ");

        }
    }
}
