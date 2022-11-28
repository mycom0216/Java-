package 메소드;

import java.util.Scanner;

public class ex03가까운수찾기 {

	public static void main(String[] args) {

		// 1. 정수형 num1과 num2 를 입력받으세요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);
	}

	private static int close10(int num1, int num2) {
		int result = 0;
		// 11, 15
		// 11 - 10 < 15 - 10
		// num1 - 10 < num2 - 10
		// 1. 자바에서 제곱 만드는 방법
		// if((num1 - 10)*(num1-10) < (num2 - 10)*(num2-10)) {
		// 2. 절대값 씌우는 방법
		if (Math.abs(num1 - 10) < Math.abs(num2 - 10)) {
			result = num1;
		} else {
			result = num2;
		}

		return result;
	}

	// 단, 두 숫자 모두 10과의 차이가 같다면 0 반환
}
