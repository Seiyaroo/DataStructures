//package D6;
//
//// Given two strings, write a method to decide if one is a permutation of the other.
//
//// Test cases would be, do spaces matter? ("God   " same as "God") y/n
//
//public class permutation {
//   public static boolean permutation(String s, String t) {
//       if (s.length() != t.length()) {
//           return false;
//       }
//       return sort(s).equals(sort(t));
//}
//    String sort(String s) {
//        char[] content = s.toCharArray();
//        java.util.Arrays.sort(content);
//        return new String(content);
//    }
//}
