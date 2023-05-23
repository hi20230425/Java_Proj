package chapter10.ex06;

class Student {        // 14: 50 분까지 완료 : p.jangwoo@gmail.com
	Student(String name) {
		this.name = name; 
	}
	
	String name ; 
	//합계와 평균을 출력 하는 메소드 : 부모 클래스의 메소드 : 실행 코드가 없음, 자식 클래스에서 오버라이딩해서 구현 코드를 생성함. 
	void sum_avg() {		
	}
}
class Student_Sub extends Student{
	int kor ; 
	int eng ; 
	int math ;  	
	//1.생성자로 매개변수 값을 받아서 각 필드의 값을 할당. name, kor, eng, math  
	Student_Sub (String name, int kor, int eng, int math) {
		//super(); 
		super (name); 
		super.name = name; 
		this.kor = kor;
		this.eng = eng; 
		this.math = math; 
	}
	
	//2. 필드의 값을 모두 합하고, 평균을 출력, 각 객체의 점수의 합계와 평균을 구하는 메소드  
	@Override
	void sum_avg() {
		int sum = 0; 
		double avg = 0.0 ; 
		
		sum = kor + eng + math ; 
		avg = (double)sum / 3 ;
		
		System.out.printf(  "%s 님의 과목의 국어, 영어, 수학의  합은 : %d 이고, 평균은 : %.2f 입니다.", name, sum, avg );
		System.out.println();
	}	
}
public class Ex01 {
	public static void main(String[] args) {
	//각 객체의 필드의 값 할당은 생서자 호출시 매개변수로 값을 넣도록 하세요. 
		/*
		 	홍길동 70 88 77
		 	이순신 80 68 87
		 	김똘똘 60 86 87 
		 	홍길순 77 56 80
		 	강감찬 55 66 77
		 */
		
		// Student 타입의 sum_avg() 호출시 오버라이딩된 메소드 호출  
		
		Student s1 = new Student_Sub("홍길동", 70, 88, 77); 
		Student s2 = new Student_Sub("이순신", 80, 68, 87); 
		Student s3 = new Student_Sub("김똘똘", 60, 86, 87); 
		Student s4 = new Student_Sub("홍길순", 77, 56, 80); 
		Student s5 = new Student_Sub("강감찬", 55, 66, 77); 
		
		// 직접 출력 
		s1.sum_avg();
		s2.sum_avg();
		s3.sum_avg();
		s4.sum_avg();
		s5.sum_avg();
		
		System.out.println("=================");
		// 배열에 넣고 
		Student[] arr = new Student[] {s1, s2, s3, s4, s5} ; 
		
		// for 문을 사용해서 배열의 메소드 호출 
		for ( int i = 0 ; i < arr.length ; i ++) {
			arr[i].sum_avg();
		}
		
		System.out.println("=================================");
		// for 문을 사용해서  아래와 같이 출력되도록 구문 작성 하세요.  : 
		
		
		//모든사용자의 국어점수의 총합 : 000점 
		//모든사용자의 영어점수의 총합 : 000점 
		//모든사용자의 수학점수의 총합 : 000점 

		
		
	}

}
