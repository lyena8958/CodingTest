package programmers_211218;

import java.util.Scanner;

public class pg82612 {
	public static int numExcep(int a, int b) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			try {
				num= sc.nextInt();
				if(num < a || b < num) {
					System.out.println("재입력하세요. "+a+"~"+b);
				}else {
					break;
				}
			}catch(Exception e) {
				sc.nextLine();
				continue;
			}
		}
		
		return num;
	}
	public static long solution(int price, int money, int count){
		long answer = 0;
		
		for(int i = 1; i <= count; i++) {
			answer += price * i;
		}
		
		answer = answer > money ? answer - money : 0; 
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		System.out.println("놀이기구 이용료를 입력하세요.");
		int price = numExcep(1, 2500);
		
		System.out.println("현재 가지고 있는 금액을 입력하세요.");
		int money = numExcep(1, 1000000000);
		
		System.out.println("놀이기구 이용 횟수를 입력하세요.");
		int count = numExcep(1, 2500);
		
		
		solution(price, money, count);
		
	}

}
