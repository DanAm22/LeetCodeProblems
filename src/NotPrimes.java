public class NotPrimes {
    public static int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for(int i = 2; i < notPrimes.length; i++){
            if(!notPrimes[i]){
                count++;
                for(int j = 2; i * j < notPrimes.length; j++){
                    notPrimes[i * j] = true;
                }
            }
        }
        return count++;
    }

    public static void main(String[] args){
        int n = 123124;
        int result = countPrimes(n);
        System.out.println(result);
    }
}
