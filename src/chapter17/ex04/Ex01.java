package chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 	1. for문을 사용해서 1 ~ 100 까지 HashSet에 값을 저장 
		 	2. Iterator 를 사용해서 HashSet에 저장된 값을 출력 
		 	3. Enhanced for문을 사용해서 출력 
		 	4. HashSet에 저장된 값을 ===> 배열로 변환 , 일반 for 문을 사용해서 출력 
		 	
		 	완료시간 : 12시 50분까지 완료 : p.jangwoo@gmail.com 
		 */
		
		//1. HashSet 선언후 객체 내부에 값입력 
		Set<Integer> hset = new HashSet(); 
		HashSet<Integer> hset2 = new HashSet(); 
		
		
		for ( int i = 1 ; i <= 100 ; i++) {
			hset.add(i); 
		}
		
		System.out.println(hset);
		
		// Iterator 를 사용해서 출력 
		Iterator<Integer> iterator = hset.iterator(); 

		while ( iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		// Enhanced For 문을 사용해서 출력 

		for (int k :  hset) {
			System.out.print( k + " ");
		}
		System.out.println();
		
		//4 배열로 변환후 일반 for문을 사용해서 출력 
		Integer[] arr = hset.toArray(new Integer[0]); 
		
		for (int i =0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
