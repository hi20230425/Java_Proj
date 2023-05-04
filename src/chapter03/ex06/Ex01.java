package chapter03.ex06;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		  Ex01>  삼항 연산자를 사용해서 스캐너로 정수값을 인풋 받아서 인풋 받은 값이 홀수이면 
		  		" 지금 넣은 값은 0 이고 [홀수/짝수] 입니다."
		  
		  Ex02> 스캐너로 인풋 받은 값이  3,6,9의 배수이면 
		  " 지금 넣은 값은 3, 6, 9의 배수 입니다"
		  " 지금 넣은 값은 3,6,9의 배수가 아닙니다."		
		 */
		//1. Ex01 
		Scanner sc = new Scanner(System.in); 
		int a ; 
		System.out.println("정수값 하나를 넣어 주세요>>>");
		a = sc.nextInt(); 
		System.out.printf( (a%2==0) ? " 짝수 입니다 \n" : "홀수 입니다\n" );
		
		//2. Ex02 
		System.out.println("또 다른 정수값 하나를 넣어 주세요");
		a = sc.nextInt(); 
		System.out.println((a%3==0 || a%6==0 || a%9==0) ? "369의 배수입니다": "369의 배수가 아닙니다.");
				
	}

}
