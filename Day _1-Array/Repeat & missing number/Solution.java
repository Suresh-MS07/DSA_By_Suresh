 class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        boolean[] seen = new boolean[size + 1];
        int repeated = -1, missing = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                if (seen[val]) {
                    repeated = val;
                }
                seen[val] = true;
            }
        }

        for (int i = 1; i <= size; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        return new int[]{repeated, missing};
    }
}
   

