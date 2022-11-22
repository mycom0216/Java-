package 배열;

public class ex01배열생성 {

	public static void main(String[] args) {
		
		
		// 배열의 특징
		// 1. 같은 자료형만 하나로 묶을 수 있다.
		// 2. 인덱스 번호를 가지고 있다.
		// 인덱스는 0부터 차례로 1씩 증가한다.
		// 3. 크기가 고정적이다.
		
		// 정수형 데이터 5개를 보관할 수 있는 arr 배열 생성
		int[] arr = new int[5];
		// arr ---> 5칸짜리 배열이 어디있는지 주소값을 참조하는 레퍼런스 변수
		
		System.out.println("주소값 : "+arr);
		System.out.println(arr[0]); 
		arr[0] = 7;
		System.out.println(arr[0]); 
		
		// 배열을 생성함과 동시에 데이터를 집어넣는 방법
		String[] names = {"김운비","임경남","김미희"};
		System.out.println(names[1]);
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
