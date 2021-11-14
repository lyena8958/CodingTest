package baekjoon_211114;

import java.util.Scanner;

//baekjoon 2530 : 인공지능 시계
//https://www.acmicpc.net/problem/2530

public class bj2530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("인공지능 오븐을 시작합니다.");
		System.out.println("현재시각 시,분,초 를 입력해 주세요.");
		
		int[] now = new int[3];
		int[] timeLimit = {23, 60, 60}; // 시,분,초 입력 제한
		
		for(int i = 0; i < now.length; i++) {
			now[i] = sc.nextInt();
			
			if(now[i] < 0  || timeLimit[i] < now[i]) { // 유효성 검사
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. "+timeLimit[i]+" 내 입력");
				i--;
			}
		}
		
		System.out.println("\n현재 시간 입력이 완료되었습니다.");
		System.out.println("조리할 시간을 입력해 주세요.");
		
		now[2] += sc.nextInt();
		
		for(int i = now.length-1; 0 <= i; i--) {
			for(int j = now[i]; timeLimit[i] > j;) {
				if(timeLimit[i] > now[i]) {
					now[i] /= 60;
					now[i-1]++;
					j-=60;
				}
			}
		}
		
		for(int i = 0; i < now.length; i++) {
			System.out.print(now[i]+ " ");
		}
		
	}
}
