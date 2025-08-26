class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        long maxDiagonalSq = 0; 
        int maxArea = 0;

        for (int[] rect : dimensions) {
            int l = rect[0];
            int w = rect[1];

            long diagonalSq = (long) l * l + (long) w * w; // l² + w²
            int area = l * w;

            if (diagonalSq > maxDiagonalSq) {
                maxDiagonalSq = diagonalSq;
                maxArea = area;
            } else if (diagonalSq == maxDiagonalSq && area > maxArea) {
                maxArea = area;
            }
        }

        return maxArea;
    }
}