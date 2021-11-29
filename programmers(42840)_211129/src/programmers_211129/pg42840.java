package programmers_211129;

import java.util.ArrayList;
import java.util.Scanner;


//프로그래머스 : 코딩테스트 연습 > 완전탐색 > 모의고사
//url : https://programmers.co.kr/learn/courses/30/lessons/42840



public class pg42840 {
	public static int numExcep(int a, int b) {
		Scanner sc = new Scanner(System.in);
		int result = 0;

		while(true) {
			try {
				result = sc.nextInt();

				if(result < a || b < result ) {
					System.out.println("재입력");
				}else {
					break;
				}
			}catch(Exception e) {
				sc.nextLine();
				continue;
			}

		}

		return result;
	}
	public static ArrayList<Integer> solution(int[] answers) {
		int[] result = new int[3];
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int[] stu1 = {1, 2, 3, 4, 5};
		int[] stu2 = {2, 1 ,2, 3, 2, 4, 2, 5};
		int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		for(int i = 0; i < answers.length; i++) {
			
			if(stu1[i%stu1.length] == answers[i]) {
				result[0]++;
			}
			if(stu2[i%stu2.length] == answers[i]) {
				result[1]++;
			}
			if(stu3[i%stu3.length] == answers[i]) {
				result[2]++;
			}
		}
		int max = Math.max(Math.max(result[0], result[1]), result[2]);
		
		for(int i = 0; i < result.length; i++) {
			if(result[i] == max) {
				answer.add(i+1);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println("시험 문제 수를 입력하세요.");

		int[] answers = new int[numExcep(1, 10000)];

		for(int i = 0; i < answers.length; i++) {
			System.out.println((i+1)+"번째 문제의 답");
			answers[i] = numExcep(1, 5);
		}
		
		solution(answers);
	}

}
