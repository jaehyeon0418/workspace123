package p1021;

public class J1021_01 {

	public static void main(String[] args) {
		// 1~25 의 배열 숫자넣기
		// 랜덤하게 섞어서 2차원 배열 출력
		// 숫자대신 문자로 출력
		// a~y 25개 넣은 1차원 배열 생성
		// 랜덤하게 섞기
		// 5 by 5 만들기

		char ch = 'a';
		int[] num = new int[25];
		char[] num2 = new char[25];
		char[][] num3 = new char[5][5];
		int temp = 0;
		int random = 0;

		// 1~25 의 배열 숫자넣기
		for (int i = 0; i < 25; i++) {
			num[i] = i + 1;
//			num[i] = (char)(ch + 1);
		}
		System.out.println(num[0]);

		for (int i = 0; i < 25; i++) {
			num2[i] = (char) (ch + i);
		}
		System.out.println(num2[0]);

		// 랜덤하게 섞기

		for (int i = 0; i < 500; i++) {
			random = (int) (Math.random() * 25);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}

		// 2차원 배열에 값 넚기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num3[i][j] = num2[5 * i + j];
//				System.out.println(num3[i][j]);
			} // for
		} // for

		// 2차원 5 by 5 출력
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%s\t", num3[i][j]);
			} //for
			System.out.println();
		} //for

//		for (int i = 0; i);

	}

}
