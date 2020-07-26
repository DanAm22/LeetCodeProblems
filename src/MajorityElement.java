public class MajorityElement {
    public static int majorityElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(count(nums,nums[i]) > nums.length / 2){
                return nums[i];
            }
        }
        return 0;
    }

    public static int count(int[] nums, int n){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == n){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        int majority = majorityElement(nums);
        System.out.println(majority);
    }

}
