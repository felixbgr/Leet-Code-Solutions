import java.util.HashMap;
import java.util.Map;

class Solution383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("a","b"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean possible = true;
        Map<Character,Integer> magazineFreq = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            magazineFreq.put(magazine.charAt(i), magazineFreq.getOrDefault(magazine.charAt(i),0)+1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(magazineFreq.containsKey(ransomNote.charAt(i)) && magazineFreq.get(ransomNote.charAt(i)) >=1){
                magazineFreq.put(ransomNote.charAt(i), magazineFreq.get(ransomNote.charAt(i))-1);
            }
            else{
                possible = false;
            }
        }
        return possible;
    }
}