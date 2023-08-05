class Solution {
    public String mergeAlternately(String word1, String word2) {
        // get total length and then allocate array
        int length = word1.length() + word2.length();
        char result[] = new char[length];
        
        int index = 0; // current index of result char array

        for (int i = 0; i < length; i++) {
            // check that i isn't bigger than the word
            if (i < word1.length()) {
                // add char to array then increment index
                result[index] = word1.charAt(i);
                index++;
            }
            if (i < word2.length()) {
                result[index] = word2.charAt(i);
                index++;
            }
        }

        // convert to string and return
        return new String(result);
    }
}
