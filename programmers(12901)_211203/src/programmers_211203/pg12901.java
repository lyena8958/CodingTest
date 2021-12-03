package programmers_211203;

import java.util.Scanner;

// 프로그래머스 : 코딩테스트 연습 > 연습문제 > 2016년
// url : https://programmers.co.kr/learn/courses/30/lessons/12901

public class pg12901 {
	public static int[] dateExcep() {
		Scanner sc = new Scanner(System.in);
		
		int date[] = new int[2];
		
		
		while(true) {
			try {
				System.out.println("달(month) 입력");
				date[0] = sc.nextInt();
				System.out.println("일(day) 입력");
				date[1] = sc.nextInt();
			}catch(Exception e) {
				System.out.println(e);
				sc.nextLine();
				continue;
			}
			
			int dayRes;
			
			switch(date[0]) {
			case 4 : case 6 : case 9 : case 11 :
				dayRes = 30;
				break;
			case 2 :
				dayRes = 29;
				break;
			default :
				dayRes = 31;
				break;
			}
			if(date[1] <= dayRes) {
				break;
			}
			
			System.out.println("\n월에 맞게 다시 일자를 입력하세요.\n\n");
		}
		return date;
	}
	public static String solution(int a, int b) {
		String[] day = {"SUN", "MON", "TUE", "WED", "THU","FRI", "SAT"};
		String answer = "";
		
		int daySum = 0;
		
		for(int i = 1; i < a; i++) {// 현재 월 이전까지 모든 일수를 합함
			if(i == 4 || i == 6 || i == 9 || i == 11) {
				daySum += 30;
			}else if(i == 2) {
				daySum += 29;
			}else {
				daySum += 31;
			}
		}
		daySum += b; // 현재 월의 일수를 합함
		System.out.println(daySum);
		
		daySum %= 7; // 일주일 일수의 나머지를 구함
		
		// 1월 1일이 금요일부터 시작이 되고 (금, 토 = 2)
		// 현실숫자에서 index로 변환을 위해 = 1
		//   3만큼 차감 후, 요일을 반환 / 만일, index초과가 된다면 +4
		answer = day[daySum-3 < 0 ? daySum+4 : daySum-3];
		System.out.println(answer);
		return answer;
		
	}
	public static void main(String[] args) {
		int[] date = dateExcep();
		
		solution(date[0], date[1]);
	}
}

