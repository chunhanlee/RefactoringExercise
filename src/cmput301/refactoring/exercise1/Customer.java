package cmput301.refactoring.exercise1;
import java.util.Enumeration;
import java.util.Vector;


public class Customer {
	/**
	 * @uml.property  name="_name"
	 */
	private String _name;
	/**
	 * @uml.property  name="_rentals"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="Rental"
	 */
	private Vector _rentals = new Vector();

	public Customer (String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		double totalAmount = totalAmount();
		int frequentRenterPoints = frequentRenterPoints();
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while(rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();

			//determine amounts for each line
			double thisAmount = amountFor(each);

			//show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" +
			String.valueOf(thisAmount) + "\n";
		}

		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) +
		" frequent renter points";
		return result;
	}

	private double totalAmount()
	{

		double totalAmount = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements())
		{
			Rental each = (Rental) rentals.nextElement();
			double thisAmount = amountFor(each);
			totalAmount += thisAmount;
		}
		return totalAmount;
	}

	private int frequentRenterPoints()
	{

		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements())
		{
			Rental each = (Rental) rentals.nextElement();
			if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE
					&& each.getDaysRented() > 1)
			{
				frequentRenterPoints += 2;
			} else
			{
				frequentRenterPoints++;
			}
		}
		return frequentRenterPoints;
	}

    private double amountFor(Rental aRental) {
    	Rental r = new Rental(aRental.getMovie(), aRental.getDaysRented());
        return r.getCharge(aRental);
    }
}
