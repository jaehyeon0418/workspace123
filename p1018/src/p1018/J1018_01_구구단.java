package p1018;

import java.util.Scanner;

public class J1018_01_구구단 {

	public static void main(String[] args) {
		// 구구단 2~9단 2,5단 빼고 출력하시오. continue

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 2 || i == 5)
					continue;
				System.out.printf("[ %d단 출력 ]\n",i);
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();

		}

	}

}
