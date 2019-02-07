import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Write a program to find all the top integers in an array.
// A top integer is an integer which is bigger than all the elements to its right.

public class Task_05 {
    public static void main (String [] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int [] numArray = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isGreater = false;

        for (int i = 0; i < numArray.length; i++) {

            int number = numArray[i];

            for (int j = i +1 ; j < numArray.length ; j++) {

                if(number > numArray[j]){
                    isGreater = true;
                } else{
                    isGreater = false;
                    break;
                }

            }
            if(isGreater || i==numArray.length -1){

                    System.out.print(number + " ");
                }
            isGreater = false;

            }


        }
    }

