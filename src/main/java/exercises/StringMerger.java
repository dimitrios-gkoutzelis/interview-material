package main.java.exercises;

/**
 * write an algorithm to check if a given string, s, can be formed from two other strings, part1 and part2.
 * The restriction is that the characters in part1 and part2 are in the same order as in s
 * <p>
 * The interviewer gives you the following example and tells you to figure out the rest from the given test cases.
 * <p>
 * 'codewars' is a merge from 'cdw' and 'oears':
 * <p>
 * s:  c o d e w a r s   = codewars
 * part1:  c   d   w         = cdw
 * part2:    o   e   a r s   = oears
 */
public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if (part1 == part2 & !s.isEmpty()) return false;

        char[] ch = s.toCharArray();
        char[] p1 = part1.toCharArray();
        char[] p2 = part2.toCharArray();
        int l = ch.length, l1 = p1.length, l2 = p2.length;
        int n = 0, m = 0;
        if (l == (l1 + l2)){
            for (int i = 0; i < l; i++){
                if (n < l1 && ch[i] == p1[n]) n++;
                if (m < l2 && ch[i] == p2[m]) m++;
            }
            if(l == n + m){
                return true;
            } else return false;

        } else return false;

    }
}
