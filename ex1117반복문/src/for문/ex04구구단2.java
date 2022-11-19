package for문;

import java.util.Scanner;

public class ex04구구단2 {

	public static void main(String[] args) {
		// 몇단을 출력할건지 사용자한테 입력받아서
		// 구구단 출력하기!
		Scanner sc = new Scanner(System.in);
		// 1. 몇단을 출력할지 입력받기
		System.out.print("단 입력 : ");
		int num = sc.nextInt();
		// 2. 입력받은 정수에 대한 구구단을 반복문을 사용해서 출력
		
		for(int i = 1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
