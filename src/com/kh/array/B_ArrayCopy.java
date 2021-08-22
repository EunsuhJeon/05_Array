package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	//배열 복사
	public void method1() {
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("== 원본 배열 출력 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// 단순하게 origin을 다시 대입시킨 copy 배열 세팅
		int[] copy = origin;
		System.out.println("== 복사본 배열 출력 ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		copy[2] = 99;
		System.out.println("-----------복사본 배열 값 변경 후 -----------");
		System.out.println("== 원본 배열 출력 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println("\n== 복사본 배열 출력 ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		// copy만을 가지고 수정을 해도 원본까지 변경되어 있음
		// 왜? origin과 copy가 같은 곳을 참조하고 있기 때문(즉, 같은 주소값)
		System.out.println("\norigin주소값: " + origin.hashCode());
		System.out.println("copy 주소값: " + copy.hashCode());
		
		// 얕은 복사: 주소값을 복사하는 것.
		
	}
	
	// 얕은 복사의 문제를 해결하기 위한 깊은 복사
	public void method2() {
		// 1. for문을 활용한 방법
		//	  새로운 배열을 아예 생성한 후 반복문을 활용해서 원본 배열의 값들을 새로이 만든 배열에 대입
		
		int[] origin = {1, 2, 3, 4, 5};
		
		//int[] copy = origin; // 얕은 복사 : 주소값 대입
		int[] copy = new int[5];
		for(int i=0; i<copy.length; i++) {
			copy[i]= origin[i];
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		System.out.println("------copy 수정 후 -------");
		System.out.println("== 원본 배열 출력 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println("\n== 복사본 배열 출력 ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin 주소값: " + origin.hashCode());
		System.out.println("copy 주소값: " + copy.hashCode());
		
	}
	
	public void method3() {
		// 2. 새로운 배열 생성 후 System클래스에서의 arraycopy()메소드를 이용한 복사
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10]; // 넉넉하게 크개 생성 0~9번 인덱스까지 0이 다 담겨있을 것!!
		
		//System.arraycopy(원본배열명, 복사 시작할 인덱스, 복사본배열명, 복사본배열의 복사될 시작인덱스, 복사할 갯수);
		
		System.arraycopy(origin, 1, copy, 3, 3);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin 주소값: " + origin.hashCode());
		System.out.println("copy 주소값: " + copy.hashCode());
	
	}
	
	public void method4() {
		// 3. Arrays 클래스에서 제곳하는 copyof()메소드 사용
		int[] origin = {1, 2, 3, 4, 5};
		// 복사본 배열 = Arrays.copyof(원본배열명, 복사할길이);
		int[] copy = Arrays.copyOf(origin, 10);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		/*
		 * Arrays.copyOf 메소드
		 * => 내가 제시한 길이만큼 복사본 배열 크기 할당
		 * => 단, 내가 제시한 길이가 원본배열의 크기보다 클 경우 기존의 배열에 있는 값 다 복사한 뒤 나머지는 0으로 채움
		 * =>	내가 제시한 길이가 원본 배열의 크기보다 작을 경우 기존의 배열에 있는 값 내가 제시한 길이만큼만 복사
		 */
		System.out.println("\norigin의 주소값: " + origin.hashCode());
		System.out.println("copy의 주소값: " + copy.hashCode());
			
	}
	
	/*
	 * [참고]
	 * java.lang.Math
	 * java.lang.String
	 * java.lang.System
	 * ==> java.lang 패키지에 있는 클래스들을 쓸 때는 import가 불필요함!
	 * 
	 * java.util.Scanner
	 * java.util.Arrays
	 * ==> java.lang 이외의 패키지에 있는 클래스를 사용할 때는 무조건 import 해줘야 함!
	 * 
	 */
	
	public void method5() {
		
		// 4. clone() 메소드 이용한 복사
		// 	   인덱스 지정 불가, 크기 지정 별도로 못함
		int[] origin = {1,2,3,4,5};
		// 복사본 배열 = 원본배열.clone();
		int[] copy = origin.clone();
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin의 주소값: " + origin.hashCode());
		System.out.println("copy의 주소값: " + copy.hashCode());
		
		
		
	}
	
	
	
	
	
	
}
