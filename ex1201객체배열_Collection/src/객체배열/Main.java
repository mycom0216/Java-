package 객체배열;

public class Main {

	public static void main(String[] args) {

		// 1. 객체 배열 생성
		// 자료형[] 배열이름 = new 자료형[개수];
		// 포켓몬 자료 3개를 저장할 수 있는 bag 배열 생성
		Pokemon[] bag = new Pokemon[3];

		// 객체배열의 0번 인덱스에 들어있는 데이터 출력
		System.out.println(bag[0]);

		// 객체배열의 0번 인덱스에 포켓몬을 넣어보자
		// 이름 : 피카츄 / 스킬 : 백만볼트 / hp : 1000
		// atk : 200 / 타입 : 전기
		bag[0] = new Pokemon("피카츄", "전기", 1000, 200, "백만볼트");
		System.out.println(bag[0].getName());

		// 1번 인덱스 >> 파이리 / 불 / 1000 / 200 / 불
		bag[1] = new Pokemon("파이리", "불", 1000, 200, "불");
		// 2번 인덱스 >> 꼬부기 / 물대포 / 2000 / 100 / 물
		bag[2] = new Pokemon("꼬부기", "물대포", 2000, 100, "물");

		// 배열안에 들어있는 포켓몬들의 이름, 타입, hp를 전부 출력해주세요
		// 형식
		// =====포켓몬 정보 출력=====
		// 1) 피카츄 전기 1000
		// 2) 파이리 불 1000
		// 3) 꼬부기 물 2000
		System.out.println("=====포켓몬 정보 출력=====");

		for (int i = 0; i < bag.length; i++) {
			System.out.println(i + 1 + ") " + bag[i].getName() + "\t" + bag[i].getType() + "\t" + bag[i].getHp());

		}

		// for-each문
		// 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용
		// 동작 원리
		// 배열안에 저장되어있는 데이터를 for문에서 순차적으로 꺼내서
		// :(콜론) 기준 좌측에 있는 변수에 담아주는 흐름을 가진다.
		for (Pokemon p : bag) {
			System.out.println(p.getName() + "\t" + p.getType() + "\t" + p.getHp());
		}

	}

}
