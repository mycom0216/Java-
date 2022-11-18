package 삼항연산자;

import java.util.Scanner;

public class ex04삼항연산자 {

	public static void main(String[] args) {
		
	// 1. 농구공의 개수를 입력하세요를 출력
	System.out.print("농구공의 개수를 입력하세요 >> ");	
	// 2. 정수형 숫자를 입력
	// 2-1) 입력받는 도구 꺼내오기
	Scanner sc = new Scanner(System.in);
	// 2-2) 입력받기
	int ball = sc.nextInt();
	
	// 3. 필요한 상자의 수를 구하는 로직
	// 조건식 ? 참이었을 때 실행하는 구문 : 거짓이었을 때 실행하는 구문
	int result = ball % 5 == 0 ? ball/5 : ball /5+1;
			
	
	// 4. 결과값을 출력	
	System.out.println("필요한 상자의 개수 : "+ result);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
