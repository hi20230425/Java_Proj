package chapter10.ex03;

class Customer{
	
	void memberInfo() {
		System.out.println("회원님은 기본 회원님 입니다. ");
	}
}

class Gold extends Customer {
	@Override
	void memberInfo() {
		System.out.println("회원님은 Gold 회원님 입니다. ");
	}
}
class Silver extends Customer {
	@Override
	void memberInfo() {
		System.out.println("회원님은 Silver 회원님 입니다. ");
	}
}
class Bronze extends Customer {
	@Override
	void memberInfo() {
		System.out.println("회원님은 Bronze 회원님 입니다. ");
	}
}

public class Ex03 {
	public static void main(String[] args) {

		//자식을 객체화해서 부모 타입으로 지정 
		//부모의 메소드 호출시 오버라이딩된 메소드 출력 
		// for / Enchance For 문에 넣어서 출력 
		
		Customer c1 = new Gold(); 
		Customer c2 = new Silver(); 
		Customer c3 = new Bronze(); 
		
		//Customer (부모) 의 메소드 호출시 오바라이딩된 자식 메소드의 내용 출력됨 
		c1.memberInfo();
		c2.memberInfo();
		c3.memberInfo(); 
		
		System.out.println("=======배열의 각 객체를 저장호 for / enhanced for 문을 사용하여 출력 ");
		//1. 배열에 저장 
		Customer[] arr = new Customer[] { c1, c2, c3}; 
		
		//for문으로 오버라이딩된 메소드 출력 
		for (int i = 0 ; i < arr.length; i++) {
			arr[i].memberInfo(); 
		}
		
		System.out.println("==Enhanced For 문을 사용하여 출력 ==");
		for ( Customer k : arr) {
			k.memberInfo(); 
		}

	}

}
