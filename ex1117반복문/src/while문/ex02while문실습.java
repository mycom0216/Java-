package while문;

import java.util.Scanner;

public class ex02while문실습 {

	public static void main(String[] args) {
		// ctrl shift f : 정렬 단축키
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 2. 정수 입력 출력하기
			System.out.print("정수 입력 : ");

			// 3. 정수를 입력받기
			int input = sc.nextInt();

			// 4. 2~3구간이 반복! 10보다 큰 수를 입력받으면 종료!
			
			if(input > 10) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			
			
			
			
			
			
			
		}

	}

}
