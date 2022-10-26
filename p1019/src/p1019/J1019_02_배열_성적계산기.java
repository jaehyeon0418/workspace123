package p1019;

import java.util.Scanner;

public class J1019_02_배열_성적계산기 {

	public static void main(String[] args) {
		// score 크기 3의 배열 생성
		// score 숫자 입력
		// score 숫자 출력

		int[] score = new int[3];
		Scanner scan = new Scanner(System.in);
		String name = "";
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
		
		int total = 0;
		double avg = 0;
		
		for (int i = 0; i < 3; i++) {
			score[i] = i + 1;
		}

		System.out.println("이름을 입력하세요.>>");
		name = scan.nextLine();

		for (int i = 0; i < 3; i++) {
			System.out.println("점수를 입력하세요");
			score[i] = scan.nextInt();
			total = total + score[i];
		}

		// 합계, 평균 계산 total,avg
		
		avg = total / 3.0;
		
		// 데이터 출력
		
		for (int i = 0; i < 6; i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("--------------------------------------");
		
		System.out.printf("%s\t",name);
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d\t",score[i]);	
		}
		// 합계 평균
		System.out.printf("%d\t%.2f\n",total,avg);
		
		
		
		
		
		
		
		
		
	} // main

} // class
