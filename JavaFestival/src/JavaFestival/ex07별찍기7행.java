package JavaFestival;

import java.util.Scanner;

public class ex07별찍기7행 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
