package a1;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q1 {

        // Return all substrings of the String s
        public static ArrayList<String> allSubstrings(String s) {
                ArrayList<String> arrayLString = new ArrayList<>();
                int num = s.length() - 1;
                // checks if string s is not empty
                if (!s.isEmpty()) {
                        ArrayList<String> arrLTemp = allSubstrings(s.substring(0, num)); // temp ArrayList
                        char charEnd = s.charAt(num); // char that gets added
                        // adds all contents from arrLTemp to arrayLString
                        arrayLString.addAll(arrLTemp);
                        /*
                         * for loop, the next end char is selected and added to the end of each
                         * ArrayList item as new ArrayList items
                         */
                        for (int i = 0; i < arrLTemp.size(); i++) {
                                String temp = arrLTemp.get(i);
                                arrayLString.add(temp + charEnd);
                        }
                        // else, the ArrayList is empty so an ArrayList item is added ""
                } else {
                        arrayLString.add("");
                        return arrayLString;
                }
                return arrayLString;
        }

        public static void main(String[] args) {
                ArrayList<String> s = allSubstrings("abcde");
                System.out.println("Testing...");
                assertEquals(s.size(), 32);
                /**
                 * These are all the 32 substrings that should be contained in Q1.
                 */

                assertEquals(s.contains(""), true);
                assertEquals(s.contains("a"), true);
                assertEquals(s.contains("b"), true);
                assertEquals(s.contains("c"), true);
                assertEquals(s.contains("d"), true);
                assertEquals(s.contains("e"), true);
                assertEquals(s.contains("ab"), true);
                assertEquals(s.contains("ac"), true);
                assertEquals(s.contains("ad"), true);
                assertEquals(s.contains("ae"), true);
                assertEquals(s.contains("bc"), true);
                assertEquals(s.contains("bd"), true);
                assertEquals(s.contains("be"), true);
                assertEquals(s.contains("cd"), true);
                assertEquals(s.contains("ce"), true);
                assertEquals(s.contains("de"), true);
                assertEquals(s.contains("abc"), true);
                assertEquals(s.contains("abd"), true);
                assertEquals(s.contains("abe"), true);
                assertEquals(s.contains("acd"), true);
                assertEquals(s.contains("ace"), true);
                assertEquals(s.contains("ade"), true);
                assertEquals(s.contains("bcd"), true);
                assertEquals(s.contains("bce"), true);
                assertEquals(s.contains("bde"), true);
                assertEquals(s.contains("cde"), true);
                assertEquals(s.contains("abcd"), true);
                assertEquals(s.contains("abce"), true);
                assertEquals(s.contains("acde"), true);
                assertEquals(s.contains("abde"), true);
                assertEquals(s.contains("bcde"), true);
                assertEquals(s.contains("abcde"), true);
                System.out.println("Success!");
        }

}
