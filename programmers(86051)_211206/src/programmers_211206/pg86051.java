package programmers_211206;

import java.util.Arrays;
import java.util.Scanner;

// 프로그래머스 : 코딩테스트 연습 > 월간 코드 챌린지 시즌 3 > 없는 숫자 더하기
// url : https://programmers.co.kr/learn/courses/30/lessons/86051

public class pg86051 {
	public static int numExcep(int a, int b) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		
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
	public static int solution(int[] numbers) {
		int answer = 0;
		
		Arrays.sort(numbers);
		// 0 4 5 6 7 8 9
		for(int i = 0; i <= 9; i++) {
			boolean flag = true;
			for(int j = 0; j < numbers.length; j++) {
				if(i == numbers[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				answer += i;
			}
		}
		System.out.println(answer);
		return answer;
		
	}
	public static void main(String[] args) {

		System.out.println("배열의 길이를 입력하세요");
		int[] numbers = new int[numExcep(1, 9)];
		
		// 길이만큼 정수입력
		for(int i = 0; i < numbers.length; i++) {
			System.out.println((i+1)+"번째 정수 입력하세요.");
			int box = numExcep(0, 9);
			boolean flag = true;
			
			// 중복입력 체크
			for(int j = 0; j < i; j++) {
				if(box == numbers[j]) {
					System.out.println("중복된 값은 입력이 불가합니다. 다시 입력해 주세요.");
					box = numExcep(0, 9);
					j--;
					flag = false;
				}else {
					flag = true;
				}
			}
			if(flag) {
				numbers[i] = box;
			}
		}
		
		solution(numbers);
	}
}
