package ProjectOOPs;

import java.util.ArrayList;
import java.util.List;

/*
You have a list of strings, and you want to keep only those that
start with “A” and you want to return them in lower case.
 */
public class T8 {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Apple");
        str.add("Orange");
        str.add("Aunt");
        str.add("Antique");
        str.add("Fantastic");

        str.replaceAll(String::toLowerCase);
        for(String s:str){
            if(s.startsWith("a")){
                System.out.println(s);
            }
        }
    }
}
