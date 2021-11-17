package baekjoon_211118;

import java.util.Scanner;

// baekjoon 2439 : 별찍기
// url : https://www.acmicpc.net/problem/2439

public class bj2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int star = sc.nextInt();
		for(int i = 0; i < star; i++) {
			for(int j = i; j < i+star; j++) {
				
				if(j < star-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		/*
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < i+5; j++) {
				
				if(j < 5-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}*/
	}
}
