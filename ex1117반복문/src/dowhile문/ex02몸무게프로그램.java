package dowhile문;

import java.util.Scanner;

public class ex02몸무게프로그램 {

	public static void main(String[] args) {

		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);

		// 2. 현재몸무게 : 출력하기
		System.out.print("현재몸무게 : ");
		// 3. 현재몸무게 입력받기
		int now = sc.nextInt();
		// 4. 목표몸무게 : 출력하기
		System.out.print("목표몸무게 : ");
		// 5. 목표몸무게 입력받기
		int wg = sc.nextInt();
		int week = 1;
		do {
			// 6. 주차별 감량 몸무게 : 출력하기
			System.out.print(week+"주차별 감량 몸무게 : ");
			week++;
			// 7. 감량 몸무게 입력받기
			int minus = sc.nextInt();
			// 8. 현재 몸무게에서 감량 몸무게를 빼주기!!!
			// 그리고 해당하는 값이 다시 현재몸무게가 되게 만들어주기
			now -= minus; // now = now - minus
			
			
		} while (now > wg);
		// 언제 반복할 건지를 정의해주는 조건식!!!
		
		System.out.println(now+"kg 달성!!!");

		// 9. 6~8까지 반복!!! 만약 현재 몸무게가 목표 몸무게에 도달했다면

		// 10. 현재 몸무게를 출력하고 프로그램 종료!

	}

}
