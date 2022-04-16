package abc;

import java.util.*;


// WAP to find highest repeating char in a given string

public class HighestRepeatingCharInString {

    public static void main(String[] args) {
        String inputString="this world is funny and funny people lives in this world ll ss";
        char[] chArray = inputString.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char c:chArray){
            if(map.get(c)==null){
                map.put(c,1);
            }else{
                int value = map.get(c);
                map.put(c,value+1);
            }
        }
        System.out.println("Char and Count : "+map);
        Set<Character> ch = map.keySet();
        Iterator<Character> itr = ch.iterator();
        int count=0;
        while(itr.hasNext()){
            Character currentChar = itr.next();
            if(currentChar!=' '){
                if(map.get(currentChar)>count){
                    count=map.get(currentChar);
                }
            }
        }
        itr = ch.iterator();
        List<Character> charList = new ArrayList<>();
        while(itr.hasNext()){
            char currentValue = itr.next();
            if(map.get(currentValue)==count){
               charList.add(currentValue);
            }
        }
        System.out.println("Repeated Char List: "+charList);
        System.out.println("Repeated Times :"+count);
    }
}
