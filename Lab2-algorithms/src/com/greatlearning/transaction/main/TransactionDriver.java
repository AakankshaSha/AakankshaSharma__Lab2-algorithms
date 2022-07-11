package com.greatlearning.transaction.main;

import java.util.Scanner;

import com.greatlearning.transaction.service.TransactionService;

public class TransactionDriver {

	public static void main(String[] args) throws Exception {

		TransactionService transactionService= new TransactionService();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		int totalNoOfTransactions = sc.nextInt();

		int[] transactionsArr = new int[totalNoOfTransactions];
		System.out.println("Enter the values of array");
		for(int i = 0; i < totalNoOfTransactions; i++) {
			transactionsArr[i] = sc.nextInt();
		}
		System.out.println("Enter the total no. of targets that needs to be achieved");
		int targetCount = sc.nextInt();

		transactionService.checkTransaction(transactionsArr, targetCount);
		sc.close();
	}
}
