class Solution {
    public int strStr(String haystack, String needle) {
        // If haystack is shorter than needle, needle can't be in haystack
        if (haystack.length() < needle.length()) {
            return -1;
        }

        // Iterate over the haystack with a sliding window the size of the needle
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring from current index matches the needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // If match found, return the start index
            }
        }

        // If no match found, return -1
        return -1;     
    }
}
