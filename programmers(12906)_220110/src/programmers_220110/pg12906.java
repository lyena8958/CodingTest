package programmers_220110;

import java.util.ArrayList;
import java.util.Scanner;

public class pg12906 {

	// 프로그래머스 : 코딩테스트 연습 > 연습문제  > 같은 숫자는 싫어
	// url : https://programmers.co.kr/learn/courses/30/lessons/12906

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
				continue;
			}
		}
		
		return res;
	}
	public static ArrayList<Integer> solution(int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i-1] != arr[i]) {
				answer.add(arr[i]);
			}
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		System.out.println("1차원 배열의 길이를 입력");
		int[] arr = new int[numExcep(1, 1000000)];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"번째 0~9 내 정수입력");
			arr[i] = numExcep(0, 9);
		}
		
		solution(arr);
	}

}
