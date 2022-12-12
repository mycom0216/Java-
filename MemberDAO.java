Connection conn = null;
   PreparedStatement psmt = null;
   ResultSet rs = null;

   // 공통된 부분을 메소드로 묶기
   private void getConn() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         String url = "jdbc:oracle:thin:@220.93.169.75:1521:xe";
         String user = "c##service";
         String pw = "12345";

         conn = DriverManager.getConnection(url, user, pw);

      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   private void getClose() {

      try {
         if (rs != null)
            rs.close();
         if (psmt != null)
            psmt.close();
         if (conn != null)
            conn.close();

      } catch (SQLException e) {
         e.printStackTrace();
      }
   }