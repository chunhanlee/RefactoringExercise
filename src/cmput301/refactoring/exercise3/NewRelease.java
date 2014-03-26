package cmput301.refactoring.exercise3;


/**
 * @see cmput301.refactoring.exercise3.Movie#NEW_RELEASE
 */
public class NewRelease extends PriceCode
{

	public int getPriceCode()
	{

		return Movie.NEW_RELEASE;
	}

	public double getCharge(double result, int _daysRented)
	{

		result += _daysRented * 3;
		return result;
	}
}