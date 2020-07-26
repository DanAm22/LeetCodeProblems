public class StringCompression {
    public static int compress(char[] chars) {
        int k = 0;
        for(int i = 0; i < chars.length; i++){
            int countLetter = countConsecutive(chars,i,chars[i]);
            chars[k++] = chars[i];
            i += countLetter - 1;
            if(countLetter > 1){
                int reverse = reverseNumber(countLetter);
                while(reverse != 0){
                    chars[k++] = Integer.toString(reverse % 10).charAt(0);
                    reverse /= 10;
                }
                if(countLetter % 10 == 0){
                    chars[k++] = Integer.toString(reverse % 10).charAt(0);
                }
            }
        }
        return k;
    }


    public static int countConsecutive(char[] chars, int index, char key){
        int count = 1;
        for(int i = index; i < chars.length - 1; i++){
            if(chars[i] == key && chars[i] == chars[i+1]){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static int reverseNumber(int number){
        int reverse = 0;
        while(number != 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static void main(String[] args){
        char[] chars = {'b','0','l','A',']','+','O','5','j','4'};
        int result = compress(chars);
        System.out.println(result);
    }
}
