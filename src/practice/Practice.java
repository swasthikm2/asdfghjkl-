package practice;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// s w a s t i k i
		
		// s s i i w a t k
		
		
		// 0 1 2 3 4 5 6 7 ...... 25
		// a b c d e f g h ...... z
		
		
		// a -> 97  --> 0
		// b -> 98  --> 1
		
		
		// z -> 122 --> 25
		
		// [1,0,0,............2,1,0]
		
		int[] arr = new int[26];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String str = sc.next();
		
		String res = "";
		
//		char[] temp = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(!res.contains(str.charAt(i)+"")) {
				res+=str.charAt(i);
			}
		}
		
		// str = swastiiiik
		// res = swatik
		
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)-'a']++;
		}
		
		// new function
		ArrayList<Pair> list = new ArrayList<>();
//		(s,2)(i,2)...
		
		for(int i=0;i<res.length();i++) {
			list.add(new Pair(res.charAt(i), arr[res.charAt(i)-'a']));
		}
		
		Collections.sort(list,(a,b)->b.freq-a.freq);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).data+" -> "+list.get(i).freq);
		}
		
		
//		for(int i=0;i<res.length();i++) {
//			
//			System.out.println(res.charAt(i)+" -> "+arr[res.charAt(i)-'a']);
//		}
		
//		for(int i=0;i<26;i++) {
//			if(arr[i]!=0) {
//				System.out.println((char)(i+'a')+" -> "+arr[i]);
//			}
//		}
		
		
		// HashMap, HashSet
		
//		ArrayList<Integer> list = new ArrayList<>();
		
			
	}

}


class Pair{
	char data;
	int freq;
	Pair(char data, int freq){
		this.data=data;
		this.freq=freq;
	}
}
