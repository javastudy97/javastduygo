package org.project.commend;

import java.util.List;
import java.util.Scanner;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSelectAgeDo implements MemberCommed {

	@Override
	public void excuteQueryCommend() {
		System.out.println("30대 회원 출력");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("시작나이:");
		int ageStart=input.nextInt();
		System.out.print("끝나이:");
		int ageEnd=input.nextInt();
		
		MemberDao dao = new MemberDao();
		List<MemberDto> members = dao.selectAge(ageStart,ageEnd);
		
		if(members!=null)
		{
			System.out.println("조회 Success");
			for(MemberDto member: members) {
				System.out.println("아이디:"+member.getUserId()+" ");
				System.out.println("비밀번호:"+member.getUserPw()+" ");
				System.out.println("나이:"+member.getAge()+" ");
				System.out.println("이메일:"+member.getEmail());
			}
		}else {
			System.out.println("조회 Fail!!");
		}
	}

}
