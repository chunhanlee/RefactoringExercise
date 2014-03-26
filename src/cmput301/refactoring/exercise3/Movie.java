package cmput301.refactoring.exercise3;

public class Movie {
	
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _title;
	private PriceCode _priceCode = new Regular();
	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}
	
	public int getPriceCode() {
		return _priceCode.getPriceCode();
	}
	
	public void setPriceCode(int arg) {
		switch (arg)
		{
			case REGULAR:
				this._priceCode = new Regular();
				break;
			case NEW_RELEASE:
				this._priceCode = new NewRelease();
				break;
			case CHILDRENS:
				this._priceCode = new Childrens();
				break;
			default:
				this._priceCode = null;
				break;
		}
	}
	
	public String getTitle() {
		return _title;
	}

	public double getCharge(int _daysRented) {
		double result = 0;
		result = _priceCode.getCharge(result, _daysRented);
		return result;
	}

	public int getFrequentRenterPoints(int _daysRented) {
	    //add bonus for a two day new release rental
	    if((getPriceCode() == Movie.NEW_RELEASE) && _daysRented > 1)
	          return 2;
	    else
	          return 1;
	}
}
