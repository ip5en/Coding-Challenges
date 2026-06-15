import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.List.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'matrixRotation' function below.
     *
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY matrix
     *  2. INTEGER r
     *  3. INTEGER m
     *  4. INTEGER n
     */

    public static void matrixRotation(List<List<Integer>> matrix, int r, int m, int n) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        // Find the number of layers
        int noLayers = Math.min(m,n)/2;
        // Find last column
        int lastCol = matrix.get(0).size()-1;
        // Find last row
        int lastRow = matrix.size()-1;
        // Set first column
        int firstCol = 0;
        // Set first Row
        int firstRow = 0;
        // Create temp list to hold layers 
        List<List<Integer>> tempList = new ArrayList<>(noLayers);
        // Create a matrix to hold the result and initialise it to the right size
        List<List<Integer>> result = new ArrayList<>();        
        for(int i = 0; result.size() < matrix.size(); i++){
            result.add(new ArrayList<>());
            while (result.get(i).size() < matrix.get(i).size()){
                result.get(i).add(0);
            }
        }
        
        // Parse matrix into layers
        for(int j = 0; j < noLayers; j++){
            // Initialise a new layer
            tempList.add(new ArrayList<>());
            // Pull the top row
            for(int i = firstCol; i <= lastCol; i++){
                tempList.get(j).add(matrix.get(firstRow).get(i));
            }
            // Pull the right column
            for(int i = firstRow+1; i <= lastRow; i++){
                tempList.get(j).add(matrix.get(i).get(lastCol));
            }
            // Pull the bottom row
            for(int i = lastCol-1; i >= firstCol ; i--){
                tempList.get(j).add(matrix.get(lastRow).get(i));
            }        
            // Pull the left column
            for(int i = lastRow-1; i > firstRow; i--){
                tempList.get(j).add(matrix.get(i).get(firstCol));
            }
            // Move to the next layer
            firstCol++;
            firstRow++;
            lastCol--;
            lastRow--;
        }
        // Reset trackers
        lastCol = matrix.get(0).size()-1;
        lastRow = matrix.size()-1;
        firstCol = 0;
        firstRow = 0;
        
        // Rebuild the matrix shifting layers by min rotations
        for(int j = 0; j < tempList.size(); j++){
            int minR = r%tempList.get(j).size();
            int index = 0;
            
            // Fill the top row
            for(int i = firstCol; i <= lastCol; i++){
                result.get(firstRow).set(i, tempList.get(j).get((index + minR) % tempList.get(j).size()));
                index++;
            }
            // Fill the right column
            for(int i = firstRow+1; i <= lastRow; i++){
                result.get(i).set(lastCol, tempList.get(j).get((index + minR) % tempList.get(j).size()));
                index++;
            }
            // Fill the bottom row
            for(int i = lastCol-1; i >= firstCol ; i--){
                result.get(lastRow).set(i, tempList.get(j).get((index + minR) % tempList.get(j).size()));
                index++;
            }        
            // Fill the left column
            for(int i = lastRow-1; i > firstRow; i--){
                result.get(i).set(firstCol, tempList.get(j).get((index + minR) % tempList.get(j).size()));
                index++;
            }
            // Move to the next layer
            firstCol++;
            firstRow++;
            lastCol--;
            lastRow--;
        } 
        
        // Print the result
        for (int i = 0; i < result.size(); i++){
            int w = result.get(i).size();
           
            for (int j = 0; j < w; j++){
                bufferedWriter.write(result.get(i).get(j).toString() + " ");                
            }
            bufferedWriter.newLine();        
        }
        bufferedWriter.close();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        int r = Integer.parseInt(firstMultipleInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                matrix.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        Result.matrixRotation(matrix, r, m, n);

        bufferedReader.close();
    }
}
