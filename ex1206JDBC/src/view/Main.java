package view;

import java.util.Scanner;

import model.StudentDAO;
import model.StudentDTO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("======SMHRD 회원관리 프로그램======");
		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]전체회원목록 [4]회원정보수정 [5]회원탈퇴 [6]종료 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("=====회원가입=====");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();

				StudentDTO s = new StudentDTO(id, pw, name, age);

				// insert 메소드 사용
				StudentDAO dao = new StudentDAO();
				int row = dao.insert(s);
				// 결과를 이용한 작업
				// ---> 사용자한테 어떤 내용을 보여줄지
				if (row > 0) {
					System.out.println("회원가입 성공~~!");
				} else {
					System.out.println("회원가입 실패...");
				}

			} else if (choice == 2) {
				System.out.println("2번");
			} else if (choice == 3) {
				System.out.println("3번");
			} else if (choice == 4) {
				System.out.println("4번");
			} else if (choice == 5) {
				System.out.println("5번");
			} else if (choice == 6) {
				System.out.println("프로그램 종료!!");
				break;
			}

		}
	}

	private static StudentDTO StudentDTO(String id, String pw, String name, int age) {
		return null;
	}

}
