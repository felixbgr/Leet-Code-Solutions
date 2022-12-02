import java.util.Arrays;

public class Solution1337 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        kWeakestRows(arr , 2);
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int[] rowStrength = new int[rows];
        for (int i = 0; i < rows; i++) {
            int j = 0;
            int count1 = 0;
            while (j < mat[i].length && mat[i][j] == 1 ) {
                count1++;
                j++;
            }
            rowStrength[i] = count1*rows + i;
        }
        Arrays.sort(rowStrength);
        for (int i = 0; i < rows; i++) {
            rowStrength[i] = rowStrength[i] % rows;
        }
        return Arrays.copyOf(rowStrength,k);
    }
}