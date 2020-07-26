import java.util.Arrays;

public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] array) {
        int[] result = new int[array.length];
        for(int i = 0; i < array.length; i++){
            result[i] = (int) Math.pow(array[i],2);
        }
        Arrays.sort(result);
        return result;
    }

    public static void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] array = {-7,-3,2,3,11};
        int[] result = sortedSquares(array);
        printArray(result);
    }
}
