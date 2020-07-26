public class CreateTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int count = 0;
        int[] target = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            if (index[i] == 0) {
                for (int k = target.length - 1; k > index[i]; k--) {
                    target[k] = target[k - 1];
                }
            } else if (index[i] < count) {
                for (int k = target.length - 1; k >= index[i]; k--) {
                    target[k] = target[k - 1];
                }
            }
            target[index[i]] = nums[i];
            count++;
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 0 };
        int[] index = { 0, 1, 2, 3, 0 };
        int[] target = createTargetArray(nums, index);

    }
}
