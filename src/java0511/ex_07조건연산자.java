/*
		Date : 2020.05.11
		author : 권택훈
		Description : 조건연산자(cinditionalOperation)
		Version : 1.6
 */


package java0511;

public class ex_07조건연산자 {

	public static void main(String[] args) {
		// 삼항연산자
		//(조건식) ? 참일때 값 : 거짓일때 값 ;
		int inAge = 35;
		int hoonAge = 50;
		
		char resultChar;
		int resultInt;
		String resultStr;
		
		// (조건식) ? 참일때 값 : 거짓일때 값 ;  ※이해안감
		resultChar = (inAge < hoonAge) ? '0' : 'X' ;
		
		resultInt = (inAge < hoonAge) ? 0 : 1 ;
		
		resultStr = (inAge < hoonAge) ? "참일경우" : "거짓일경우";
		
		System.out.println("resltChar : " + resultChar);
		System.out.println("resltInt : " + resultInt);
		System.out.println("resltStr : " + resultStr);
		
		//문제
		//조건연산자를 사용하여 10이 짝수인 경우에는 true, 홀수인 경우에는 false 출력하는 조건연산자를 작성하시오
		
		int num = 10;
		
		boolean resultEven;
		// (조건식) ? 참일때 값 : 거짓일때 값 ; 
		resultEven = (num % 2 == 0) ? true : false;
		System.out.println(" 결과 : " + resultEven);
	}

}
