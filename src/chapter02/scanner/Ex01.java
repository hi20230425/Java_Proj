package chapter02.scanner;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		// 18:00 까지 완료. 
		 
		//1. Scanner 등록 
		//2. 아버님 이름 , 어머님 이름 , 형제이름, 자신이름    : sc.next(); 
			//아버님 나이 , 어머님 나이 , 형제 나이, 자진의 나이 : sc.nextInt();
		//3. 스케너로 받은 변수의 값을 출력 
		//4. 전체 나이의 합계, 평균을 구해서 소숫점이하 2 자리까지만 출력 

		Scanner sc = new Scanner(System.in); 
		
		String fName ; 		//아버님 이름
		String mName ; 		//어머님 이름
		String bName ; 		//형제 이름
		String myName ; 	// 나의 이름 
		
		int fAge; 
		int mAge; 
		int bAge; 
		int myAge; 
		
		System.out.println("아버님이름 어머님이름 형제이름 나의이름을 공백을 구분해서 입력 하세요 >>>>");
		fName = sc.next(); 
		mName = sc.next(); 
		bName = sc.next(); 
		myName = sc.next(); 
		
		System.out.println("아버님나이 어머님나이 형제나이 나의나이을 공백을 구분해서 정수로 입력 하세요 >>>>");
		fAge = sc.nextInt(); 
		mAge = sc.nextInt();
		bAge = sc.nextInt();
		myAge = sc.nextInt();
		
		int sum = fAge + mAge + bAge + myAge; 
		double avg = sum / 4.0 ; 
		
		// 변수의 값을 출력 
		System.out.printf("아버님 이름은 %s , 어머님 이름은 %s 형제이름은 %s 나의 이름은 %s \n\n", 
				fName, mName, bName, myName );
		System.out.printf("아버님 나이는 %d, 어머님 나이는 %d 형제나이는 %d 나의 나이 %d \n\n", 
				fAge, mAge, bAge, myAge);
		
		System.out.printf("우리 가족의 나이의 합계는 %d, 평균은 %5.2f \n ", sum , avg );
		
				
		
	}

}
