package OOP기초;

public class MemberMain {
	// 실행하는 공간, 객체를 생성할 수 있는 공간
	public static void main(String[] args) {

		// 1. 클래스를 기반으로 객체 생성
		// 레퍼런스 변수 --> 주소값을 참조하고 있는 변수
		// : java는 저장 공간 영역이 여러개이다.
		// 크고 복잡한 데이터 저장 -> heap(GC기능 있음)
		// 비교적 단순한 데이터 저장 -> stack
		Member m1 = new Member();
		System.out.println(m1);
		System.out.println(m1.name);
		m1.name = "정은정";
		// 나이, 생년월일, 성별, 번호
		m1.age = 29;
		m1.birth = 19940226;
		m1.gender = '여';
		m1.phone = "010-1234-5678";

		// 이름 출력
		System.out.println(m1.name);

		m1.login();

		m1.join("정은정", 29);

		// m2 라는 이름을 가진 새로운 객체 생성
		Member m2 = new Member();

		// 이름 : 반재영
		m2.name = "반재영";
		System.out.println(m2.name);
		// 나이 : 28
		// 생년월일 : 19950216
		// 성별 : 남
		// 번호 : 010-1234-5678

	}

}
