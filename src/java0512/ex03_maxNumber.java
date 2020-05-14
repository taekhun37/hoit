/*
		Date : 2020.05.12
		author : 권택훈
		Description : 
		Version : 1.8
 */
package java0512;

import java.util.Scanner;

public class ex03_maxNumber {
	public static void main(String[] arge) {
		// 두수를 입력받아 클수를 출력하기
		Scanner sc = new Scanner(System.in);

//		int num1 , num2 , max;
//		
//		System.out.println("첫번째 숫자 >>");
//		num1 = sc.nextInt();
//		System.out.println("두번째 숫자 >>");
//		num2 = sc.nextInt();
//		
//		if(num1 > num2) {
//			max = num1;
//		} else {
//			max = num2;
//		}
//		
//		System.out.println("최댓값 : " + max);

		// 숫자 3개를 입력받아서 최댓값 구하기

		int num1, num2, num3, max;

		System.out.println("첫번째 숫자 >>");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자 >>");
		num2 = sc.nextInt();
		System.out.println("세번째 숫자 >>");
		num3 = sc.nextInt();
		
		

//		if (num1 > num2) {
//			if (num1 > num3) {
//				max = num1;
//			} else {
//				max = num3;
//			}
//		} else if (num2 > num3) {
//			max = num2;
//		} else {
//			max = num3;
//		}
//		System.out.println("최대값 : " + max);
		
		
		
			if(num1 > num2 && num1 > num3) {
				max = num1;;
			} else if(num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
			System.out.println("최대값 : " + max);
			
			//최대값,중간값,최소값
	}
}
