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
		// 현대자동차 객체를 인풋으로 받아서 arr배열 변수에 저장 
		// 현대자동차의 배열에 저장된 최대스피트의 평균을 출력 
		// 현대 자동차의 배열에 저장된 오일의 합을 출력 
	}
	void avgMaxSpeed (Car[] arr) {
		
	}
	int sumOil (Car[] arr) {
		int sum = 0 ; 
			
		return sum ; 	
	}
	
	public static void main(String[] args) {
		//현대자동차의 객체를 생성해서 필드의 값입력 
									// 연식	 차이름  / 최대스피드 / 오일 용량  
		Hcar h1 = new Hcar();		// 2000 / 에쿠스 / 330 / 60     
		Hcar h2 = new Hcar();    	// 2010 / 제네시스 / 300 / 50 
		Hcar h3 = new Hcar();     	// 2022 / 그렌져 / 250 / 55
		Hcar h4 = new Hcar();     	// 2023 / 아반떼 / 200 / 40 
		
	}

}
