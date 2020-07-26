public class HouseRobber {
    public static int rob(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int nextOne = 0;
        int nextTwo = 0;
        for(int i = 0; i < nums.length; i++){
            int tmp = nextOne;
            nextOne = Math.max(nextTwo + nums[i], nextOne);
            nextTwo = tmp;
        }
        return nextOne;
    }

    public static void main(String[] args){
        int[] nums = {1, 7, 9, 10, 2};
        int result = rob(nums);
        System.out.println(result);
    }
}
