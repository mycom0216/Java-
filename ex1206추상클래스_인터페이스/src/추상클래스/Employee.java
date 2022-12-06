package 추상클래스;

public abstract class Employee {

	// 접근제한자
	// public >> protected >> default >> private

	// 사번
	protected String empno;
	// 이름
	protected String name;
	// 연봉
	protected int pay;

	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public abstract int getMoneyPay();

	// 사번:이름:연봉 리턴하는 메소드
	public String print() {
		return (empno + " / " + name + " / " + pay);
	}

}
