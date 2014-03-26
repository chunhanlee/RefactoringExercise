package cmput301.refactoring.exercise1;


public class MovieProduct
{

	private int _priceCode;

	public int get_priceCode()
	{

		return _priceCode;
	}

	public void set_priceCode(int _priceCode)
	{

		this._priceCode = _priceCode;
	}

	public double getCharge(Rental aRental, Rental rental)
	{

		return aRental.getCharge(rental);
	}
}