package p1011;

import java.util.Scanner;

public class J1011_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수 2개를 입력받아 평균을 내서 kor. eng
		// 평균에 맞는 학점을 출력하시오 90<= A 80<=B 70<=C 70< F
		// 정답
		int kor = 0, eng = 0, total = 0;
		double avg = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		eng = scan.nextInt();

		total = kor + eng;
		avg = total / 2.0;

		if (avg >= 90) {
			System.out.println("A입니다.");
		} else if (avg >= 80) {
			System.out.println("B입니다.");
		} else if (avg >= 70) {
			System.out.println("C입니다.");
		} else
			System.out.println("F");

//		System.out.println("숫자를 입력하세요");
//		int score = scan.nextInt();
//		
//		if (score > 90) {
//			System.out.println("합격입니다.");
//		} else System.out.println("불합격입니다.");

		// 점수 2개를 입력받아 평균을 내서 kor. eng
		// 평균에 맞는 학점을 출력하시오 90<= A 80<=B 70<=C 70< F

//		System.out.println("국어 점수를 입력하시오");
//		int kor = scan.nextInt();
//		System.out.println("영어 점수를 입력하시오");
//		int eng = scan.nextInt();
//
//		int total = kor + eng;
//		System.out.println("총 점수 :" + total);
//
//		double avg = (kor + eng) / 2.0;
//		System.out.println("평균 점수 :" + evg);
//
//		if (avg >= 90) {
//			System.out.println("A입니다.");
//		} else if (avg >= 80) {
//			System.out.println("B입니다.");
//		} else if (avg >= 70) {
//			System.out.println("C입니다.");
//		} else
//			System.out.println("F");

	}

}
