public class LengthOfTheLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split("\\W+");
        if(words.length == 0){
            return 0;
        }
        return words[words.length-1].length();
    }

    public static void main(String[] args){
        String s = "Hello World";
        int length = lengthOfLastWord(s);
        System.out.println(s);
    }
}
