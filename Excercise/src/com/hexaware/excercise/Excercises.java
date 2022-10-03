package com.hexaware.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Excercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Q1
//		
//		int[] A ={23,12,45,67,90,23,54,67,8,1,14};
//		System.out.println("Array is");
//		for(int i = 0; i < A.length; i++) {
//			System.out.print(A[i]+" ");
//		}
//		
//		Arrays.sort(A);
//		System.out.println("\nSorted Array is");
//		for(int i = 0; i < A.length; i++) {
//			System.out.print(A[i]+" ");
//		}
//		
//		Q2
//		
//		int flag= 0;
//		for(int i = 0; i < A.length; i++) {
//			if(A[i] == 65) {
//				System.out.println("\nFound 65 at position " + i);
//				flag = 1;
//			}
//			
//		}
//		if (flag ==0) {
//			System.out.println("\n65 Not Found");
//		}
//		
////		Q3
		Scanner sc =new Scanner(System.in);
//		
//		System.out.println("\nEnter element to be searched");
//		int ele = sc.nextInt();
//		flag =0;
//		for(int i = 0; i < A.length; i++) {
//			if(A[i] == ele) {
//				System.out.println("\nFound "+ele +" at position " + i);
//				flag = 1;
//			}
//			
//		}
//		if (flag ==0) {
//			System.out.println("\n "+ele+"Not Found");
//		}
		
		
//		Q4
		
//		System.out.println("\nEnter position of element to be inserted");
//		int pos = sc.nextInt();
//		System.out.println("\nEnter element to be inserted");
//		ele = sc.nextInt();
//		int temp = 0;
//		int temppos = 0;
//		
//		System.out.println("Array before insertion");
//		for(int i = 0; i < A.length; i++) {
//			System.out.print(A[i]+ " ");
//		}
//		for(int i = 0; i < A.length; i++) {
//			
//			if (i == pos) {
//				temp = A[i];
//				A[i] = ele;
//				temppos = i+1;
//			}
//		}
//		for(int j = temppos; j <A.length-1;j++ ) {
//			
//			A[j] = temp;
//			temp = A[j+1];
//		}
//		System.out.println("\nArray after insertion");
//		for(int i = 0; i < A.length; i++) {
//			System.out.print(A[i]+" ");
//		}
		
		
//		Q5
//		
//		int[] Array1 = {23,12,45,67,90,23,54,67,8,1,14};
//		int[] Array2 = {43,32,45,97,90,23,54,7,8};
//		for(int i = 0;i<Array1.length;i++) {
//			for(int j = 0;j<Array2.length;j++) {
//				if(Array1[i] == Array2[j]) {
//					System.out.print(Array2[j] + " ");
//				}
//			}
//		}
//		
//		
//		Q6
//		
//		int[] Arr = {23,12,45,67,90,23,54,67,8,1,14};
//		
//		Arrays.sort(Arr);
//		System.out.println("\nThird lasrgest element is: "+Arr[Arr.length-3]);
//		
//		Q7
//		
//		int[] Array = {23,12,45,67,90,23,54,67,8,1,14};
//		
//		Arrays.sort(Array);
//		System.out.println("\nThird smallest element is: "+Array[3]);
		
//		Q10
		
//		int[] Arr1 = {23,12,45,67,90,23,54,67,8,1,14};
//		for(int i = 0;i<Arr1.length;i++) {
//			for(int j = i+1;j<Arr1.length;j++) {
//				if(Arr1[i] == Arr1[j]) {
//					Arr1[j] = 0;
//				}
//			}
//		}
//		for(int i = 0; i < Arr1.length; i++) {
//			System.out.print(Arr1[i]+ " ");
//		}
//		
		
//		Q11
		
//		int price = 30;
//		int age;
//		System.out.print("Enter your age");
//		age = sc.nextInt();
//		if(age==0) {
//			System.out.print("Enter valid age");
//		}
//		else if(age>=65) {
//			System.out.print("Parking fees on discount on person's age "+ age +" is $"+ price * 0.5);
//		}
//		else {
//			System.out.print("Parking fees one person's age "+ age+" is $"+ price);
//		}
		
//		Q12
		
//		System.out.println("Enter thhe valu of y");
//		int y = sc.nextInt();
//		if(y > 0 ) {
//			int x = 1;
//			System.out.println("x=");
//		}
		
		
//		Q 13
		
//		double score = 0.0;
//		System.out.println("Enter marks");
//		score = sc.nextDouble();
//		if ((score>80) && (score<90)){
//			score +=5;
//			System.out.println("Your score is: "+ score);
//		}
//		else {
//			System.out.println("Your score is: "+ score);
//		}
		
		
//		Q 14
		
//		if((i>=10) && (v<50)
		
//		Q 15
		
//		int x = 0;
//		System.out.println("Enter a number");
//		x = sc.nextInt();
//		if (( x % 2 != 0) && (x > 0)){
//			System.out.println(x +" is positive and odd");
//		}
		
		
//		Q 17
		
		int x,y= 0;
		System.out.println("Enter first number");
		x = sc.nextInt();
		System.out.println("Enter first number");
		y = sc.nextInt();
		if (( x > 0) && (y > 0)){
			System.out.println(x+","+y+" are positive numbers");
		}
		else {
			System.out.println(x+","+y+" are not positive numbers");	
		}
		
		
		
		
		
		
		
		
	}

}
