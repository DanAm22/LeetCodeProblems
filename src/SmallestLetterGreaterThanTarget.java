public class SmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        char result;
        if(isTargetGreatest(letters,target)){
            result = minChar(letters[0],letters[1]);
            for(int i = 2; i < letters.length; i++){
                result = minChar(result, letters[i]);
            }
        }
        else{
            int index = firstIndexCharAboveTarget(letters, target);
            result = letters[index];
            for(int i = index + 1; i < letters.length; i++){
                if(letters[i] > target){
                    result = minChar(result,letters[i]);
                }
            }
        }

        return result;
    }

    private static boolean isTargetGreatest(char[] letters, char target){
        for(int i = 0; i < letters.length; i++){
            if(target < letters[i]){
                return false;
            }
        }
        return true;
    }

    private static char minChar(char one, char two){
        if(one < two){
            return one;
        }
        return two;
    }

    private static int firstIndexCharAboveTarget(char[] letters, char target){
        for(int i = 0; i < letters.length; i++){
            if(letters[i] > target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char result = nextGreatestLetter(letters,target);
        System.out.println(result);
    }
}
