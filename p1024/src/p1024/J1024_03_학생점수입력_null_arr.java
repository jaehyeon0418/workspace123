package p1024;

import java.util.Scanner;

public class J1024_03_학생점수입력_null_arr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int choice = 0;
		int stunum = 0;
		int kor = 0;
		double avg = 0;
		int totalscore = 0;
		int maxscore = 0;
		int[] score = null;

		// while
		// 학생수 입력
		// 입력받은 학생의 수 만큼의 국어점수를 입력 받아서
		// 최고점수랑 평균읠 구하는 프로그램

		loop: while (true) {
			System.out.println("---------------------------");
			System.out.println("1.학생 수 입력");
			System.out.println("2.국어 점수 입력");
			System.out.println("3.입력된 점수 추력");
			System.out.println("4.평균과 최고값 출력");
			System.out.println("5. 종료");
			System.out.println("----------------------------");

			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("학생 수 입력하세요");
				stunum = scan.nextInt();
				score = new int[stunum];

				for (int i = 0; i < score.length; i++) {
					score[i] = 1 + i;
				}
				for (int i = 0; i < score.length; i++) {

				}

				break;

			case 2:
				System.out.println("국어 점수를 입력하세요");

				for (int i = 0; i < score.length; i++) {
					System.out.println((i + 1) + "번째 국어점수 입력");
					kor = scan.nextInt();
					score[i] = kor;
					totalscore = totalscore + score[i];

				}
				for (int i = 0; i < score.length; i++) {

				}

				break;
			case 3:
				for (int i = 0; i < score.length; i++) {
					System.out.println((i + 1) + "번째 국어점수 :" + score[i]);
				}

				break;
			case 4:
				System.out.println("평균과 최고점");
				avg = totalscore / score.length;

				System.out.println("평균 :" + avg);

				for (int i = 0; i < score.length; i++) {
					totalscore += score[i];
					if (maxscore < score[i]) {
						maxscore = score[i];
					}
				}
				System.out.println("최고점 :" + maxscore);

				break;
			case 5:
				break loop;
			}

		}

	}

}
