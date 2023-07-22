package telran.interviews;

import java.util.HashMap;

public class Anagram {
    /**
     * Checks if anagram is one of the possible anagrams of a given word.
     *
     * @param word    the original word
     * @param anagram the potential anagram
     * @return true if anagram is one of the possible anagrams of word, false otherwise
     */
    public static boolean isAnagram(String word, String anagram) {
        // Check if the lengths of the strings are equal
        if (word.length() != anagram.length()) {
            return false;
        }

        // Count the frequencies of characters in the word
        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (char c : word.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }

        // Compare the frequencies of characters in the anagram
        for (char c : anagram.toCharArray()) {
            if (!frequencies.containsKey(c)) {
                return false; // Character not present in word
            }
            frequencies.put(c, frequencies.get(c) - 1);
            if (frequencies.get(c) == 0) {
                frequencies.remove(c);
            }
        }

        return frequencies.isEmpty(); // All characters in word matched and frequencies is empty
    }
}

//public class Anagram {
///**
// * 
// * @param word
// * @param anagram
// * @return true if anagram is one of the possible anagrams of a given word
// * anagram is a string containing all symbols from a given word with different order
// * Example: yellow (wolely, lowlye, yellow) , wrong anagrams (yello, yelllw)
// */
//	public static boolean isAnagram(String word, String anagram) {
//		//TODO
//		return false;
//		
//	}
//
//	
//
//
//}