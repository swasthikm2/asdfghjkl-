package practice;
import java.util.*;
public class dist {
public static void main(String[] args) {
	
	/*
	OUTPUT should meet the following CONDITIONS

	Every word in the output has to be in the dict
	remove_spaces(output) == input

	E.g., 
	Dict ={ "you", "a", "are", "hero", "i", "then", "areah"} 
	Input = "youareahero"

	Output = "you are a hero"
	*/
	
	System.out.println(outputSentence("youareahero", new dist()));
	
}

public static boolean find(String aWord) {
//	String str = aWord;
	String arr[] = {"you", "a", "are", "hero", "i", "then", "areah"};
	
//	ArrayList<String> resultList = new ArrayList<>();
	Set<String> set = new HashSet<>();
	for(int i = 0; i < arr.length; i++) {
		set.add(arr[i]);
	}
	
	return set.contains(aWord);
}
	// Implement the following
		public static String outputSentence(String input, dist d)
		{
			if(input.length() == 0 || input == null) return "";
			StringBuilder sb = new StringBuilder();
			String temp = input.charAt(0)+"";
			for(int i = 1; i < input.length(); i++) {
				if(d.find(temp)) {
					sb.append(temp+" ");
					temp = "";
				}
				else {
					temp += input.charAt(i);
				}
			}
			
			return sb.toString();
			
		}


}
