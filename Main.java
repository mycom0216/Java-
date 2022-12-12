package 미지게임;

public class Main {

    Scanner sc = new Scanner(System.in);

    System.out.println("============WELCOME============");
    System.out.println("=========★미니 게임 천국★=========");
    System.out.println("===============================");
    System.out.println();

    while (true) {
       System.out.print("[1]회원가입 [2]로그인 >> ");
       int choiceLogin = sc.nextInt();
       System.out.println();

       if (choiceLogin == 1) {
          System.out.println("=====회원가입=====");
          System.out.print("ID 입력 : ");
          String id = sc.next();
          System.out.print("비밀번호 입력 : ");
          String pw = sc.next();

          MemberDTO dto = new MemberDTO(id, pw);
          MemberDAO dao = new MemberDAO();
          int row = dao.insert(dto);
          // insert 결과(row)를 이용해 사용자에게 가입 실패 유무를 출력
          if (row > 0) {
             System.out.println("===========");
             System.out.println("회원가입 성공!");
          } else {
             System.out.println("===========");
             System.out.println("회원가입 실패");
          }

//       ------------------------------------------------------
       } else if (choiceLogin == 2) {
          System.out.println("=====로그인=====");
          System.out.print("ID 입력 : ");
          String id = sc.next();
          System.out.print("비밀번호 입력 : ");
          String pw = sc.next();

          MemberDTO dto = new MemberDTO(id, pw);
          MemberDAO dao = new MemberDAO();

          MemberDTO result = dao.login(dto);

          // 4) 결과를 이용한 작업처리(로그인 성공 유무 판단)
          if (result != null) {
             // 로그인 성공
             System.out.println(result.getId() + "님 미니게임 천국에 오신 것을 환영합니다!");
          }
       }

       while (true) {
          System.out.println("===========메뉴=============");
          System.out.print("[1]게임 선택 [2]랭킹확인 [3]검색확인 [4]지옥으로 가시겠습니까..? >> ");
          int choice = sc.nextInt();

          if (choice == 1) {
             System.out.println();
             System.out.println("==========게임 선택===========");
             System.out.println("[1]널 꼭 웃기고 말거야..! 넌센스퀴즈 ");
             System.out.println("[2]당신은 영화를 얼마나 보셨나요? 영화 초성퀴즈");
             System.out.print("당신의 선택은?!?!?!?! >> ");
             int choiceGame = sc.nextInt();
             System.out.println();

             if (choiceGame == 1) {

                System.out.println("==========!넌센스 퀴즈 규칙!==========");
                System.out.println("♥           기회는 단 5번           ♥");
                System.out.println("♥       한 문제 당 제한시간 15초       ♥");
                System.out.println("♥   게임을 종료하고 싶다면 입력란에 OUT   ♥");
                System.out.println("♥    정답은 꼭 띄어쓰기 없이 작성하기!!   ♥");
                System.out.println("==================================");
                System.out.print("피식할 준비가 되셨습니까?(Y) >> ");
                String y = sc.next();
                if (y.equals("Y")) {

 
                } else {
                   continue;
                }

             } else if (choiceGame == 2) {

                System.out.println("==========!영화 초성퀴즈 규칙!==========");
                System.out.println("♥           기회는 단 5번            ♥");
                System.out.println("♥        한 문제 당 제한시간 N초        ♥");
                System.out.println("♥   게임을 종료하고 싶다면 입력란에 OUT    ♥");
                System.out.println("♥    정답은 꼭 띄어쓰기 없이 작성하기!!    ♥");
                System.out.println("==================================");
                System.out.print("준비가 되셨습니까?(Y) >> ");
                String y = sc.next();
                if (y.equals("Y")) {
                   // 게임 진행 로직
                } else {
                   continue;
                }

             }

          } else if (choice == 2) {
             System.out.print("당신의 랭킹을 보고 실망하지 않을 자신이 있습니까?(Y) >> ");
             String y = sc.next();
             if (y.equals("Y")) {
                // 랭킹확인 로직
                // 랭킹 확인 출력문 위에 이거 넣어주세요! System.out.println("==========!랭킹확인!==========");

                System.out.println("어떤 게임의 랭킹을 확인하시겠습니까?");
                System.out.print("[1]넌센스 퀴즈 [2]영화 초성퀴즈 >> ");
                int rank = sc.nextInt();

                if (rank == 1) {
                   // 넌센스 퀴즈 랭킹

                   // 랭킹 로직 이후 나가기 구문
                   System.out.print("나가기(Y) >>");
                   String out = sc.next();
                   if (out.equals("Y")) {
                      continue;
                   } else {
                      continue;
                   }
                } else if (rank == 2) {
                   // 영화 초성퀴즈 랭킹

                }

                // 랭킹 로직 이후 나가기 구문
                System.out.print("나가기(Y) >>");
                String out = sc.next();
                if (out.equals("Y")) {
                   continue;
                } else {
                   continue;
                }

             } else {
                continue;
             }

          } else if (choice == 3) {
             System.out.print("정말 정답이 궁금하십니까?(Y) >> ");
             String y = sc.next();
             if (y.equals("Y")) {
                // 검색 로직

             } else {
                continue;
             }

          } else if (choice == 4) {

             System.out.print("정말 프로그램을 종료하고 지옥으로 가시겠습니까..?(Y) >> ");
             String c = sc.next();
             if (c.equals("Y")) {
                System.out.println("당신은 지옥행 열차를 탑승하셨습니다.");
                System.out.println("밤길 조심하세요");
                break;
             } else {
                continue;
             }
          }

       }

       break;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
