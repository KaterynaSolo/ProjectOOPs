package ProjectOOPs;
/*
Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
 */
public class T9 {
    public static void main(String[] args) {

        String s = "abracadabra";
        for(Character ch: s.toCharArray()){
            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                System.out.println("First Non-Repeating Character in a String: "+s+" is "+ch);
                break;
            }
        }
    }
}
