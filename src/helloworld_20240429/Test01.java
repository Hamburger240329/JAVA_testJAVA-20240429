package helloworld_20240429;

public class Test01 {

	public static void main(String[] args) {

		// 정수 변수 x를 선언
		int x;  // 메모리(ran)에 4byte 공간에 하나 생성됨 -> 이름이 x로 // 변수를 선언한다
		x = 10;  // 위에서 선언된 정수 변수 x에 정수값 10이 저장됨 -> x의 초기값은 10이다 -> x를 초기화했다 
		int y;
		int z;
		//  int x, y, z;  // 한번에 3개의 정수변수를 선언
		
		// int x;  // 이미 선언된 변수를 다시 선언하는 것은 불가!
		// 다시 값을 넣는 것은 된다
		x = 100;
		int a = 100;  // 정수변수 a를 선언과 동시에 100으로 초기화
		
		
		// z = a + y;

		// System.out.println(f"저의 수학점수는 {a}점입니다");
		System.out.println("저의 수학점수는 "+ a +"점 입니다");
		
		if(a >= 100) {
			System.out.println("저의 수학점수는 "+ a +"점 입니다");
			System.out.println("저의 수학점수는 "+ a +"점 입니다");
			System.out.println("저의 수학점수는 "+ a +"점 입니다");}
		else {
			System.out.println("저의 수학점수는 "+ a +"점 입니다");
			System.out.println("저의 수학점수는 "+ a +"점 입니다");
			System.out.println("저의 수학점수는 "+ a +"점 입니다");
		}
		
		char c = 'A';   // c변수에 65가 저장 -> 한 개의 문자는 ''로 묶음
//		char d = "A";	// 에러발생
		// 에러 발생 -> ""로 묶였다는 것은 문자열을 의미
		
		String f = "Korea"; // 문자열은 String(첫글자 대문자!!!)로 선언
		// 이 String 은 클레스임 - 색이 안변하고 풍선도움말(마우스 올리면 도움말 나타남)표시됨
		
		float e2 = 3.14f;  	// float 형 실수 변수는 마지막에 f를 붙임
		double e1 = 10.1; 
		long k = 10L;		// long 형 정수 변수는 마지막에 L을 붙임
		
		boolean aaa = true;  // 소문자로
		boolean bbb = false;
				
		System.out.println("큰따옴표\"\"를 찍어봅시다");
	
		
	}
//	int a = 10;  // 가능 - 안에있는 a와 동명이인임
}

