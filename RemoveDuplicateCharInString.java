import com.google.common.base.Joiner;

import java.util.*;


// WAP to remove all duplicates from given string

public class RemoveDuplicateCharInString {

    public static void main(String[] args) {
        String inputString="MavenOfLemon";

        char[] charArray = inputString.toCharArray();
        List<Character> charList = new ArrayList<>();
        for(char c:charArray){
            if(!charList.contains(c)){
                charList.add(c);
            }
        }

        String output = Joiner.on("").join(charList);
        System.out.println(output);
    }
}
