package chapter08.ex04;

public class Student_Test {

	public static void main(String[] args) {

		//Student 객체 생성 
		Student s1 = new Student(); 
		
		s1.setStuName("홍길동");
		s1.setStuEmail("aaa@aaa.com");
		s1.setStuAge(10);
		s1.setStuWeight(55.55);
		
		//getter로 필드의 정보를 출력 
		
		System.out.println(s1.getStuName());
		System.out.println(s1.getStuEmail() );
		System.out.println(s1.getStuAge());
		System.out.println(s1.getStuWeight());
		
		//toString () 호출 
		System.out.println(s1);
		System.out.println(s1.toString());
	 
		


	}

}
