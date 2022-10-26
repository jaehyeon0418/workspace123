package p1013;

import java.util.Scanner;

public class J1013_01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			//변수선언
			String [] title = {"이름","국어"};
			String [] name = new String [3];
			int[] kor = new int[3];
			int[] eng = new int[3];
			int[] math = new int[3];
			int[] total = new int[3];
			double[] avg = new double[3];
			
			
			
			// 입력		
			for (int i=0; i<name.length;i++) {
				System.out.println("이름을 입력하세요");
				name[i] = scan.next();
				System.out.println("입력한 이름 :"+name[i]);
				scan.nextLine();
				System.out.println("국어 점수를 입력하세요.");
				kor [i] = scan.nextInt();
				System.out.println("영어 점수를 입력하세요.");
				eng [i] = scan.nextInt();
				System.out.println("수학 점수를 입력하세요.");
				math [i] = scan.nextInt();
				scan.nextLine();
				
				total[i] = kor[i] + eng[i] + math[i] ;
				avg[i] = total[i] / 3.0 ;
				}
			
			// 성적출력
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\n");
			System.out.println("----------------------------");
				
			for (int i=0; i > name.length;i++) {
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",name[0],kor[0],eng[0],math[0],total[0],avg[0]);
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",name[1],kor[1],eng[1],math[1],total[1],avg[1]);
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",name[2],kor[2],eng[2],math[2],total[2],avg[2]);
			}
				
				
			
			
			
			
			
			
			
			
			
			
	}

}
