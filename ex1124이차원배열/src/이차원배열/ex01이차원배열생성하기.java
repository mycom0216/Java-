package 이차원배열;

import java.util.Arrays;

public class ex01이차원배열생성하기 {

	public static void main(String[] args) {

		// 1. 이차원배열 생성하기(정수형 데이터 저장)
		int[][] arr = new int[5][5];

		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][0]);

		// 2. 이차원배열 값을 넣으면서 생성
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 3. 이차원배열 안에 값 넣기
		int num = 1;

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				arr[j][i] = num++;
			}
		}

		// 4. 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(Arrays.toString(arr[3]));
		System.out.println(Arrays.toString(arr[4]));

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				// 한 행이 출력되는 반복문
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();

		}

	}
}
