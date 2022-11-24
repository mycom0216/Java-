package 배열;

import java.util.Arrays;
import java.util.Random;

public class ex06로또번호추첨 {

	public static void main(String[] args) {

		Random ran = new Random();

		int[] lotto = new int[5];
		// 0번방
		lotto[0] = ran.nextInt(10) + 1;

		// 1번방
		for (int j = 1; j < 5; j++) {
			lotto[j] = ran.nextInt(10) + 1;
			for (int i = 0; i < j; i++) {
				if (lotto[j] == lotto[i]) {
					j--; // 중복된 숫자가 발생했다면 다시 인덱스 번호를 앞으로 보낼수 있는 코드
					break; // 만약 중복된 숫자가 하나라도 발견됐다면 안에있는 for문 멈추고 인덱스 up
				}
			}
		}

		System.out.println(Arrays.toString(lotto));
	}
}