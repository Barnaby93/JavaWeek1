package JavaSE.Library;

public class govDocs extends Item {

	private boolean classified;

	private String country;

	public govDocs(String author, String title, double price, int yearWrote, int loanDuration, boolean fiction) {
		super(author, title, price, yearWrote, loanDuration, fiction);
		// TODO Auto-generated constructor stub
	}

	public boolean isClassified() {
		return classified;
	}

	public void setClassified(boolean classified) {
		this.classified = classified;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public void govDocDetails() {
		
	}

}
