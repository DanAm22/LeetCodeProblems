import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static int distributeCandies(int[] candies) {
        Set<Integer> types = new HashSet<Integer>();

        for(Integer el : candies){
            types.add(el);
        }

        if(types.size() > candies.length / 2){
            return candies.length / 2;
        }
        else{
            return types.size();
        }
    }

    public static void main(String[] args) {
        int[] candies = {1,1,2,2,3,3};
        int noCandies = distributeCandies(candies);
        System.out.print(noCandies);
    }
}
