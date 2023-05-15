package Chapter06.ex01;

class Animal {
	// 기본생성자 
	public Animal() {} 

	// 필드 
	String animalName ; 
	String animalCry; 
	String animalRun; 
	int animalAge; 
	double animalWeight; 
	
	//필드의 내용을 출력  : 필드의 내용출력 
	public void print () {
		System.out.println("동물이름 : " + animalName);
		System.out.println("동물의 울음소리 : " + animalCry);
		System.out.println("동물의 운동 : " + animalRun);
		System.out.println("동물 나이 : " + animalAge);
		System.out.println("동물 몸무게 : " + animalWeight);
	}
}
public class Object05 {
	public static void main(String[] args) {
		// Animal 클래스 ==> tiger 객체 생성 : "호랑이"/"어흥"/"컹충컹충"/10/300
		// Animal 클래스 ==> egle 객체 생성 : "독수리"/"키이오"/"훨훨날아감"/20/30
		// Animal 클래스 ==> dog 객체 생성 : "개"/"멍멍"/"팔짝팔짝"/40/20
		
		// 16:00까지 : 
		// arr1 배열에 객체를 저장후 끄집어내서 출력 

	}
}
