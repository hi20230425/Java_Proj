package chapter05.ex06;

import java.util.Arrays;

public class Non_Raectangle_Array {
	public static void main(String[] args) {
		/*
		 	2차원 배열 : 
		 	   - 정방형 배열 : 각 행의 대해서 열의 갯수가 같은 배열 
		 	   - 비 정방형 배열 : 각 행에 대해서 열의 갯수가 각 각 다른 배열  	   
		 */
		// 1. 비 정방형 배열 선언 : 
		//		-- 배열 변수를 생성시에 행의 방번호만 지정후, 나중에 각행에 대해서 열의 방번호를 지정함.
		// -- 행의 방번호만 지정 : 0, 1, 2 
		int[][] arr1 = new int[3][] ; 
		arr1[0] = new int[5];           // 0 번행의 열의 갯수 지정 : 5 
		arr1[1] = new int[2]; 			// 1 번행의 열의 갯수 2 
		arr1[2] = new int[4]; 			// 2 번행은 열의 갯수 4
		
		//직접 값을 할당
		// 0 행의 5개의 방에 값 할당 
		arr1[0][0] = 10; 
		arr1[0][1] = 20; 
		arr1[0][2] = 30; 
		arr1[0][3] = 40;
		arr1[0][4] = 50;
		
		// 1 행의 2개의 방에 값 할당 
		arr1[1][0] = 11;
		arr1[1][1] = 12;
		
		// 3 행의 4개의 방에 값 할당 
		arr1[2][0] = 21;
		arr1[2][1] = 22;
		arr1[2][2] = 23;
		arr1[2][3] = 24;
		
		// Arrays.toString (); 
		System.out.println("===Arrays.toString()");
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		
		
		
	System.out.println("=============================");	
	int[][] arr2 = new int[3][];      //비정방형 배열 선언 
		arr2[0] = new int[100];     // 10의 배수 입력 
		arr2[1] = new int[200]; 	// 20의 배수 입력 
		arr2[2] = new int[150]; 	// 30의 배수 입력 
		
		
	System.out.println(arr2.length);    //행의 갯수 출력 , // 3
	System.out.println(arr2[0].length); // 0 행의 length, // 100
	System.out.println(arr2[1].length); // 1 행의 length, // 200
	System.out.println(arr2[2].length); // 2 행의 length, // 150
	
	//이중 For문을 사용해서 값을 저장함. 
	for (int i = 0 ; i < arr2.length; i++) {
		if ( i == 0 ) {   
			for (int j = 0 , a = 10 ; j < arr2[i].length; j++, a+=10 ) {    //100 번 루프 
				arr2[i][j] = a; 
			}			
		}else if ( i == 1) {
			for (int j = 0, a = 20 ; j < arr2[i].length; j++, a+= 20) {   // 200번 루프
				arr2[i][j] = a; 
			}
		}else if ( i == 2 ) {
			for (int j = 0, a= 30 ; j < arr2[i].length; j++, a+=30 ) {   //150
				arr2[i][j] = a; 
			}
		}
	}
	
	System.out.println("==1. For 문을 사용해서 출력 == ");
	for ( int i = 0 ; i < arr2.length; i++) {
		for ( int j = 0 ; j < arr2[i].length; j++) {
			System.out.print(arr2[i][j] + " ");
		}
		System.out.println();
	}
	
	System.out.println("==2. Enhanced For 문을 사용해서 출력 ==");
	for (int[] k : arr2) {
		for ( int a : k) {
			System.out.print( a + " ");
		}
		System.out.println();
	}
	
	System.out.println("== 3. Arrays.toString () ==");
	
	for (int i = 0 ; i < arr2.length; i++ ) {
		System.out.println(Arrays.toString(arr2[i]));
	}
	
		
		
		
		
		
		
		
		
		

	}
}
