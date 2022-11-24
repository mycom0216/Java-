package 배열;

import java.util.Arrays;
import java.util.Random;

public class ex04배열 {

	public static void main(String[] args) {

		Random ran = new Random();
		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array 생성
		int[] array = new int[5];
		// 2. 1~10까지의 랜덤한 숫자로 초기화
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
		}
		// 3. 가장 큰 값 찾기
		int max = array[0];
		// max가 가장 큰 값이니?
		// max와 arr의 데이터를 비교해서

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		// 4. 출력
		System.out.println(Arrays.toString(array));
		System.out.println("최대값 : " + max);

	}

}
