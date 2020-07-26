public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[k++] = nums[i];
            }
        }
        for(int j = k; j < nums.length; j++){
            nums[j] = 0;
        }
    }

    public static void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        printArray(nums);
    }
}

