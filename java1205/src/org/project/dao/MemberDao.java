package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;


public class MemberDao {

	public MemberDao() {
		System.out.println("기본생성자");
	}

	// 추가 부분
	public int insertDo(String userId, String userPw, int age, String email) {
		int result = 0;
		Connection conn = null; // DB연동
		PreparedStatement pstm = null;// SQL처리
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into member1(userId,userPw,age,email) values(?,?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setInt(3, age);
			pstm.setString(4, email);

			result = pstm.executeUpdate(); // 실행
			System.out.println("SQL실행 OK!!");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL 실행 Fail");
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

	// 수정 부분
	public int updateDo(String userId, String userPw, int age, String email) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update member1 set userpw=?, age= ?, email= ? where userid=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userPw);
			pstm.setInt(2, age);
			pstm.setString(3, email);
			pstm.setString(4, userId);

			result = pstm.executeUpdate();
			System.out.println("SQL 실행 OK!!");
		} catch (SQLException e) {
			System.out.println("SQL 실행 Fail!!");
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

	// 탈퇴 부분
	public int deleteDo(String userId) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "Delete from member1 where userId=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);

			result = pstm.executeUpdate();
			System.out.println("SQL 실행 Success!!");

		} catch (SQLException e) {
			System.out.println("SQL 실행 Fail!!");
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

		return result = 0;

	}

	// 조회 부분
	public ArrayList<MemberDto> selectDo() {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null; // 받아서 처리하는 객체 ResultSet
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member1";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			if (rs != null) { // 테이블의 레코드 1개씩 가져오는거다
				while (rs.next()) {
					String userId = rs.getString(1);
					String userPw = rs.getString(2);
					int age = rs.getInt(3);
					String email = rs.getString(4);

					lists.add(new MemberDto(userId, userPw, age, email));// Arraylist나 list에 한줄씩 추가해줘야함.
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
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
			}
		}

		return lists;
	}

	
	public List<MemberDto> selectAge(int ageStart, int ageEnd) {
		
//		member1 테이블
//		나이가 30대인 멤버를 조회 하고 콘솔에 출력
//		select * from member1 where age>=30 and age<40;
//		select * from member1 where age BETWEEN 30 and 39;
//		**Conroller, Commend, Dao이용
		List<MemberDto> members = new ArrayList<MemberDto>();
		
		System.out.println(ageStart);
		System.out.println(ageEnd);
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query ="";
		
			try {
				conn =DBConnect.getConnection();
				query="select * from member1 where age >= ? and age < ?";
				pstm = conn.prepareStatement(query);
				
				pstm.setInt(1, ageStart); //SelectAge SQL 실행시 값(?)을 넣어야 하기 때문에 적어야함
				pstm.setInt(2, ageEnd);
				
				rs = pstm.executeQuery();
				
				if(rs!=null) {
					while(rs.next()) {
							
						String userId = rs.getString(1);
						String userPw = rs.getString(2);
						int age = rs.getInt(3);
						String email = rs.getString(4);
						
					members.add(new MemberDto(userId, userPw, age, email));
						
					}
					
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if (conn != null)
						conn.close();
					if (pstm != null)
						pstm.close();
					if (rs != null)
						rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
				}
			}
			
		

		return members;
	}

}
