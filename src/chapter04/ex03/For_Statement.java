package chapter04.ex03;

public class For_Statement {
	public static void main(String[] args) {
		/*
		  반복문 : for, while, do while    ,  조건이 true 일때 까지 반복, 조건이 false 이면 구문을 빠져나온다. 
		  
		  for (변수의초기값;조건;증감식) {
		  	// 조건이 True 일동안 반복 실행블락
		  }
		  
		 */
		
		//1. For 문의 기초 : i = 0 값을 할당 함. , i변수는 for 블락에서 선언 했기 때문에 for문이 끝나면 소멸 
			// 0 ~ 9까지 1씩 증가하면서 i 변수의 값을 출력 
		for (int i = 0; i <10 ; i ++) {
			
			System.out.println(i);	
		}
		
		// i = 100, j=200 <== 초기갑 ,   i <1000 <== 조건 ,  증감식 : i++, j++ <== 실행 구문 작동후 증감식작동 
		for (int i = 100, j = 200 ; i < 1000 ; i++, j++) {
			System.out.printf("변수 i : %d, 변수 j : %d \n", i , j );
		}
		
		System.out.println("==================================");
		
		// 전역 변수로 선언  b 
		
		
		int b ;     //전역 변수 : for 문 블락 밖에서 선언 
		for ( b=0 ; b < 100 ; b +=2 ) {
			System.out.print(b + " ");
		}
		System.out.println();   //라인 개행 
		
		// for 문을 사용해서 0 ~ 1000 사이의 3배수만 출력 
		for (int a = 0 ; a < 1000 ; a+=3) {
			if (a != 0) {
				System.out.print( a + " " );
			}
		}
		System.out.println();
		System.out.println("======2단을 println()으로 출력 ==================================");
		
		// for 문을 사용해서 2단 출력  
		for ( int i = 2, j = 1 ; j < 10 ; j++ ) {
			System.out.println( i + " * " + j +  " = " + i * j );
		}
		
		System.out.println("======2단을 printf()으로 출력 ==================================");
		for (int i = 2, j=1 ; j < 10 ; j++) {
			System.out.printf( "%d * %d = %d \n", i, j, i*j);
		}
		
	}
}
