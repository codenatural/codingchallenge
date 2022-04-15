package demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfPallindromeStringInAGivenString {

	public static void main(String[] args) {
		String checkString = "Nitin";
		System.out.println("Input String : "+checkString);
		int countOfPal = 0;
		int currentPos=0;
		while(currentPos<checkString.length()-2){
			String mySubString = checkString.substring(currentPos,currentPos+3);
			if(checkPallindrome(mySubString)==true){
				System.out.println(mySubString);
				countOfPal++;
				currentPos=currentPos+1;
			}else{
			currentPos=currentPos+1;
			}

		}

		System.out.println("Number of Pallindrome Words : "+countOfPal);
	}
	
	static boolean checkPallindrome(String str){
		StringBuffer stb = new StringBuffer(str);
		stb.reverse();
		if(str.equals(stb.toString())){
			return true;
		}else{
		    return false;
		}
}

}
