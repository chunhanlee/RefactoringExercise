package cmput301.refactoring.exercise1;


/**
 * @see cmput301.refactoring.exercise1.Movie#CHILDRENS
 */
public class Childrens extends PriceCode
{

	public double getCharge(double result, Rental aRental, Rental rental)
	{

		result += 1.5;
		if (rental.getDaysRented() > 3)
			result += (rental.getDaysRented() - 3) * 1.5;
		return result;
	}
}