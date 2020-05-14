/*
		Date : 2020.05.11
		author : 권택훈
		Description : 계산기(Calculator)
		Version : 1.8
 */

package java0511;

import java.util.Scanner; 

public class ex09_계산기 {

	public static void main(String[] args) {
		// 두개의 정수를 입력받아서 결과를 출력해보자
		
		int num1;
		int num2;
		double result;
		
		Scanner sc = new Scanner(System.in); // 객체선언
		//세번째 입력한 값을 지정해주기
		System.out.println("첫번째 숫자를 입력 : ");
		num1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력 : ");
		num2 = sc.nextInt();
		
		// + , - , x , / , %
		result = num1 + num2;
		System.out.println("덧셈결과 : " + result);
		result = num1 - num2;
		System.out.println("뺄셈결과 : " + result);
		result = num1 * num2;
		System.out.println("곱셈결과 : " + result);
		result =  (double) num1 / num2; // (double)
		System.out.println("나눗셈결과 : " + result);
		result = num1 % num2;
		System.out.println("나머지결과 : " + result);
		
		
		
		
	}

}
