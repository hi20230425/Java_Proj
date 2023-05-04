package chapter02.ex05;

public class TypeCasting {
	public static void main(String[] args) {
		/*
		 타입 캐스팅 (Type Casting) : 정수 ==> 실수  ,   실수 ==> 정수
		 
		 	-- 낮은 자료형    ==========> 높은 자료형 
		 	    byte  ==> short ==> int ==> long ==> float ==> double  
		 
		  	-- 업캐스팅 	: 자동으로 변환 , 
		  			낮은 자료형 ===> 높은 자료형으로 변환 
		  	-- 다운캐스팅  : 자동으로 변환되지 않는다, 수동으로 명시가 필요함. 
		  			높은자료형 ====> 낮은 자료형으로 변환  
		 	
		 */
		
		// 1. 캐스팅 방법 1 
		
//		int val1 = 4.3;    //오류 발생    val1 : int 이므로 실수를 넣으면 오뷰발생 
		int val2 = (int) 4.3;    // 다운 캐스팅 : 실수 4.3을 정수형으로 다운 캐스팅 해서 변수에 할당,  val2 : 4 
								    // 수동으로 명시를 해야 한다. 
		
		System.out.println(val2);    // 4 
		
		double val3 = 3;     // 업캐스팅 : 자동으로 작동됨 
		System.out.println(val3);
		
		
		//다운 캐스팅이 필요함. (명시해야함) 
		
		int val4 = (int) 5.8 ; 
		long val5 = (long) 10.0000344;     
		System.out.println(val4);       // 한 라인 복사 : ctrl + art + <아랫쪽 하살표>                          
		System.out.println(val5);       // 한 라인 복사 : ctrl + art + <아랫쪽 하살표>                          
	                         
		
		// 업캐스팅 (자동으로 업캐스팅됨) 명시 하지 않아도 됨 
		
		float val6 = 5; 
		double val7 = 6; 
		
		System.out.println(val6);
		System.out.println(val7);
		
		
		
		
		
		
		
	}

}
