class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // no flowers to place
        if (n == 0) return true;

        int len = flowerbed.length;

        int placed = 0; // number of placed flowers

        for (int i = 0; i < len; i++) {
            // check if prev and next element are out of bounds
            int prev = (i != 0) ? flowerbed[i-1] : 0;
            int curr = flowerbed[i];
            int next = (i != len - 1) ? flowerbed[i+1] : 0;

            // if no flowers are around current index then place one
            if (prev + curr + next == 0) {
                flowerbed[i] = 1;
                placed++;
            }

            // if all flowers have been placed return true
            if (placed == n) return true;
        }

        // got to end without planting all flowers
        return false;
    }
}