package OOP기초;

public class BankBook {

	// 클래스, 설계도면

	// 1.필드(DATA)
	// 정수형 money 저장할 수 있는 필드
	private int money; // --> 정보은닉(캡슐화)
	// 문자열형 name 저장할 수 있는 필드
	String name;

	// 2.메소드
	// 2-1) deposit -> 리턴타입x, 매개변수로 정수 1개
	public void deposit(int inputMoney) {

		money += inputMoney;
	}

	// 2-2) withdraw -> 리턴타입x, 매개변수 정수 1개
	public void withdraw(int outMoney) {

		money -= outMoney;
	}

	// 2-3) showMoney -> 리턴타입x
	public void showMoney() {

		System.out.println(name + "님의 잔액은" + money + "원 입니다.");

	}

}
