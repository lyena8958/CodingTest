package baekjoon_211119;

import java.util.Scanner;

//success
// baekjoon 2438 : 별찍기
// url : https://www.acmicpc.net/problem/2438

/*
문제명 : 별찍기
url : https://www.acmicpc.net/problem/2438

● 풀이 :
★디버그표 활용

1. 열, 행 출력의 길이인 star를 사용자에게 입력받는다.
2. 열인 i 반복문은 0부터 star까지 반복한다.
3. 행인 j 반복문은  0부터 i까지 반복하며, 별을 출력한다. (0부터 n+1씩 증가하므로)
4. j반복문이 마치면 다음 열을 출력해야하므로 줄 바꿈을 해준다.
*/
public class bj2438 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();
		
		for(int i = 0; i < star; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
