import java.util.Arrays;

public class Solution {
    public static int[] sortByHeightLNT(int[] param1) {
        int len = param1.length, t;
        boolean ok = true;
        for (int i = 0; i < len; i++) {
            ok = true;
            for (int j = 0; j < len - i - 1; j++) {
                if (param1[j] == -1) continue;
                int jump = 1;
                for (; j + jump < len; jump++) {
                    if (param1[j + jump] != -1) break;
                }
                if (param1[j] > param1[j + jump]) {
                    ok = false;
                    t = param1[j];
                    param1[j] = param1[j + jump];
                    param1[j + jump] = t;
                }
                j = j + jump - 1;
            }
            if (ok) break;
        }
        return param1;
    }

    public static void main(String[] args) {
        int[] arr = {
                -1, 150, 190, 170, -1, -1, 160, 180
        };
        Solution.sortByHeightLNT(arr);
    }
}//
