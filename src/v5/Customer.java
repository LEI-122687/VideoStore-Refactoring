package v5;

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
        // header
        String result = "Rental Record for " + getName() + "\n";

        for (Rental each: _rentals)
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getAmount() + "\n";

        // add footer lines
        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    public String htmlStatement()
    {
        // header com HTML
        String result = "<h1>Rental Record for " + getName() + "</h1>\n";

        for (Rental each: _rentals)
            // Linha do filme com HTML
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getAmount() + "<br>\n";

        // add footer lines com HTML
        result += "<p>Amount owed is " + getTotalAmount() + "</p>\n";
        result += "<p>You earned " + getTotalFrequentRenterPoints() + " frequent renter points</p>";
        return result;
    }


    public int getTotalFrequentRenterPoints()
    {
        int frequentRenterPoints = 0;
        for (Rental each: _rentals)
            frequentRenterPoints += each.getFrequentRentalPoints();
        return frequentRenterPoints;
    }

    public double getTotalAmount()
    {
        double totalAmount = 0;
        for (Rental each: _rentals)
            totalAmount += each.getAmount();
        return totalAmount;
    }
}