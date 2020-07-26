public class CountAndSay {
    public static String getNextElement(String text) {
        StringBuilder result = new StringBuilder("");
        char[] txt = text.toCharArray();
        char crt = txt[0];
        int count = 1;
        for (int i = 1; i < txt.length; i++) {
            if (crt == txt[i]) {
                count++;
            } else {
                result.append(count);
                result.append(crt);
                crt = txt[i];
                count = 1;
            }
        }
        result.append(count);
        result.append(crt);
        return result.toString();
    }

    public static String countAndSay(int n) {
        String result = "1";
        for(int i = 1; i < n; i++) {
            result = getNextElement(result);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 2;
        String result = countAndSay(n);
        System.out.println(result);

    }
}
