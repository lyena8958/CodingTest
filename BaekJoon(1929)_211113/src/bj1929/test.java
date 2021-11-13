package bj1929;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// baekjoon - 1929번 (소수 구하기)
		// https://www.acmicpc.net/problem/1929
		
		Scanner sc = new Scanner(System.in);

		System.out.println("자연수 M~N 사이의 소수 출력 프로그램입니다.\n");

		System.out.println("먼저 첫 자를 입력해 주세요.");
		int m = sc.nextInt();

		System.out.println("\n입력이 완료되었습니다. 다음 두 번째 자를 입력해 주세요.");
		int n = sc.nextInt();

		for(int i = m; i <= n; i++) {
			int cnt = 0;
			
			for(int j = 1; j <= n; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			
			if(cnt == 2) {
				System.out.println(i);
			}
		}


	}
}
