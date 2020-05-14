/*
 	Date : 2020.05.14
 	Author : taekhun 
 	Description : do-while 예제
 	Version : 1.0
 */
package java0514;

import java.util.Scanner;

public class Ex03_DoWhile {
	public static void main(String[] args) {
		int answer = (int)(Math.random() *45) + 1; //랜덤 메소드를 이용하기
		int input = 0;  
		int count = 0;
		
		boolean run = true; //run이란 변수에 true라는 것을 알려줌
		
		Scanner sc = new Scanner(System.in); //객체선언
		System.out.println("Up & Down Game시작!");
		
		do {
			System.out.println("1부터 45까지 숫자를 말하세요!");
			input = sc.nextInt();
			count++; // 1씩증가(??)
			
			if(answer > input) {  // 1~45 사이에 있는 숫자보다 0이 클때
				System.out.println("Up! 더 큰수를 말하세요!");  //이 문장이 나옴
			} else if(answer < input) {  // 1~45사이에 있는 숫자보다 0이 작을때
				System.out.println("Down! 더 작은수를 말하세요!"); // 저 문장이 나옴
			} else { //answer = input 와 같을때
				System.out.println("정답은" + answer + "입니다!"); // 이런 문장이 나옴
				System.out.println("시도한 횟수는" + count + "번 입니다."); // 이런 문장이 나옴
				 run = false; // run이 false가 들어가서 더이상 반복이 되지 않고 끝남
			}
		
				
				
			
			
		}while(run) ;
			if(count >= 3); {
				System.out.println("3번안에 못맞추셨으니 벌칙입니다!");	
			}
				
		    
		
			}
}
 
