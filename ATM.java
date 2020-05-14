public class ATM
{
	private double balance;
	private int pinNumber;
	private int cardNumber;
	private double checking;
	private double saving;

	public ATM()
	{
	}


	public void setBalance(double balance)
	{
		this.balance = balance;
    }

    public double getBalance()
    {
		return balance;
	}

	public void setPinNumber(int pinNumber)
	{
		this.pinNumber = pinNumber;
	}

	public int getPinNumber()
	{
		return pinNumber;
	}

	public void setCardNumber(int cardNumber)
	{
		this.cardNumber = cardNumber;

	}

	public int getCardNumber()
	{
		return cardNumber;
	}

	public void setChecking(double checking)
	{
		this.checking = checking;
	}

	public double getChecking()
	{
		return checking;
	}

	public void setSaving(double saving)
	{
		this.saving = saving;
	}

	public double getSaving()
	{
		return saving;
	}


	public String toString()
	{
		return "\nYour bank information" +
		       "\n---------------------" +
		       "\nYour balance: " +
		       balance + "0$" +
		       "\nYour checking: " +
		       checking + "0$" +
		       "\nYour saving: " +
		       saving + "0$" +
		       "\nYour card number: " +
		       cardNumber +
		       "\nYour PIN: "+
		       pinNumber ;
	}
}
