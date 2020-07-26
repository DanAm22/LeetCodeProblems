public class SqrtX {
    public static int mySqrt(int x) {
        int left = 1; int right = x;

        while(left <= right){
            int mid = (left + right) / 2;
            if(x / mid == mid){
                return mid;
            }
            else if(x / mid > mid){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args){
        int x = 17;
        int result = mySqrt(x);
        System.out.println(result);
    }
}
