package programmers_211220;

import java.util.Scanner;

// 코딩테스트 연습 > 2021 카카오 채용연계형 인턴십 > 숫자 문자열과 영단어
// https://programmers.co.kr/learn/courses/30/lessons/81301


public class pg81301 {
	public static String lengthExcep(int a, int b) {
		Scanner sc = new Scanner(System.in);

		String result;
		while(true) {
			try {
				result = sc.next();

				if(result.length() < a || b < result.length()) {
					System.out.println(a+" 이상 "+b+"이하 길이로 재입력");
				}else {
					break;
				}
			}catch(Exception e) {
				sc.nextLine();
				continue;
			}
		}
		return result;
	}
	//"[^0-9a-z-_.]"
	public static int solution(String s) {
		String[] datas = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String data = s;
		for(int i = 0; i < datas.length; i++) {
			data = data.replaceAll(datas[i], String.valueOf(i));
		}
		System.out.println(data);
		int answer = Integer.parseInt(data);
		System.out.println(answer);
		
		return answer;
	}
	public static void main(String[] args) {
		String s = lengthExcep(1, 50);
		
		solution(s);
	}
}
