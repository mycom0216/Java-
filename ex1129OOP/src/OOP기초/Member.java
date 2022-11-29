package OOP기초;

public class Member {
	// 클래스, 설계도면(틀) --> 실행되는 공간이 아님

	// 1. 필드(Field / data / 속성)
	// 이름
	String name;
	// 연락처
	String phone;
	// 생년월일
	int birth;
	// 성별
	char gender;
	// 나이
	int age;

	// 2. 메소드(Method / logic / 행동)
	// 로그인한다
	public void login() {
		System.out.println(name + "이(가) 로그인한다.");
	}

	// 회원가입한다.
	public void join(String inputName, int inputAge) {
		name = inputName;
		age = inputAge;
		System.out.println("회원가입완료");
	}

}
