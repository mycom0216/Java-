package view;

public class 회원관리프로그램 {

	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);
	      System.out.println("=====SMHRD 회원관리 프로그램=====");
	      while(true)
	      {System.out.print("[1]회원가입 [2]로그인 [3]전체회원목록 [4]회원탈퇴 [5]종료 >>");
	      int choice = sc.nextInt();
	      if(choice == 1) {
	         System.out.println("=====회원가입=====");
	      System.out.print("ID 입력 : ");
	      String id = sc.next();
	      System.out.print("pw 입력 : ");
	      String pw = sc.next();
	      System.out.print("이름 입력 : ");
	      String name = sc.next();
	      System.out.print("나이 입력 : ");
	      int age = sc.nextInt();
	      
	      StudentDTO s = new StudentDTO(id, pw, name, age);
	      //insert 메서드 사용   
	      StudentDAO dao = new StudentDAO();   
	      int row = dao.insert(s);   
	      // 결과를 이용한 작업
	      // ---> 사용자한테 어떤 내용을 보여줄지 
	      if(row > 0) {
	         System.out.println("회원가입 성공~~!");
	      }else {
	         System.out.println("회원가입 실패...");
	      }
	      
	      
	      
	      }else if(choice == 2) {
	         System.out.println("=====로그인=====");
	         System.out.print("ID 입력 : ");
	         String id = sc.next();
	         System.out.print("pw 입력 : ");
	         String pw = sc.next();
	         
	         
	         // select * from iot_member where id = ? and pw =?
	         // 1) id, pw 하나로 묶어주기
	         StudentDTO dto = new StudentDTO(id, pw);
	         // 2) 도구 꺼내오기
	         StudentDAO dao = new StudentDAO();
	         // 3) 사용하기
	         StudentDTO result = dao.login(dto); 
	         
	         // 로그인 성공유무 판단
	         if(result != null) {
	            //로그인 성공
	            System.out.println(result.getName()+"님 환영합니다!");
	            System.out.println("회원정보를 수정하시겠습니까? [1]수정 [2]나가기");
	            int choice2 = sc.nextInt();
	            if(choice2 == 1) {
	               System.out.print("아이디를 입력하세요 : ");
	               String newId = sc.next();
	               System.out.print("비밀번호를 입력하세요 : ");
	               String newPw = sc.next();
	               System.out.print("이름을 입력하세요 : ");
	               String newName = sc.next();
	               
	            int row = dao.update(new StudentDTO(newId, newPw, newName, 0),id);
	            if(row > 0) {
	               System.out.println("회원정보 수정 성공!");
	            } else {
	               System.out.println("회원정보 수정 실패!");
	            }
	               
	            } else if(choice == 2) {
	               System.out.println("시작페이지로 이동합니다.");
	               continue; // --> 반복문의 시작지점으로 보내는 키워드
	            }
	         
	         
	         }else {
	            //로그인 실패
	            System.out.println("아이디나 비밀번호를 확인해주세요!");
	         }
	         
	      
	      
	      
	      }else if(choice == 3) {
	         System.out.println("=====전체회원목록=====");
	      System.out.println("iD"+"\t"+"이름"+"\t"+"나이");
	      // select * from iot_member 
	      StudentDAO dao = new StudentDAO();
	      ArrayList<StudentDTO> resultList = dao.selectAll();
	      for(StudentDTO dto:resultList) {
	         System.out.print(dto);
	         System.out.println();
	      }
	      
	      
	      }else if(choice == 4) {
	         System.out.println("5번");
	      System.out.println("=====회원탈퇴=====");
	      System.out.print("ID 입력 : ");
	      String id = sc.next();
	      System.out.print("pw 입력 : ");
	      String pw = sc.next();
	      // 0) 입력받을 데이터 정하기(테이블 구조, 어떤 SQL구문 적을까?)
	      // 1) id와 비밀번호를 하나의 자료형으로 묶어준다. 
	      StudentDTO dto = new StudentDTO(id, pw);
	      // 2) 데이터베이스와 연결할 때 사용하는 도구 생성하기    
	      StudentDAO dao = new StudentDAO();
	      // 3) 도구 사용하기
	      int row = dao.delete(dto);
	      // 4) 결과를 이용한 작업 처리
	      if(row > 0) {
	         System.out.println("회원탈퇴 성공!");
	      }else {
	         System.out.println("회원탈퇴 실패");
	      }
	      
	      }else if(choice == 5){
	         System.out.println("프로그램 종료!!");
	         break;
	      }
	      
	      }
	      
	      
	      
	      
	      
	   }

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
