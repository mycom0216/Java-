package 메소드;

import java.util.Scanner;

public class ex02계산기 {

	public static void main(String[] args) {

		// 1. 정수형 num1과 num2를 입력 받고, 문자형 op를 생성해 원하는 연산자넣기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		// 2. num1과 num2를 op에 맞게 연산하여 최종 값을 반환해주는 cal메소드 생성
		char op = '-';
		// 단, 빼기를 수행할 때는 더 큰 수에서 작은 수 빼기
		System.out.println(cal(num1, num2, op));

	}

	// private : 다른 클래스에서 사용할 수 없게 막는 접근제한자
	private static int cal(int num1, int num2, char op) {
		int result = 0;
		// op ---> +, -, *, /
		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = num1 > num2 ? num1 - num2 : num2 - num1;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		}

		return result;
	}

}
