package codeup_211209;

import java.util.Random;
import java.util.Scanner;

//코드업 : 2633 Lower Bound
//url : https://www.codeup.kr/problem.php?id=2633

public class cu2633 {
	static int numCheck(int a, int b) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		while (true) {
			try {
				res = sc.nextInt();
				if (res < a || b < res) { // a이상 b이하가 아니라면 재입력
					System.out.print(a + "이상 " + b + "이하로 재입력해주세요 : ");
					continue;
				}
				break; // 정상입력시 반복문종료
			}
			catch(Exception e) {
				System.out.println();
				continue;
			}
		}
		return res; // 정상입력한 값 리턴
	}

	public static void main(String[] args) {
		// [정답 ver]
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[sc.nextInt()]; 
		int search = sc.nextInt();

		//  랜덤값 저장
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();
		}

		
		if (numArr[numArr.length - 1] < search) { // 배열 내부의 최대값을 초과한다면 num+1 출력
			System.out.println((numArr.length + 1));
		} 
		else { // 초과하지 않다면
			// 입력한search 숫자찾기!
		// 입력한search 숫자찾기!
			for (int i = 0; i < numArr.length; i++) {
				if (search <= numArr[i]) { // 찾는 값이 있다면 출력 후 종료
					System.out.println((i + 1));
					break;
				}
			}
		}

		// [세부 코드 ver (버블정렬 / 정렬배열 출력)]
		/* 
		Random rand = new Random();
		
		System.out.print("배열의 길이 입력해주세요 : ");
		int[] numArr = new int[numCheck(1, 50)]; // 집합개수만큼 저장할 배열

		System.out.print("검색 숫자를 입력해주세요 : ");
		int search = numCheck(1, 50); // 유효성검사 함수 호출! (1이상~50이하)		

		//  랜덤값 저장
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = numCheck(1, 50); // 집합개수만큼 저장할 배열
		}

		// 오름차순 정렬(버블정렬)
		for (int i = 0; i < numArr.length - 1; i++) {
			for (int j = 0; j < numArr.length - 1; j++) {
				if (numArr[j] > numArr[j+1]) { // 대상보다 비교대상이 더 작다면 교환->오름차순 정렬
					int tmp = numArr[j]; // 교환
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
				}
			}
		}

		// 정렬된 배열 숫자출력
		System.out.print("[ ");
		for (int v: numArr) {
			System.out.print(v + " ");
		}
		System.out.println("]");

		if (numArr[numArr.length - 1] < search) { // 배열 내부의 최대값을 초과한다면 num+1 출력
			System.out.println((numArr.length + 1));
		} 
		else { // 초과하지 않다면
			// 입력한search 숫자찾기!
			for (int i = 0; i < numArr.length; i++) {
				if (search <= numArr[i]) { // 찾는 값이 있다면 출력 후 종료
					System.out.println((i + 1));
					break;
				}
			}
		}

*/
	}

}
