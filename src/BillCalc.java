import java.util.Scanner;

/**
 * Assignment 1. You are a developer asked to build a small application to split
 * a bill and calculate tips. This application takes 2 inputs from the user for
 * the billAmount and nosOfDiners Based on these values it calculates the tip
 * for values for 15%, 18% and 20% tip and then generates the totalbillAmount
 * for each of those tip percentages. Subsequently the application presents the
 * amount owed by each of the diners based on the totalBillAmount and
 * nosofDiners.
 * 
 * Declare 2 variables to take inputs from the user. These variables should be
 * named a. billAmount b. nosOfDiners
 * 
 * Take the 2 inputs from the user and store them in the above variables
 * 
 * Present the user with a calculation of 15%, 18% and 20% tip based on the
 * billAmount. Also present them with totalBillAmount based on those percentages
 * (i.e. Add the tip to the billAmount)
 * 
 * Present the amount owed by each diner for each of the totalBillAmounts.
 * 
 * Present this information in a meaningful way based on the results from
 * zyBooks tester.
 * 
 * 
 * 
 * @author nikhilsrinivasan
 *
 */

public class BillCalc {

	public static void main(String[] args) {

		double billAmount;
		int nosOfDiners;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter bill amount :");
		billAmount = scan.nextDouble();

		System.out.print("Enter number of diners :");
		nosOfDiners = scan.nextInt();

		System.out.println("Please consider the following tips:");
		System.out.println("15 % :" + billAmount * .15 + " | Total bill: " + (billAmount + 0.15 * billAmount));
		System.out.println("18 % :" + billAmount * .18 + " | Total bill: " + (billAmount + 0.18 * billAmount));
		System.out.println("20 % :" + billAmount * .20 + " | Total bill: " + (billAmount + 0.20 * billAmount));
		System.out.println();

		System.out.println("Amount due from each diner based on tip percentage:");
		System.out.println("Tip Amount 15% : " + (billAmount + 0.15 * billAmount) / nosOfDiners + " due");
		System.out.println("Tip Amount 18% : " + (billAmount + 0.18 * billAmount) / nosOfDiners + " due");
		System.out.println("Tip Amount 20% : " + (billAmount + 0.20 * billAmount) / nosOfDiners + " due");
	}

}
