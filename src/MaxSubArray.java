public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum > max){
                    max = sum;
                }
            }
            sum = 0;
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = maxSubArray(nums);
        System.out.println(sum);
    }
}
