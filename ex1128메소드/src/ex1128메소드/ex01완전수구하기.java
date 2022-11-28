package ex1128메소드;

import java.util.Scanner;

public class ex01완전수구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();

		// 두개의 정수가 입력되면 메소드로 연결하기! --> 메소드 호출!

		boolean divisor = isDivisor(num1, num2);

		// 메소드의 결과 값 출력하기
		System.out.println(divisor);

		System.out.println();

		System.out.println(getSum(44));

		System.out.println();

		System.out.println(isPerfect(6));

	}

	public static boolean isPerfect(int num) {

		int sum = 0;

		// 1. num에 대한 약수를 구하기 -> 1~num 중 num을 제외한 범위
		for (int i = 1; i < num; i++) {
			if (num % 1 == 0) {
				// 2. 약수에 대한 합계 구하기 -> 누적합계
				sum += i; // 1 + 2 + 3
			}
		}

		// 3.sum의 합이 완전수 인지 아닌지 판단!
		if (sum == num) {
			return true; // 완전수가 맞다!
		} else {
			return false;
		}

	}

	// 1. isDivisor를 생성할 수 있는 위치!

	// 메소드를 생성하기 위한 조건! -> 메소드의 구조!
	// - public 접근지정자(=접근제한자)
	// - static 키워드
	// - 리턴타입 (메소드의 결과값을 지정하는 기능)
	// - 메소드의 이름, 메소드의 매개변수(입력값, 재료값)
	// - return 키워드로 반환값 돌려주기!

	public static boolean isDivisor(int num1, int num2) {

		// num2이 num1의 약수인지 아닌지 판단!
		// -> 나머지를 구했을 때 0인지 아닌지 판단!
		// -> 결과 -> 0 -> 약수! -> true
		// -> 1 -> 약수 X -> false

		// boolean result = true;

		if (num1 % num2 == 0) {
			// 약수가 맞다!
			return true;
		} else {
			// 약수가 아니다!
			return false;
		}

		// return result;

	}

	// 2. 자신을 제외한 약수의 총합 구하는 메소드
	public static int getSum(int num) {

		int sum = 0; // 누적을 위한 변수

		// 1. num이라는 수를 입력 받는다 -> 매개변수 num 사용!

		// 2. 해당 숫자의 약수들을 구한다 -> 1~num 까지 중에서 num을 제외한 범위 사용!
		for (int i = 1; i < num; i++) {
			// ** 기존 로직
//			if(num % i == 0) {
//				// 약수이다!
//				// 3. 나 자신을 제외한 숫자들의 합을 구한다 -> 누적합계 -> 새로운 변수!
//				sum = sum + i; // sum += i;
//			}

			// ** 메소드를 호출한 로직
			// 메소드 구조 안에 메소드를 새롭게 구현할 수는 없으나
			// 메소드 자체를 호출하여 사용하는것은 가능하다!
			if (isDivisor(num, i) == true) {

				// 누적합계
				sum += i;

			}

		}

		return sum;
	}

}
