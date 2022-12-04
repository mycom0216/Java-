package JavaFestival;

import java.util.Scanner;

public class ex01몸무게프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int cur = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int tar = sc.nextInt();

		int cnt = 1;
		while (true) {
			System.out.print(cnt + "주차 감량 몸무게 : ");
			int j = sc.nextInt();
			cur -= j;
			if (cur <= tar) {
				break;
			}

		}
		System.out.print(cur + "kg 달성!! 축하합니다!");
	}

}
