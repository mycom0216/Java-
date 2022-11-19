package while문;

public class ex01while문기초 {

	public static void main(String[] args) {
		
		// while문 구조
		// Hello World! 5번 출력하는 코드를 작성해보자!
		
		// 반복횟수를 정해주는 정수형 num 생성하기
		int num = 0;
		
		
		while(num < 5){
			System.out.println("Hello World!");
			num++;
		}
		
		// 무한반복문
		while(true) {
			System.out.println("두번째 방법");
			num++;
			if(num > 10) {
				break;  // 반복문을 멈추는 키워드
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
