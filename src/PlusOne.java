import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int k = lastIndexOf(digits,9);
        if(k == 0){
            digits = Arrays.copyOf(digits, digits.length + 1);
            digits[0] = 1;
            for(int j = 1; j < digits.length; j++){
                digits[j] = 0;
            }
        }
        else if(k != -1){
            digits[k - 1]++;
            for(int j = k; j < digits.length; j++){
                digits[j] = 0;
            }
        }
        else{
            digits[digits.length-1] = digits[digits.length - 1] + 1;
        }
        return digits;
    }

    public static int lastIndexOf(int[] nums, int val){
        if(nums.length == 1 && nums[0] == 9){
            return 0;
        }
        int index = -1;
        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i] != val){
                break;
            }
            else{
                index = i;
            }
        }
        if(index == 1 && nums[0] == 9){
            index = 0;
        }
        return index;
    }

    public static void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] nums1 = {9};
        int[] nums2 = {3,4,2};
        int[] nums3 = {9,9,8,9};
        int[] result1 = plusOne(nums1);
        int[] result2 = plusOne(nums2);
        int[] result3 = plusOne(nums3);
        printArray(result1);
        System.out.println();
        printArray(result2);
        System.out.println();
        printArray(result3);
        System.out.println();
    }
}
