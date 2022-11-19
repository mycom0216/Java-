package for문;

public class ex06 {

	public static void main(String[] args) {
		
		// 1-2+3-4+...+99-100을 계산하여 답을 출력하세요!
		// 누적시켜줄 공간 sum
		// 홀수일 때 더해주고, 짝수일때는 뺴준다
	    int sum = 0;
	    for(int i = 1; i<101; i++) {
	    	if(i%2==0) {
	    		sum -= i;
	    	}else {
	    		sum += i;
	    		//sum = sum + i;
	    	}
	    	
	    }
		
		System.out.println(" 결과 : "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
