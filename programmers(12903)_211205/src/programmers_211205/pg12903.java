package programmers_211205;

import java.util.Scanner;

public class pg12903 {

	// 프로그래머스 : 코딩테스트 연습 > 연습문제 > 가운데 글자 가져오기
	// url : https://programmers.co.kr/learn/courses/30/lessons/12903

	public static String strExcep(int a, int b) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		while(true) {
			try {
				int length = str.length();
				if(length < a || b < length) {
					System.out.println(a+"이상 "+b+"이하의 길이로 입력");
					str = sc.next();
					continue;
				}
				break;
			}catch(Exception e) {
				sc.nextLine();
				continue;
			}
		}
		
		return str;
	}
	public static String solution(String str) {
		String[] answer = str.split("");
		int centerIndex = (int) Math.round(str.length()/2.0)-1;
		
		if(str.length() %2 == 0) {
			str = "";
			for(int i = centerIndex; i < centerIndex+2; i++) {
				str += answer[i];
			}
			
		}
		else {
			str = answer[centerIndex]; 
		}
		System.out.println(str);
		return str;
		
		
	}
	public static void main(String[] args) {

		String str = strExcep(1,100);
		solution(str);
	}

}
