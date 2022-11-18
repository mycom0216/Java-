package 조건문기초;

import java.util.Scanner;

public class ex03단순if문예제2 {

	public static void main(String[] args) {
		
		// 1. 출력
		System.out.print("정수를 입력하세요 >> ");
		// 2. 숫자를 입력
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 3. 3과 5의 배수인지 조건 판단
		if(num % 3 == 0 && num % 5 == 0) {
			// 4. 만약에 조건이 참이라면, 3과 5의배수입니다를 출력
			System.out.println("3과 5의 배수");
			
			
		}
		
		if(num%3==0) {
			if(num%5==0) {
				System.out.println("3과 5의 배수");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
