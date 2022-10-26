package p1018;

import java.util.Scanner;

public class J1018_03_성적_점수_입력 {

	public static void main(String[] args) {
		// 배열
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];   // 배열 5개 생성
		int total = 0;             // 
		double avg = 0;
		
		String[] title = { "국어", "영어", "수학", "과학", "사회" };   // 과목 5개 
		

		for (int i = 0; i < 5; i++) {
			System.out.println(title[i]+"점수를 입력하세요.");     // 각 과목의 점수 입력
			score[i] = scan.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(title[i] + " 점수 출력 :" + score[i] );  // 각 과목의 점수 출력
			total = total+score[i];									 // 과목의 점수 총합
		}
		
		avg = total / 5.0 ;
		avg = (double)total / score.length ;
	//	avg = (double)total / score.length ;   실수 =    (실수) 정수 / 정수
		System.out.println("합계  :"+total);
		System.out.println("합계  :"+avg);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[] score = new int[10];
//		// 1,2,3,4,5,..........10
//		// 입력
//		for (int i = 0; i < 10; i++) {
//			score[i] = i+1;
//		}
//		// 출력
//		for (int i = 0; i < 10; i++) {
//			System.out.println(score[i]);
//		}

//		int num = 0; // 1개 변수
//		int num2 = 0;
//		//////////////////////////////////////////
//		int [] score = new int[5]; // 5개 변수   // for 문에 많이 씀
//		int [] score2 = new int[5]; // 5개 변수
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		int [] score2 = {1,2,3,4,5};  // 그냥 할때 많이 씀
//		///////////////////////////////////////////////////////   - 자주 씀
//		
//		int [] score3 = new int[] {1,2,3,4,5};  // 그냥 할때 많이 씀
//		
//		/////////////////////////////////////////

	}

}
