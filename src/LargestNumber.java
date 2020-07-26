import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static String largestNumber(int[] nums) {

        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        StringComparator comparator = new StringComparator();

        Arrays.sort(strings, comparator);

        StringBuilder stringBuilder = new StringBuilder();

        for (String s : strings) {
            stringBuilder.append(s);
        }

        if (stringBuilder.charAt(0) == '0') {
            return "0";
        }

        return stringBuilder.toString();
    }

    private static class StringComparator implements Comparator<String> {

        public int compare(String s1, String s2) {
            String one = s1 + s2;
            String two = s2 + s1;
            return two.compareTo(one);
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String largestNumber = largestNumber(nums);
        System.out.print(largestNumber);
    }
}
