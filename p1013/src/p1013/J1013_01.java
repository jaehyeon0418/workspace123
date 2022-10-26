package p1013;

import java.util.Scanner;

public class J1013_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//변수선언
		String [] title = {"이름","국어"};
		String [] name = new String [3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		
			
		
		
		
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
			
			for (int j=0; j > name.length;j++) {
				System.out.println("이름\t국어\t영어\t수학\n");
				System.out.println("-------------------");
			}
			System.out.printf("%s\t%d\t%d\t%d\n",name[i],kor[i],eng[i],math[i]);
			
		}
	
		
		
		
		
		
		
		
		
		
		
	}

}
