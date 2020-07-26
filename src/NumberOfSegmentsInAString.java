public class NumberOfSegmentsInAString {
    public static int countSegments(String s) {
        int count = 0;
        if(s.equals("")){
            return 0;
        }
        if(s.charAt(0) != ' '){
            count++;
        }
        for(int i = 1; i < s.length() - 1; i++){
            if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' '){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String s = "Hello, my name is John";
        int result = countSegments(s);
        System.out.println(result);
    }
}
