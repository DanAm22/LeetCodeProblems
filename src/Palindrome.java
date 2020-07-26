public class Palindrome {
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int copyX = x;
        int reverse = 0;
        while(copyX != 0){
            reverse = reverse * 10 + copyX % 10;
            copyX /= 10;
        }
        return reverse == x;
    }
    public static void main(String[] args){
        int x = 10;
        System.out.println(isPalindrome(x));
    }
}
