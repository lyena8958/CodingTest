package programmers_211204;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class pg17681 {

	// 프로그래머스 : 코딩테스트 연습 > 2018 KAKAO BLIND RECRUITMENT > [1차] 비밀지도
	// url : https://programmers.co.kr/learn/courses/30/lessons/17681


	public static int numExcep(int a, int b) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		while(true) {
			try {
				res = sc.nextInt();
			}catch(Exception e) {
				System.out.println(e);
				continue;
			}
			if(a <= res && res <= b) {
				break;
			}
		}

		return res;
	}
	public static int[] binaryData(int n, int data) {
		Long binary = Long.parseLong(Long.toBinaryString(data));
		int[] res = new int[n];
		int[] box = Stream.of(String.valueOf(binary).split("")).mapToInt(Integer::parseInt).toArray();

		int index = 0;
		for(int i = box.length; i < n; i++) {
			res[index] = 0;
			index++;
		}
		
		for(int i = 0; i < box.length; i++) {
			res[index] = box[i];
			index++;
		}

		return res;
	}
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for(int i = 0; i < n; i++) {

			int[] binary1 = binaryData(n, arr1[i]);
			int[] binary2 = binaryData(n, arr2[i]);		
			System.out.println("binary1 "+Arrays.toString(binary1));
			System.out.println("binary2 "+Arrays.toString(binary2));
			String row = "";
			for(int j = 0; j < n; j++) {
				if(binary1[j] == 1 || binary2[j] == 1) {
					row += "#";
				}else {
					row += " ";
				}
			}
			System.out.println(row);
			answer[i] = row;

		}

		return answer;
	}
	public static void main(String[] args) {
		System.out.println("정사각형의 한 변의 길이를 입력하세요. (1이상 16이하)");

		int length = numExcep(1, 16);

		int[] arr1 = new int[length];
		int[] arr2 = new int[length];

		// Math.pow : 제곱 (대상숫자, 지수) ex) 5,2 == 25s
		for(int i = 0; i < length; i++) {
			System.out.println("arr1의 "+(i+1)+"번 행의 값을 입력하세요.");
			arr1[i] = numExcep(0, (int)Math.pow(2, length));

		}


		for(int i = 0; i < length; i++) {
			System.out.println("arr2의 "+(i+1)+"번 행의 값을 입력하세요.");
			arr2[i] = numExcep(0, (int)Math.pow(2, length));
		}


		solution(length, arr1, arr2);

	}

}
