package org.study.basicPackage;

import java.util.Scanner;

public class OppsQuizEx {

	public static void main(String[] args) {

		/*
		 * Scanner, substring() while, if, switch 활용 변수등의 작성자 임의로 작성 해주세요. String
		 * url=query4.substring(query4.length() - 3);//.do 이용 String
		 * url=query4.substring(0, query4.length() - 3); 이용 1. Scanner 입력 끝3자리는 ".do" 끝날
		 * 때 1-1. 입력값이 ".do"를 제외하고"/insert"면 콘솔에 "회원가입실행" 1-2. 입력값이 ".do"를
		 * 제외하고"/update"면 콘솔에 "회원수정실행" 1-3. 입력값이 ".do"를 제외하고"/select"면 콘솔에 "회원조회실행" 1-4.
		 * 입력값이 ".do"를 제외하고"/delete"면 콘솔에 "회원탈퇴실행" 1-5. 입력값이 ".do"를 제외하고 위의 1-1 ~ 1-4 값을
		 * 제외 하면 콘솔에 "입력값오류" -> 다시 while문 실행 2. Scanner 입력값 "exit"면 "종료" -> While문 종료 3.
		 * Scanner 입력값 "exit"나 ".do"로 끝나지 않으면 "입력값오류! 다시입력하세요" 다시 while문 실행
		 */

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.print("url 입력: ");
			String order = input.next();

			String url = order.substring(order.length() - 3);

			if (url.equals(".do")) {

				String query = order.substring(0, order.length() - 3);

				if (query.equals("/insert")) {
					System.out.println("회원가입");
				} else if (query.equals("/select")) {
					System.out.println("회원조회");
				} else if (query.equals("/update")) {
					System.out.println("회원수정");
				} else if (query.equals("/delete")) {
					System.out.println("회원삭제");
				} else {
					System.out.println("입력오류!! 다시입력:");
				}

			} else if (!url.equals(".do")) {
				System.out.println("입력값오류!! .do를 붙혀주세요!!");

			}
		}
	}
}

//		while (true) {
//			System.out.println("프로그램을 시작하겠습니다?");
//			String order = input.next();
//
//			if (order.equals("exit")) {
//				System.out.println("종료");
//				break;
//			} else {
//				System.out.print("url 입력(3자이상):");
//				String uri = input.next();
//
//				String url = uri.substring(uri.length() - 3);
//
//				if (url.equals(".do")) {
//
//					if (url.length() < 2) {
//						System.out.println("3자이상 입력하시오");
//					} else {
//						String query = uri.substring(0, uri.length() - 3);
//
//						switch (query) {
//						case "/insert":
//							System.out.println("회원가입 실행");
//							break;
//						case "/select":
//							System.out.println("회원조회 실행");
//							break;
//						case "/update":
//							System.out.println("회원수정 실행");
//							break;
//						case "/delete":
//							System.out.println("회원탈퇴 실행");
//							break;
//						default:
//							System.out.println("입력값오류 다시 입력해주세요");
//							break;
//						}
//					}
//				} else if (!url.equals(".do")) {
//					System.out.println("입력값오류!! .do를 붙혀주세요!!");
//				}
//			}
//		}

//	}
//}
