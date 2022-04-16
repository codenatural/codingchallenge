import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// WAP to find non repeating substring

public class FindNonRepeatingSubString {

    public static void main(String[] args) {
        String input = "GEEKSFORGEEKS";

        char[] charArray = input.toCharArray();
        Set<String> setOfWords = new HashSet<>();
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = ' ';
            List<Character> listForJ = new ArrayList<>();

            StringBuilder stringBuilder = new StringBuilder("");
            for (int j = i; j < charArray.length; j++) {
                currentChar = charArray[j];
                if (!listForJ.contains(currentChar)) {
                    listForJ.add(charArray[j]);
                    stringBuilder.append(String.valueOf(charArray[j]));
                } else {
                    break;
                }
            }
            setOfWords.add(stringBuilder.toString());
        }

        System.out.println("Set Of Words :" + setOfWords);

        // Find word with highest length
        int stringLength=0;
        List<String> stringSet = new ArrayList<>();
        for(String s:setOfWords){
            if(s.length()>stringLength){
                stringLength=s.length();
            }
        }

        for(String s:setOfWords){
            if(s.length()==stringLength){
                stringSet.add(s);
            }
        }

        System.out.println("List Of Non Repeatative Words as a SubString in a Given String : "+stringSet);
    }

}
