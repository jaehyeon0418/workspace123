package p1017;

public class J1017_05 {

	public static void main(String[] args) {
		int input = 0 ;
		String choice = "";
			
		input = (int)(Math.random()*10); // 0~9까지
		//숫자를 문아열로 변환
		//01,02,03,04,05,06,07............09,10
		choice = String.format("%02d", input);// 빈 공백ㅂ은 0으로 채워서 출력
		choice = input+"";
		
		char ch=' ' , ch1=' ';
		int num = 0, num1 = 0;
		
		ch= choice.charAt(0);
		ch1= choice.charAt(1);
		
		
		System.out.println(ch);
		System.out.println(ch1);
		
		
		System.out.println(num);
//		num = (int)(Math.random()*100); // 0~99까지
		
		// 숫자 2개를 입력받아 두 수를 더해서 출력하세요
	}

}
