package programmers_211127;

import java.util.Arrays;
import java.util.Scanner;

//프로그래머스 : 코딩테스트 연습 > 해시 > 완주하지 못한 선수
//url : https://programmers.co.kr/learn/courses/30/lessons/42576#

public class pg42576 {
	public static int numException(int a, int b) {
		Scanner sc = new Scanner(System.in);
		int data;
		while(true) {
			data = sc.nextInt();

			if(data < a || b < data) {
				System.out.println("다시 입력하세요. "+a+"~"+b);
			}
			else {
				return data;
			}
		}
	}
	public static String strException(int a, int b) {
		Scanner sc = new Scanner(System.in);
		String data;
		while(true) {
			data = sc.next();

			if(data.length() < a || b < data.length()) {
				System.out.println("다시 입력하세요. "+a+"~"+b+"길이 만큼");
			}
			else {

				String[] words = data.split(" "); // 공백제거

				for(int i = 0; i < words.length; i++) { // A~z == 65~122
					int wIndex = words[i].charAt(i);

					if(! (wIndex < 65 || 122 < wIndex)) { // 영문내로 올바르게 입력했다면
						return data;
					}
				}

			}
		}
	}
	public static String solution(String[] participant, String[] completion) {

		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i;
		for(i = 0; i < completion.length; i++) {
			if(!completion[i].equals(participant[i])) {
				break;
			}
		}

		System.out.println(participant[i]);
		return participant[i];
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("참가하는 마라톤 선수 수를 입력하세요.");
		String[] p = new String[numException(1, 100000)];

		for(int i = 0; i < p.length; i++) {
			System.out.println((i+1)+"번째의 참가 선수 이름을 입력하세요.");
			p[i] = strException(1, 20);
		}


		String[] c = new String[p.length-1]; 

		for(int i = 0; i < c.length; i++) {
			System.out.println("완주한 선수를 조회할 이름을 입력하세요.");
			c[i] = strException(1, 20);
		}


		solution(p, c);
	}
}
