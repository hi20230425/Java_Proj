package chapter10.ex04;

class Car {
	String companyName = "현대자동차"; 
	int carYear;         //생산년도.  
}
class Hcar extends Car {
	
	//
	String carName ; // 자동차 모델 (에쿠스, 제네시스, 아반데, 봉고 ) 
	int maxSpeed ;   // 최대 speed
	int oilLiter ;   // 각차의 오일이 최대 몇 리터    
	
}
class BMW extends Car {
	
}

public class Ex02 {
	//
	Car[] arr = null;            // 완료 : 6:20분까지 : p.jangwoo@gmail.com 
	void carInfo (Car c1, Car c2, Car c3 , Car c4) {   
		//1.  현대자동차 객체를 인풋으로 받아서 arr배열 변수에 저장 
		arr = new Car[]{ c1, c2, c3, c4 }; 
		//2. 현대자동차의 배열에 저장된 최대스피트의 평균을 출력 
		avgMaxSpeed(arr); 
		//3. 현대 자동차의 배열에 저장된 오일의 합을 출력 
		System.out.println("현대 자동차의 오일의 전체 합계는 : " + sumOil(arr));
	 
		
	}
	
	void avgMaxSpeed (Car[] arr) {
		//배열에 들어오는 갑을 다운캐스팅후 maxSpeed 필드의 값을 더함. 
		int sum = 0 ; 
		double avg = 0.0; 
		for (int i = 0 ; i < arr.length; i++) {
			// 다운 캐스팅 
			if ( arr[i] instanceof Hcar) {
				sum += ((Hcar)arr[i]).maxSpeed ;    // sum = sum + maxSpeed
			}
		}
		avg = (double) (sum / arr.length) ; 
		
		System.out.printf("현대 자동차의 평균 스피드는 : %.2f 입니다. " ,  avg );
		System.out.println();
	}
	
	int sumOil (Car[] arr) {
		int sum = 0 ; 
		
		// 배열에 들어오는 oilLiter 필드의 값을 더해서 리턴 
		for ( int i = 0 ; i < arr.length; i++) {
			//다운 캐스팅 
			if (arr[i] instanceof Hcar) {
				sum += ((Hcar) arr[i]).oilLiter; 
			}
		}
		
		return sum ; 	
	}
	
	public static void main(String[] args) {
		//현대자동차의 객체를 생성해서 필드의 값입력 
									// 연식	 차이름  / 최대스피드 / 오일 용량  
		Hcar h1 = new Hcar();		// 2000 / 에쿠스 / 330 / 60     
		Hcar h2 = new Hcar();    	// 2010 / 제네시스 / 300 / 50 
		Hcar h3 = new Hcar();     	// 2022 / 그렌져 / 250 / 55
		Hcar h4 = new Hcar();     	// 2023 / 아반떼 / 200 / 40 
		
		//객체의 값 할당. 
		h1.carYear = 2000; 
		h1.carName = "에쿠스"; 
		h1.maxSpeed = 330; 
		h1.oilLiter = 60; 
		
		h2.carYear = 2010; 
		h2.carName = "제네시스"; 
		h2.maxSpeed = 300; 
		h2.oilLiter = 50;
		
		h3.carYear = 2023; 
		h3.carName = "그렌져"; 
		h3.maxSpeed = 250; 
		h3.oilLiter = 55;
		
		h4.carYear = 2000; 
		h4.carName = "에쿠스"; 
		h4.maxSpeed = 330; 
		h4.oilLiter = 60;
		
		//객체 생성후 메소드 호출 
		Ex02 e = new Ex02(); 
		
		
		e.carInfo(h1, h2, h3, h4);
		
		
	}    

}
