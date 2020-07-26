public class ReverseInteger {
    public static int reverse(int x) {
        long reverse = 0;
        while(x != 0){
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        if(reverse < Math.pow(-2, 31) || reverse > Math.pow(2,31) - 1){
            return 0;
        }
        return (int) reverse;
    }

    public static void main(String[] args){
        int x = 1534236469;
        int reverse = reverse(x);
        System.out.println(reverse);
    }
}
