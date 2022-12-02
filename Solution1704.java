public class Solution1704 {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
    public static boolean halvesAreAlike(String s) {
        String firstHalf = s.substring(0,s.length()/2);
        int firstHalfVowels = 0;
        System.out.println(firstHalf);
        String secondHalf = s.substring(s.length()/2);
        int secondHalfVowels = 0;
        System.out.println(secondHalf);
        for (int i = 0; i < firstHalf.length(); i++) {
            switch (firstHalf.charAt(i)){
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> firstHalfVowels += 1;
            }
        }
        for (int i = 0; i < secondHalf.length(); i++) {
            switch (secondHalf.charAt(i)){
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> secondHalfVowels += 1;
            }
        }
        return(firstHalfVowels == secondHalfVowels);
    }
}
