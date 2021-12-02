package codeup_211202;

import java.util.Scanner;

public class cu1409 {

	// 코드업 : 기억력 테스트1
	// url : https://codeup.kr/problem.php?id=1409

	// 유효성검사 함수
	static int numCheck(int a, int b) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		while (true) { // 정상입력 할 때까지 반복
			result = sc.nextInt();

			try {
				if (result < a || b < result) { // a이상 b이하 값이 아니라면 재입력
					System.out.println("[입력오류] "+a+"~"+b+" 숫자 범위에 벗어났습니다. 다시 입력하세요.  ");
					continue;
					// 값 재비교를 위해 반복문 첫부분 이동
				}
			}
			catch(Exception e) {
				sc.nextLine();
				continue;
			}
			break; // 정상입력 했다면 종료
		}
		return result; // 올바른 값을 리턴
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int H = 50; // 유효성검사 -> 최대값
		final int L = 1; // 유효성검사 -> 최소값
		
		System.out.print("나열할 숫자의 개수를 입력하세요 ");
		
		// 나열 개수입력
		int num = numCheck(L, H);
		
		int[] numArr = new int[num]; // 숫자 n개 저장배열
		
		// 배열(numArr) 초기화
		for(int i = 0; i < numArr.length; i++) { 
			numArr[i] = num-i; // 숫자 역순부터 값 저장(ex 10~1)
			System.out.print(numArr[i]+" ");
		}
		
		System.out.println("\n"); // 줄정리
		
		System.out.print("몇번째 숫자를 찾으시겠습니까? ");
		int ans; // 검색숫자입력
		ans = numCheck(L, num); // 유효성검사 함수호출 (1이상 num이하)
		
		System.out.println("찾으시는 위치의 숫자는 "+numArr[ans-1]+"입니다!!");
		// 검증된 숫자를 출력


	}

}
