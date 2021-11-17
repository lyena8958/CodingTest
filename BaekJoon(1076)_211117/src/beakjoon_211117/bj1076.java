package beakjoon_211117;

import java.util.Scanner;

// beakjoon 1076 : 저항
// url : https://www.acmicpc.net/problem/1076

public class bj1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long color[] = new long[3];

		for(int i = 0; i < color.length; i++) {
			System.out.println("-------------------------");
			System.out.println("컬러를 입력하세요. 색-값-곱");
			System.out.println("black 0 1");
			System.out.println("brown 1 10");
			System.out.println("red 2 100");
			System.out.println("orange 3 1,000");
			System.out.println("yellow 4 10,000");
			System.out.println("green 5 100,000");
			System.out.println("blue 6 1,000,000");
			System.out.println("violet 7 10,000,000");
			System.out.println("grey 8 100,000,000");
			System.out.println("white 9 1000,000,000\n");

			String sel = sc.next();
			int val = 0;
			
			switch(sel) {
			case "black" : 
				val = 0;
				break;
			case "brown" :
				val = 1;
				break;
			case "red" :
				val = 2;
				break;
			case "orange" :
				val = 3;
				break;
			case "yellow" :
				val = 4;
				break;
			case "green" :
				val = 5;
				break;
			case "blue" :
				val = 6;
				break;
			case "violet" :
				val = 7;
				break;
			case "grey" :
				val = 8;
				break;
			case "white" :
				val = 9;
				break;
			}
			color[i] = val;

		}

		color[color.length-1] = (int) Math.pow(10, color[color.length-1]);
		String i = Long.toString(color[0])+Long.toString(color[1]);

		System.out.println(Integer.parseInt(i)*color[2]);


	}
}
