public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder text = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                text.append(s.charAt(i));
            }
        }
        return text.toString().equals(text.reverse().toString());
    }

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        boolean isPalindrome = isPalindrome(s);
        System.out.println(isPalindrome);
    }
}
