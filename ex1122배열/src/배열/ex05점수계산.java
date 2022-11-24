package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class ex05점수계산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 1. 성적 데이터를 저장할 수 있는 배열 생성
		int[] scores = new int[5];
		// 2. 성적 입력(5개)
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "번째 입력 >>");
			scores[i] = sc.nextInt();
		}
		// 3. 입력 받은 데이터 전부 출력
		System.out.println("입력된 점수 : " + Arrays.toString(scores));

		int max = 0;
		int min = scores[0];
		int sum = 0;

		for (int i = 0; i < scores.length; i++) {
			// 4. 최고 점수 구하기
			if (max < scores[i]) {
				max = scores[i];
			}
			// 5. 최저 점수 구하기
			if (min > scores[i]) {
				min = scores[i];
			}

			// 6. 합계 구하기
			sum += scores[i];

		}

		// 7. 평균 구하기
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ((double) sum / scores.length));


	}
}
