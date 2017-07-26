package JavaSE.Library;

public abstract class Item {

	private String Author;
	private String Title;

	private int ID;
	private double Price;
	private int yearWrote;
	private int loanDuration;

	private boolean Fiction;

	public Item(String author, String title, double price, int yearWrote, int loanDuration, boolean fiction) {
		super();
		Author = author;
		Title = title;
		Price = price;
		this.yearWrote = yearWrote;
		this.loanDuration = loanDuration;
		Fiction = fiction;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getYearWrote() {
		return yearWrote;
	}

	public void setYearWrote(int yearWrote) {
		this.yearWrote = yearWrote;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public boolean isFiction() {
		return Fiction;
	}

	public void setFiction(boolean fiction) {
		Fiction = fiction;
	}

}
