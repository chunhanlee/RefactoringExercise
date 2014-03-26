package cmput301.refactoring.exercise1;

public class Movie {
	
	private MovieProduct movieProduct = new MovieProduct();
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	/**
	 * @uml.property  name="_title"
	 */
	private String _title;
	public Movie(String title, int priceCode) {
		_title = title;
		movieProduct.set_priceCode(priceCode);
	}
	
	public int getPriceCode() {
		return movieProduct.get_priceCode();
	}
	
	public void setPriceCode(int arg) {
		movieProduct.set_priceCode(arg);
	}
	
	public String getTitle() {
		return _title;
	}

	public double getCharge(Rental aRental, Rental rental)
	{

		return movieProduct.getCharge(aRental, rental);
	}
}
