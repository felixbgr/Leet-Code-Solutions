import java.util.Arrays;

public class Solution1672 {
    public static int maximumWealth(int[][] accounts) {
        int[] totalWealth = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                totalWealth[i] += accounts[i][j];
            }
        }
        return (Arrays.stream(totalWealth).max().orElseThrow());
    }
}
