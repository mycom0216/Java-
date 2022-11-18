package dowhile문;

import java.util.Scanner;

public class ex03로그인프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 정답 아이디, 비밀번호
		String answerId = "test";
		String answerPw = "test1234";
		int cnt = 0;

		do {
			// 1. 아이디 입력
			System.out.print("아이디를 입력하세요 >> ");
			String inputId = sc.next();

			// 2. 비밀번호 입력
			System.out.print("비밀번호를 입력하세요 >> ");
			String inputPw = sc.next();

			// 3. 아이디와 비밀번호가 전부 일치하는 지 여부 비교
			if (inputId.equals(answerId) && inputPw.equals(inputPw)) {
				System.out.println("로그인 성공!");
				break;
			} else {
				System.out.println("로그인 실패!");
				cnt++;
			}
		} while (cnt < 3);
		
		System.out.println("아이디와 비밀번호가 3회 틀렸습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
