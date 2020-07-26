public class ReverseString {
    public static void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++){
            swap(s, i, s.length - 1 - i);
        }
    }

    public static void swap(char[] s, int i, int j){
        char aux = s[i];
        s[i] = s[j];
        s[j] = aux;
    }

    public static void printArray(char[] s){
        for(int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }

    public static void main(String[] args){
        char[] s ={'H','a','n','n','a','h'};
        reverseString(s);
        printArray(s);
    }
}
