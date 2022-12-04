package JavaFestival;

import java.util.Scanner;

public class ex04거스름돈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("현재 금액 : ");
		int price = sc.nextInt();

		int[] arr = { 10000, 5000, 1000, 500, 100 };
		for (int i = 0; i < arr.length; i++) {
			int money = price / arr[i];
			System.out.println(i + "원 : " + money + "개");
			price = price % arr[i];

		}

	}

}
