package org.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.study.dbconnect.DBConnect;
import org.study.dto.MemberDto;

public class MemberDao {

	public MemberDao() {
		System.out.println("기본생성자");
	}

	// 회원가입 return 정수 1(성공)
	public int inserDo(String userId, String userPw, int age) {
		System.out.print(userId + " " + userPw + " " + age);
		int result = 0;
		Connection conn = null; // DB연동 데이터 베이스 연동객체
		PreparedStatement pstm = null;// SQL
		String query = "";

		try {
			// 1.DB연동
			conn = DBConnect.getConnection(); // prepareStatement
			query = "insert into member(userId,userPw,age) values(?,?,?) ";
			pstm = conn.prepareStatement(query); // DB연동, SQL처리
			pstm.setString(1, userId);// setString(인덱스(1~), 값)
			pstm.setString(2, userPw);
			pstm.setInt(3, age);

			// 실행
			result = pstm.executeUpdate(); // 성공이면 1반환

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
			} finally {
			}
		}

		return result;

	}

	// 회원탈퇴 return 정수 1(성공)
	public int deleteDo(String userId) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = DBConnect.getConnection();
			String query = "delete from member where userId=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);

			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
		}

		return result;
	}

	// 회원수정 return 정수 1(성공)
	public int updateDo(String userId, String userPw, int age) {
		System.out.println(userPw + " " + age + " " + userId);
		int result = 0;
		Connection conn = null; // Connection DB 연결 객체 생성 및 변수 선언 후 초기화
		PreparedStatement pstm = null; // PreparedStatement DB연동하고 SQL처리해주는 객체 생성및 초기화
		String query = "";// 쿼리문 생성 후 초기화

		try {
			conn = DBConnect.getConnection(); // db연결 매서드 호출
			query = "update member set userPw=? ,age=? where userId=?";
			pstm = conn.prepareStatement(query); // CRUD 역할 prepareStatement 매소드 호출
			// 3. SQL 설정
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, userId);

			// 4. PreparedStatement 실행
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
			} finally {
			}
		}

		return result;

	}
	// 회원조회 return 객체(DTO), null

	public ArrayList<MemberDto> selectDo() {

		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;// DB 데이터를 저장 할 객체
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member";
			pstm =conn.prepareStatement(query);
			rs = pstm.executeQuery(); // DB 데이터를 저장

			if (rs != null) {
				// DB데이터가 없으면 null
				while (rs.next()) {
//					rs.getString("userId"); 글자쓰다가 에러 많이 나가서 추천X
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					
					lists.add(new MemberDto(userId, userPw, age));
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lists;
	}

}
