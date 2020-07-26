import java.util.*;

public class KeyboardRow {
    public static String[] findWords(String[] words) {
        String firstLine = "qwertyiuop";
        String secondLine = "asdfghjkl";
        String thirdLine = "zxcvbnm";

        Set<Character> firstSet = new HashSet<Character>();
        Set<Character> secondSet = new HashSet<Character>();
        Set<Character> thirdSet = new HashSet<Character>();

        for(Character c : firstLine.toCharArray()){
            firstSet.add(c);
        }

        for(Character c : secondLine.toCharArray()){
            secondSet.add(c);
        }

        for(Character c : thirdLine.toCharArray()){
            thirdSet.add(c);
        }

        List<Set<Character>> setList = new LinkedList<>();
        setList.add(firstSet);
        setList.add(secondSet);
        setList.add(thirdSet);

        List<String> list = new ArrayList<String>();

        for(String word : words){
            if(oneRowKeyboard(setList,word)){
                list.add(word);
            }
        }

        String[] result = new String[list.size()];
        int k = 0;

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            result[k++] = it.next();
        }

        return result;
    }

    public static boolean oneRowLine(Set<Character> set, String word){
        for(Character c : word.toCharArray()){
            char character = Character.toLowerCase(c);
            if(!set.contains(character)){
                return false;
            }
        }
        return true;
    }

    public static boolean oneRowKeyboard(List<Set<Character>> setList, String word){
        for(Set<Character> set : setList){
            if(oneRowLine(set,word)){
                return true;
            }
        }
        return false;
    }

    public static void printArray(String[] array){
        for(String el : array){
            System.out.print(el + " ");
        }
    }

    public static void main(String[] args) {
        String[] input = {"Hello", "Alaska", "Dad", "Peace"};
        String[] words = findWords(input);
        printArray(words);
    }
}
