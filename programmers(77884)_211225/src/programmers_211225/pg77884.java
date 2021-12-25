package programmers_211225;

import java.util.Scanner;

public class pg77884 {

	// 코딩테스트 연습 > 월간 코드 챌린지 시즌2 > 약수의 개수와 덧셈
	// url : https://programmers.co.kr/learn/courses/30/lessons/77884
	public static int numExcep(int a, int b) {
		Scanner sc  = new Scanner(System.in);
		int res;

		while(true) {
			try {
				res = sc.nextInt();
				if(res < a || b < res) {
					System.out.println(a+"이상 "+b+"이하로 재입력");
				}else {
					break;
				}
			}
			catch(Exception e) {
				sc.nextLine();
				continue;
			}
		}
		
		return res;
	}
	public static int solution(int left, int right) {
		int answer = 0;
		for(int i = left; i <= right; i++) {
			int cnt = 0; 
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt++;
				}
			}
			answer = cnt%2 == 0 ? answer+i : answer-i;
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		System.out.println("left부터 right 까지의 각 숫자에 대한 약수의 개수를 나타내는 프로그램입니다.");
		System.out.println("left 수를 입력하세요");
		int left = numExcep(1, 1000);
		
		System.out.println("right 수를 입력하세요");
		int right = numExcep(left, 1000);
		
		solution(left, right);

	}

}
