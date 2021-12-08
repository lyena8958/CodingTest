package codeup_211208;

import java.util.Scanner;

public class cu1367 {
	// 유효성 검사 함수
	static int numCheck(int a, int b) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		while (true) {
			try {
				if (res < a || b < res) { // a~b 값이 아니라면 다시입력
					System.out.println(a + "이상 " + b + "이하의 숫자를 다시 입력해주세요!");
					res = sc.nextInt();
					continue; 
				}

				break; // 올바르게 입력했다면 반복문 종료
			}
			catch(Exception e) {
				sc.nextLine();
				continue;
			}
		} // while 종료
		return res; // 맞게 입력한 값을 리턴 
	}
	public static void main(String[] args) {

		System.out.println("평행사변형 출력 프로그램 입니다!! :)");
		System.out.println("출력될 칸 수를 입력하세요.");

		int num = numCheck(2, 99); // 입력받을 칸(행) 수 -> 유효성 검사 함수호출(2이상 99이하)

		for (int i = num; i > 0; i--) { // 행 (입력 값부터 ~ 1까지)
			for (int j = i + num-1; j > 0; j--) { // 열 (i + 입력값-1부터 ~ 1까지)
				if (j > num) { // j보다 num이 더 작다면 칸띄움
					System.out.print(" ");
				} else { // 아니라면 별찍음
					System.out.print("*");
				}
			} 
			System.out.println(); // 다음 행 -> 줄바꿈
		}//for종료

	} // main 종료
}

