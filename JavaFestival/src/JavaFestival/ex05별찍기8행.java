package JavaFestival;

import java.util.Scanner;

public class ex05별찍기8행 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		System.out.println("행 개수 : ");
		int row = sc.nextInt();

		for (int i = 1; i < row + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
