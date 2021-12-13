package programmers_211213;

import java.util.Scanner;

public class pg72410 {

	// 프로그래머스 : 코딩테스트 연습 > 2021 KAKAO BLIND RECRUITMENT > 신규 아이디 추천
	// url : https://programmers.co.kr/learn/courses/30/lessons/72410?language=java

	public static String solution(String new_id) {
		// 아이디가 공백인 경우, a로 리턴
		if(new_id.equals("")) {
			return "a";
		}		

		// 소문자 치환
		new_id = new_id.toLowerCase();

		// 소문자, 숫자, -, _, . 제외한 문자 제거 (정규식활용)
		new_id = new_id.replaceAll("[^0-9a-z-_.]", "");
		//char[] ids = new_id.toCharArray();
		System.out.println("1. "+new_id);
		int cnt = 0;

		// 마침표 제거 및 치환 (2개 이상인 경우 1개로 치환, 첫자 마지막자가 있다면 제거)
		/*
		for(int i = new_id.indexOf("."); i < new_id.length(); i++) {

			  if(ids[i] == '.') {
				  cnt++;
				  if(2 <= cnt) {
					  ids[i] = ' '; 
				  }
			  }else {
				  cnt = 0;
			  }
		}*/
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
				}
			}else {
				cnt = 0;
			}
		}

		/*ids[0] = ids[0] == '.' ? ' ' : ids[0];
		ids[ids.length-1] = ids[ids.length-1] == '.' ? ' ' : ids[ids.length-1];
		System.out.println(ids[ids.length-1]);
		new_id = String.valueOf(ids);
		new_id = new_id.replaceAll(" ", "");*/
		new_id = 15 <= new_id.length() ? new_id.substring(0, 15) : new_id;
		System.out.println(new_id);

		if(new_id.length() <= 2) {
			for(int i = new_id.length(); i <= 3; i++) {
				new_id += new_id.valueOf(new_id.length());
			}
		}
		return new_id;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String new_id = sc.next();
		int i = 1;

		solution(new_id);

	}

}
