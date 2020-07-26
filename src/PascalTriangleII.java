import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>(rowIndex);
        List<Integer> prevRow = new ArrayList<Integer>();

        prevRow.add(1);
        pascal.add(prevRow);
        if(rowIndex == 0){
            return prevRow;
        }

        for(int i = 1; i <= rowIndex; i++){
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
        return prevRow;
    }

    public static void main(String[] args) {
        int k = 10;
        List<Integer> kthRow = getRow(k);
        System.out.println(kthRow);
    }
}
