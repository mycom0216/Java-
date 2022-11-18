package while문;

import java.util.Scanner;

public class ex03while문예제 {

	public static void main(String[] args) {
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true){
			
			// 2. 정수 입력 출력하기 (줄바꿈 없이)
		System.out.print("정수 입력 : ");
		// 3. 정수 입력받기
		int input = sc.nextInt();
		// 4. 입력받은 정수를 누적하기
		// ----> 누적할 변수가 하나 필요하겠죠?
		
		sum += input;
				
		System.out.println("누적결과 : "+ sum);		
		// 5. 2~4까지 반복!!! -1을 입력하면 종료되었습니다 출력 후 프로그램 끝
		
		if(input == -1) {
			System.out.println("종료!!!!");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
