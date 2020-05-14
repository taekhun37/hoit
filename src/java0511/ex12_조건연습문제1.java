package java0511;

import java.util.Scanner;

public class ex12_조건연습문제1 {

	public static void main(String[] args) {
		//// 문제. 성적출력 예제
		// 점수를 입력받아서 90점이상이면 "A학점입니다"
		// A : 90~100
		// B : 80~89
		// C : 70~79
		// D : 60~69
		// F : 60미만
		
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("점수를 입력하세요 : ");
		num1 = sc.nextInt();
			
		if (num1 >= 90){
			System.out.println("A학점입니다");
		} else if (num1 >= 80){
			System.out.println("B학점입니다");
		} else if (num1 >= 70){
			System.out.println("C학점입니다");
		} else if (num1 >= 60){
			System.out.println("D학점입니다");
		} else {
			System.out.println("F학점입니다");
		}
		
		
		

	}

}
