package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		// 단축키 : Ctrl + Shift + F <== 코드를 자동정렬
		// 단축키 : Ctrl + Alt + Down(화살표) : 선택된 라인을 복사
		// 단축키 : Alt + UP/Down : 선택 라인을 이동

		// 스캐너로 번호를 인풋 받아서 4. 번을 누를때까지는 계속 무한루프
		// do while, if , for-for
		// 완료시간 : 15:10 까지 완료
		Scanner sc = new Scanner(System.in);
		int a; // sc로 받은 값을 담은 변수

		do {
			System.out.println("===============================================================");
			System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단중 7배수단 출력 | 4. 프로그램 종료");
			System.out.println("================================================================");
			System.out.println("위의 번호를 입력 하세요 >>>> ");
			a = sc.nextInt();

			if (a == 1) {
				System.out.println("1. 구구단 출력");
				System.out.println("===============");
				for (int i = 1; i < 10; i++) { // 단수를 출력 하는 for , i : 단
					System.out.println(i + " 단");
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d * %d = %d \t", i, j, i * j);
					}
					System.out.println(); // 단수를 출력후 enter
				}

			} else if (a == 2) {
				System.out.println("2. 19단 출력");
				System.out.println("===============");
				for (int i = 1; i < 20; i++) { // 단수를 출력 하는 for , i : 단
					System.out.println(i + " 단");
					for (int j = 1; j < 20; j++) {
						System.out.printf("%d * %d = %d \t", i, j, i * j);
					}
					System.out.println(); // 단수를 출력후 enter
				}

			} else if (a == 3) {
				System.out.println("3. 19단중 7배수단 출력");
				System.out.println("===============");

				for (int i = 1; i < 20; i++) { // 단수를 출력 하는 for , i : 단
					if (i % 7 == 0) {
						System.out.println(i + " 단");
						for (int j = 1; j < 20; j++) {
							System.out.printf("%d * %d = %d \t", i, j, i * j);
						}
						System.out.println(); // 단수를 출력후 enter
					}
				}

			} else if (a == 4) {
				System.out.println("4. 프로그램 종료");
				break;
			} else {
				System.out.println("경고 : 1 ~ 4까지의 정수만 입력 하세요. ");

			}

		} while (true);
		System.out.println("while 문 탈출 - 프로그램 종료됨");
		sc.close();
	}
}
