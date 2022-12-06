package 추상클래스;

public class PartTimeEmployee extends Employee {

	// 1.필드

	// 일한일자
	private int workDay;

	// 2.메소드
	// 생성자
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}

	// 월급여 계산 pay*workDay 하는 메소드
	public int getMoneyPay() {
		return (pay * workDay);
	}

}
