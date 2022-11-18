package 변수;

import java.util.Scanner;

public class ex01변수기초 {

	public static void main(String[] args) {
		// main 생성방법 : main 작성 후 ctrl space
		
		// 정수형 숫자 4를 담을수 있는 number 변수 선언
		// 자료형 변수명 = 값;
		int number = 4;
		// 변수를 사용하는 이유는?
		// ---> 재사용하기 위해서!
		System.out.println(number);
		
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("숫자를 입력하세요 >> ");
		// 2. 정수형 숫자 입력 받기
		int input = sc.nextInt();
		
		// 3. 입력받은 숫자 출력하기
		System.out.println(input);
		
		// 상수 선언하는 법
		final int number2 = 7;
		
		// 변수에 들어있는 값 변경
		number = 10;
		// number2 = 14; --> 상수는 값 변경 불가능하다!
		
		// int input = 5; --> 변수명 중복선언은 불가능하다!
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
