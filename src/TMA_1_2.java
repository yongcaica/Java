/*
(15%) Write a short Java program that outputs all of the possible strings formed using each of the characters
‘c’, ‘a’, ‘t’, ‘d’, ‘o’, and ‘g’ exactly once.
*/

/*
C-1.22) Hint There are many solutions. If you know about recursion, the
easiest solution uses this technique. Otherwise, consider using an array to
hold solutions. If this still seems to hard, then consider using six nested
loops (but avoid repeating characters and make sure you allow all string
lengths).
 */


import java.util.ArrayList;

public class TMA_1_2 {

    public static ArrayList<String> getPerms(String str) {
        if (str == null) {
            return null;
        }
        ArrayList<String> permutations = new ArrayList<String>();
        if (str.length() == 0) { // base case
            permutations.add("");
            return permutations;
        }

        char first = str.charAt(0); // get the first character
        String remainder = str.substring(1); // remove the first character
        ArrayList<String> words = getPerms(remainder);
        for (String word : words) {
            for (int j = 0; j <= word.length(); j++) {
                String s = insertCharAt(word, first, j);
                permutations.add(s);
            }
        }
        return permutations;
    }
    /* Insert char c at index i in word. */
    public static String insertCharAt(String word, char c, int i) {
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start + c + end;
    }

    public static void main(String[] args) {
        ArrayList<String> list = getPerms("catdog");
        System.out.println("There are " + list.size() + " permutations.");
        for (String s : list) {
            System.out.println(s);
        }
    }

}
