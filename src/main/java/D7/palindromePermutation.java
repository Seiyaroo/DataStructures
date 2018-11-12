package D7;

// Given a string write a function to check if it is a permutation of a palindrome. A palindrome is a rearrangement of letters. A word or phrase that is the same forwards and backwards.
// For example : Taco Cat -> taCo caT, or Tact Coa -> Taco Cat

public class palindromePermutation {
    // With the knowledge we have, we know that Taco Cat has 2 C's 2 A's 2 T's and the o is placed in such a way
    // that it is not a problem that there is only 1. Knowing palindromes, only 1 letter in the entire string
    // can be 'odd'.
    boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false
                }
                foundOdd = true;
            }
        }
        return true;
    }

    int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }
}
