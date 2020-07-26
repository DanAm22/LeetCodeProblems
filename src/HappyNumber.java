import java.util.ArrayList;

public class HappyNumber {
    public static boolean isHappy(int n) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        while(true){
            int sum = 0;
            while(n > 0){
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if(sum == 1 || sum == 7){
                return true;
            }
            else if(sum < 10 || results.contains(n)){
                break;
            }
            else{
                n = sum;
                results.add(n);
            }
        }
        return false;
    }

    public static ArrayList<Integer> isHappyTwo(int n) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        while(true){
            int sum = 0;
            while(n > 0){
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if(sum == 1 || sum == 7){
                break;
            }
            else if(sum < 10 || results.contains(n)){
                break;
            }
            else{
                n = sum;
                results.add(n);
            }
        }
        return results;
    }

    public static void main(String[] args){
        int n = 7;
        ArrayList<Integer> result= isHappyTwo(n);
        System.out.println(result);
    }
}
