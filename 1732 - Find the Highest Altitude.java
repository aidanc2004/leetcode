class Solution {
    public int largestAltitude(int[] gain) {
        // Current altitude and maximum altitude
        int altitude = 0;
        int max = 0;
        
        for (int i = 0; i < gain.length; i++) {
            // Add gain to current altitude for next altitude
            altitude += gain[i];
            // If larger, set new max
            if (altitude > max) max = altitude;
        }

        return max;
    }
}