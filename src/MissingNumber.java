import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        if(nums[nums.length - 1] != nums.length){
            return nums.length;
        }
        return 1;
    }

    public static void main(String[] args){
        int nums[] = {9,6,4,2,3,5,7,0,1};
        int result = missingNumber(nums);
        System.out.println(result);
    }
}
