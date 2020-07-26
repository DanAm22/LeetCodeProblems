import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 9, 10, 7, 0, 9, 123, 9231};
        boolean isDuplicates = containsDuplicate(nums);
        System.out.println(isDuplicates);
    }
}
