package programmers_220107;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

// 프로그래머스 : 코딩테스트 연습 > 연습문제 > 나누어 떨어지는 숫자 배열
// url : https://programmers.co.kr/learn/courses/30/lessons/12910

public class pg12910 {
	public static int numExcep() {
		int res;
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				res = sc.nextInt();
			}catch(Exception e) {
				sc.nextInt();
				continue;
			}
			break;
		}

		return res;
	}
	public static ArrayList solution(int[] arr, int divisor) {
		ArrayList answer = new ArrayList();
		//int[] answer = {};

		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%divisor == 0) {
				answer.add(arr[i]);
			}
		}
		if(answer.size() == 0) {
			answer.add(-1);
		}else {
			answer.sort(Comparator.naturalOrder());
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		System.out.println("정수의 길이 입력");
		int[] arr = new int[numExcep()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = numExcep();
		}
		System.out.println("나눌 값을 입력");
		int divisor = numExcep();

		solution(arr, divisor);

	}

}
