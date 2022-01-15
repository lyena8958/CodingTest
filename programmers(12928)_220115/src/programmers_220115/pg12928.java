package programmers_220115;

import java.util.Scanner;

public class pg12928 {

	// 프로그래머스 > 코딩테스트 연습 > 연습문제 > 약수의 합
	// url : https://programmers.co.kr/learn/courses/30/lessons/12928
	
	public static int numExcep(int a,int b) {
		int res;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.println("정수 입력");
				res = sc.nextInt();
				if(res < a || b < res) {
					System.out.println(a+"이상 "+b+"이하로 재입력");
				}else {
					break;
				}
			}catch(Exception e) {
				continue;
			}
		}
		return res;
	}
	public static int solution(int n) {
		if(n == 0) {
			return 0;
		}
		int answer = 1; // 약수  1로 초기화
		
		for(int i = 2; i <= n; i++) {
			if(n%i == 0) {
				answer += i;
			}
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		int n = numExcep(0, 3000);
		solution(n);

	}

}
