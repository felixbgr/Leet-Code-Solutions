import java.util.HashMap;
import java.util.HashSet;

public class Solution1207 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(numbers));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> occurences = new HashMap<>();
        for (int n: arr) {
            occurences.put(n,occurences.containsKey(n) ? occurences.get(n) + 1: 1);
//            occurences.put(n, occurences.getOrDefault(n,0)+1);
        }
        HashSet<Integer> freq = new HashSet<Integer>(occurences.values());
        return freq.size() == occurences.size();

//        HashMap<Integer,Integer> occurenceOfOcurrences = new HashMap<Integer,Integer>();
//        for (int n: occurences.values()) {
//            occurenceOfOcurrences.put(n,occurenceOfOcurrences.containsKey(n) ? occurenceOfOcurrences.get(n) + 1: 1);
//        }
//        boolean unique = true;
//        for(int n: occurenceOfOcurrences.values()){
//            if(n != 1) {
//                unique = false;
//            }
//        }
//        return unique;
    }
}
