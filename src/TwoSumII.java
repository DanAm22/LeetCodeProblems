public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }
        return result;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] numbers = {1, 3, 9};
        int target = 10;
        int[] result = twoSum(numbers,target);
        printArray(result);
    }
}
