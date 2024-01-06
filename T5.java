package ProjectOOPs;

import java.util.Arrays;

/*
Check if Two Strings are Anagrams: Given two strings, determine if they are
anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
 */
public class T5 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagramSort(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
    private static boolean isAnagramSort(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
     char [] charArr1 = s1.toCharArray();
     char [] charArr2 = s2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        for (int i = 0; i < charArr1.length; i++) {
            if (charArr1[i] != charArr2[i]) {
                return false;
            }
        }
        return true;
    }
}



