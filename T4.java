package ProjectOOPs;
/*
Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward.
For example, "madam" is a palindrome.
 */
public class T4 {
    public static void main(String[] args) {
        String str = "Kayak";
        String reversedWord= "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversedWord=reversedWord+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversedWord)){
            System.out.println("Given word "+str+" is Palindrome");
        }else{
            System.out.println("Given word "+str+" is not Palindrome");
        }

    }

}
