package 배열;

import java.util.Random;

public class ex02배열 {

	public static void main(String[] args) {

		Random ran = new Random();

		// 1. 정수형 데이터를 5개 보관할수 있는 arr 배열 생성
		int[] arr = new int[5];

		// 2. 배열안에 모든 데이터를 임의의 값으로 초기화(1~100까지의 수)
		// 배열의 크기를 가져오는 방법 ---> 배열의 이름.length
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}

		// 3. 배열 안에 있는 모든 값을 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
			
	}

}
