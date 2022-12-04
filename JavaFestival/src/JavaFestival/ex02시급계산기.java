package JavaFestival;

import java.util.Scanner;

public class ex02시급계산기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("일한시간을 입력하세요 : ");
		int hour = sc.nextInt();

		if (hour > 8) {
			System.out.println("총 임금은" + (8 * 5000 + (hour - 8) * 7500) + "원입니다.");
		} else {
			System.out.println("총 임금은" + 5000 * hour + "입니다.");
		}

	}

}
