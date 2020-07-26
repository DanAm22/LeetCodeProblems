public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i < ransomNote.length(); i++){
            if(count(ransomNote,ransomNote.charAt(i)) > count(magazine,ransomNote.charAt(i))){
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

    public static void main(String[] args){
        String ransomNote = "aa";
        String magazine = "aab";
        boolean result = canConstruct(ransomNote,magazine);
        System.out.println(result);
    }
}
