package p1014;

import java.util.Scanner;

public class J1014_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//      배열 100개를 만들어서 1-100까지 만드세요 (정답)
		
//		int [] num = new int [100];
//		for (int i = 0; i < 100; i++) {
//			num[i] = i + 1 ;
//		}
		
		
		// 배열 100개를 만들어서 1,3,5,7 (정답)
//		for(int i = 0; i < 100; i++) { 
//			num[i] = 2*i+1;		  // 1,3,5,7,9............................
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int [] num = new int [100];
		
		for(int i = 0; i < 100; i++) {
			num[i] = 2*i+1;
			
		}
		
		
		for(int i = 0; i < 100; i++) {
			System.out.println(num[i]);
		}

		
	}

}
