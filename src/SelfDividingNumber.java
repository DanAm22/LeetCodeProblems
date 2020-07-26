import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividedNumbers = new ArrayList<Integer>();
        for(int i = left; i <= right; i++){
            if(isSelfDivided(i)){
                selfDividedNumbers.add(i);
            }
        }
        return selfDividedNumbers;
    }


    public static boolean isSelfDivided(int number){
        int copyNumber = number;
        while(copyNumber != 0){
            int lastDigit = copyNumber % 10;
            if(lastDigit == 0){
                return false;
            }
            if(number % lastDigit != 0){
                return false;
            }
            copyNumber /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        List<Integer> selfDividedNumbers = selfDividingNumbers(left,right);
        System.out.println(selfDividedNumbers);
    }
}
