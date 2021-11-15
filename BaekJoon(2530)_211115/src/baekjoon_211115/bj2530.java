package baekjoon_211115;

import java.util.Scanner;

//baekjoon 2530 : 인공지능 시계
//https://www.acmicpc.net/problem/2530

public class bj2530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("인공지능 오븐을 시작합니다.");
		System.out.println("현재시각 시,분,초 를 입력해 주세요.");

		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		System.out.println("조리할 시간을 입력해 주세요.");
		
		int c = sc.nextInt();
		
		s += c;
		
		m += (s/60);
		s %= 60;
		
		h += (m/60);
		m %= 60;
		
		h %= 24;
		
		System.out.println(h+" "+m+" "+s);
		
		/*s += c;
		
		if(60 <= s) {
			int i = s/60;
			s = s%60;
			m += i;
			
		}
		System.out.println("1. "+h+" "+m+" "+s);
		if(60 <= m) {
			int i = m/60;
			m = m%60;
			h += i;
			
		}
		System.out.println("2. "+h+" "+m+" "+s);
		h = 24 <= h ? h-24 : h;
		
		System.out.println(h+" "+m+" "+s);*/
		
	/*	int[] now = new int[3];
		int[] timeLimit = {24, 60, 60}; // 시,분,초 입력 제한

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

		for(int i = now.length-1; 0 < i; i--) {
			System.out.println("1. "+i);
			for(int j = now[i]-60; 0 <= j; j -= 60) {

				if(!(now[i] < 0) && timeLimit[i] <= now[i]) {

					now[i] = j;
					now[i-1]++;
					System.out.println("2. "+i+" : "+now[i]);

				}
			}

		}

		now[0] = 24 <= now[0] ? now[0] - timeLimit[0]  : now[0]; 
		
		for(int i = 0; i < now.length; i++) {
			System.out.print(now[i]+ " ");
		}*/

	}
}
