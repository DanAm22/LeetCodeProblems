import java.util.Arrays;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int max = nums[nums.length - 1];
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] < max){
                max = nums[i];
                count++;
            }
            if(count == 3){
                return max;
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args){
        int[] nums = {2, 1, 9, 7, 5};
        int thirdMax = thirdMax(nums);
        System.out.println(thirdMax);
    }
}
