package com.greatlearning.transaction.service;

import java.util.Scanner;

public class TransactionService {

	public void checkTransaction(int[] arr, int targetNum) {

		Scanner sc = new Scanner(System.in);
		while(targetNum-- !=0) {
			int flag = 0;
			int targetValue;
			System.out.println("Enter the value of target");
			targetValue = sc.nextInt();
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
				if (sum >= targetValue) {
					System.out.println("Target is achieved after " +(i+1)+ " transactions");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}
		sc.close();		
	}
}
