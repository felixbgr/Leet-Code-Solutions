import java.util.Arrays;
import java.util.HashMap;

public class Solution1567 {
    public static void main(String[] args) {
        String word1 = "uau";
        String word2 = "ssx";
        System.out.println(closeStrings(word1,word2));
    }
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        HashMap<Character, Integer> word1Freq = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
                char currentChar = word1.charAt(i);
                word1Freq.put(currentChar, word1Freq.getOrDefault(currentChar, 0) +1);
            }
        Object[] word1FreqArray = word1Freq.values().toArray();
        Arrays.sort(word1FreqArray);

        HashMap<Character, Integer> word2Freq = new HashMap<>();
        for (int i = 0; i < word2.length(); i++) {
            char currentChar = word2.charAt(i);
            word2Freq.put(currentChar, word2Freq.getOrDefault(currentChar, 0) +1);
        }
        Object[] word2FreqArray = word2Freq.values().toArray();
        Arrays.sort(word2FreqArray);

        for(Character c: word1Freq.keySet() ){
            if (!word2Freq.containsKey(c)){
                return false;
            }
        }
        return(Arrays.equals(word1FreqArray, word2FreqArray));
    }
}
