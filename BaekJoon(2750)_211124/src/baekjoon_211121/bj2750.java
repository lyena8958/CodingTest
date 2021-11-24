package baekjoon_211121;

import java.util.Scanner;

// baekjoon 2750 : 수 정렬하기
// url : https://www.acmicpc.net/problem/2750

/*
문제명 : 수 정렬하기
url : https://www.acmicpc.net/problem/2750

● 풀이 :
★디버그표 활용

1. length 를 사용자에게 입력받는다.
2. 해당 길이 만큼 배열을 생성하고, 숫자를 입력받는다.
3. "버블정렬"을 통해서 정렬을 하므로, 이중 반복문을 한다.
4. i 반복문은 길이만큼 반복을 해준다. 이때 i 인덱스는 좌측
5. j 반복문은 i+1길이만큼 반복을 해준다. 이때 j 인덱스는 우측
6. i > j index 조건식을 통해서 j가 더 값이 작으면 i의 위치에 값을 치환한다.
7. 데이터 보관을 위해 i인덱스의 값을 int box 변수에 저장해놨다가 → j에 i의값을 입력시킨다.  
*/
public class bj2750 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		
		int[] data = new int[length];
		
		for(int i = 0; i < data.length; i++) {
			System.out.println("입력");
			data[i] = sc.nextInt();
		}
		
		for(int i = 0; i < data.length; i++) {
			for(int j = i+1; j < data.length; j++) {
				if(data[j] < data[i]) {
					int box = data[i];
					data[i] = data[j];
					data[j] = box;
				}
			}
			System.out.println(data[i]);
		}
	}
}
