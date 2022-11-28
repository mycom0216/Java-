package 메소드;

public class ex01더하기 {

	public static void main(String[] args) {

		// 메소드 사용하기(main 영역 안쪽에서 사용하기)

		double result = addDouble(4.2, 3.14);

		System.out.println(result);

		System.out.println(subNum(4, 10));
		
		
		
	}

	// 메소드 생성(main 영역을 벗어나서 작성하기)
	
	// 빼기 수행하는 메소드
	// 리턴타입 : int / 매개변수 : int 2개 / 메소드명 : subNum
	// 매개변수로 받아온 데이터 2개를 뺀 결과값을 돌려주는 메소드
	// 단, 큰 수에서 작은 수를 뺀 결과를 돌려주기!
	
	public static int subNum(int num1, int num2) {
		
		int result = 0;
		result = num1 > num2 ? num1 - num2 : num2 - num1;
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	// 리턴타입 : double / 매개변수 : 2개 double / 메소드 명 : addDouble
	public static double addDouble(double num1, double num2) {

		// void : 리턴타입이 없음을 의미하는 키워드
		double result = num1 + num2;
		return result;
	}

}
