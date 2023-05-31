package chapter17.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_Test {
	public static void main(String[] args) {
		
		// ArrayList 변수 선언 : <Student> 
		List<Student> aList = new ArrayList(); 
		Scanner sc = new Scanner(System.in);   // 콘솔로 부터 값을 인풋 
		
		//완료시간 : 17:00 까지 완료 : p.jangwoo@gmail.com
		
		boolean run = true ; 
		int studentNum = 0 ;         //스캐너로 학생수를 인풋 받는 변수 
		
		while ( run ) {
			System.out.println("===================================================");
			System.out.println("1. 학생수 입력 | 2. 점수 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("===================================================");
			System.out.println("위의 번호중 하나의 정수를 입력하세요. >>>>>");
			
			int selectNo = sc.nextInt(); 
			if ( selectNo == 1) {
				//스캐너로 학생수를 인풋 받아서 studentNum 변수에 할당 합니다. 
				System.out.println("1. 원하는 학생수를 입력하세요 >>> ");
				studentNum = sc.nextInt(); 
				System.out.println("당신이 입력한 학생수는 : " + studentNum + " 입니다. ");
				System.out.println();
				
			} else if ( selectNo == 2) {
				// 학생수가 인풋 되지 않으면 먼저 학생수를 입력 하세요 메세지 출력 
				if ( studentNum == 0 ) {
					System.out.println("먼저 학생수를 입력 해야 합니다. [1. 학생수 입력] 을 선택하세요. ");
					
				} else {
					// 학생수에대한 각각의 student 객체를 생성후 점수를 스캐너로 입력 받고  aList 에 저장 합니다. 
					for ( int i = 1 ; i <= studentNum ; i++) {
						
						Student student = new Student();  // Student 객체 생성 
						System.out.println(i + " 번째 학생의 점수를 입력해 주세요 >>> ");
						int score = sc.nextInt(); 	//스캐너로 점수를 인풋 받도록 함. 
						//스캐너로 인풋 받은 값을 student 객체에 setter 를 사용해서 저장 
						student.setScore(score);
						
						aList.add(student); 
						
					}
					System.out.println("학생의 점수 입력이 완료 되었습니다. ");
					System.out.println(); 				
					
				}				
				
			} else if (selectNo == 3) {
				// 점수의 리스트를 출력 , aList 의  Student 
				if ( studentNum == 0  ) {
					System.out.println("먼저 학생수를 입력 해야 합니다. [1. 학생수 입력] 을 선택하세요. ");
					
				}else if ( aList.isEmpty()) {
					System.out.println(" 먼저 [2. 점수] 을 선택해서 입력해 주세요. ");				
				}else {
					//aList 의 Student 객체를 끄집어 내서 출력 
					System.out.println("[3. 점수리스트] 를 출력 합니다. ");
					for ( int i = 0 ; i < aList.size() ; i++) {
						System.out.print (aList.get(i).getScore() + " ");		
					}
					System.out.println();System.out.println();
				}				
				
			} else if (selectNo == 4 ) {
				// 최대 점수를 출력 
				// 평균 출력 
				int maxScore = 0; 
				int sum = 0 ; 
				double avg = 0.0; 
				
				
				// aList에 Student객체에 getScore() 를 사용해서 점수를 끄집어 내면서 처리 
				for ( int i = 0 ; i < aList.size() ; i++) {
					Student student = aList.get(i) ;  
					
					//점수 : 객체의 getter를 사용해서 점수를 받아온다.  
					int score = student.getScore(); 
					
					sum += score;     // sum = sum + score ;
					
					//최대 점수를 maxScore 변수에 할당  : if 조건으로 처리, 삼항 연산자로 처리 
					if (score > maxScore) {
						maxScore = score;     
					}	
				}
				avg = (double) sum/aList.size(); 
				
				System.out.println(" 최대 점수는 : " + maxScore);
				System.out.println(" 평균은 : " + avg );
				System.out.println();		
				
			}else if (selectNo ==5 ) {
				//while문을 빠져나옴 
				
				//break; 
				run = false; 
			}else {
				System.out.println("잘못된 번호를 입력 했습니다. 1 ~ 5번 까지만 선택 하세요");
				System.out.println();
			}
			
			
		}
		
		System.out.println("프로그램 종료됨 ");
		sc.close();

	}
}
