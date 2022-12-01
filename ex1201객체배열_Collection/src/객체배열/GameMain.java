package 객체배열;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 게임 실행공간
		// 1) 포켓몬 2마리 생성
		Pokemon jiriri = new Pokemon("찌리리공", "전기", 1000, 120, "자폭");
		Pokemon kkobuk = new Pokemon("꼬부기", "물", 1000, 150, "물대포");

		while (true) {
			// 2) 사용자에게 메뉴 보여주기
			System.out.println("===포켓몬 선택하기===");
			System.out.print("[1]찌리리공 [2]꼬부기 >> ");
			int input = sc.nextInt();
			// 3) 사용자가 입력한 값 구분하기
			if (input == 1) {
				// 사용자가 찌리리공 선택!!!!
				System.out.println("===공격 패턴 선택===");
				System.out.print("[1]일반공격 [2]스킬공격 >> ");
				int input2 = sc.nextInt();
				if (input2 == 1) {
					// 찌리리공이 꼬부기를 일반 공격
					// 꼬부기의 hp = 꼬부기의 hp - 찌리리공 atk
					kkobuk.setHp(kkobuk.getHp() - jiriri.getAtk());
					System.out.println("찌리리공 공격~");

				} else {
					// 꼬부기의 hp - 찌리리공 atk 1.5배 만큼
					System.out.println("찌리리공 스킬 사용");
					System.out.println(jiriri.getSkill());

					kkobuk.setHp((int) (kkobuk.getHp() - jiriri.getAtk() * 1.5));

				}

			} else if (input == 2) {
				// 사용자가 꼬부기 선택!!!!!
				System.out.println("===공격 패턴 선택===");
				System.out.print("[1]일반공격 [2]스킬공격 >> ");
				int input2 = sc.nextInt();
				if (input2 == 1) {
					// 꼬부기가 찌리리공을 일반 공격
					// 찌리리공의 hp - 꼬부기 atk
					jiriri.setHp(jiriri.getHp() - kkobuk.getAtk());
					System.out.println("꼬부기 공격");

				} else {
					// 찌리리공의 hp - 꼬부기 atk 1.5배 만큼
					System.out.println("꼬부기 스킬 사용");
					System.out.println(kkobuk.getSkill());
					jiriri.setHp((int) (jiriri.getHp() - kkobuk.getAtk() * 1.5));

				}

			} else {
				System.out.println("캐릭터를 다시 선택하세요~");
			}

			System.out.println("꼬부기 체력 : " + kkobuk.getHp());
			System.out.println("찌리리공 체력 : " + jiriri.getHp());

			// 종료 조건
			// 두 마리중 한마리라도 체력이 0보다 작거나 같은 경우 프로그램 종료
			if (kkobuk.getHp() <= 0 || jiriri.getHp() <= 0) {
				System.out.println("게임을 종료합니다.");
				break;
			}

		}

	}

}