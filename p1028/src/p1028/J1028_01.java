package p1028;

import java.util.Scanner;

public class J1028_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int stuNum = 2;
		int choice = 0;
		String str = "";
		String[] name = new String[stuNum];
		int[][] score = new int[stuNum][3];
		int[] total = new int[stuNum];
		double[] avg = new double[stuNum];
		String[] title = { "이름", "국어", "영어", "수학", "총점", "평균", "등수" };

		loop: while (true) {

			System.out.println("---------------------------------");
			System.out.println("학생 성적 프로그램");
			System.out.println("1 학생 입력");
			System.out.println("2 점수 출력");
			System.out.println("3 성적 수정");
			System.out.println("");
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
					System.out.println((i + 1) + "번째 학생 입력");
					name[i] = scan.next();
					System.out.println();
					for (int j = 0; j < score[i].length; j++) {
						System.out.println(name[i] + "의" + (title[j + 1]) + " 점수를 입력해주세요");
						score[i][j] = scan.nextInt();
						total[i] = total[i] + score[i][j];
						avg[i] = total[i] / 3.0;
						System.out.println();
					}
				}
				break;
			case 2:
				System.out.println("학생 점수 출력 ( -1 상위 메뉴로 이동)");
				str = scan.next();
				if (str.equals("-1")){
					System.out.println("상위메뉴로 이동합니다.");
				break;
				}
				for (int i = 0; i < name.length; i++) {
					System.out.printf("이름\t국어\t영어\t수학\t총점\t평균\n");
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], score[i][0], score[i][1], score[i][2],
							total[i], avg[i]);
				}
				System.out.println();
				break;
			case 3:
				System.out.println("성적 수정( -1 상위 메뉴로 이동)");
				str = scan.next();
				if (str.equals("-1")){
					System.out.println("상위메뉴로 이동합니다.");
				break;
				}
				System.out.println("이름을 검색해주세요");
				str = scan.next();
				for (int i = 0; i < name.length; i++) {
					for (int j = 0; j < score[i].length; j++) {
						if (name[i].equals(str)) {
							System.out.println(name[i] + "의" + (title[j + 1]) + "수정 점수를 입력해주세요");
							score[i][j] = scan.nextInt();
						}
					}
					System.out.println();
				}
				break;
			case 4:
				break;
			case 0:
				break;
			}// switch
		} // while

	}// main

}// class
