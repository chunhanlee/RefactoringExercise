package cmput301.refactoring.exercise3;


public abstract class PriceCode
{

	public abstract int getPriceCode();

	public abstract double getCharge(double result, int _daysRented);
}