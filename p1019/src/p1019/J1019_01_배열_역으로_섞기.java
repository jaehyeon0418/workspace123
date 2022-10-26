package p1019;

public class J1019_01_배열_역으로_섞기 {

	public static void main(String[] args) {
		// 1-100 까지 배열 생성하여 넣기

		int[] num = new int[100]; // 1-100
		int[] num2 = new int[100];// num배열의 숫자를 가지고 num2 100~1번까지 들어가도록 해보세요.

		for (int i = 0; i < 100; i++) {
			num[i] = i + 1;
		}

		// num배열의 숫자를 가지고 num2 100~1번까지 들어가도록 해보세요.
		// num2[0] = 100 num2[1]=99 num2[2] = 98
		// num2[0] = num [99] -> ,num2[1] = num[98] , num2[2] = num[97]
		// ........................
		// 1. 외우면 좋음
		for (int i = 100; i < 0; i--) {

			num2[100 - i] = i;
		}

		// 2. 외우면 좋음.
		for (int i = 0; i < 100; i++) {
			num2[i] = num[99-i] ;
		}
		
		for (int i = 99; i > 0; i--) {
			num2[99-i] = num[i] ;
		}
		//////////////////////////////////
		
		//// 1 과 2는 같다.
		
		
	}// main

} // class
