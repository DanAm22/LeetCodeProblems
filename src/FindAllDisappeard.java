import java.util.ArrayList;
import java.util.List;

public class FindAllDisappeard {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappeard = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0){
                nums[val] = - nums[val];
            }
        }


        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                disappeard.add(i + 1);
            }
        }
        return disappeard;
    }

    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> disappeard = findDisappearedNumbers(nums);
        System.out.println(disappeard);
    }
}
