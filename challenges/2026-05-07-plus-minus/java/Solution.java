import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float pos = 0;
        float neg = 0;
        float zer = 0;
        
        for(int i: arr){
            if (i > 0){
                pos++;
            } else if (i < 0){
                neg++;
            } else {
                zer++;
            }
        }
        
        pos = pos / arr.size();
        neg = neg / arr.size();
        zer = zer / arr.size();        
        
        System.out.printf("%.6f%n", pos);
        System.out.printf("%.6f%n", neg);
        System.out.printf("%.6f%n", zer);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
