import java.util.ArrayList;
import java.util.List;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        List<Character> chars = getUniqueChars(s);
        for(Character c : chars){
            if(count(s,c) != count(t,c)){
                return false;
            }
        }
        return true;
    }

    public static int count(String s, char key){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == key){
                count++;
            }
        }
        return count;
    }

    public static List<Character> getUniqueChars(String s){
        List<Character> chars = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
            if(!chars.contains(s.charAt(i))){
                chars.add(s.charAt(i));
            }
        }
        return chars;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean isAnagram = isAnagram(s,t);
        System.out.println(isAnagram);
    }
}
