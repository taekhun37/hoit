/*
 	Date : 2020.05.14
 	Author : taekhun 
 	Description : while문 예제2
 	Version : 1.0
 */
package java0514;

import java.util.Scanner;

public class Ex01_WhileEx {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int account=0; //통장을 만듬 0원이 들어있다
		boolean run = true;  // while문 사용하기 위해서 run(조건변수) 선언 , true 초기화
		int menu;
		
		//while문 사용
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println(" 1.예금 ㅣ 2.출금 ㅣ 3.잔고 ㅣ 4.종료 ");
			System.out.println("----------------------------------------");
			System.out.println("선택 =>>");
			menu = sc.nextInt(); //menu 변수선언, 입력
			
			switch(menu) {
			case 1 :
				System.out.println("예금액 >>");
				//int a = sc.nextInt();
				account += sc.nextInt();
				break; //switch문 탈출
				
			case 2 :
				System.out.println("출금액 >>");
				account -= sc.nextInt();
				break;
				
			case 3 :
				System.out.println("잔고액 >>" + account);
				break;
				
			case 4 :
				run = false; // 4입력시 run값이 false로 변한다.
				break;
				
			default :
					System.out.println("다시 입력해주세요..\n");
			} //switch문 종료
			// 거짓이 될때까지 계속 반복된다
			System.out.println();
		} //
		
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
		
		
		
		
	}

}
