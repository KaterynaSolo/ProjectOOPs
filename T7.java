package ProjectOOPs;
/*
Count the Number of Words in a String: Write a function to count the number
of words in a given string. Words are separated by spaces or punctuation.
For example, the input "Hello, world!" should return 2.
 */
public class T7 {
    public static void main(String[] args) {
        String str ="Today is a beautiful day outside";
        String [] strArray= str.split(" ");
        System.out.println("The number of words in a String: "+str+", are "+strArray.length);


    }
}
