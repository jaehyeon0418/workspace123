package p1021;

public class J1021_03 {

	public static void main(String[] args) {
		// 
		
		
		
		int [] num = new int [25];
		int [][] num2 = new int [5][5];
		
		
		
		for (int i = 0; i < 25; i++) {
			num[i] = i +1;
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num2[i][j] = num[5*i+j];
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d\t",num2[i][j]);
			}
		System.out.println();
		}
		
		
		
	}

}
