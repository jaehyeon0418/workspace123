package p1013;

import java.util.Scanner;

public class J1013_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 입력한 숫자 5개를 입력받아
		// 5개의 숫자,합과 평균을 구하시오
		// 입력한 숫자 : 1,2,3,4,5

		// 1. 배열 5개 선언.
		// 2. 배열 값을 넣는다.
		// 3. 배열 값을 출력한다.

		// 합계 : 15
		// 평균 : 3.0
		
		
		int [] num = new int[5];
		int sum = 0 ;
		double avg = 0 ;
		
		for ( int i = 0 ; i < 5 ; i++) {
			System.out.println("숫자를입력하세요");
			num[i] = scan.nextInt();
			
		}
		
	}
}
