public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n == 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n % 2 == 1){
            return false;
        }
        while(n % 2 == 0){
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args){
        int n = 214;
        boolean isPowOfTwo = isPowerOfTwo(n);
        System.out.println(n);
    }
}
