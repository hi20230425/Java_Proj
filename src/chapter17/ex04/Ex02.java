package chapter17.ex04;
import java.util.HashSet;
import java.util.Set;

class Student{
	int stuID; 			// 식별자 : 
	String stuName; 
	String stuPhone;	
	public Student(int stuID, String stuName, String stuPhone) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuPhone = stuPhone;
	} 	
}
public class Ex02 {
	public static void main(String[] args) {

		Set<Student> hset = new HashSet(); 
		
		//학생 객체 5개 생성해서 set에 넣을 경우 stuID 필드에 중북된 값을 넣지 못하도록 설정 
		// stuID필드의 equals() 재정의 , hashCode() 재정의 
		// 완료시간 : 17:00 , p.jangwoo@gmail.com
		

	}

}
