public class Book {
	private String title;
	private String author;
	private int ISBN;
	private String category;
	private double cost;
	private double rating;
	private boolean isLost;
	private String owner;
	private int daysBorrowed;

	public Book(String title, String author, int ISBN, String category,
			double cost, double rating) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.category = category;
		this.cost = cost;
		this.rating = rating;
		isLost = false;
		daysBorrowed = 0;
	}

	public void reportLost(Student student) {
		student.addFines(cost);
		isLost = true;
	}
	
	// Getters and Setters
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getISBN() {
		return ISBN;
	}

	public String getCatagory() {
		return category;
	}

	public double getCost() {
		return cost;
	}

	public double getRating() {
		return rating;
	}

	public int getDaysBorrowed() {
		return daysBorrowed;
	}

	public String getOwner() {
		return owner;
	}

	public boolean getIsLost() {
		return isLost;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void setDaysBorrowed(int daysBorrowed) {
		this.daysBorrowed = daysBorrowed;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
