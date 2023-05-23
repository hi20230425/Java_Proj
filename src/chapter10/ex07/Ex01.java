package chapter10.ex07;

class Apple {
	String name;   // 이름
	int price ; 	//가격
	int count; 		//갯수 	
	
	Apple (String name, int price, int count) {
		this.name = name; 
		this.price = price; 
		this.count = count; 
	}
}

class Banana {
	String name;   // 이름
	int price ; 	//가격
	int count; 		//갯수 
	Banana (String name, int price, int count) {
		this.name = name; 
		this.price = price; 
		this.count = count; 
	}
}
class Stroberry {
	String name;   // 이름
	int price ; 	//가격
	int count; 		//갯수 
	Stroberry (String name, int price, int count) {
		this.name = name; 
		this.price = price; 
		this.count = count; 
	}
}

public class Ex01 {
	
	// 배열의 객체을 매개변수로 받아서 총 가격을 출력 
	void totalPrice (Object[] obj) {
		
	}
		
	public static void main(String[] args) {
		// p.jangwoo@gmail.com      
		/*
		  모든 클래스는 Object의 자식 클래스 이다. 
		  모든 클래스는 Object의 타입으로 업캐스팅이 가능하다.  
		 */
		
		/*  생성자를 사용해서 각 객체의 값을 할당. 
		"사과" 2000 5
		"바나나" 4000 10
		"딸기" 5000 30
	
		*/ 
		
		// 모든 객체를 Ojbect 배열에 넣습니다. 
		
		Object[] obj = new Object[] { } 
		
		
	}

}
