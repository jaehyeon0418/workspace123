package p1024;

import java.util.Scanner;

public class J1024_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		1,2,3,4,5,6 만들기
		
		Scanner scan = new Scanner(System.in);	
		int num = 5 ;
		int []	arr = null;
		arr = new int[num];

		System.out.println("배열의 크기를 입력하세요 : ");

		num = scan.nextInt();
		arr = new int [num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + i;
		}
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
					

			
	
	}

}
