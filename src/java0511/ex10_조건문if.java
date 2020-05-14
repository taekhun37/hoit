/*
		Date : 2020.05.11
		author : 권택훈
		Description : 조건문(ifElse)
		Version : 1.9
 */
package java0511;

public class ex10_조건문if {

	public static void main(String[] args) {
		/*
		 		if(조건식){
		 			조건식이 참일 경우 실행
		 		} else {
		 			조건식이 거짓일 경우 실행
		 		}
		 */
		
		boolean condition = true;
		System.out.println("if문 시작");
		
		if(condition) {
			System.out.println("조건만족");
			System.out.println("condition이" + condition + "일 때");
		} else {
			System.out.println("조건불만족");
			System.out.println("condition이" + !condition + "일 때");
		}
		
		System.out.println("if문 종료");
		
		System.out.println();
		System.out.println("=====================");
		
		
		//문제.
		//나이가 8살 이상이면 학교에 갑니다 그렇지 않으면 학교에 가지 않는다
		
		int num3=10 , num4=8;
		if (num3 > num4) {
			System.out.println("학교에 갑니다");
		} else {
			System.out.println("학교에 가지 않는다");
		}
		

	}

}
