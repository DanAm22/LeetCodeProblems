public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        return allCapital(word) || allNotCapital(word) || onlyFirstCapital(word);
    }

    public static boolean allCapital(String word){
        for(int i = 0; i < word.length(); i++){
            if(Character.isLowerCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean allNotCapital(String word){
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean onlyFirstCapital(String word){
        if(Character.isLowerCase(word.charAt(0))){
            return false;
        }
        for(int i = 1; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String word = "USA";
        boolean result = detectCapitalUse(word);
        System.out.println(result);
    }
}
