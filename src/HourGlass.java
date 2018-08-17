import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class HourGlass {


    public static int hourglassSum(int[][] arr) {

        int TL = arr[0][0];
        int TC = arr[0][1];
        int TR = arr[0][2];
        int C = arr[1][1];
        int BL = arr[2][0];
        int BC = arr[2][1];
        int BR = arr[2][2];

        int sum = TL+TC+TR+C+BL+BC+BR;
        for(int i =0;i<4;i++){

            for(int j=0;j<4;j++){
                TL = arr[i][j];
                TC = arr[i][j+1];
                TR = arr[i][j+2];
                C = arr[i+1][j+1];
                BL = arr[i+2][j];
                BC = arr[i+2][j+1];
                BR = arr[i+2][j+2];

                int tmp = TL+TC+TR+C+BL+BC+BR;
                if(tmp>sum){
                    sum = tmp;
                }
            }
        }
        return sum;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}