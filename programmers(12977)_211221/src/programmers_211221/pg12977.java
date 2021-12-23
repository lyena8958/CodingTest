package programmers_211221;

import java.util.Scanner;

public class pg12977 {

	// 코딩테스트 연습 > Summer/Winter Coding(~2018) > 소수 만들기
	// https://programmers.co.kr/learn/courses/30/lessons/12977

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
	public static int solution(int[] nums) {
		
		// 소수cnt 변수
		int answer = 0;
		
		for(int a = 0; a < nums.length; a++) {
			
			for(int b = a+1; b < nums.length; b++) {
				
				for(int c = b+1; c < nums.length; c++) {
					int box = nums[a] + nums[b] + nums[c];
					boolean flag = true;
					for(int d = 2; d < box; d++) {
						if(box%d == 0) {
							flag = false;
							break;
						}
					}
					if(flag) {
						answer ++;
					}
				}
			}
		}

		return answer;
		
	}
	public static void main(String[] args) {
		System.out.println("배열의 길이를 입력하세요. 3~50");
		int[] nums = new int[numExcep(3, 50)];

		// 배열 값 입력
		for(int i = 0; i < nums.length; i++) {
			System.out.println((i+1)+"번째 정수를 입력하세요.");
			int box = numExcep(1, 1000);

			// 입력한 숫자 중복 유효성검사 처리
			for(int j = 0; j < nums.length; j++) {
				if(box == nums[j]) {
					System.out.println("중복된 값이 있습니다. 다시 입력하세요");
					box = numExcep(1, 1000);
					j = 0; // 초기화
				}
			}
			nums[i] = box; // 내부 반복문에서 유효성검사 처리 후, index에 입력값 대입
		}

		// 함수 호출
		solution(nums);
	}

}
