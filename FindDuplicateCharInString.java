
import java.util.ArrayList;
import java.util.List;


// WAP to find all duplicates from given string

public class FindDuplicateCharInString {

    public static void main(String[] args) {
       String input = "MavenLemona";
       char[] charArray = input.toCharArray();
       List<Character> baseList = new ArrayList<>();
       List<Character> duplicateList = new ArrayList<>();
       for(char c:charArray){
           if(!baseList.contains(c)){
               baseList.add(c);
           }else{
               duplicateList.add(c);
           }
       }
        System.out.println("Duplicate Char List : "+duplicateList);
    }
}
