package p1018;

import java.util.Scanner;

public class J1018_04_성적점수입력 {

	public static void main(String[] args) {

		// 국어 ,영어,수학,과학,사회 과목의 점수 입력받아 출력
		// 점수 5개 생성
		// 과목 타이틀 생성
		// 점수 입력
		// 점수 출력
		// 점수 총합
		// 점수 평균
		
		
		Scanner scan = new Scanner(System.in);
		
		int [] score = new int [5];
		String [] title = {"국어","영어","수학","과학","사회"};
		
		int total = 0 ;
		double avg = 0 ;
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(title[i]+"점수를 입력하세요");
			score[i] = scan.nextInt();
			
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(title[i]+"점수 : "+score[i]);
			total = total + score[i];
		}
		
		
		avg = total / 5.0;
		avg = (double)total/score.length;
		
		System.out.println(total);
		System.out.println(avg);
		
		
	}

}
