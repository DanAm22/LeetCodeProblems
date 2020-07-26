public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String result = longestCommonPrefixTwoWords(strs[0], strs[1]);
        for (int i = 2; i < strs.length; i++) {
            result = longestCommonPrefixTwoWords(result, strs[i]);
        }
        return result;
    }

    public static String longestCommonPrefixTwoWords(String txtOne, String txtTwo) {
        StringBuilder prefix = new StringBuilder("");
        int length = Math.min(txtOne.length(), txtTwo.length());
        for (int i = 0; i < length; i++) {
            if (txtOne.charAt(i) == txtTwo.charAt(i)) {
                prefix.append(txtOne.charAt(i));
            } else {
                break;
            }
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String commonPrefix = longestCommonPrefix(strs);
        System.out.println(commonPrefix);
    }
}
