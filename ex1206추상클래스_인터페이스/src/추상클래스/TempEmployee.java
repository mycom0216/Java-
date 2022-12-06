package 추상클래스;

public class TempEmployee extends Employee {

	// 1.필드

	// 2.메소드
	// 생성자
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);

	}

	// 월급여 계산(pay)/12 하는 메소드
	public int getMoneyPay() {
		return (pay) / 12;
	}

}
