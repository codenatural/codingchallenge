import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class DemoQA1 {

    public static void main(String[] args) {
        String input = "277774492664440558862777";
        System.out.println("Input String : "+input);
        String output="";
        ArrayList<String> key0 = new ArrayList<>(Collections.singletonList(" "));
        ArrayList<String> key2 = new ArrayList<>(Arrays.asList("a","b","c"));
        ArrayList<String> key4 = new ArrayList<>(Arrays.asList("g","h","i"));
        ArrayList<String> key5 = new ArrayList<>(Arrays.asList("j","k","l"));
        ArrayList<String> key6 = new ArrayList<>(Arrays.asList("m","n","o"));
        ArrayList<String> key7 = new ArrayList<>(Arrays.asList("p","q","r","s"));
        ArrayList<String> key8 = new ArrayList<>(Arrays.asList("t","u","v"));
        ArrayList<String> key9 = new ArrayList<>(Arrays.asList("w","x","y","z"));

        HashMap<Integer,ArrayList<String>> map = new HashMap<>();
        map.put(0,key0);
        map.put(2,key2);
        map.put(4,key4);
        map.put(5,key5);
        map.put(7,key7);
        map.put(8,key8);
        map.put(9,key9);
        map.put(6,key6);

        char[] chArray = input.toCharArray();
        char currentChar=chArray[0];
        int count=0;
        for(int i=0;i<chArray.length;i++){
            if(chArray[i]==currentChar){
                count=count+1;
            }else if(chArray[i]!=currentChar){
                int key=Integer.parseInt(String.valueOf(currentChar));
                ArrayList<String> list = map.get(Integer.parseInt(String.valueOf(currentChar)));
                output=output+list.get(count-1);
                currentChar = chArray[i];
                count=0;
                count=count+1;
            }
        }
        ArrayList<String> list = map.get(Integer.parseInt(String.valueOf(currentChar)));
        output=output+list.get(count-1);
        System.out.println("Output : "+output);
    }
}
