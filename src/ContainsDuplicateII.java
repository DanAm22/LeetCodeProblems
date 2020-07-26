public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && Math.abs(i - j) <= k){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        boolean containsDuplicates = containsNearbyDuplicate(nums,k);
        System.out.println(containsDuplicates);
    }
}
