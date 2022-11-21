package 이중for문;

import java.util.Scanner;

public class ex05별찍기 {

	public static void main(String[] args) {
		
		
		// ->5행!
		// *
		// **
		// ***
		// ****
		// *****
		// 사용자에게 입력받은 행의 수만큼 별찍기
		Scanner sc = new Scanner(System.in);
		System.out.print("행 입력 >>");
		int num = sc.nextInt();
		
		
		for (int j = 1; j < num+1; j++) {
			
			for (int i = 0; i < j; i++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}