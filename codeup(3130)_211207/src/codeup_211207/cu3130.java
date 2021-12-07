package codeup_211207;

import java.util.Scanner;

public class cu3130 {
	
	// 코드업 : 3130 소들의 헤어스타일
	// url : https://www.codeup.kr/problem.php?id=3130

	// 유효성 검사 함수
	static int numExcep(int a, int b) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		while (true) {
			try {
				res = sc.nextInt();
				if (res < a || b < res) {//a미만 또는 b초과라면 재입력
					System.out.print("[입력오류] " + a + "이상 " + b + "이하로 재입력 해주세요.\n : ");
					continue;
				} 
				else { // 정상입력시 종료
					break;
				}
			}catch(Exception e) {
				sc.nextLine();
			}
		}
		return res; // 정상 입력한 num값을 리턴
	}

	public static void main(String[] args) {

		System.out.print("소의 수를 입력하세요 : ");
		int num = numExcep(1, 80000); // 소 마리 입력 -> 유효성검사 함수 호출(1이상 8만이하)


		int[] cowHi = new int[num]; // 소의 키 저장


		// 각 소의 키 입력
		for (int i = 0; i < cowHi.length; i++) {
			System.out.print((i + 1) + "번 소의 키를 입력하세요 : ");
			cowHi[i] = numExcep(1,1000000000); // 소 키입력 -> 유효성검사 함수 호출(1이상 10억이하)
		} // for문 종료

		System.out.println(); // 줄정리

		int CowCnt = 0; // 소의 총 횟수저장변수


		// 키 비교
		for (int i = 0; i < cowHi.length; i++) {
			for (int j = i+1; j < cowHi.length; j++) { // 대상의 다음부터 마지막 까지 반복
				if(cowHi[i] < cowHi[j]) { // 비교대상이 키가 더 작다면 반복문중단
					break;
				}
				CowCnt++; // 아니라면 마리수 증가
			}
		} // for문 종료

		System.out.println("소들은 총 " + CowCnt + "마리를 볼 수 있습니다!"); // 헤어확인 가능한 소마리 수 출력



	} // main 종료
}

