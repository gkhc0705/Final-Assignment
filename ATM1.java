import java.util.Scanner;

public class ATM1
{
	private static final String list =
	                                   "------------------------------- " +
	                                   "\nList of options: " +
	                                   "\n1. Check balance " +
	                                   "\n2. Withdraw money " +
	                                   "\n3. Make a deposit " +
	                                   "\n4. Check your bank account info " +
	                                   "\n5. Change the PIN " +
	                                   "\n6. Exit" +
	                                   "\n------------------------------- ";


	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		ATM atm = new ATM();
		atm.setBalance(0);
		atm.setChecking(0);
		atm.setSaving(0);

		System.out.print("Enter your card number: ");
		int cardNumber = kb.nextInt();
	    atm.setCardNumber(cardNumber);

	    System.out.print("Enter your PIN: ");
	    int pinNumber = kb.nextInt();
	    atm.setPinNumber(pinNumber);

        System.out.print("\n" + list + "\nWhat do you want to do? ");
	    int option = kb.nextInt();


	    while(option > 0 || option <= 6)

	    switch(option)
	    {
			case 1:
			System.out.printf("\nYour current balance: %.2f$\n", atm.getBalance());
			System.out.printf("Your checking account: %.2f$", atm.getChecking());
			System.out.printf("\nYour saving account: %.2f$\n", atm.getSaving());
			System.out.print("\n" + list + "\nWhat else do you want to do? ");
			option = kb.nextInt();
			break;

			case 2:
			System.out.print("\nEnter amount you want to withdraw: ");
			double amount = kb.nextDouble();
		    if(amount > atm.getBalance())
				{
					System.out.println("\nYou don't have enough balance to withdraw that amount!");
					System.out.printf("\nYour remaining balance: %.2f$\n", atm.getBalance());
					System.out.print("\n" + list + "\nWhat else do you want to do? ");
				    option = kb.nextInt();
				}

            else
            {
            double remAmount = atm.getBalance() - amount;
			System.out.printf("\nYour remaining balance: %.2f$\n", remAmount);
			atm.setBalance(remAmount);
            System.out.print("\n" + list + "\nWhat else do you want to do? ");
		    option = kb.nextInt();
		    }
         	break;


			case 3:
			System.out.print("\nWhere do you want to deposit?(CHQ/SAV) ");
			String clientAnswer = kb.next();
			System.out.print("\nEnter amount you want to deposit: ");
			double depAmount = kb.nextDouble();

	        if(clientAnswer.equals("CHQ"))
			{
			System.out.println("You've successfully deposit the money! ");
			double remAmount2 = atm.getChecking() + depAmount;
			atm.setChecking(remAmount2);
			System.out.print("\n" + list + "\nWhat else do you want to do? ");
			option = kb.nextInt();
		    }

		    if(clientAnswer.equals("SAV"))
		    {
		    System.out.println("You've successfully deposit the money! ");
		    double remAmount3 = atm.getSaving() + depAmount;
		    atm.setSaving(remAmount3);
		    System.out.print("\n" + list + "\nWhat else do you want to do? ");
			option = kb.nextInt();
		    }
            break;

			case 4:
			System.out.println(atm.toString());
			System.out.print("\n" + list + "\nWhat else do you want to do? ");
			option = kb.nextInt();
			break;

			case 5:
			System.out.print("\nEnter your current PIN: ");
			int pin = kb.nextInt();
			atm.getPinNumber();
			System.out.print("Enter the new PIN: ");
			int newPin = kb.nextInt();
			System.out.print("Confirm your new PIN: ");
			int confNewPin = kb.nextInt();

			do
			{
				System.out.println("\nYour PIN does not match, please try again! ");
				System.out.print("\nEnter your current PIN: ");
				pin = kb.nextInt();
				atm.getPinNumber();
				System.out.print("Enter the new PIN: ");
			    newPin = kb.nextInt();
			    System.out.print("Confirm your new PIN: ");
			    confNewPin = kb.nextInt();
			    atm.setPinNumber(confNewPin);
			}
			while(confNewPin != newPin);

          	atm.setPinNumber(confNewPin);
			System.out.println("\nYou've successfully changed your PIN! ");
			System.out.print("\n" + list + "\nWhat else do you want to do? ");
			option = kb.nextInt();
			break;

			case 6:
			System.out.println("\nThank you for using! ");
			return;

			default:
			System.out.println("\nPlease enter a valid option! ");
			System.out.print("\n" + list + "\nWhat else do you want to do? ");
			option = kb.nextInt();

     	}

	}
}
