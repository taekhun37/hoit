package java0512;

public class ex08_loopFor {
	public static void main(String[] args) {
		// 안녕하세요 10번 출력하기
		
		//System.out.println("안녕하세요");
		
		//반복문 for
		/*
		  	for(초기화식; 조건식; 증감식){
		  		반복할 수행문
		  	}
		  	
		  */   
		// 시작값,언제까지 할거냐,대입하고 계산
		int i;
		
		for (i=1; i<=10; i++) {
	//		System.out.println(i + "안녕하세요.");
		}
		System.out.println("반복문 이후 i값 : " + i);
		
		//1부터 10까지의 합을 출력!
		int sum =0;
		
		for (i=1; i <=10; i++) {
			sum += i;  sum=sum+i;
			sum = sum + i;
			// 1 = 0 + 1
			// 3 = 1 + 2
			// 6 = 3 + 3
			//10 =6 + 4
			// 15 = 10 + 5
			System.out.print("i ;" + i + "\t=>> ");
			System.out.println("\tsum : " + sum);
		}
		System.out.println("1부터 10까지의 합은 : " + sum);
		
		
		
	}
}
