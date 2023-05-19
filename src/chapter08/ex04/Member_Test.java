package chapter08.ex04;

public class Member_Test {

	public static void main(String[] args) {
		// Member 객체 생성후 setter로 주입 / getter로 필드의 값을 출력 
		
		Member m1 = new Member(); 
		
		//setter로 값을 주입 
		m1.setMemberNo(1L);    // 1L 
		m1.setMemberEmail("aaa@aaa.com");
		m1.setMeberPass("1234");
		m1.setMemberAge(10);
		m1.setMemberId("Himedia");
		
		
		//getter로 필드의 값을 출력함. 
		System.out.println(m1.getMemberId());
		System.out.println(m1.getMeberPass());
		System.out.println(m1.getMemberEmail());
		System.out.println(m1.getMemberNo());
		System.out.println(m1.getMemberAge());
		
		
		//toString () 
		System.out.println(m1);
		System.out.println(m1.toString());
		
		
		

	}

}
