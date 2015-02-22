//import javax.swing.JOptionPane;
//
//import java.awt.BorderLayout;
//import java.awt.GridBagConstraints;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.FontFormatException;
//import java.awt.GraphicsEnvironment;
//import java.awt.Insets;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Window;
//import java.io.File;
//import java.io.IOException;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
//import java.awt.Font;
//import java.awt.FontFormatException;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
//public class MainRC {
//	private static Book[] books;
//	private static Student[] students;
//	private Library library;
//
//	public static void main(String[] args) {
//		// Launches welcome screen, asks for one-time setup information
////		String input = JOptionPane
////				.showInputDialog("How many books will be stored in this library system?");
////		int numBooks = Integer.parseInt(input);
////		books = new Book[numBooks];
////		input = JOptionPane
////				.showInputDialog("How many students will be stored in this library system?");
////		int numStudents = Integer.parseInt(input);
////		students = new Student[numStudents];
////		Library library = new Library(numBooks, numStudents);
//		books = new Book[100]; // TO REMOVE
//		students = new Student[100]; // TO REMOVE
//		Library library = new Library(100, 100); // TO REMOVE
//		String input =""; // remove
//		
//		// Launches splash screen
////		SplashThread splashThread = new SplashThread();
////		splashThread.start();
//		final SplashScreen splash = new SplashScreen();
//		splash.setVisible(true);
//		ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor(); 
//		s.schedule(new Runnable() {
//		    public void run() {
//		    	splash.setVisible(false);
//		    	splash.dispose();
//		    }
//		}, 1, TimeUnit.SECONDS); // change to 8
//
//		ScheduledExecutorService s2 = Executors.newSingleThreadScheduledExecutor(); 
//		s2.schedule(new Runnable() {
//		    public void run() {
//		    	// Launches home screen
//				HomeScreenRC home = new HomeScreenRC();
//				home.setVisible(true);
//		    }
//		}, 1, TimeUnit.SECONDS); // change to 8
//		
//		
//		// TRIGGER THE FOLLOWING IF USER CREATES NEW BOOK
//		for (int i = 0; i < books.length; i++) {
//			if (books[i] == null) {
//				String title = JOptionPane.showInputDialog("Title of Book:");
//				for (int x = 0; x < books.length; x++) { // Search for books with identical titles
//					if (books[x].getTitle().equalsIgnoreCase(title) == true) {
//						JOptionPane // Show error message
//								.showMessageDialog(null, "The book " + title
//										+ " already exists.");
//					}
//				}
//				String author = JOptionPane.showInputDialog("Author of Book:");
//				input = JOptionPane.showInputDialog("Book ISBN Code:");
//				int ISBN = Integer.parseInt(input);
//				for (int x = 0; x < books.length; x++) { // Search for books with identical ISBN
//					if (books[x].getISBN() == ISBN) {
//						JOptionPane // Show error message
//								.showMessageDialog(null, "The book ISBN "
//										+ ISBN + " already exists.");
//					}
//				}
//				String category = JOptionPane
//						.showInputDialog("Catagory of Book:");
//				input = JOptionPane.showInputDialog("Book Cost:");
//				double cost = Double.parseDouble(input);
//				input = JOptionPane.showInputDialog("Book Rating:");
//				double rating = Double.parseDouble(input);
//				books[i] = new Book(title, author, ISBN, category, cost, rating);
//				break;
//			}
//		}
//
//		// TRIGGER WHEN USER CREATES NEW STUDENT
//		for (int i = 0; i < students.length; i++) {
//			if (students[i] == null) {
//				String firstName = JOptionPane
//						.showInputDialog("Student First Name:");
//				String lastName = JOptionPane
//						.showInputDialog("Student Last Name:");
//				input = JOptionPane
//						.showInputDialog("Student PDSB Identification Number:");
//				int stuNum = Integer.parseInt(input);
//				for (int x = 0; x < books.length; x++) { // Search for users with identical student number
//					if (students[x].getStuNum() == stuNum) {
//						JOptionPane // Show error message
//								.showMessageDialog(null, "The student number "
//										+ stuNum + " already exists.");
//					}
//				}
//				students[i] = new Student(firstName, lastName, stuNum);
//				break;
//			}
//		}
//
//		// TRIGGER WHEN USER DELETS NEW STUDENT
//		// books[i] = null;
//
//	}
//
//	public void deleteBook(Book[] books, int i) {
//		books[i] = null;
//	}
//
//	public void deleteStudent(Student[] students, int i) {
//		students[i] = null;
//	}
//
//	public Book searchBook(String query) {
//		Book book = null;
//		String title;
//		for (int i = 0; i < books.length; i++) { // Searches for books with identical titles or ISBN
//			title = books[i].getTitle();
//			if (title.equalsIgnoreCase(query) == true) { // Do the book titles match?
//				book = books[i];
//			}
//			if (books[i].getISBN() == Integer.parseInt(query)) { // Do the ISBN codes match?
//				book = books[i];
//			} else {
//				JOptionPane // No search results have been found
//						.showMessageDialog(null, "No books match the query '"
//								+ query + "'.");
//			}
//		}
//		return book;
//	}
//
//	public Student searchStudent(String query) {
//		Student student = null;
//		String firstName;
//		String lastName;
//		String fullName;
//		for (int i = 0; i < students.length; i++) { // Searches for books with identical titles or ISBN
//			firstName = students[i].getFirstName();
//			lastName = students[i].getLastName();
//			fullName = students[i].getFirstName() + " "
//					+ students[i].getLastName();
//			if (firstName.equalsIgnoreCase(query) == true) { // Do the first names match?
//				student = students[i];
//			}
//			if (lastName.equalsIgnoreCase(query) == true) { // Do the last names match?
//				student = students[i];
//			}
//			if (fullName.equalsIgnoreCase(query) == true) { // Does the full name match?
//				student = students[i];
//			}
//			if (students[i].getStuNum() == Integer.parseInt(query)) { // Do the student number match?
//				student = students[i];
//			} else {
//				JOptionPane // No search results have been found
//						.showMessageDialog(null,
//								"No students match the query '" + query + "'.");
//			}
//		}
//		return student;
//	}
//
//	
//	
//}
