package programmers_220113;

import java.util.Scanner;

public class pg12937 {

	// 프로그래머스 : 코딩테스트 연습 > 연습문제 > 짝수와 홀수
	// url : https://programmers.co.kr/learn/courses/30/lessons/12937
	
	public String solution(int num) {
		
		if(num%2==0) {
			return "Even";
		}else {
			return "Odd";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		

	}

}
