package com.kh.array;

import java.util.Scanner;

public class A_Array {

	/*
	 * 변수: 하나의 공간에 하나의 값을 담을 수 있음
	 * 배열: 하나의 공간에 여러개의 값을 담을 수 있는 개념
	 * 		"같은 자료형의 값"으로만 담을 수 있음
	 * 		정확히 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김(인덱스는 0부터 시작!)
	 */
	
	
	
	
	
	public void method1() {
		
		// 배열을 왜 쓰는지
		
		// 변수만 이용하면 => 대량의 데이터들을 보관하고자 할 때 각각의 변수를 만들어서 따로 관리해야 함.
		/*
		int num1 = 0;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		int sum = num1 + num2 + num3 + num4 + num5;
		*/
		
		/*
		 * 1. 배열 선언(여러 개의 값들을 보관할 배열을 만들겠다!)
		 * 		자료형 배열명[];
		 * 		자료형[] 배열명;
		 */
		
		// int a; //변수선언
		
		//int arr[];
		//int[] arr;
		 
		/*
		 * 2. 배열 할당(이 배열에 몇 개의 값들을 보관할 것인지 크기 지정하는 과정, 그 갯수만큼의 방이 만들어짐)
		 * 		배열명 = new 자료형[배열크기];
		 * 
		 */
		// arr = new int[5];
		// *** 배열 선언과 동시에 할당 (배열 만듦과 동시에 크기 지정)
		int[] arr = new int[5];
		
		/*
		 * 3. 값 대입
		 * 		배열[인덱스] = 값;
		 * 
		 */
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// 배열 장점: 반복문 활용 가능!!
		for(int i=0; i<5; i++) {
			arr[i] = i;
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); // 실제 arr이라는 박스에는 "주소값"이라는 것이 담겨 있음 => 이상한 문구가 출력됨
		
	}
	
	public void method2() {
		
		int i = 10;
		
		int[] iArr = new int[5];
		
		System.out.println(iArr);
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		
		/*
		 * 실제 리터럴 값을 곧바로 담을 수 있는 변수를 일반 변수라고 하고,
		 * 주소값을 담고 있는 변수는 참조형 변수(레퍼런스 변수)라고 한다.
		 * 
		 * 기본자료형(boolean, char, byte, short, int , long, float, double)으로 선언된 변수
		 * => 실제 리터럴값을 바로 담는 변수 => 그냥 일반 변수
		 * 
		 * 그 외 자료형(int[], double[], char[], short[], .. , String, Scanner,..)으로 선언된 변수
		 * => 주소값을 담는 변수 => 참조변수(레퍼런스 변수)
		 * 
		 */
	
	}
	
	public void method3() {
		
		int[]iArr = new int[3]; // 0~2번 인덱스
		double[] dArr = new double[4]; //0~3번 인덱스
		// 배열 선언하고 크기지정(할당)까지만 한 상태
		// 그럼 각각의 인덱스에 초기화가 되어 있을까?
		
		// iArr배열 출력
		for(int i=0; i<3; i++) {
			System.out.println(iArr[i]);
			
		}
		
		// dArr배열 출력
		for(int d=0; d<4; d++) {
			System.out.println(dArr[d]);
		}
		// 내가 각 인덱스에 초기화를 하지 않았는데도 값이 담겨있는 이유???
		// Heap이라는 공간은 절대 빈 공간이 존재할 수 없음!!
		// => 따라서 공간이 만들어질 때 JVM이 기본값으로라도 초기화(대입)를 진행해줌
		// 기본값: 정수형 = 0/ 실수형 = 0.0
	
	}
	
	public void method4() {
		
		int[] arr = new int[5];
		
		/*
		arr[0] = ?;
		arr[1] = ?;
		arr[2] = ?;
		arr[3] = ?;
		arr[4] = ?;
		*/
		
		// 대입용 for문
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		// 출력용 for문
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 * 대입용, 출력용 한번에 작성할 수도 있음
		 * for(int i=0; i<5; i++) {
		 * 	System.out.println(arr[i] = i + 1);
		 * }
		 */
		
		System.out.println(arr); // 배열의 자료형 + @ + 주소값의 16진수형태
		System.out.println(arr.hashCode()); // 주소값의 10진수형태
		System.out.println("배열의 길이: " + arr.length); // 배열의 길이

	}
	
	public void method5() {
		
		int result = 0;
		
		int[] arr = null;
		// 주소값을 담는 변수의 기본값은 null임!
		
		System.out.println(arr);
		
		// null 가지고 메소드를 호출한다거나 특정 어딘가에 접근하고자 한다면
		// => 항상 오류 발생!! => NullPointException
		//System.out.println(arr.hashCode());
		//System.out.println(arr.length);
		System.out.println(arr[0]);

	}
	
	public void method6() {
		
		//내가  푼 방법
		
		int[] arr = new int[5];
		/*
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			
			result += arr[i] + 2;
			System.out.println(result);
		}
		*/
		
		//선생님 풀이
		int value = 2;
		for(int i=0; i<arr.length; i++) {
			arr[i] = value;
			value += 2;
			System.out.println(arr[i]);
		}
		
		System.out.println("arr의 해쉬코드값: " + arr.hashCode());
		System.out.println("arr의 길이: " + arr.length);
		
		// * 배열의 가장 큰 단점
		// - 한 번 지정된 배열의 크기는 변경 불가
		//  => 배열의 크기를 변경하고자 한다면 다시 만들어야됨
		arr = new int[7];
		System.out.println("변경 후 arr의 해쉬코드값: " + arr.hashCode());
		System.out.println("변경 후 arr의 길이: " + arr.length);
		// 주소 값이 변경됨! => 새로운 곳은 참조하고 있음!
		
		/*
		 * 연결이 끊어진 기존 배열은 Heap 영역에 둥둥 떠다님(어디에도 참조되어있지 않으므로 필요 없는 존재, 지우는 것이 좋음)
		 * => 일정 시간이 지나면 "가비지컬렉터(GC)"가 알아서 지우는 작업을 해줌
		 * => 자바에서 "자동메모리 관리"의 특징!! == 개발자가 코드 작성에만 신경 쓸 수 있음
		 * 
		 */
		
		// 배열을 강제로 삭제시키고자 한다면?? ==> 연결고리를 끊으면 됨!
		arr =null; // 아무것도 참조하지 않겠다!
		
		System.out.println(arr);
		
		// null.xxxx() ==> NullPointerException 발생
	
		
	}
	
	public void method7() {
		// 배열 선언, 할당, 초기화 다 동시에 하기

		int[] arr1 = new int[] { 1, 2, 3, 4 }; // 표현법1
		int[] arr2 = {1, 2, 3, 4}; // 표현법2
		
		System.out.println(arr1 == arr2); // false
		// 각각 변수에 담겨있는 주소값을 비교하기 때문에

	}
	
	public void method8() {
		
		// 1. 크기 10짜리 정수 배열 생성 후 
		int[] arr = new int[10];
		
		// 2. 반복문을 활용해서 0번 인덱스부터 마지막 인덱스까지 순차적으로 접근하면서 값을 대입
		// 	   매번 1~100 사이에 발생되는 랜덤값
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3. 반복문을 활용해서 해당 배열의 0번 인덱스 ~ 마지막 인덱스까지 담겨있는 값 출력
		// 	  arr[x]: xx
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "]: " +  arr[i]);
		}
	}
	
	public void method9() {
		
		// 1. 사용자에게 배열의 길이 입력받은 후
		//		해당 그 크기만큼의 문자열 배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size];
		
		// 2. 반복문을 활용해서 매번 사용자에게 과일명 입력받아 그 값을 매 인덱스 자리에 대입(0번~마지막인덱스)
		for(int i=0; i<arr.length; i++) {
			System.out.print("좋아하는 과일명 입력: ");
			arr[i] = sc.nextLine();
		}
		
		// 3. 반목문을 활용해서 0~마지막 인덱스까지 담긴 값들을 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method10() {
		// 사용자에게 문자열 하나 입력받은 후 
		// 각각의 인덱스에 있는 문자들을 char배열에 옮겨담기
		
		// 1. 사용자에게 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		System.out.print("찾고자하는 문자: ");
		char ch = sc.nextLine().charAt(0);
		
		// 2. char배열 생성해두기(이 때 배열의 크기 == 문자열의 길이만큼)
		// 문자열 길이: 문자열.length()
		char[] arr = new char[str.length()];
		
		// 3. 반복문 활용해서 해당 문자열에서 각 인덱스별 문자를 char배열의 각 인덱스 대입
		/*
		 * arr[0] = str.charAt(0);
		 * arr[1] = str.charAt(1);
		 * ...
		 * arr[마지막] = str.charAt(마지막);
		 * 
		 */
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
			
		}
		
		// 4. 반복문 활용해서 해당 배열의 0~마지막 인덱스까지 담긴 값 출력
		int count = 0; // 일치하는 문자가 존재할 경우 매번 1씩 증가
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
			//if(ch == arr[i]) {
				if(ch == arr[i]) {
					count++;
				}
		}
		
		System.out.println("찾아진 문자 갯수: " + count);
		
		
	}
	
	public void method11() {
		
		// 1. 사용자에게 배열의 길이 입력받은 후 해당 크기만큼의 정수배열 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		// 2. 반복문 활용해서 0~마지막 인덱스까지 매번 1~100 사이의 랜덤값 발생시켜 대입
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*100 +1);
			
		}
		
		// 3. 반복문 활용해서 0~마지막인덱스까지 담긴 값을 출력과 동시에
		// 	   해당 그 인덱스에 담긴 값이 짝수인 값들의 총 합계 구하기
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
			if(arr[i]% 2 ==0) {
				sum += arr[i];
			}
		}
		
		// 4. 위에서 구해진 짝수들의 총합계 출력
		System.out.println("짝수들의 총합: " + sum);
		
	}
	
	
}
