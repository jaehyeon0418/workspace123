package p1014;

import java.util.Scanner;

public class J1014_04 {

	public static void main(String[] args) {
		// 구구단을 출력하세요

		

		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				if (5<=i && i <=8) {     
				continue;
				} 
				System.out.printf("%d * %d = %d \n ", i, j, i * j);
			}
		}

	}

}
