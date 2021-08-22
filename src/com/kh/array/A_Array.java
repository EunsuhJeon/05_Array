package com.kh.array;

import java.util.Scanner;

public class A_Array {

	/*
	 * ����: �ϳ��� ������ �ϳ��� ���� ���� �� ����
	 * �迭: �ϳ��� ������ �������� ���� ���� �� �ִ� ����
	 * 		"���� �ڷ����� ��"���θ� ���� �� ����
	 * 		��Ȯ�� ������ڸ� �迭�� �� �ε��� �ڸ��� ���� ���� ���(�ε����� 0���� ����!)
	 */
	
	
	
	
	
	public void method1() {
		
		// �迭�� �� ������
		
		// ������ �̿��ϸ� => �뷮�� �����͵��� �����ϰ��� �� �� ������ ������ ���� ���� �����ؾ� ��.
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
		 * 1. �迭 ����(���� ���� ������ ������ �迭�� ����ڴ�!)
		 * 		�ڷ��� �迭��[];
		 * 		�ڷ���[] �迭��;
		 */
		
		// int a; //��������
		
		//int arr[];
		//int[] arr;
		 
		/*
		 * 2. �迭 �Ҵ�(�� �迭�� �� ���� ������ ������ ������ ũ�� �����ϴ� ����, �� ������ŭ�� ���� �������)
		 * 		�迭�� = new �ڷ���[�迭ũ��];
		 * 
		 */
		// arr = new int[5];
		// *** �迭 ����� ���ÿ� �Ҵ� (�迭 ����� ���ÿ� ũ�� ����)
		int[] arr = new int[5];
		
		/*
		 * 3. �� ����
		 * 		�迭[�ε���] = ��;
		 * 
		 */
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// �迭 ����: �ݺ��� Ȱ�� ����!!
		for(int i=0; i<5; i++) {
			arr[i] = i;
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); // ���� arr�̶�� �ڽ����� "�ּҰ�"�̶�� ���� ��� ���� => �̻��� ������ ��µ�
		
	}
	
	public void method2() {
		
		int i = 10;
		
		int[] iArr = new int[5];
		
		System.out.println(iArr);
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		
		/*
		 * ���� ���ͷ� ���� ��ٷ� ���� �� �ִ� ������ �Ϲ� ������� �ϰ�,
		 * �ּҰ��� ��� �ִ� ������ ������ ����(���۷��� ����)��� �Ѵ�.
		 * 
		 * �⺻�ڷ���(boolean, char, byte, short, int , long, float, double)���� ����� ����
		 * => ���� ���ͷ����� �ٷ� ��� ���� => �׳� �Ϲ� ����
		 * 
		 * �� �� �ڷ���(int[], double[], char[], short[], .. , String, Scanner,..)���� ����� ����
		 * => �ּҰ��� ��� ���� => ��������(���۷��� ����)
		 * 
		 */
	
	}
	
	public void method3() {
		
		int[]iArr = new int[3]; // 0~2�� �ε���
		double[] dArr = new double[4]; //0~3�� �ε���
		// �迭 �����ϰ� ũ������(�Ҵ�)������ �� ����
		// �׷� ������ �ε����� �ʱ�ȭ�� �Ǿ� ������?
		
		// iArr�迭 ���
		for(int i=0; i<3; i++) {
			System.out.println(iArr[i]);
			
		}
		
		// dArr�迭 ���
		for(int d=0; d<4; d++) {
			System.out.println(dArr[d]);
		}
		// ���� �� �ε����� �ʱ�ȭ�� ���� �ʾҴµ��� ���� ����ִ� ����???
		// Heap�̶�� ������ ���� �� ������ ������ �� ����!!
		// => ���� ������ ������� �� JVM�� �⺻�����ζ� �ʱ�ȭ(����)�� ��������
		// �⺻��: ������ = 0/ �Ǽ��� = 0.0
	
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
		
		// ���Կ� for��
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		// ��¿� for��
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 * ���Կ�, ��¿� �ѹ��� �ۼ��� ���� ����
		 * for(int i=0; i<5; i++) {
		 * 	System.out.println(arr[i] = i + 1);
		 * }
		 */
		
		System.out.println(arr); // �迭�� �ڷ��� + @ + �ּҰ��� 16��������
		System.out.println(arr.hashCode()); // �ּҰ��� 10��������
		System.out.println("�迭�� ����: " + arr.length); // �迭�� ����

	}
	
	public void method5() {
		
		int result = 0;
		
		int[] arr = null;
		// �ּҰ��� ��� ������ �⺻���� null��!
		
		System.out.println(arr);
		
		// null ������ �޼ҵ带 ȣ���Ѵٰų� Ư�� ��򰡿� �����ϰ��� �Ѵٸ�
		// => �׻� ���� �߻�!! => NullPointException
		//System.out.println(arr.hashCode());
		//System.out.println(arr.length);
		System.out.println(arr[0]);

	}
	
	public void method6() {
		
		//����  Ǭ ���
		
		int[] arr = new int[5];
		/*
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			
			result += arr[i] + 2;
			System.out.println(result);
		}
		*/
		
		//������ Ǯ��
		int value = 2;
		for(int i=0; i<arr.length; i++) {
			arr[i] = value;
			value += 2;
			System.out.println(arr[i]);
		}
		
		System.out.println("arr�� �ؽ��ڵ尪: " + arr.hashCode());
		System.out.println("arr�� ����: " + arr.length);
		
		// * �迭�� ���� ū ����
		// - �� �� ������ �迭�� ũ��� ���� �Ұ�
		//  => �迭�� ũ�⸦ �����ϰ��� �Ѵٸ� �ٽ� �����ߵ�
		arr = new int[7];
		System.out.println("���� �� arr�� �ؽ��ڵ尪: " + arr.hashCode());
		System.out.println("���� �� arr�� ����: " + arr.length);
		// �ּ� ���� �����! => ���ο� ���� �����ϰ� ����!
		
		/*
		 * ������ ������ ���� �迭�� Heap ������ �յ� ���ٴ�(��𿡵� �����Ǿ����� �����Ƿ� �ʿ� ���� ����, ����� ���� ����)
		 * => ���� �ð��� ������ "�������÷���(GC)"�� �˾Ƽ� ����� �۾��� ����
		 * => �ڹٿ��� "�ڵ��޸� ����"�� Ư¡!! == �����ڰ� �ڵ� �ۼ����� �Ű� �� �� ����
		 * 
		 */
		
		// �迭�� ������ ������Ű���� �Ѵٸ�?? ==> ������� ������ ��!
		arr =null; // �ƹ��͵� �������� �ʰڴ�!
		
		System.out.println(arr);
		
		// null.xxxx() ==> NullPointerException �߻�
	
		
	}
	
	public void method7() {
		// �迭 ����, �Ҵ�, �ʱ�ȭ �� ���ÿ� �ϱ�

		int[] arr1 = new int[] { 1, 2, 3, 4 }; // ǥ����1
		int[] arr2 = {1, 2, 3, 4}; // ǥ����2
		
		System.out.println(arr1 == arr2); // false
		// ���� ������ ����ִ� �ּҰ��� ���ϱ� ������

	}
	
	public void method8() {
		
		// 1. ũ�� 10¥�� ���� �迭 ���� �� 
		int[] arr = new int[10];
		
		// 2. �ݺ����� Ȱ���ؼ� 0�� �ε������� ������ �ε������� ���������� �����ϸ鼭 ���� ����
		// 	   �Ź� 1~100 ���̿� �߻��Ǵ� ������
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3. �ݺ����� Ȱ���ؼ� �ش� �迭�� 0�� �ε��� ~ ������ �ε������� ����ִ� �� ���
		// 	  arr[x]: xx
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "]: " +  arr[i]);
		}
	}
	
	public void method9() {
		
		// 1. ����ڿ��� �迭�� ���� �Է¹��� ��
		//		�ش� �� ũ�⸸ŭ�� ���ڿ� �迭 ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ����: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[size];
		
		// 2. �ݺ����� Ȱ���ؼ� �Ź� ����ڿ��� ���ϸ� �Է¹޾� �� ���� �� �ε��� �ڸ��� ����(0��~�������ε���)
		for(int i=0; i<arr.length; i++) {
			System.out.print("�����ϴ� ���ϸ� �Է�: ");
			arr[i] = sc.nextLine();
		}
		
		// 3. �ݸ��� Ȱ���ؼ� 0~������ �ε������� ��� ������ ���
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method10() {
		// ����ڿ��� ���ڿ� �ϳ� �Է¹��� �� 
		// ������ �ε����� �ִ� ���ڵ��� char�迭�� �Űܴ��
		
		// 1. ����ڿ��� ���ڿ� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String str = sc.nextLine();
		
		System.out.print("ã�����ϴ� ����: ");
		char ch = sc.nextLine().charAt(0);
		
		// 2. char�迭 �����صα�(�� �� �迭�� ũ�� == ���ڿ��� ���̸�ŭ)
		// ���ڿ� ����: ���ڿ�.length()
		char[] arr = new char[str.length()];
		
		// 3. �ݺ��� Ȱ���ؼ� �ش� ���ڿ����� �� �ε����� ���ڸ� char�迭�� �� �ε��� ����
		/*
		 * arr[0] = str.charAt(0);
		 * arr[1] = str.charAt(1);
		 * ...
		 * arr[������] = str.charAt(������);
		 * 
		 */
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
			
		}
		
		// 4. �ݺ��� Ȱ���ؼ� �ش� �迭�� 0~������ �ε������� ��� �� ���
		int count = 0; // ��ġ�ϴ� ���ڰ� ������ ��� �Ź� 1�� ����
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
			//if(ch == arr[i]) {
				if(ch == arr[i]) {
					count++;
				}
		}
		
		System.out.println("ã���� ���� ����: " + count);
		
		
	}
	
	public void method11() {
		
		// 1. ����ڿ��� �迭�� ���� �Է¹��� �� �ش� ũ�⸸ŭ�� �����迭 ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ����: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		// 2. �ݺ��� Ȱ���ؼ� 0~������ �ε������� �Ź� 1~100 ������ ������ �߻����� ����
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*100 +1);
			
		}
		
		// 3. �ݺ��� Ȱ���ؼ� 0~�������ε������� ��� ���� ��°� ���ÿ�
		// 	   �ش� �� �ε����� ��� ���� ¦���� ������ �� �հ� ���ϱ�
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
			if(arr[i]% 2 ==0) {
				sum += arr[i];
			}
		}
		
		// 4. ������ ������ ¦������ ���հ� ���
		System.out.println("¦������ ����: " + sum);
		
	}
	
	
}
