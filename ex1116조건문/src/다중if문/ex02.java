package 다중if문;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 점수입력
		System.out.print("점수 입력 :");
		int totalScore = sc.nextInt();
		char grade = 'a';
		if (totalScore >= 90) {
			// 2. 90 이상은 A학점
			grade = 'A';
		} else if (totalScore >= 80) {
			// 3. 80점 이상 90점 미만 B학점
			grade = 'B';
		} else if (totalScore >= 70) {
			// 4. 70점 이상 80점 미만 C학점
			grade = 'C';

		} else {
			// 5. 70점 미만일 경우 D학점 출력!
			grade = 'D';
		}
		System.out.println(grade + "학점입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
