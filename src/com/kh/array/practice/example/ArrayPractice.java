package com.kh.array.practice.example;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] =i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		/*
		 * arr[0] = 10
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length-i;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
		String[] arr = new String[5];
		
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		
		// 선언과 초기화를 한번에 진행하는 방법
		// String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.print(arr[1]);
	
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열: ");
		String str = sc.nextLine();
		
		
		System.out.print("문자: ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			
		}
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			//System.out.println(arr[i]);
			
			if(ch == arr[i]) {
				count++;
			}
		}
		
		System.out.println(ch + " 개수: " + count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0~6 사이 숫자 입력: ");
		int day = sc.nextInt();
		
		if(day>=0 && day<=6) {
			System.out.print(arr[day] + "요일");			
		}else {
			System.out.print("잘못 입력하셨습니다.");
		}

	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값:");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int sum = 0;
		for(int i=0; i<num; i++) {
			sum += arr[i];
		}
		
		System.out.println("\n총합: " + sum);
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("정수: ");
			int num = sc.nextInt();
			
			if(num % 2 == 1 && num>=3) {
				
				int[] arr = new int[num];
				
				int value = 1;
				for(int i=0; i<arr.length; i++) {
					arr[i] = value;
					
					if(i < arr.length/2) {
						value++;						
					}else {
						value--;						
					}
					
				}
				
				for(int i=0; i<arr.length; i++) {
					
					if(i<arr.length-1) {
						System.out.print(arr[i] + ", ");						
					}else {
						System.out.print(arr[i]);
					}
				}
			
				break;
				
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"양념", "뿌링클", "후라이드", "간장", "고추바사삭"};
		
		System.out.print("치킨 이름을 입력하세요: ");
		String name = sc.nextLine();
		
		//int count = 0;
		boolean flag = false;
		
		
		for(int i=0; i<arr.length; i++) {
			if(name.equals(arr[i])) {
				//count++;
				flag = true;
				break;
			}
		}
		
			if(flag) {
				System.out.print(name + "치킨 배달 가능");
				
			}else {
				System.out.print(name + "치킨은 없는 메뉴입니다.");
				
			}
		
	}
	
	public void practice10() {
	
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함): ");
		String id = sc.nextLine(); // "980929-2123456"
		
		char[] origin = new char[id.length()];
		
		
		for(int i=0; i<origin.length; i++) {
			origin[i] = id.charAt(i);
		}
		
		char[] copy = new char[origin.length];
		
		for(int i=0; i<copy.length; i++) {
			if(i <=7) {
				copy[i] = origin[i];
				
			}else {
				copy[i] = '*';
				
			}
			
			System.out.print(copy[i]);
		}
	}
	
	
	
	
	
	
}
