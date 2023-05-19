package chapter08.ex03;
public class Ex01 {
	public static void main(String[] args) {   //완료시간 : 15:20   : p.jangwoo@gmail.com
		// 
		int[] coinUnit = { 500, 100, 50, 10 }  ;    //거슬러 줘야하는 잔돈 
		int money = 2680 ;    // money : 변수의 돈을 위의 거스름 돈으로 나누어 줄려고 함. 
		
		System.out.println("money = " + money );	
		
		for ( int i = 0 ; i < coinUnit.length; i++) {
			// 나누어줄 거슬름돈이 아래 와 같이 출력 되도록 코드 작성
			
			System.out.println(coinUnit[i] + "원 : " + money / coinUnit[i] + " 개" );
			
			money = money % coinUnit[i];   // 나누고 나머지 값만 가져와서 다음 으로 연산   
		}
			
	}
}

/*
실행결과 :
money = 2680 
500원 : 5 
100원 : 1
50원: 1 
10원: 3
*/