package programmers_211130;

import java.util.Arrays;
import java.util.Scanner;

//프로그래머스 : 코딩테스트 연습 > 탐욕법 > 체육복
//url : https://programmers.co.kr/learn/courses/30/lessons/42862#

public class pg42862 {
	public static int numExcep(int a, int b) {
		int result = 0;

		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				result = sc.nextInt();
				if(result < a || b < result) {
					System.out.println("재입력");
					continue;
				}
				else {
					break;
				}
			}
			catch(Exception e) {
				sc.nextLine();
				continue;
			}

		}

		return result;
	}
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1; 
                    break; 
                }
            }
        }
        // 도난당한 학생에게 체육복 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1; 
                    break; 
                }
            }
        }
        return answer;

	}
	public static void main(String[] args) {
		System.out.println("전체 학생의 수를 입력");
		int n = numExcep(2, 30);

		System.out.println("체육복을 도난당한 학생 수를 입력");
		int[] lost = new int[numExcep(1, n)];
		for(int i = 0; i < lost.length; i++) {
			System.out.println((i+1)+"번째 도난 학생의 학번 입력");
			lost[i] = numExcep(1, 100);
		}

		System.out.println("여벌의 체육복을 가진 학생 수를 입력");
		int[] reserve = new int[numExcep(1, n)];
		for(int i = 0; i < reserve.length; i++) {
			System.out.println((i+1)+"번째 여벌 체육복 학생의 학번 입력");
			reserve[i] = numExcep(1, 100);
		}

		solution(n, lost, reserve);
	}
}
