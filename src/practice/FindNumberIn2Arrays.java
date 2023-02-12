package practice;

import java.util.*;

public class FindNumberIn2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,1,2,4,7,6};
		int[] arr2 = {3,3,5,2,4,6};
		int target = 2;
		
		Map<Integer,Integer> map = new HashMap<>();		
		
		for(int i=0;i<arr1.length;i++) {
			map.put(arr1[i], i);
		}
		
		boolean flag = false;
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i]) && arr2[i]==target) {
				flag=true;
				System.out.println(map.get(arr2[i])+" "+i);
			}
		}
		if(!flag) {
			System.out.println("-1");
		}
		
	}

}
