public class FindLucky {
    public static int findLucky(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int count = countValue(arr, arr[i]);
            if (count == arr[i] && count > max) {
                max = arr[i];
            }
        }
        if (max == Integer.MIN_VALUE) {
            max = -1;
        }
        return max;
    }

    public static int countValue(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        if (count == 0) {
            count--;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 3, 3, 3 };
        int findMaxLucky = findLucky(arr);
        System.out.println(findMaxLucky);
    }
}
