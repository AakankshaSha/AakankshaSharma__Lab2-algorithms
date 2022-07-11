package com.greatlearning.notecount.main;

import java.util.Scanner;

import com.greatlearning.notecount.service.MergeSortImplementation;
import com.greatlearning.notecount.service.NoteCountService;

public class NoteCountDriver{

	public static void main(String[] args) {

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NoteCountService noteCount = new NoteCountService();

		System.out.println("Enter the size of currency denominations");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] currencyDenominations = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			currencyDenominations[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(currencyDenominations,0,currencyDenominations.length-1);
		noteCount.notesCountImplementation(currencyDenominations, amount);
		sc.close();
	}
}
