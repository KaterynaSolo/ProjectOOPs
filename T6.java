package ProjectOOPs;
//Create a method to count how many vowels are present in a string “documentation”
public class T6 {
    public static void main(String[] args) {

        String str = "documentation";

        int vowelCount=0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='o' || str.charAt(i)=='e' ||
               str.charAt(i)=='u' || str.charAt(i)=='i'){
                vowelCount++;
            }
        }
        System.out.println("The number of vowels in word "+str+" are "+vowelCount);
    }
}
