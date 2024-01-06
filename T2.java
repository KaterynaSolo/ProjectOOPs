package ProjectOOPs;
//Find out how many alpha characters are present in a string.
public class T2 {
    public static void main(String[] args) {

        String word = "Java is fun 2024";
        System.out.println("Java is fun 2024");

        int alphaCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if(Character.isLetter(word.charAt(i))){
                alphaCount++;
            }
        }
        System.out.println("The amount of alpha characters in the above string: "+alphaCount);
    }
}
