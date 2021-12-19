package programmers_211219;

import java.util.Scanner;

public class pg62048 {

	// 코딩테스트 연습 > Summer/Winter Coding(2019) > 멀쩡한 사각형
	// url : https://programmers.co.kr/learn/courses/30/lessons/62048
	public static int numExcep(int a, int b) {
		Scanner sc = new Scanner(System.in);
		int result;
		while(true) {
			try {
				result = sc.nextInt();

				if(result < a || b < result) {
					System.out.println(a+"이상 "+b+" 이하로 재입력");
				}else {
					break;
				}
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("정수로 재입력");
				continue;
			}
		}
		return result;

	}
	public static long solution(int w, int h) {
		long answer = w*h;
		
		// 정수범위로 인한 변수 재설정
		long W = w, H = h;
		
		// 가로 세로 길이가 같다면 
		if(W == H) {
			answer = (W * H) - W;
		}else {
			// 같지 않다면 가로, 세로 길이의 최대공약수를 구함
			long a = W, b = H, c;
			
			while(b != 0) {
				c = a % b;
				a = b;
				b = c;
			}
			
			long gcd = a;
			
			answer = (W * H) - (((W / gcd) + (H / gcd) - 1) * gcd);
		}
		System.out.println(answer);
		return answer;
	}
	public static void main(String[] args) {
		System.out.println("가로길이 입력");
		int w = numExcep(1, 100000000);
		
		System.out.println("세로길이 입력");
		int h = numExcep(1, 100000000);
		
		solution(w, h);
	}

}
