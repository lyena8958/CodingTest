package programmers_211126;

import java.util.Scanner;

// 프로그래머스 : 코딩테스트 연습 > 정렬 > K번째 수
// url : https://programmers.co.kr/learn/courses/30/lessons/42748

public class pg42748 {
	// 유효성 검사
	public static int numException(int a, int b) {
		Scanner sc = new Scanner(System.in);
		int data;
		while(true) {
			data = sc.nextInt();
			
			if(data < a || b < data) {
				System.out.println("다시 입력해 주세요.");
			}else {
				break;
				
			}
		}
		return data;
	}
	public static int[] solution(int[] array, int[][] commands) {
		
		// k번째의 데이터를 반환할 변수 answer
		int[] answer = new int[commands.length];
		
		// commands까지 반복
		for(int i = 0; i < commands.length; i++) {
			
			// i~j 자르기
			int[] data = new int[commands[i][1] - commands[i][0]+1]; // i~j까지 잘라 정렬까지해서 임시보관할 변수 data
			int index = 0;
			for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++) {
				data[index] = array[j];
				index++;
			}
			
			// 버블정렬
			for(int a = 0; a < data.length; a++) {
				
				for(int b = 0; b < data.length-1; b++) {
					if(data[b] > data[b+1]) {
						int box = data[b]; // box -> 임시보관(데이터손실방지)
						data[b] = data[b+1];
						data[b+1] = box;
					}
				}
			}
			
			// 최종적으로 정렬된 data변수를 k번째로 받는다. 
			answer[i] = data[(commands[i][2])-1];
		}
		
		// 값 확인
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
		
		// 반환
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("array 길이 지정");
		int[] array = new int[numException(1, 100)];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("array "+(i+1)+"번째 원소 입력");
			array[i] = numException(1, 100);
		}
		
		
		System.out.println("commands 길이 지정");
		int[][] commands = new int[numException(1, 50)][3];
		
		for(int c = 0; c < commands.length; c++) {
			int jcnt = 0;
			System.out.println("자를 n번째부터의 값을 입력");
			int i = sc.nextInt();
			
			System.out.println(i+"부터 ~ n번까지의 값을 입력");
			int j = sc.nextInt();
			
			System.out.println(i+"~"+j+"내 에서 가져올 n번째의 숫자를 입력");
			int k = sc.nextInt();
			
			int[] data = {i, j, k};
			commands[c] = data;
			
			jcnt++;
			
			jcnt = jcnt == 3 ? 0 : jcnt; // 원소의 길이가 3까지 이므로, 3이라면 다시 0으로 초기화
			
		}
		solution(array, commands);
		
	}

}
