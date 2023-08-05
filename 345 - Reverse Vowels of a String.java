class Solution {
    public String reverseVowels(String s) {
        // not sure how many vowels, so use a dynamic array
        List<Character> vowels = new ArrayList<Character>();

        // convert String to char[] to make it mutable
        char charArray[] = s.toCharArray();

        // get all vowels in order
        for (char c : charArray) {
            if (isVowel(c))
                vowels.add(c);
        }

        // replace vowels
        for (int i = charArray.length - 1; i >= 0; i--) {
            char c = charArray[i];
            if (isVowel(c))
                charArray[i] = vowels.remove(0);
        }

        // convert back to String
        return new String(charArray);
    }

    // check if a character is a vowel
    private boolean isVowel(char c) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u',
                         'A', 'E', 'I', 'O', 'U'};
        for (char vowel : vowels) {
            if (c == vowel) return true;
        }
        return false;
    }
}