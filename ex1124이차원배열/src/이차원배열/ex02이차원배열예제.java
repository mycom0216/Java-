package 이차원배열;

public class ex02이차원배열예제 {

	public static void main(String[] args) {

		// 1. 정수형 데이터를 저장할 수 있는 5행 5열 크기의 array 생성

		int[][] arr = new int[5][5];

		// 2. 21~45까지의 숫자를 저장하고 출력

		int num = 21;

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				arr[i][j] = num++;
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
