class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.strip().split(" ")        # split into words
        words = list(filter(None, words))   # remove empty strings
        words.reverse()                     # reverse list of words
        return " ".join(words)              # join back into one string
