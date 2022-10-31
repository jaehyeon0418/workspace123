package p1031;

import java.util.Scanner;

public class J1031_01_학생성적프로그램등수까지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int choice = 0; // 번호 선택
		int stuNum = 3; // 학생 수 총 3명
		int[] total = new int[stuNum]; // 3명의 각 토탈 점수
		int[][] score = new int[stuNum][3];
		double[] avg = new double[stuNum]; // 3명의 각 평균
		String[] name = new String[stuNum]; // 3명의 이름을 입력
		String str = ""; // 이름입력
		String[] title = { "이름", "국어", "영어", "수학", "총점", "평균" ,"등수" };
		int[] rank = new int[stuNum];
		int rankNum = 0;

		loop: while (true) {

			System.out.println("---------------------------------");
			System.out.println("학생 성적 프로그램");
			System.out.println("1 학생 입력");
			System.out.println("2 점수 출력");
			System.out.println("3 성적 수정");
			System.out.println("4 등수 출력");
			System.out.println("0 종료");
			System.out.println("---------------------------------");
			System.out.println("번호를 입력하세요");
			choice = scan.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				System.out.println("학생 입력 ( -1 상위 메뉴로 이동)");
				str = scan.next();
				if (str.equals("-1")){
					System.out.println("상위메뉴로 이동합니다.");
				break;
				}
				for (int i = 0; i < name.length; i++) {
					System.out.printf((i + 1) + "번째 학생의 이름을 입력해주세요.");
					name[i] = scan.next();
					System.out.println();
					for (int j = 0; j < score.length; j++) {

						System.out.printf(name[i] + "의" + title[j + 1] + "점수를 입력하세요");
						score[i][j] = scan.nextInt();
						total[i] = total[i] + score[i][j];
						avg[i] = total[i] / 3.0;
					}
				}
				break;
			case 2:		
				for (int i = 0; i < name.length; i++) {
					rankNum = 1; // 등ㅅ ㅜ초기화
					for (int j = 0; j < name.length; j++) {
						if (total[i] < total[j]) {
							rankNum++; // 등수 계산
						}

					}
					rank[i] = rankNum; // 등수를 배열속에 넣어주기 
					System.out.println("등수처리가 완료 되었습니다.");
				}
				System.out.println();
				System.out.println("학생 점수 출력");
				System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\t등수\n");
				for (int i = 0; i < name.length; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", name[i], score[i][0], score[i][1], score[i][2],total[i], avg[i],rank[i]);
					System.out.println();
				}
				break;
			case 3:
				System.out.println("학생점수 수정 ( -1 상위 메뉴로 이동)");
				str = scan.next();
				if (str.equals("-1")){
					System.out.println("상위메뉴로 이동합니다.");
				break;
				}
				System.out.println("학생 이름을 입력하세요");
				str = scan.next();
				for (int i = 0; i < name.length; i++) {
					for (int j = 0; j < score.length; j++) {
						if (name[i].equals(str)) {
							System.out.println(name[i] + "의 점수를 수정합니다");
							System.out.println(title[j + 1] + "의 점수를 입력하세요");
							score[i][j] = scan.nextInt();

						}
					}
				}
				for (int i = 0; i < name.length; i++) {
					rankNum = 1; // 등ㅅ ㅜ초기화
					for (int j = 0; j < name.length; j++) {
						if (total[i] < total[j]) {
							rankNum++; // 등수 계산
						}

					}
					rank[i] = rankNum; // 등수를 배열속에 넣어주기 
					System.out.println("등수처리가 완료 되었습니다.");
				}
				break;
			case 4: 
				System.out.println("등수 처리");
				for (int i = 0; i < name.length; i++) {
					rankNum = 1; // 등ㅅ ㅜ초기화
					for (int j = 0; j < name.length; j++) {
						if (total[i] < total[j]) {
							rankNum++; // 등수 계산
						}

					}
					rank[i] = rankNum; // 등수를 배열속에 넣어주기 
					System.out.println("등수처리가 완료 되었습니다.");
				}
				break;
			case 0:
				System.out.println("프로그램이 종료 되었습니다.");
				break;
			} // switch
		} // while

	} // main

}
// class
