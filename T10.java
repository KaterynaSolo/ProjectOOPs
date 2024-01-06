package ProjectOOPs;

import java.util.ArrayList;
//How can you remove all duplicates from ArrayList?
public class T10 {
    public static void main(String[] args) {
        ArrayList <String> items = new ArrayList<>();
        items.add("Book");
        items.add("Pencil");
        items.add("Laptop");
        items.add("TV");
        items.add("TV");
        items.add("Book");

        System.out.println("Before removal duplicates:");
        items.forEach(x-> System.out.println(x));

        for (int i = 0; i < items.size(); i++) {
            for(int j = i+1; j < items.size(); j++ ){
                if(items.get(i).equals(items.get(j))){
                    items.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After removal duplicates: ");
        items.forEach(c-> System.out.println(c));
    }
}
