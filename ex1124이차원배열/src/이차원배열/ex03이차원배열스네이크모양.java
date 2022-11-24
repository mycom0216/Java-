package 이차원배열;

public class ex03이차원배열스네이크모양 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		// 0,2,4 ------> : 행의 인덱스가 짝수일때
		// 1,3 <------ : 행의 인덱스가 홀수일때
		int num = 21;

		for (int j = 0; j < 5; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < 5; i++) {
					arr[j][i] = num++;
				}
			} else {
				for (int i = 4; i >= 0; i--) {
					arr[j][i] = num++;
				}
			}

		}

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[j].length; i++) {
				// 한 행이 출력되는 반복문
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
