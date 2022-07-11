package com.greatlearning.notecount.service;

public class NoteCountService {

	public void notesCountImplementation(int currencyDenominations[], int amount) {

		int[] noteCounter = new int[currencyDenominations.length];

		try {
			for (int i = 0; i < currencyDenominations.length; i++) {
				if (amount >= currencyDenominations[i]) {
					noteCounter[i] = amount / currencyDenominations[i];
					amount = amount - noteCounter[i] * currencyDenominations[i];
				}
			}
			if (amount > 0) {
				System.out.println("Exact amount cannot be given with the highest denomination");
			} else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < currencyDenominations.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(currencyDenominations[i] + ":" + noteCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e+ " notes of denomination 0 is invalid");
		}
	}
}
