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
		
		//tiger 객체 생성 
		System.out.println("== tiger 객체 생성 =====");
		//1. 객체 생성 
		Animal tiger = new Animal(); 
		
		//객체를 생성하면. 객체의 필드와 메소드를 사용.
		//2. 객체의 필드의 값을 넣는다. 
		tiger.animalName = "호랑이";
		tiger.animalCry = "어흥"; 
		tiger.animalRun = "컹충컹충"; 
		tiger.animalAge = 10; 
		tiger.animalWeight = 300; 
		
		//3. print() : 필드의 값을 출력 
		tiger.print();
		
		System.out.println("== egle 객체 생성 ==");
		// egle 객체 생성  : : "독수리"/"키이오"/"훨훨날아감"/20/30
		Animal egle = new Animal (); 
		
		//객체의 필드의 값 주입 
		egle.animalName="독수리"; 
		egle.animalCry= "키이오"; 
		egle.animalRun="훨훨날아감"; 
		egle.animalAge = 20 ; 
		egle.animalWeight = 30; 
		
		//egle 객체의 필드의 값 출력 : print() 
		egle.print();
		
		
		System.out.println("== dog 객체 생성 == ");
		//dog 객체 생성 : "개"/"멍멍"/"팔짝팔짝"/40/20
		
		Animal dog = new Animal();  
		
		// dog 객체의 필드의 값을 주입 
		dog.animalName = "개"; 
		dog.animalCry = "멍멍"; 
		dog.animalRun = "팔짝팔짝"; 
		dog.animalAge = 40; 
		dog.animalWeight = 20 ; 
		
		// 필드의 주입된 값을 출력 하는 메소드 호출 : print() 
		dog.print();
		
		
		System.out.println(" ==== 배열에 값을 할당후 출력 ========");
		
		//배열 선언 , 
		
		// 1. 방의 크기를 지정후 나중에 각 방에 값을 입력 
		int[] arr11 = new int[3];    //arr11 배열은 방(index) 3개가 생성이 되고 정수만 입력 
		double[] arr12 = new double[3]; //arr12 배열은 방(idex) 3개가 생성되고 실수만 입력 
		String[] arr13 = new String[3]; // 문자열만 저장가능 
		
		
		Animal[] arr1 = new Animal[3]; // Animal 타입의 객체만 저장이 가능 
		
		//각 배열의 방에 Animal 타입의 객체를 저장 , tiger, egle, dog는 Animal 클래스로 생성됨, Animal 타입을 가지고 있다. 
		
		arr1[0] = tiger;    //arr1 0번째 방에 tiger 객체를 저장 
		arr1[1] = egle ;    //arr1 1번째 방에 egle 객체를 저장 
		arr1[2] = dog ;     //arr1 2번째 방에 dog 객체를 저장 
		
		// 각 배열의 방에는 객체의 Heap 의 주소가 들어가 있다. 
		System.out.println(tiger);    // 76ccd017
		System.out.println(egle);	  // 182decdb
		System.out.println(dog);	  // 26f0a63f
		
		// 배열의 방의 저장된 객체를 다시 변수에 할당해서 끄집어 낸다. 
		//객체 변수를 선언후 끄집어 낸다.
		System.out.println("===============");
		Animal a1 = null ;				// 객체형 변수 : a1 
			System.out.println(a1);
		a1 = arr1[0]; 					//arr1[0] 방의 값을 가지고 와서 a1 변수에 할당.      
			System.out.println(a1);
		
		Animal a2 = arr1[1];   // egle 객체 
		Animal a3 = arr1[2];   // dog 객체 
		
		
		System.out.println("==tiger 객체의 정보를 출력===================");
		a1.print();     // tiger 객제의 정보를 출력 
		
		System.out.println("==egle 객체의 정보를 출력=======");
		a2.print();
		
		System.out.println("==dog 객체 정보를 출력 ===");
		a3.print();
		
		
		
		
		
		
		
		
		
		

	}
}
