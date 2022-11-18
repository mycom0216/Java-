package 다중if문;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수를 입력받아서 0인지, 홀수인지, 짝수인지 판별하는 프로그램
		// 1. 정수 입력받기
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 2. 조건 판단
		if(num  == 0) {
			System.out.println("0");
		}else if(num % 2 == 1) {
			System.out.println("홀수");
		}else if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			
			
		}
		
	}

 }
