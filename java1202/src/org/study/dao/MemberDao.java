package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.study.dbconnect.Dbconnect;
import org.study.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("Dao");
	}

	// 회원가입

	public int insertDo(String userId, String userPw, int age, String email) {
		System.out.println(userId + ", " + userPw + ", " + age + ", " + email);
		int result = 0;
		Connection conn = null;// 커넥션(DB연동)
		PreparedStatement pstm = null; // SQL처리
		String query = ""; // SQL문 -> 실행할 SQL

		try {
			conn = Dbconnect.getConnection();// DB연동
			query = "insert into member2(userId, userPw, age, email) values(?, ?, ?, ?)"; // SQL
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			pstm.setString(4, email);

			result = pstm.executeUpdate(); // 성공하면 1반환-> 회원수정, 회원탈퇴

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	// 회원탈퇴
	public int deletoDo(String userId) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = Dbconnect.getConnection();
			query = "delete from member2 where userId=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);

			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	// 회원수정
	public int updateDo(String userId, String userPw, int age, String email) {
		System.out.println(userId + " " + userPw + " " + age + " " + email);
		int result = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = Dbconnect.getConnection();
			query = "update member2 set userPw =?, age=?, email=? where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, email);
			pstm.setString(4, userId);

			result = pstm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;

	}

	// 회원조회
	public ArrayList<MemberDto> selectDo() {
		ArrayList<MemberDto> members = new ArrayList<MemberDto>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// DB 테이블 데이터를 get
		String query = "";

		try {
			conn = Dbconnect.getConnection();
			query = "select userId,userPw,age,email from member2";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery(); // 실행 시켜서 가져온다.
			if (rs != null) {
				// 테이블 데이터가 존재 하면..
				while (rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);
					
					members.add(new MemberDto(userId, userPw, age, email));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs!=null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return members;

	}

}
