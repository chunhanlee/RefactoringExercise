package cmput301.refactoring.exercise1;

public class Rental {
	/**
	 * @uml.property  name="_movie"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Movie _movie;
	/**
	 * @uml.property  name="_daysRented"
	 */
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}
	
	
	public double getCharge1(Rental aRental) {
		return _movie.getCharge(aRental, this);
	}

	public PriceCode getPriceCodeObject(int _priceCode)
	{

		switch (_priceCode)
		{
			case Movie.REGULAR:
				return new Regular();
			case Movie.NEW_RELEASE:
				return new NewRelease();
			case Movie.CHILDRENS:
				return new Childrens();
		}
		return null;
	}

	public double getCharge(Rental rental)
	{

		double result = 0;
		result = rental.getPriceCodeObject(getMovie().getPriceCode())
				.getCharge(result, this, rental);
		return result;
	}
}
