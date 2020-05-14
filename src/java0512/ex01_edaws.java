package java0512;

import java.util.Scanner;

public class ex01_edaws {
	public static void main(String[] args) {
		// 스캐너를 사용해서 국어,영어,수학 점수를 입력받아서 총점, 평균을 구하기
		 //평균점수 이용하여 등급 정하기 , 총점과 평균은 실수형으로
		Scanner sc = new Scanner(System.in); // 객체선언
		
		System.out.println("국어점수를 입력하세요");
		int Kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		int Eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		int Mat = sc.nextInt();
		
		double tot;
		double avg; 
		String grade;
		
		tot = (Kor + Eng + Mat);
		avg = tot / 3;
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);
		
		if(avg <= 100) {
			if (avg>= 90) { // 90~100
				if(avg >= 95) { //95~100
					grade = "A+";
				} else { // 90~94
					grade = "A";
				}
			} else if(avg >= 80) { // 80~89
				if(avg >= 85) { //85~89
					grade = "B+";
				} else {
					grade = "B";
				}			
			} else if(avg>= 70) { //70~79
				if(avg >=75) { //75~79
					grade = "C+";
				} else {
					grade = "C";
				}
			} else if(avg>= 60) { //60~69
				if(avg >= 65) { //65~69
					grade = "D+";
				} else {
					grade = "D";
				}
			} else {
				grade = "F";
				
			}
			
			System.out.println("당신의 학점은" + grade + "입니다");
			
		} else {
			System.out.println("입력범위를 초과했습니다.");
		}
	}		
}  