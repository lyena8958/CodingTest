package programmers_211224;

import java.util.Scanner;

// 코딩테스트 연습 > 연습문제 > x만큼 간격이 있는 n개의 숫자
// url : https://programmers.co.kr/learn/courses/30/lessons/12954

public class pg12954 {
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
	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		answer[0] = x;
		for(int i = 1; i < n; i++) {
			answer[i] = answer[i-1] + x;
		}
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println("정수 x부터 시작해 x씩 n번까지 반복하는 프로그램입니다.");
		System.out.println("x의 값을 입력하세요");
		int x = numExcep(-10000000, 10000000);
		
		System.out.println("다음으로 n의 값을 입력하세요");
		int n = numExcep(0, 1000);
		
		solution(x, n);

	}

}
