package OOP기초;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// BankBook 설계도면을 기반으로 bank1 객체 생성
		BankBook bank1 = new BankBook();
		bank1.name = "재영";

		System.out.print("입금 금액 입력 >> ");
		// bank1.money += sc.nextInt();
		// 메소드를 사용해서만 필드 값을 조정할 수 있다.
		bank1.deposit(sc.nextInt());
		bank1.showMoney();

		System.out.print("출금 금액 입력 >> ");
		bank1.withdraw(sc.nextInt());
		bank1.showMoney();

	}

}
