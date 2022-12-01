package ArrayList;

import java.util.ArrayList;

public class ArrayMain {

	public static void main(String[] args) {

		// Collection
		// : 객체 형식의 데이터를 하나로 저장하는 클래스
		// : 가변적(추가, 삭제 가능)

		// ArrayList
		// : 배열과 유사한 형태를 가지고 있는 클래스
		// 1) ArrayList 생성하기
		// 클래스이름 변수명 = new 클래스이름();
		// 제네릭 기법(Generic)
		// <E> : 클래스 내부에서 사용한 자료형을 외부에서 지정하는 기법
		ArrayList<String> list = new ArrayList<String>();

		// ArrayList 사용법
		// 1) 데이터 추가하기
		list.add("해바라기도시락");
		list.add("차돌쌀국수");
		list.add("마라탕");

		// 2) 데이터를 원하는 위치에 추가하기
		list.add(0, "연어회");

		// 3) 데이터 가져오기
		// 해바라기 도시락 출력해주세요
		System.out.println(list.get(1));

		// 4) 데이터 삭제하기
		list.remove(2);

		// 5) 저장되어 있는 전체 데이터 개수를 가져오기
		System.out.println(list.size());

		// 6) 전체 삭제하기
		list.clear();

		System.out.println(list.size());

	}

}
