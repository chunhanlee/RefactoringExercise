package cmput301.refactoring.exercise1;


/**
 * @see cmput301.refactoring.exercise1.Movie#NEW_RELEASE
 */
public class NewRelease extends PriceCode
{

	public double getCharge(double result, Rental aRental, Rental rental)
	{

		result += rental.getDaysRented() * 3;
		return result;
	}
}