import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++){
            nums[i] = nums1[i];
        }
        for(int j = nums1.length; j < nums.length; j++){
            nums[j] = nums2[j - nums1.length];
        }
        Arrays.sort(nums);
        if(nums.length % 2 == 1){
            return nums[nums.length / 2];
        }
        else{
            return (double) (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5, 6};
        int[] nums2 = {3, 4};
        double result = findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }
}
