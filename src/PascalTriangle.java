import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>(numRows);
        if(numRows == 0){
            return pascal;
        }

        List<Integer> prevRow = new ArrayList<Integer>();
        prevRow.add(1);
        pascal.add(prevRow);

        for(int i = 1; i < numRows; i++){
            List<Integer> newRow = new ArrayList<Integer>(i+1);
            newRow.add(1);
            for(int j = 0; j < prevRow.size() - 1; j++){
                int sum = prevRow.get(j) + prevRow.get(j+1);
                newRow.add(sum);
            }
            newRow.add(1);
            pascal.add(newRow);
            prevRow = newRow;
        }
        return pascal;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> pascal = generate(5);
        System.out.println(pascal);
    }
}
