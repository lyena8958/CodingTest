package baekjoon_211125;

import java.util.Scanner;
//baekjoon 1145 : 적어도 대부분의 배수
//url : https://www.acmicpc.net/problem/1145

public class bj1145 {
	public static void main(String[] args) {

		int[] data = new int[5];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < data.length; i++) {
			System.out.println("자연수를 입력하세요. ");
			data[i] = sc.nextInt();
		}

		int val = 1;
		
		while(true) {
			int cnt = 0;
			
			
			for(int i = 0; i < data.length; i++) {
				
				if(val % data[i] == 0) {
					cnt++;
				}
				
			}
			
			if(3 <= cnt) {
				System.out.println(val);
				break;
			}
			val++;
		}
			

	}
}
