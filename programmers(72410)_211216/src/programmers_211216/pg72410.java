package programmers_211216;

import java.util.Scanner;

public class pg72410 {

	// 프로그래머스 : 코딩테스트 연습 > 2021 KAKAO BLIND RECRUITMENT > 신규 아이디 추천
	// url : https://programmers.co.kr/learn/courses/30/lessons/72410?language=java

	public static String solution(String new_id) {


		// 소문자 치환
		new_id = new_id.toLowerCase();

		// 소문자, 숫자, -, _, . 제외한 문자 제거 (정규식활용)
		new_id = new_id.replaceAll("[^0-9a-z-_.]", "");

		// (.) 규칙 제거 (첫자, 마지막자, 2자 연속 시 제거)
		if(new_id.indexOf(".") != -1) {
			int cnt = 0;

			int lastNum = new_id.length();
			for(int i = new_id.indexOf("."); i < lastNum; i++) {
				if(new_id.substring(i, i+1).equals(".")) {
					cnt++;
					if(i == 0 || i == lastNum-1) {
						new_id = new_id.substring(0, i)+new_id.substring(i+1, new_id.length());
						lastNum = new_id.length();
						i--;
					}
					else if(2 <= cnt) {
						new_id = new_id.substring(0, i)+new_id.substring(i+1, new_id.length());
						lastNum = new_id.length();
						i--;
					}

				}else {
					cnt = 0;
				}
			}
		}
		
		// id 15자초과시 sub처리
		new_id = 15 <= new_id.length() ? new_id.substring(0, 15) : new_id;
		
		// 아이디가 공백인 경우, a로 리턴
		if(new_id.equals("")) {
			new_id = "a";
		} // 공백이 아니라면 마지막 자리에 (.) 존재 시 제거
		else if(new_id.substring(new_id.length()-1, new_id.length()).equals(".")) {
			new_id = new_id.substring(0, new_id.length()-1);
		}
		
		// 문자가 3자 미만이라면, 3자리가 될 때 까지 반복문으로 마지막자리 추가
		if(new_id.length() < 3) {
			for(int i = new_id.length(); i < 3; i++) {
				new_id += new_id.substring(new_id.length()-1, new_id.length());
			}
		}
		System.out.println(new_id);
		return new_id;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String new_id = sc.next();


		solution(new_id);

	}

}
