package while문;

import java.util.Scanner;

public class ex04홀짝개수구하기 {

	public static void main(String[] args) {
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		int even = 0; // 짝수
		int odd = 0; // 홀수
		while(true){
		// 2. 정수 입력 출력하기 (줄바꿈 없이)
		System.out.print("정수 입력 : ");
		// 3. 정수 입력받기
		int input = sc.nextInt();	
		
		
		// 4. 입력받은 정수가 짝수라면 짝수의 개수를 +1
		// ---> 짝수의 개수와 홀수의 개수를 구할 변수가 하나씩 필요!!!
		if(input % 2 == 0) {
			even++;
		}else if(input % 2 == 1) {
			// 5. 입력받은 정수가 홀수라면 홀수의 개수를 +1
			odd++;
		} else if(input == -1) {
			System.out.println("종료!!");
			break;
		}
		// 6. 짝수개수, 홀수개수 출력하기
		System.out.println("짝수 개수 : "+ even);
		System.out.println("홀수 개수 : "+ odd);
		
		//7. 2~6까지 반복!!! -1을 입력하면 프로그램 종료~
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
