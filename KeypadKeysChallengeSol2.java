import java.util.ArrayList;
import java.util.HashMap;

public class KeypadKeysChallengeSol2 {
    // ImpactQA - Swiggy
    public static void main(String[] args) {
        String input = "2777744";
        String[] combos = new String[]{"2","22","222","7","77","777","7777","4","44","444"};

        ArrayList<String> listCombo = new ArrayList<>();
        for(String s: combos){
            listCombo.add(s);
        }

        HashMap<String,String> mappings = new HashMap<>();
        mappings.put(listCombo.get(0),"a");
        mappings.put(listCombo.get(1),"b");
        mappings.put(listCombo.get(2),"c");
        mappings.put(listCombo.get(3),"p");
        mappings.put(listCombo.get(4),"q");
        mappings.put(listCombo.get(5),"r");
        mappings.put(listCombo.get(6),"s");
        mappings.put(listCombo.get(7),"g");
        mappings.put(listCombo.get(8),"h");
        mappings.put(listCombo.get(9),"i");

        char[] inp = input.toCharArray();
        String displayOutput="";
        char currentChar  = input.charAt(0);
        int count=0;
        for(int i=0;i<input.length();i++){
            System.out.println("Value of i : "+i);
            if(inp[i]==currentChar){
                count=count+1;
            }else if(inp[i]!=currentChar){
                displayOutput =displayOutput+mappings.get(getRepeatedString(count,currentChar));
                currentChar=inp[i];
                count=0;
                count=count+1;
            }
        }
        displayOutput =displayOutput+mappings.get(getRepeatedString(count,currentChar));
        System.out.println("Output String : "+displayOutput);
    }

    static String getRepeatedString(int count,char c){
        String myString ="";
        for(int j=0;j<count;j++){
            myString = myString+String.valueOf(c);
        }
        return myString;
    }
}
