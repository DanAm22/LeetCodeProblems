public class StrStr {
    public static int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        if(needle.equals(haystack)) return 0;
        if(needle.length() > haystack.length()) return -1;

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            if(haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String haystack = "hello";
        String needle = "ell";
        int index = strStr(haystack,needle);
        System.out.println(index);
    }
}
