import java.util.HashSet;
import java.util.Set;

public class JewelsAndStone {
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        Set<Character> set = new HashSet<Character>();

        for(Character el : J.toCharArray()){
            set.add(el);
        }

        for(Character el : S.toCharArray()){
            if(set.contains(el)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        int noJewels = numJewelsInStones(J,S);
        System.out.println(noJewels);
    }
}
