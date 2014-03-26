package cmput301.refactoring.exercise3;


/**
 * @see cmput301.refactoring.exercise3.Movie#REGULAR
 */
public class Regular extends PriceCode
{

	public int getPriceCode()
	{

		return Movie.REGULAR;
	}

	public double getCharge(double result, int _daysRented)
	{

		result += 2;
		if (_daysRented > 2)
			result += (_daysRented - 2) * 1.5;
		return result;
	}
}