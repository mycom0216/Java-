package 산술연산자;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		// 입력 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 1. 정수형 num을 선언하고 
		// 사용자한테 값을 입력받기
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		
		// 2. num 의 백의 자리 이하는 버릴수 있는 산술 연산 작성
		// ex) 456 ---> 400
		// 정수형 result 
		int result = num - num%100;
		int result2 = num/100*100;
		
		// 3. 결과 확인 : 결과값 출력하기
		System.out.println("결과 확인 : "+ result);
		System.out.println("결과 확인 : "+ result2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
