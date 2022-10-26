package p1013;

import java.util.Arrays;
import java.util.Scanner;

public class J1013_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 5개의 숫자를 입력받아
		// 가장 큰 수와 가장 작은 수를 출력하시오
		// 입력한 숫자 : 1,2,3,4,5
		// 가작 큰 수 : 5
		// 가장 작은 수 :1
		
		int [] num = new int[7];
		int big = 0 ;

		int small = 0 ;

		for (int i=0; i<7 ; i++) {
			System.out.println("숫자를 입력하세요");
			num [i] = scan.nextInt();
			
			if(big<num[i]) {
				big=num[i];
			} if (small>num[i]) {
				small=num[i];
			}
		} 
				
			
		System.out.println("당신이 입력한 숫자 :");
		for (int i=0;i<7;i++) {
			System.out.println(num[i]+",");
		}
		System.out.println();
		Arrays.sort(num);
		System.out.println("큰 수 :"+ num[num.length+1]);
		System.out.println("작은 수 :"+ num[num.length-1]);
		
		
		

		
		
		
		// 국어,영어,수학 3명의 점수를 입력받아 출력하시오.
		

//		int [] kor = new int[3];
//		int [] eng = new int[3];
//		int [] math = new int[3];
//		
//		for (int i=0; i < 3 ; i++) {
//			System.out.println("국어 점수");
//			kor [i] = scan.nextInt() ;
//			System.out.println("영어 점수");
//			eng [i] = scan.nextInt() ;
//			System.out.println("수학 점수");
//			math [i] = scan.nextInt();
////			System.out.printf("국어\t영어\t수학\n");
////			System.out.printf("%d\t%d\t%d\n",kor[i],eng[i],math[i]);
//			
//		}
//		System.out.println("[[ 성적 출력 ]]");
//		System.out.printf("국어\t영어\t수학\n");
//		System.out.println("---------------------------------");
//		System.out.printf("%d\t%d\t%d\n",kor[0],eng[0],math[0]);
//		System.out.printf("%d\t%d\t%d\n",kor[1],eng[1],math[1]);
//		System.out.printf("%d\t%d\t%d\n",kor[2],eng[2],math[2]);
	}

}
