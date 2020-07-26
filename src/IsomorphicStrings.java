import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        Map<Character, Character> mapTwo = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char firstChar = s.charAt(i);
            char secondChar = t.charAt(i);
            if(map.containsKey(firstChar) && map.get(firstChar) != secondChar){
                return false;
            }
            if(mapTwo.containsKey(secondChar) && mapTwo.get(secondChar) != firstChar){
                return false;
            }
            map.put(firstChar,secondChar);
            mapTwo.put(secondChar,firstChar);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        boolean result = isIsomorphic(s,t);
        System.out.print(result);
    }
}
