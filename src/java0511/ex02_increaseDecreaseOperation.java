/*
		Date : 2020.05.11
		author : 권택훈
		Description : 증감연산자(increaseDecreaseOperation)
		Version : 1.2
 */

package java0511;

public class ex02_increaseDecreaseOperation {

	public static void main(String[] args) {
		// 증감연산자는 단항연산자에 포함
		// 증가와 감소연산이다( ++ , -- )
		// ++num : num이 가지고 있는 값에 1을 증가한 뒤에 연산에 적용
		//num++ : num이 가지고 있는 값을 연산에 적용한 뒤 1을 증가
		
		int num = 5;
		System.out.println("num 값 : " + num);
		
		++num;
		System.out.println("++num 값 : " + num);
		
		num++;
		System.out.println("num++ 값 :" + num);
		
		int num1 = 5;
		int result1;
		
		result1 = ++num1;
		System.out.println("++num1 result1 : " + result1);
		// result1 = ++num1;
		// num1 = num1 + 1;
		// result1 = num1;
		
		result1 = num++;
		System.out.println("num1++ result1 : " + result1);
		// result1 = num1==;
		// result1 = num1;
		// num1 = num1 + 1;
		
		// example
		
		int num2 = 10;
		--num2;
		System.out.println(num2);   // 9 ??
		// num2 = num2 - 1;
		// num2 = 10 - 1;
		// num2 = 9;
		
		int result2;
		result2 = --num2;
		System.out.println(result2);  // 8 ??
		// result2 = --num2;
		// num2 = num2 - 1;
		// num2 = 9 - 1;
		// result2 = num2;
		// result2 = 8;
		
		result2 = num2--;
		System.out.println(result2); // 8
		// resuit2 = num2--;
		// result2 = num2;
		// result2 = 8;
		// num2 = num2 - 1;
		// num2 = 8 - 1;
		
		// example
		int result3; 
		System.out.println("num1="+num1);  //6
		System.out.println("num2="+num2);  //7
		result3 = ++num1 + ++num2; //(6+1)+(7+1)
		System.out.println("result3="+ result3);
		System.out.println(num1);
		System.out.println(num2);
		
		int result4;
		result4 = num1++ + num2++; // 7   +  8 
		System.out.println("result4=" + result4);
		System.out.println(num1);  // 8
		System.out.println(num2);  // 9
		
		int result5;
		result5 = ++num1 + num2++;  // 8    9
		System.out.println("result5=" + result5);
		System.out.println(num1);  //9
		System.out.println(num2);  //10
		System.out.println(++num1 + num2++);  
		 //num1=10 num2=11
		// ++ 앞에 있으면 num1 + num2를 1씩더하고 연산한다
		// ++ 뒤에 있으면 num1 + num2를 먼저 더하고 각자 1씩 더해준다
		// ++ 뒤에 있으면 나중에 연산이 끝나고 1식 플러스다
		
		//System.out.println("num1");  //  17
		//System.out.println("num2");  // 
		
		//
		
		result3 = num1++ + num2++;
		//num1			//8 
		// +
		//num2			//8
		//=
		// result     		//16
		//num1 = num1 + 1;     //9
		//num2 = num2 + 1;     //9
		
		
		result3 = num1++ + ++num2;
		result3 = ++num1 + num2++;
		// num1 = num1 = 1		/11
		// +
		// num2						//10
		// =
		//result
		
		
		int num3 = 5;
		int num4 = 11;
		int result6;
		result6 = ++num3 + --num4; //6 + 10
		System.out.println("result6 : " + result6);
		System.out.println(num3);  //6
		System.out.println(num4);  //10
		System.out.println(++num3 + --num4 );
		int result7;
		result7 = num4++ - num3--;  // 10     6    // 10 - 6  = 4
		System.out.println(+ num4++ - num3-- + "result7 : ");
		System.out.println(num4);  //11
		System.out.println(num3); //5
		System.out.println(num4 ++ - num3--);
		int result8;
		result8 = num3++ - ++num4;
		         //  5                 11
		  // 5 - 12  = -7
		  // num3 = 6
		  // num4 = 12
		
		
	}

}
