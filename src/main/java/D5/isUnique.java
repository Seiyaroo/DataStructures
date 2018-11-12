//package D5;
//
//import com.sun.org.apache.xpath.internal.operations.Bool;
//
//public class isUnique {
//    // Implement an algorithm to determine if a string has all unique characters.
//    // Optional: What if you cannot use additional data structures?
//
//    public static void main(String[] args) {
//        isUnique();
//    }
//
//    private static Boolean isUnique(String str) {
//        // We use 256 to account for ASCII characters.
//
//        boolean[] wordsList = new boolean[256];
//        for (int i = 0; i < str.length(); i++) {
//            // Val takes the chars and stores them into the val variable
//            int val = str.charAt(i);
//
//            if (wordsList[val]) {
//                // If you find it in the string
//                return false;
//            }
//            wordsList[val] = true;
//        }
//        return true;
//    }
//}
//
//// Alternative implementation. Assumes only lower case a - z.
//// << and >> are right or left shift bit operation. |= is a bitwise inclusive operation. Still not fully sure about
//// this implementation.
//
////boolean isUniqueString(String str) {
////    int checker = 0;
////    for (int i = 0; i < str.length(); i++) {
////        int val = str.charAt(i) - 'a';
////        if ((checker & (1 << val)) > 0) {
////            return false;
////        }
////        checker |= (1 << val);
////    }
////    return true;
////}
