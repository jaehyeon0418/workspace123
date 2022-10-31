package p1013;

import java.util.Scanner;

public class J1013_04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int [] num = new int[10];
		
		for (int i = 0 ; i < 10 ; i++) {
			num[i] = scan.nextInt();			
		}
		
		int big = 0 ;
		String bigStr = "";
		String smallStr = "";
		
		System.out.print("입력한 숫자 :");
		for (int i = 0; i < num.length; i++){
			if(num[i] >=50 ) {
				big++ ;
				bigStr += String.format("%d" , num[i]);
				continue;
			}
			smallStr = String.format("%d", num[i]);
	
//			System.out.print(String.format(("%d "), num[i]);
		}
		
		System.out.println(String.format("큰 수 : %d %s", big, bigStr));
//		System.out.println(String.format("작은 수 : %d %s", ());
		
		
		
	}

}
