/*
		Date : 2020.05.11
		author : 권택훈
		Description : 관계연산자(relationaOperation)
		Version : 1.4
 */
     //true 참

package java0511;

public class ex05_relationaOperation {

	public static void main(String[] args) {
		// 정수형 변수 2개 선언
		int num1 = 7;
		int num2 = 2;
		
		// > , < , >= , <= , == , != 연산수행
		boolean result;
		
		result = num1 > num2;
		System.out.println("> 결과 : " + result);
		result = num1 < num2;
		System.out.println("< 결과 : " + result);
		result = num1 >= num2; 
		System.out.println(">= 결과 : " + result);
		result = num1 <= num2;
		System.out.println("<= 결과 : " + result);
		result = num1 == num2;
		System.out.println("== 결과 : " + result);
		result = num1 != num2;
		System.out.println("!= 결과 : " + result);

	}

}
