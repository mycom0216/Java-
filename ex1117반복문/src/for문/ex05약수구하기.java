package for문;

import java.util.Scanner;

public class ex05약수구하기 {

	public static void main(String[] args) {

		// 1. 입력받을 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 사용자에게 정수 입력 받기
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// 3. 입력받은 숫자를 임의의 숫자로 나누어서
		// 나머지가 0이라면 ---> 약수!
		
		 for(int i = 1; i <= num; i++) {
			 if (num % 1 == 0) {
				 System.out.print(i+" ");
				 
			 }
			 
		 }
			 
	}

}
