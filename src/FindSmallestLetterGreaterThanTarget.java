public class FindSmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0; int right = letters.length - 1;
        char result = ' ';
        if(target >= letters[letters.length-1]){
            return letters[0];
        }
        while(left <= right){
            int mid = (left + right) / 2;
            if(letters[mid] <= target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
                result = letters[mid];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'k';
        char result = nextGreatestLetter(letters,target);
        System.out.println(result);
    }
}
