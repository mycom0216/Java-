package ex1128메소드;

public class ex02메소드오버로딩 {

	public static void main(String[] args) {

		// 메소드 오버로딩(=중복정의)
		// : 매개변수의 갯수를 다르게 하고, 메소드의 이름을 똑같ㅊ이 부여하여
		// 여러개의 메소드를 사용할 수 있도록 하는것!

		System.out.println(add(1, 2));
		System.out.println(add(2, 4, 1));

		// 오버로딩 성립 조건
		// 1. 메소드의 이름이 같아야 한다
		// 2. 매개변수의 갯수, 타입은 달라야 한다

	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

}
