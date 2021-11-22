package baekjoon_211120;

import java.util.Scanner;

//success
// baekjoon 10871 : X보다 작은 수
// url : https://www.acmicpc.net/problem/10871

/*
문제명 : X보다 작은 수
url : https://www.acmicpc.net/problem/10871

● 풀이 :
★디버그표 활용

1. 수열의 길이인 n과, 기준 수인 x를 사용자에게 입력받는다.
2. n만큼 반복문을 반복한다.
3. 수열을 사용자에게 입력받고, x보다 값이 작으면 출력을 한다. (이때, 공백을 구분하므로 띄어쓰기 포함하여 출력한다.)
*/
public class bj10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
	
		for(int i = 0; i < n; i++) {
			int val = sc.nextInt();
			if(val < x) {
				System.out.print(val+" ");
			}
		}
	
		
	}
}
