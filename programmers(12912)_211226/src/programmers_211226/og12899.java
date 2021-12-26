package programmers_211226;

import java.util.Scanner;

// 코딩테스트 연습 > 연습문제 > 두 정수 사이의 합
// https://programmers.co.kr/learn/courses/30/lessons/12912

public class og12899 {
	public static int numExcep(int a, int b) {
		Scanner sc = new Scanner(System.in);

		int res;

		while(true) {
			try {
				res = sc.nextInt();
				if(res < a || b < res) {
					System.out.println(a+"이상 "+b+"이하로 재입력");
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
	public static long solution(int a, int b) {
		long answer = 0;
		if(b < a) {
			answer = b;
			b = a;
			a = (int) answer;
			answer = 0;
			System.out.println(a);
			System.out.println(b);
		}
		for(int i = a; i <= b; i++) {
			answer += i;
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		System.out.println("a~b까지의 모든 정수의 합을 구합니다.");
		System.out.println("a의 값을 입력");
		int a = numExcep(-10000000,10000000);
		
		System.out.println("b의 값을 입력");
		int b = numExcep(-10000000,10000000);
		
		solution(a, b);
	}

}
