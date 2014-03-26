package cmput301.refactoring.exercise3;


/**
 * @see cmput301.refactoring.exercise3.Movie#CHILDRENS
 */
public class Childrens extends PriceCode
{

	public int getPriceCode()
	{

		return Movie.CHILDRENS;
	}

	public double getCharge(double result, int _daysRented)
	{

		result += 1.5;
		if (_daysRented > 3)
			result += (_daysRented - 3) * 1.5;
		return result;
	}
}