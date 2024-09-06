package STRING;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(chekIfPangram(sentence));
    }
    public static boolean chekIfPangram(String sentence){
       Set<Character>set=new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));

        }
        if (set.size()==26){
            return true;
        }
        return false;
    }
}

