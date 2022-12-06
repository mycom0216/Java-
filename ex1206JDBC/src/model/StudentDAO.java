package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
	// Data Access Object : 데이터에 접근하는 것을 도와주는 객체
	// DB랑 연결해서 insert, delete, update, select 하는 코드들 모음
	// 메소드 형태로 코드 작성
	// 예외처리(Exception)
	// try : 실행할 로직
	// catch : 예외가 발생했을 때 실행할 문구
	// (개발 중 - 오류의 종류, 서비중 - 오류문구)
	// finally : try에서 예외가 발생하던지 하지 않던지
	// 무조건 실행되는 부분(DB 연결 종료)

	// 1. 학생추가(iot_member테이블에 값 삽입) 메소드
	public int insert(StudentDTO s) {
		// JDBC
		int row = 0;
		PreparedStatement psmt = null;
		Connection conn = null;
		try {
			// 1. JDBC 라이브러리 동적 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 경로지정
			// jdbc:oracle:thin ---> oracle thin 드라이버
			// @localhost --> ip주소
			// 1521 --> portnumber
			// xe --> DB별칭
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##service";
			String pw = "12345";

			// 2. DB 연결 - Connection 객체 생성
			conn = DriverManager.getConnection(url, user, pw);
			// 3. 실행할 SQL(문자열) 정의
			String SQL = "insert into iot_member values(?, ?, ?, ?)";

			// 4. SQL 문장을 전송할 수 있는 형태로 담아주기
			psmt = conn.prepareStatement(SQL);

			// 5. ? 인자 채우기
			// ? 인자는 1부터 시작한다!!
			psmt.setString(1, s.getId());
			psmt.setString(2, s.getPw());
			psmt.setString(3, s.getName());
			psmt.setInt(4, s.getAge());

			// 6. 데이터베이스에 쿼리문 전송하기
			row = psmt.executeUpdate();
			// executeUpdate() --> DML 사용
			// DML --> insert, update, delete
			// 테이블에 영향을 주는 쿼리문
			// int row --> 테이블에서 영향을 받은 행의 개수

		} catch (ClassNotFoundException e) {
			// ClassNotFoundException 처리
			e.printStackTrace(); // 예외 상황을 순서대로 콘솔 출력
		} catch (SQLException e) {
			// SQLException 처리
			e.printStackTrace();
		} finally {

			// 7. 자원반납
			// conn, psmt
			try {
				if (psmt != null)
					psmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
				// 예외상황이 발생했을 때 해당하는 예외상황을
				// 추적하면 문제점들을 출력해주는 기능!
				System.out.println("데이터 자원반납 시 오류");
			}

		}

		return row;

	}

}
