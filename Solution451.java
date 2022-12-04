import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution451 {
    public static void main(String[] args) {
        System.out.println(frequencySortOptimized("tree"));
        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> sFreq= new HashMap<>();
        StringBuilder sorted = new StringBuilder();
        char mostFrequentChar = s.charAt(1);
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            sFreq.put(currentChar, sFreq.getOrDefault(currentChar, 0) + 1);
        }
        while (!sFreq.isEmpty()) {
            mostFrequentChar = (char)sFreq.keySet().toArray()[0];
            for (Character c : sFreq.keySet()) {
                if (sFreq.get(c) > sFreq.get(mostFrequentChar)) {
                    mostFrequentChar = c;
                }
            }
            for (int i = 0; i < sFreq.get(mostFrequentChar); i++) {
                sorted.append(mostFrequentChar);
            }
            sFreq.remove(mostFrequentChar);

        }
        return sorted.toString();
    }
    public static String frequencySortOptimized(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry e = pq.poll();
            for (int i = 0; i < (int)e.getValue(); i++)
                sb.append(e.getKey());
        }
        return sb.toString();
    }
}
