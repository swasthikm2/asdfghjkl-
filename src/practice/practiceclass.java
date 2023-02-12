package practice;

public class practiceclass {
public static void main(String[] args) {
	int[] arr = new int[26];
	String str = "swasthik";
	String res = "";
	for (int i = 0; i < str.length(); i++) {
		if(!res.contains(str.charAt(i)+"")) {
			res+=str.charAt(i);
		}
	}
	for (int i = 0; i < str.length(); i++) {
		arr[str.charAt(i)-'a']++;
	}
	for (int i = 0; i < res.length(); i++) {
		System.out.println(res.charAt(i)+"->"+arr[res.charAt(i)-'a']);
		
	}
		
	
}
}
