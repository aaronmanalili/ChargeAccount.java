//ChargeAccount.java
import java.util.Scanner;

public class ChargeAccount {

	public static void main(String[] args) 
	{
		
		double prevbalance;
		double prevbalancetotal;
		double newbalancetotal;
		float addcharge;
		double newbalanceinterest;
		double interest = 0.0;
		double MinPayment = 0;	
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println ("Type the previous balance of the previous month: ");
		prevbalance = scan.nextFloat();
		System.out.println ("Type the amount of additional charges from the previous month: ");
		addcharge = scan.nextFloat();
		
		if (prevbalance == 0.0)
		{
			interest = 0;
		}
		else if (prevbalance > 0)
		{
			interest = 0.02;
		}
		
		prevbalancetotal = (prevbalance + addcharge);
		
		newbalanceinterest = ((prevbalancetotal)*interest);
		newbalancetotal = (prevbalancetotal + newbalanceinterest);
		
		if (newbalancetotal < 50.00)
		{
			MinPayment = newbalancetotal;
		}
		else if (newbalancetotal > 50.00 || newbalancetotal <= 300.00)
		{
			MinPayment = 50.00;
		}
		if(newbalancetotal > 300.00)
		{
			MinPayment = (0.2*prevbalancetotal); 
		}
		
		System.out.println("CS CARD International Statement");
		System.out.println("===============================");
		System.out.println();
		System.out.println("Previous Balance: " + "$"+prevbalance);
		System.out.println("Additional Charge: " + "$"+addcharge);
		System.out.println("Interest: " + interest);
		System.out.println("New Balance: " + "$"+newbalancetotal);
		System.out.println("Minimum Payment: " + "$"+ MinPayment);

	}
	
}
