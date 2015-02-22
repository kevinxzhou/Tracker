import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import com.apple.eawt.Application;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private static Book[] books;
	private static Student[] students;
	private Library library;

	public static void main(String[] args) {
		// Launches welcome screen, asks for one-time setup information
		// String input = JOptionPane
		// .showInputDialog("How many books will be stored in this library system?");
		// int numBooks = Integer.parseInt(input);
		// books = new Book[numBooks];
		// input = JOptionPane
		// .showInputDialog("How many students will be stored in this library system?");
		// int numStudents = Integer.parseInt(input);
		// students = new Student[numStudents];
		// Library library = new Library(numBooks, numStudents);
		books = new Book[100]; // TO REMOVE
		students = new Student[100]; // TO REMOVE
		Library library = new Library(100, 100); // TO REMOVE
		String input = ""; // remove

		// Launches splash screen
		final SplashScreen splash = new SplashScreen();
		splash.setVisible(true);
		ScheduledExecutorService s = Executors
				.newSingleThreadScheduledExecutor();
		s.schedule(new Runnable() {
			public void run() {
				splash.setVisible(false);
				splash.dispose();
			}
		}, 0, TimeUnit.SECONDS); // change to 8

		ScheduledExecutorService s2 = Executors
				.newSingleThreadScheduledExecutor();
		s2.schedule(new Runnable() {
			public void run() {
				// Launches home screen
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							HomeScreen HomeScreen = new HomeScreen();
							HomeScreen.setVisible(true);
							int winx = 800;
							int winy = 550;
							HomeScreen.setSize(winx, winy);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		}, 0, TimeUnit.SECONDS); // change to 8
	}

	// TRIGGER THE FOLLOWING IF USER CREATES NEW BOOK
	public static void newBook() {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				String title = JOptionPane.showInputDialog("Title of Book:");
				for (int x = 0; x < books.length; x++) { // Search for books with identical titles
					if (books[x] != null
							&& books[x].getTitle().equalsIgnoreCase(title) == true) {
						JOptionPane // Show error message
								.showMessageDialog(null, "The book " + title
										+ " already exists.");
					}
				}
				String author = JOptionPane.showInputDialog("Author of Book:");
				String input = JOptionPane.showInputDialog("Book ISBN Code:");
				int ISBN = Integer.parseInt(input);
				for (int x = 0; x < books.length; x++) { // Search for books with identical ISBN
					if (books[x] != null && books[x].getISBN() == ISBN) {
						JOptionPane // Show error message
								.showMessageDialog(null, "The book ISBN "
										+ ISBN + " already exists.");
					}
				}
				String category = JOptionPane
						.showInputDialog("Catagory of Book:");
				input = JOptionPane.showInputDialog("Book Cost:");
				double cost = Double.parseDouble(input);
				input = JOptionPane.showInputDialog("Book Rating:");
				double rating = Double.parseDouble(input);
				books[i] = new Book(title, author, ISBN, category, cost, rating);
				break;
			}
		}
	}

	// TRIGGER WHEN USER CREATES NEW STUDENT
	public static void newStudent() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i] == null) {
				String firstName = JOptionPane
						.showInputDialog("Student First Name:");
				String lastName = JOptionPane
						.showInputDialog("Student Last Name:");
				String input = JOptionPane
						.showInputDialog("Student PDSB Identification Number:");
				int stuNum = Integer.parseInt(input);
				for (int x = 0; x < books.length; x++) { // Search for users with identical student number
					if (students[i] != null
							&& students[x].getStuNum() == stuNum) {
						JOptionPane // Show error message
								.showMessageDialog(null, "The student number "
										+ stuNum + " already exists.");
					}
				}
				students[i] = new Student(firstName, lastName, stuNum);
				break;
			}
		}
	}

	public void deleteBook(Book[] books, int i) {
		books[i] = null;
	}

	public void deleteStudent(Student[] students, int i) {
		students[i] = null;
	}

	public static Book searchBook(String query) {
		Book book = null;
		String title;
		boolean found = false;
		for (int i = 0; i < books.length; i++) { // Searches for books with identical titles or ISBN
			if (books[i] != null
					&& books[i].getTitle().equalsIgnoreCase(query) == true) { // Do the book titles match?
				book = books[i];
				found = true;
			} else if (books[i] != null // TO-DO WRITE A METHOD THAT DETECTS IF THE QUERY CONTAINS A LETTER SO A PARSE
										// EXCEPTION IS NOT THROWN
					&& books[i].getISBN() == Integer.parseInt(query)) { // Do the ISBN codes match?
				book = books[i];
				found = true;
			}
		}
		if (found == false) {
			JOptionPane // No search results have been found
					.showMessageDialog(null, "No books match the query '"
							+ query + "'.");
		}
		return book;
	}

	public static Student searchStudent(String query) {
		Student student = null;
		String firstName;
		String lastName;
		String fullName;
		for (int i = 0; i < students.length; i++) { // Searches for books with identical titles or ISBN
			firstName = students[i].getFirstName();
			lastName = students[i].getLastName();
			fullName = students[i].getFirstName() + " "
					+ students[i].getLastName();
			if (students[i] != null
					&& firstName.equalsIgnoreCase(query) == true) { // Do the first names match?
				student = students[i];
			}
			if (students[i] != null && lastName.equalsIgnoreCase(query) == true) { // Do the last names match?
				student = students[i];
			}
			if (students[i] != null && fullName.equalsIgnoreCase(query) == true) { // Does the full name match?
				student = students[i];
			}
			if (students[i] != null
					&& students[i].getStuNum() == Integer.parseInt(query)) { // Do the student number match?
				student = students[i];
			} else {
				JOptionPane // No search results have been found
						.showMessageDialog(null,
								"No students match the query '" + query + "'.");
			}
		}
		return student;
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
