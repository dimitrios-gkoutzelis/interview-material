package main.java.exercises;

public class StringScrambler {

    // Best approach
    public static boolean scramble(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        for (String s: str2.split("")) {
            if (!str1.contains(s))  return false;
            str1 = str1.replaceFirst(s,"");
        }

        return true;
    }

    // Bad complexity(n^2) here but working
//    public static boolean scramble(String str1, String str2) {
//        StringBuilder sb1 = new StringBuilder(str1);
//        StringBuilder sb2 = new StringBuilder(str2);
//
//        for (int i = 0; i < sb2.length(); i++) {
//            char toFind = sb2.charAt(i);
//
//            int idxToDelete = -1;
//            for (int j = 0; j < sb1.length(); j++) {
//                if (sb1.charAt(j) == toFind) {
//                    idxToDelete = j;
//                    break;
//                }
//            }
//            if (idxToDelete == -1)
//                return false;
//            else
//                sb1.deleteCharAt(idxToDelete);
//        }
//        return true;
//    }
}
