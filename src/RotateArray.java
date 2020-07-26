public class RotateArray {
    public static void rotate(int[] nums, int k) {

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int newIndex = (i + k) % nums.length;

            result[newIndex] = nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = result[i];
        }
    }

    public static void printArray(int[] array){
        for(int el : array){
            System.out.print(el + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        printArray(nums);
    }
}
