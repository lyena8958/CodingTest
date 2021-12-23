package programmers_211223;

import java.util.Scanner;

// 코딩테스트 연습 > 월간 코드 챌린지 시즌3 > 나머지가 1이 되는 수 찾기
// url : https://programmers.co.kr/learn/courses/30/lessons/87389

public class pg87389 {
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
			}

		}
		return res;
	}
	public static int solution(int num) {
		int answer = 0;
		for(int i = 2; i < num; i++) {
			if(num % i == 1) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		
		System.out.println("나머지가 1이 되는 수를 찾는 프로그램입니다.");
		System.out.println("대상이 되는 수를 입력하세요.");
		
		int num = numExcep(3, 1000000);
		solution(num);
	}
}
