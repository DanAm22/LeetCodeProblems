public class FactorialTrailingZeros {
    public static int trailingZeroes(int n) {
        int trailingZero = 0;
        if(n <= 4){
            return 0;
        }
        return n / 5 + trailingZeroes(n / 5);
    }

    public static void main(String[] args){
        int n = 1808548329;
        int result = trailingZeroes(n);
        System.out.println(result);
    }
}
