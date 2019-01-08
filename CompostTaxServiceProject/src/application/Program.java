package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.BrazilInterestService;
import model.services.InterestService;
import model.services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		InterestService us = new UsaInterestService(1.01);
		double payment = is.payment(amount,months);
		double payment2 = us.payment(amount,months);
		
		System.out.println();
		System.out.println("Brazil");
		System.out.println("Payment after " + months  + " months:");
		System.out.println(String.format("%.2f", payment));
		
		System.out.println();
		System.out.println("USA");
		System.out.println("Payment after " + months  + " months:");
		System.out.println(String.format("%.2f", payment2));
		
		sc.close();
	}

}
