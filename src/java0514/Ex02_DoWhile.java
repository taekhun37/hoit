/*
 	Date : 2020.05.14
 	Author : taekhun 
 	Description : while문 예제3
 	Version : 1.0
 */
package java0514;

public class Ex02_DoWhile {
	public static void main(String[]args) {
		//do-while    //조건식이 참이여야 한다
		
		//while과 do-while의 차이점
		//while은 반복문 실행하기  전에 조건식 검사
		// do-while은 반복문실행
		/*
		 	 do{
		 	 
		 	 	반복할 내용
		 	 	
		 	 } while(조건식);
		 	 
		 */
		int i=1;
		do {
			System.out.println("do-while에서 i값 : " + i);
			i++;
		} while(i <=10);
		
		while(i<=10) {
			System.out.println("while에서 i갓 : " + i);
			i++;
		}
	}
}
