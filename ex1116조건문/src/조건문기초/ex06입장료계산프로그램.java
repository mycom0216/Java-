package 조건문기초;

import java.util.Scanner;

public class ex06입장료계산프로그램 {

	public static void main(String[] args) {
		// 0. 입력도구 꺼내오기(한번만 꺼내오면 계속 사용 가능!)
		Scanner sc = new Scanner(System.in);
		
		// 1. 출력
		System.out.println("====에버랜드====");
		
		// 2. 나이 입력
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		// 원하는 코드 복사 단축키 : ctrl alt 화살표 위 or 아래
		// 3. 인원수 입력
		System.out.print("인원수 입력 >> ");
		int people = sc.nextInt();
		
		int result = 0;
		// 4. 나이가 20살 미만이라면 50% 할인
		if(age < 20) {
			result = (int) (5000 * 0.5 * people);
			// result : 지역변수(local variable)
			// >> {} (지역, 영역) 을 표시한다!
			// {} 안쪽에서 처음으로 만들어지는 변수는 {} 바깥쪽을 벗어날 수 없다.
		}else {
			// 5. 그렇지 않은경우에는 기본료 5000원 전부 받기
			result = 5000 * people;
			
		}
		
		
		// 6. 총 금액을 출력하기
		System.out.println("총"+result+"원입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
