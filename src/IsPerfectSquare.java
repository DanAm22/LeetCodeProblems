public class IsPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        int left = 1; int right = num;
        while(left <= right){
            int mid = (left + right) / 2;
            int result = num / mid;
            int tail = num % mid;
            if(result == mid && tail == 0){
                return true;
            }
            else if(result > mid){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int num = 16;
        boolean result = isPerfectSquare(num);
        System.out.println(result);
    }
}
