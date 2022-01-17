package programmers_220118;

import java.util.Scanner;

// 프로그래머 : 코딩테스트 연습 > 연습문제 > 핸드폰 번호 가리기
// url : https://programmers.co.kr/learn/courses/30/lessons/12948

public class pg12948 {
	public static String strExcep(int a, int b) {
		Scanner sc = new Scanner(System.in);
		String res;
		
		while(true) {
			try {
				res = sc.next();
				
				if(res.length() < a || b < res.length()) {
					System.out.println("재입력");
				}else {
					break;
				}
				
			}catch(Exception e) {
				sc.nextLine();
				continue;
			}
		}
		
		return res;
	}
	public static String solution(String phone_number) {
		String answer = "";
		for(int i = 0; i < phone_number.length()-4; i++) {
			answer += "*";
		}
		answer += phone_number.substring(phone_number.length()-4, phone_number.length());

		return answer;
	}
	public static void main(String[] args) {
		String phone_number = strExcep(4, 20);
		System.out.println(phone_number.substring(phone_number.length()-4, phone_number.length()));
		solution(phone_number);
		
	}
}
