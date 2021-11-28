package programmers_211128;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pg70128 {

	//프로그래머스 : 코딩테스트 연습 > 월간 코드 챌린지 시즌1 > 내적
	//url : https://programmers.co.kr/learn/courses/30/lessons/70128

	// 문제 제한입력 -> 유효성검사 처리
	public static int numCheck(int a, int b) {
		int result;
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				result = sc.nextInt();

				if(result < a || b < result) {

					System.out.println(a+"이상 "+b+"이하로 다시 입력");
					
				}else {
					return result;
				}
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("재입력");
				continue;
			}
		}

	}
	public static int solution(int[] a, int[] b) {
		int answer = 0;
		
		for(int i = 0; i < a.length; i++) {
			answer += a[i] * b[i]; 
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.println("a,b의 길이를 입력하세요");
		int length = numCheck(1, 1000);
		int[] a = new int[length];
		int[] b = new int[length];

		for(int i = 0; i < a.length; i++) {
			System.out.println("a"+(i+1)+"번째 입력");
			a[i] = numCheck(-1000, 1000);
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b"+(i+1)+"번째 입력");
			b[i] = numCheck(-1000, 1000);
		}

		solution(a, b);
	}

}
