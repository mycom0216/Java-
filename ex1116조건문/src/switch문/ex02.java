package switch문;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 성적 입력
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		
		switch(totalScore/10) {
		// 2. 90 이상 A
		case 10:
		case 9:
			System.out.println("A학점입니다.");
			break;
		// 3. 80 이상 B
		case 8:
			System.out.println("B학점입니다.");
			break;
		// 4. 70 이상 C
		case 7:
			System.out.println("C학점입니다.");
			break;
		// 5. 70 미만 D
		default:
			System.out.println("D학점입니다.");
			break;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
