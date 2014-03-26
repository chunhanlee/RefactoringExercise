package cmput301.refactoring.exercise2;

public class Rental {
	private Movie _movie;
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

    public double getCharge() {
        double result = 0;
        result = getPriceCodeObject(getMovie().getPriceCode()).getCharge(
				result, this);
        return result;
    }

    public int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }

	private PriceCode getPriceCodeObject(int _priceCode)
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
}
