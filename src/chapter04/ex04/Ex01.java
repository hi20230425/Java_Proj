package chapter04.ex04;

public class Ex01 {
	public static void main(String[] args) {
		/*
		    1000 부터 1 까지 5씩 감소하면서 출력 : for, while 문으로 출력 
		 */
		
		System.out.println("==For 문으로 출력 ==");
		for ( int i = 1000 ; i > 0 ; i -= 5 ) {
			System.out.print( i + "\t");
		}
		System.out.print("\n \n");
				
		System.out.println("==While 문으로 출력 ==");
		
		//
		int j = 1000; 			// 초기값 : while 밖에서 선언 
		while ( j > 0) {		// 조건
			System.out.print( j + "\t");	//조건이 true 일동안 실행 
			j -= 5 ;    		// 증감식 
		}
		
	}

}
