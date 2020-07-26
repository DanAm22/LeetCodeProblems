import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i - 1])
                nums[i++] = n;
        return i;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 4, 4, 5, 5 };
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
}
