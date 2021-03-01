package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.core.Catch;

public class MemberDAO {
   Connection conn = null;
   PreparedStatement psmt = null;
   int cnt = 0;
   ResultSet rs = null;
   MemberDTO returnDto  = null;
   ArrayList<MemberDTO> list = null;
   public void conn() {

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
         String db_id = "hr";
         String db_pw = "hr";

         conn = DriverManager.getConnection(db_url, db_id, db_pw);

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public void close() {

      try {
         if (rs != null) {
            rs.close();
         }
         if (psmt != null) {
            psmt.close();
         }
         if (conn != null) {
            conn.close();
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public int join(MemberDTO dto) {
      conn();
      String sql = "insert into web_member values(?,?,?,?)";
      try {
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, dto.getEmail());
         psmt.setString(2, dto.getPw());
         psmt.setString(3, dto.getEmail());
         psmt.setString(4, dto.getAddr());

         cnt = psmt.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return cnt;
      }
   //Member DTO type and in line 87, object was created so 
   public MemberDTO login(MemberDTO dto) {
      conn();

      try {
         String sql = "select * from web_member where email = ? and pw = ?";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1,  dto.getEmail());
         psmt.setString(2, dto.getPw());
         rs = psmt.executeQuery();
         
         // numbers are indicated as columns in table
         if (rs.next()) {
            String tell = rs.getString(3);
            String addr = rs.getString(4);
            
            //개채 생성
            returnDto = new MemberDTO(dto.getEmail(), dto.getPw(), tell, addr);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
      return returnDto;
   }
   public int update(MemberDTO dto) {
      conn();
      try {
      
      String sql = "update web_member set pw = ?, tel = ?, address = ? where email = ?";
      psmt = conn.prepareStatement(sql);
      psmt.setString(1, dto.getPw());
      psmt.setString(2, dto.getTel());
      psmt.setString(3, dto.getAddr());
      psmt.setString(4, dto.getEmail());
      cnt = psmt.executeUpdate();
   }catch (SQLException e) {
      e.printStackTrace();
   }finally {
      close();
   }
      return cnt;
   }
   
   public ArrayList<MemberDTO> select() {   
      list = new ArrayList<MemberDTO>();
      conn();
      
      try {
         String sql = "select * from web_member";
         psmt = conn.prepareStatement(sql);
         
         rs = psmt.executeQuery();
         
         while(rs.next()) {
            String email = rs.getString(1);
            String pw = rs.getString(2);
            String tel = rs.getString(3);
            String addr = rs.getString(4);
            
            returnDto = new MemberDTO(email, pw, tel, addr);   
            list.add(returnDto);
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
      }finally {
         close();
      }
      return list;
   
   
   }
}