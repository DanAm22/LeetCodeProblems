import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(Integer el : nums){
            if(set.contains(el)){
                set.remove(el);
            }
            else{
                set.add(el);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int result = singleNumber(nums);
        System.out.println(result);
    }
}
