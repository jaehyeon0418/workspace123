package p1021;

public class J1021_02 {

	public static void main(String[] args) {
		// 주어진 배열의 전체 항목의 합과 평귡값 구하기
		// sum 881
		// avg 88.1
		
		int sum = 0;
		int count = 0;
		double avg = 0;
		int [][] arr = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
				count++;
			}
			
		}
		
		avg = sum / count;
		
		System.out.println(count);
		System.out.println(sum);
		System.out.println(avg);
		
		
		
		
//		int sum = 0;
//		double avg = 0;
//		
//		int [][] arr2 = {{1,2},{3,4}};
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				sum = sum + arr2[i][j];
//			}
//		}
//		
//		avg = sum / 4.0 ;
//		
//		
//		System.out.println("sum :"+sum);
//		System.out.println("avg :"+avg);
		
		
	}

}
