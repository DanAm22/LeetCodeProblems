public class DiStringMatch {
    public static int[] diStringMatch(String txt) {
        int[] result = new int[txt.length() + 1];
        int k = 0;
        int min = 0;
        int max = txt.length();
        if(txt.charAt(0) == 'I'){
            result[k++] = min;
            min++;
        }
        else{
            result[k++] = max;
            max--;
        }
        for(int i = 1; i < result.length - 1; i++){
            if(txt.charAt(i) == 'I'){
                result[i] = min;
                min++;
            }
            else{
                result[i] = max;
                max--;
            }
        }
        if(txt.charAt(txt.length() - 1) == 'I'){
            result[txt.length()] = min;
            min++;
        }
        else{
            result[txt.length()] = max;
            max--;
        }
        return result;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args){
        String txt = "IDDIDII";
        int[] result = diStringMatch(txt);
        printArray(result);
    }
}
