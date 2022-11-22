package 배열;

import java.util.Arrays;
import java.util.Random;

public class ex03배열 {

	public static void main(String[] args) {

		Random ran = new Random();

		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array 생성
		int[] array = new int[5];
		System.out.print("array에 들어있는 홀수는 ");
		int cnt = 0; 
		// 2. 배열 안의 모든 데이터를 임의의 값으로 초기화(1~100까지의 수)
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100)+1;
			// 3. 배열 안의 데이터 중 홀수의 값만 출력하고
			if (array[i] % 2 == 1) {
				System.out.print(array[i]+" ");
				cnt = cnt+1;
			}
		}

		// 4. 홀수가 총 몇개인지 출력

		System.out.println("이며, ");
		System.out.println("총 "+cnt+"개 입니다.");
		
		
		
		
		// 배열 안에 있는 값을 한번에 출력하는 방법
		System.out.println(Arrays.toString(array));
		
		
		
	}

}
