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
		
		System.out.print("���� ����: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		
		String[] arr = new String[5];
		
		arr[0] = "���";
		arr[1] = "��";
		arr[2] = "����";
		arr[3] = "������";
		arr[4] = "����";
		
		// ����� �ʱ�ȭ�� �ѹ��� �����ϴ� ���
		// String[] arr = {"���", "��", "����", "������", "����"};
		
		System.out.print(arr[1]);
	
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ�: ");
		String str = sc.nextLine();
		
		
		System.out.print("����: ");
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
		
		System.out.println(ch + " ����: " + count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.print("0~6 ���� ���� �Է�: ");
		int day = sc.nextInt();
		
		if(day>=0 && day<=6) {
			System.out.print(arr[day] + "����");			
		}else {
			System.out.print("�߸� �Է��ϼ̽��ϴ�.");
		}

	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� ��:");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int sum = 0;
		for(int i=0; i<num; i++) {
			sum += arr[i];
		}
		
		System.out.println("\n����: " + sum);
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("����: ");
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
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"���", "�Ѹ�Ŭ", "�Ķ��̵�", "����", "���߹ٻ��"};
		
		System.out.print("ġŲ �̸��� �Է��ϼ���: ");
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
				System.out.print(name + "ġŲ ��� ����");
				
			}else {
				System.out.print(name + "ġŲ�� ���� �޴��Դϴ�.");
				
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
		
		System.out.print("�ֹε�Ϲ�ȣ(-����): ");
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
