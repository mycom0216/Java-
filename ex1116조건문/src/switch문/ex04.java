package switch문;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		// 사용자에게 입력을 받기 위한 Scanner 도구
		Scanner sc = new Scanner(System.in);
		// 1. 금액을 입력받기
		System.out.println("금액 입력");
		int money = sc.nextInt();
		// 2. 메뉴를 출력
		System.out.println("메뉴를 고르세요.");
		System.out.println("1. 아우터(700원) 2. 이구동성(1000원) 3. 에그몽(500원)");
		// 3. 메뉴를 입력받기
		int menu = sc.nextInt();
		// 4. 메뉴에 따라서 잔돈을 계산하기
		int change = 0; 
		if(menu == 1) {
			change = money - 700;
		}else if(menu == 2) {
			change = money - 1000;
		}else if(menu == 3) {
			change = money - 500;
		}else {
			System.out.println("잘못된 메뉴를 입력하셨습니다.");
			change = money;
		}
		// 5. 잔돈 출력
		
		System.out.println("잔돈 : "+change);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
