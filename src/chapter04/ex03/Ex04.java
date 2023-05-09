package chapter04.ex03;

public class Ex04 {
	public static void main(String[] args) {
		
	/* 
	    1. 이중 for 문을 사용해서 1단 19 단까지 출력 
	    2. 이중 for 문을 사용해서 1단 19 단까지 출력 중 3의 배수단 만 출력 
	      < 완료시간 : 10시 40분까지 :  p.jangwoo@gmail.com > 
	 */
	
		System.out.println("===1. 1단 ~ 19단까지 출력 ==");
		for ( int i = 1 ; i < 20 ; i++) {    //단을 출력하는 for : i <== 단을 출력 변수 
			System.out.println( i + "단");
			for (int j = 1 ; j < 20 ; j++ ) {
				System.out.printf("%d * %d = %d \t" , i, j, i*j );
			}
			System.out.print("\n\n");
			
		}
		
		
		System.out.println("===2. 1단 ~ 19단까지 출력 내용중 3의 배수단만 출력 : if문을 사용  ");
		
		for ( int i = 1 ; i < 20 ; i++) {    //단을 출력하는 for : i <== 단을 출력 변수 
			
			if ( i % 3 == 0 )	{		// 3의 배수 단만 출력 	
				System.out.println( i + "단");
				for (int j = 1 ; j < 20 ; j++ ) {
					System.out.printf("%d * %d = %d \t" , i, j, i*j );
				}	
			}
			
			if ( i % 3 == 0) {
				System.out.print("\n\n");
			}
		}	
		
		System.out.println("===2. 1단 ~ 19단까지 출력 내용중 3의 배수단만 출력 : i의 증가값을 적용  ");
		for ( int i = 3 ; i < 20 ; i+=3) {    //단을 출력하는 for : i <== 단을 출력 변수 
			System.out.println( i + "단");
			for (int j = 1 ; j < 20 ; j++ ) {
				System.out.printf("%d * %d = %d \t" , i, j, i*j );
			}
			System.out.print("\n\n");		
		}
				
		System.out.println("===2. 1단 ~ 19단까지 출력 내용중 3의 배수단만 출력 : continue  ");
		
		// 제어 키워드 : break; continue; 
			// 제어 키워드는 일반적으로 if 문과 같이 사용됨 
			// break ;   <== { } 실행 블락을 탈출 
			// continue ;    <== continue 를 만나면 continue; 아래 내용을 실행되지 않고, 증감식을 작동시 시킴 
		
		for ( int i = 1 ; i < 20 ; i++) {    //단을 출력하는 for : i <== 단을 출력 변수
			
			if ( i % 3 != 0 ) { continue; }   // 3의 배수가 아닐때는 continue 가 작동, 
			
			System.out.println( i + "단");
			for (int j = 1 ; j < 20 ; j++ ) {
				System.out.printf("%d * %d = %d \t" , i, j, i*j );
			}
			System.out.print("\n\n");
			
		}
		
	
		
		
	}
}
