package v2;

import java.util.Vector;

public class Customer
{
	private String			_name;
	private Vector<Rental>	_rentals	= new Vector<Rental>();

	public Customer(String _name)
	{
		this._name = _name;
	}

	public void addRental(Rental arg)
	{
		_rentals.addElement(arg);
	}

	public String getName()
	{
		return _name;
	}

	public String statement()
	{
		double totalAmount = 0;
		int frequentRenterPoints = 0;

		// header
		String result = "Rental Record for " + getName() + "\n";

		for (Rental each: _rentals)
		{
			// double thisAmount = each.getAmount();

			// add frequent renter points
			frequentRenterPoints += getFrequentRentalPoints(each);

			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + each.getAmount() + "\n";
			totalAmount += each.getAmount();
		}

		// add footer lines
		result += "Amount owed is " + totalAmount + "\n";
		result += "You earned " + frequentRenterPoints + " frequent renter points";
		return result;
	}

	public int getFrequentRentalPoints(Rental each)
	{
		int points = 1; // 1 point for each rental

		if ((each.getMovie().getPriceCode() == Movie.Code.NEW_RELEASE) && each.getDaysRented() > 1)
			points++;

		return points;
	}

}
