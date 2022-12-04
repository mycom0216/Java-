package JavaFestival;

import java.util.Scanner;

public class ex02가운데글자구하기 {

	public static void main(String[] args) {

		// getMiddle 메소드는 하나의 단어를 입력받음
		// 단어를 입력받아서 가운데 글자를 반환하도록 getMiddle 메소드를 만들기
		// 단어의 길이가 짝수일 경우 가운데 두 글자를 반환하기
		// 입력받은 단어가 power라면 w를 반환,
		// 입력받은 단어가 test라면 es를 반환
		Scanner sc = new Scanner(System.in);
//				System.out.print("단어를 입력하세요 >> ");
//				String word = sc.next();
		System.out.println(getMiddle("test"));
	}

	public static String getMiddle(String word) {
		String answer = "";
		// substring(int index) ; 명시된 index부분을 포함한 뒤의 모든 문자열 리턴
		// substring(int beginIndex, int endIndex)
		// ; biginIndex부터 endIndex-1번째 인덱스까지 문자열 리턴
		answer = word.substring((word.length() - 1) / 2, word.length() / 2 + 1);

		return answer;

	}

}
