import javax.swing.JOptionPane;

public class Student {
	private String firstName; // User's first name
	private String lastName; // User's last name
	private int stuNum; // User's Peel District SB student number
	private double fines; // User's balance for overdue fines
	private Book borrowedBook1; // Book currently being borrowed (1 out of 3)
	private Book borrowedBook2; // Book currently being borrowed (2 out of 3)
	private Book borrowedBook3; // Book currently being borrowed (3 out of 3)

	public Student(String firstName, String lastName, int stuNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.stuNum = stuNum;
		fines = 0;
	}

	public void addFines(double addition) {
		fines += addition;
	}

	public void reduceFines(double reduction) {
		fines -= reduction;
	}

	public void borrow(Book book) {
		if (fines < 5) { // Checks if student's outstanding balance is greater than $5.00
			if (borrowedBook1 == null) { // Searches for student's available borrowing opportunities
				book.setDaysBorrowed(1); // If student can borrow the book, set it's daysBorrowed to 1
				book.setOwner(firstName + " " + lastName); // Set the book's owner to the student
				borrowedBook1 = book; // Create reference to the book instance that is being borrowed
				JOptionPane // Show confirmation message
						.showMessageDialog(null, book.getTitle()
								+ " has been checked out by " + firstName + " "
								+ lastName);
			} else if (borrowedBook2 == null) { // Searches for student's available borrowing opportunities
				book.setDaysBorrowed(1); // If student can borrow the book, set it's daysBorrowed to 1
				book.setOwner(firstName + " " + lastName); // Set the book's owner to the student
				borrowedBook2 = book; // Create reference to the book instance that is being borrowed
				JOptionPane // Show confirmation message
						.showMessageDialog(null, book.getTitle()
								+ " has been checked out by " + firstName + " "
								+ lastName);
			} else if (borrowedBook3 == null) { // Searches for student's available borrowing opportunities
				book.setDaysBorrowed(1); // If student can borrow the book, set it's daysBorrowed to 1
				book.setOwner(firstName + " " + lastName); // Set the book's owner to the student
				borrowedBook3 = book; // Create reference to the book instance that is being borrowed
				JOptionPane // Show confirmation message
						.showMessageDialog(null, book.getTitle()
								+ " has been checked out by " + firstName + " "
								+ lastName);
			} else {
				JOptionPane
						// Student already has used all 3 borrowing opportunities
						.showMessageDialog(
								null,
								firstName
										+ " "
										+ lastName
										+ " is unable to borrow '"
										+ book.getTitle()
										+ "' because student already has 3 books checked out.");
			}
		} else { // Student has more than $5.00 in fines
			JOptionPane
					// Show error message
					.showMessageDialog(
							null,
							firstName
									+ " "
									+ lastName
									+ "is unable to borrow '"
									+ book.getTitle()
									+ "' because student has more than $5.00 in overdue fees.");
		}
	}

	public void checkIn(Book book) {
		if (borrowedBook1 == book) { // Searches for returned book among student's collection of borrowed books
			book.setDaysBorrowed(0); // Reset daysBorrowed to 0 (puts the book "back on the self")
			book.setOwner(null); // Reset the book's current owner to null
			borrowedBook1 = null; // Resets borrowedBook instance to null
			JOptionPane // Show confirmation message
					.showMessageDialog(
							null,
							book.getTitle() + " has been checked out by "
									+ firstName + " "
									+ lastName);
		} else if (borrowedBook2 == null) { // Searches for returned book among student's collection of borrowed books
			book.setDaysBorrowed(0); // Reset daysBorrowed to 0 (puts the book "back on the self")
			book.setOwner(null); // Reset the book's current owner to null
			borrowedBook2 = null; // Resets borrowedBook instance to null
			JOptionPane.showMessageDialog(null, book.getTitle()
					+ " has been checked out by " + firstName
					+ " " + lastName);
		} else if (borrowedBook3 == null) { // Searches for returned book among student's collection of borrowed books
			book.setDaysBorrowed(0); // Reset daysBorrowed to 0 (puts the book "back on the self")
			book.setOwner(null); // Reset the book's current owner to null
			borrowedBook3 = null; // Resets borrowedBook instance to null
			JOptionPane // Show confirmation message
					.showMessageDialog(
							null,
							book.getTitle() + " has been checked out by "
									+ firstName + " "
									+ lastName);
		} else {
			JOptionPane // Returned book not found. Student has not borrowed the book
					.showMessageDialog(null, firstName
							+ " has not borrowed " + book.getTitle()
							+ ". Impossible to return.");
		}
	}


	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getStuNum() {
		return stuNum;
	}

	public double getFines() {
		return fines;
	}

	public Book getborrowedBook1() {
		return borrowedBook1;
	}

	public Book getborrowedBook2() {
		return borrowedBook2;
	}

	public Book getborrowedBook3() {
		return borrowedBook3;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public void setFines(double fines) {
		this.fines = fines;
	}

	public void setborrowedBook1(Book borrowedBook1) {
		this.borrowedBook1 = borrowedBook1;
	}

	public void setborrowedBook2(Book borrowedBook2) {
		this.borrowedBook2 = borrowedBook2;
	}

	public void setborrowedBook3(Book borrowedBook3) {
		this.borrowedBook3 = borrowedBook3;
	}

}
