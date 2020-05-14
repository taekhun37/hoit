/*
		Date : 2020.05.11
		author : 권택훈
		Description : 입력(Scanner)
		Version : 1.7
 */


package java0511;

import java.util.Scanner;
//두번째
// Scanner 클래스는 java.util 패키지에 있는 입력 클래스

public class ex_08입력 {

	public static void main(String[] args) {
		// 스캐너를 사용하기 위해 스캐너 객체 선언
		//첫번째
		Scanner sc = new Scanner(System.in); //스캐너 객체 선언해주기
		Scanner scan = new Scanner(System.in); // sc / scan 둘다 써도 가능하다 
		
		String name;
		String age;
		String Address;
		
		System.out.println("printIn");
		System.out.print("print");
		System.out.println("두개의 차이점 확인하기");
		//두개의 차이점 확인하기
		//ln 줄바꿈
		
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		//세번째
		// 변수에 입력한 값을 담는다.
		
		System.out.println("나이를 입력하세요.");
		age = sc.next();
		sc.nextLine().trim();
		//trim() : 앞뒤 공백을 제거한다
		System.out.println("주소를 입력하세요.");
		Address = sc.nextLine();
		
		System.out.println("=====출력내용=====");
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 나이 : " + age);
		System.out.println("입력한 주소 : " + Address);
		
		

	}

}
