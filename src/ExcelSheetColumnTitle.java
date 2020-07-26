import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        Map<Integer, Character> map = new HashMap<>();
        for(int i = 0; i < 26; i++){
            map.put(i, (char)('A' + i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(n != 0){
            int number = --n % 26;
            n /= 26;
            stringBuilder.append(map.get(number));
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        int noCol = 713;
        String colTitle = convertToTitle(noCol);
        System.out.print(colTitle);
    }
}
