package 추상클래스;

public class RegularEmployee extends Employee {

	// 1.필드

	// 보너스
	private int bonus;

	// 2.생성자
	// 메소드
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay); // --> 부모클래스의 생성자 호출
		this.bonus = bonus;
	}

	// 월급여 계산(pay+bonus)/12 하는 메소드
	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

}
