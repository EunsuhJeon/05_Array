package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	//�迭 ����
	public void method1() {
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("== ���� �迭 ��� ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// �ܼ��ϰ� origin�� �ٽ� ���Խ�Ų copy �迭 ����
		int[] copy = origin;
		System.out.println("== ���纻 �迭 ��� ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		copy[2] = 99;
		System.out.println("-----------���纻 �迭 �� ���� �� -----------");
		System.out.println("== ���� �迭 ��� ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println("\n== ���纻 �迭 ��� ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		// copy���� ������ ������ �ص� �������� ����Ǿ� ����
		// ��? origin�� copy�� ���� ���� �����ϰ� �ֱ� ����(��, ���� �ּҰ�)
		System.out.println("\norigin�ּҰ�: " + origin.hashCode());
		System.out.println("copy �ּҰ�: " + copy.hashCode());
		
		// ���� ����: �ּҰ��� �����ϴ� ��.
		
	}
	
	// ���� ������ ������ �ذ��ϱ� ���� ���� ����
	public void method2() {
		// 1. for���� Ȱ���� ���
		//	  ���ο� �迭�� �ƿ� ������ �� �ݺ����� Ȱ���ؼ� ���� �迭�� ������ ������ ���� �迭�� ����
		
		int[] origin = {1, 2, 3, 4, 5};
		
		//int[] copy = origin; // ���� ���� : �ּҰ� ����
		int[] copy = new int[5];
		for(int i=0; i<copy.length; i++) {
			copy[i]= origin[i];
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		System.out.println("------copy ���� �� -------");
		System.out.println("== ���� �迭 ��� ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println("\n== ���纻 �迭 ��� ==");
		for(int i=0; i<origin.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin �ּҰ�: " + origin.hashCode());
		System.out.println("copy �ּҰ�: " + copy.hashCode());
		
	}
	
	public void method3() {
		// 2. ���ο� �迭 ���� �� SystemŬ���������� arraycopy()�޼ҵ带 �̿��� ����
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10]; // �˳��ϰ� ũ�� ���� 0~9�� �ε������� 0�� �� ������� ��!!
		
		//System.arraycopy(�����迭��, ���� ������ �ε���, ���纻�迭��, ���纻�迭�� ����� �����ε���, ������ ����);
		
		System.arraycopy(origin, 1, copy, 3, 3);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin �ּҰ�: " + origin.hashCode());
		System.out.println("copy �ּҰ�: " + copy.hashCode());
	
	}
	
	public void method4() {
		// 3. Arrays Ŭ�������� �����ϴ� copyof()�޼ҵ� ���
		int[] origin = {1, 2, 3, 4, 5};
		// ���纻 �迭 = Arrays.copyof(�����迭��, �����ұ���);
		int[] copy = Arrays.copyOf(origin, 10);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		/*
		 * Arrays.copyOf �޼ҵ�
		 * => ���� ������ ���̸�ŭ ���纻 �迭 ũ�� �Ҵ�
		 * => ��, ���� ������ ���̰� �����迭�� ũ�⺸�� Ŭ ��� ������ �迭�� �ִ� �� �� ������ �� �������� 0���� ä��
		 * =>	���� ������ ���̰� ���� �迭�� ũ�⺸�� ���� ��� ������ �迭�� �ִ� �� ���� ������ ���̸�ŭ�� ����
		 */
		System.out.println("\norigin�� �ּҰ�: " + origin.hashCode());
		System.out.println("copy�� �ּҰ�: " + copy.hashCode());
			
	}
	
	/*
	 * [����]
	 * java.lang.Math
	 * java.lang.String
	 * java.lang.System
	 * ==> java.lang ��Ű���� �ִ� Ŭ�������� �� ���� import�� ���ʿ���!
	 * 
	 * java.util.Scanner
	 * java.util.Arrays
	 * ==> java.lang �̿��� ��Ű���� �ִ� Ŭ������ ����� ���� ������ import ����� ��!
	 * 
	 */
	
	public void method5() {
		
		// 4. clone() �޼ҵ� �̿��� ����
		// 	   �ε��� ���� �Ұ�, ũ�� ���� ������ ����
		int[] origin = {1,2,3,4,5};
		// ���纻 �迭 = �����迭.clone();
		int[] copy = origin.clone();
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin�� �ּҰ�: " + origin.hashCode());
		System.out.println("copy�� �ּҰ�: " + copy.hashCode());
		
		
		
	}
	
	
	
	
	
	
}