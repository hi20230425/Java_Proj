package chapter04.ex03;

public class Ex02 {
	public static void main(String[] args) {
		/*
		  2중 for 문을 사용해서 구구단 출력  ( printf ( " \t " ) , println() 
		   
		   1단
		   1 * 1 = 1     1 * 2 = 2     1 * 3 = 3  .......  1 * 9 = 9 
		   
		   2단 
		   2 * 1 = 1     2 * 2 = 4     2 * 3 = 6  .......  2 * 9 = 18
		   
		   ....
		   
		   9단 
		   9 * 1 = 1     9 * 2 = 18     9 * 3 =27  .......  9 * 9 = 81
		 */
		System.out.println("=====print() 로 출력 =============");
		for ( int i = 1 ; i < 10 ; i++) {	//단을 출력 : i 
			System.out.println(i + " 단");
			for ( int j = 1 ; j < 10 ; j++) {  //  각 단에서 * 1 ~ 9 
				System.out.print( i + " * " + j + " = " + i * j + "\t");
			}
			System.out.println(); System.out.println();	
		}
		
		System.out.println("======printf()로 출력 ============");
		for ( int i = 1 ; i < 10 ; i++) {
			System.out.println(i + " 단");
			for (int j = 1 ; j < 10 ; j++) {
				System.out.printf("%d * %d = %d \t" , i, j , i * j);
			}
			System.out.print("\n\n"); 
		}
		
	}
}
