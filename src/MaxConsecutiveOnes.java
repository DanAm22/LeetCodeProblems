public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 1;
        int maxConsecutive = 0;
        if(!containsOne(nums)){
            return 0;
        }
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1] && nums[i] == 1){
                count++;
            }
            else{
                if(count > maxConsecutive){
                    maxConsecutive = count;
                }
                count = 1;
            }
        }
        if(count > maxConsecutive){
            maxConsecutive = count;
        }
        return maxConsecutive;
    }

    public static boolean containsOne(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}
