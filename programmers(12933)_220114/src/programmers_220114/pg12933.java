package programmers_220114;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 프로그래머스 > 코딩테스트 연습 > 연습문제 > 정수 내림차순으로 배치하기
// url : https://programmers.co.kr/learn/courses/30/lessons/12933

public class pg12933 {

	public static long solution(long n) {

		String[] s1 = String.valueOf(n).split("");
		Arrays.sort(s1,Collections.reverseOrder());
		
		String s = "";
		for(int i = 0; i < s1.length; i++) {
			s += s1[i];
		}
		
		n = Long.parseLong(s);
		System.out.println(n);
		return n;
	}
	public static void main(String[] args) {

		long n = new Scanner(System.in).nextLong();

		solution(n);
	}

}
