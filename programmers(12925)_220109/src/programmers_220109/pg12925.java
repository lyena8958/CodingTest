package programmers_220109;

import java.util.Scanner;

// 프로그래머스 : 코딩테스트 연습 > 연습문제 > 문자열을 정수로 바꾸기
// url : https://programmers.co.kr/learn/courses/30/lessons/12925

public class pg12925 {
	public static int solution(String s) {
        int answer = 0;
        try {
        	answer = Integer.parseInt(s);
        }catch(Exception e) {
        	 if(s.substring(0,1).equals("+")) {
             	answer = Integer.parseInt(s.substring(1,s.length()));
             }else if(s.substring(0,1).equals("-")) {
             	answer = -1 * Integer.parseInt(s.substring(1,s.length()));
             }
        }
        System.out.println(answer);
        
        return answer;
    }
	public static void main(String[] args) {
		String s = new Scanner(System.in).next();

		solution(s);

	}

}
