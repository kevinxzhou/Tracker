//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
//import java.awt.Insets;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import com.apple.eawt.Application;
//
//import javax.print.DocFlavor.URL;
//import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JMenu;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;
//import javax.swing.JPanel;
//import javax.swing.JSeparator;
//import javax.swing.JTextField;
//import javax.swing.JTextPane;
//
//@SuppressWarnings("restriction")
//public class HomeScreenRC extends JFrame implements ActionListener {
//
//	private JFrame frame;
//	private JTextField tf1;
//	private JTextField tf2;
//	private JPanel panel_1;
//	private static final long serialVersionUID = 1L;
//
//	public HomeScreenRC() {
//		super ("qeqwe");
//		initialize();
//	}
//
//	public void initialize() {
//		// Setup window properties
//				frame = new JFrame();
//				int winx = 1000;
//				int winy = 700;
//				setSize(winx, winy);
//				setLocationRelativeTo(null);
//				setIconImage(new ImageIcon("images/icon.png").getImage());
//				Application.getApplication().setDockIconImage(
//						new ImageIcon("images/icon.png").getImage());
//				frame.getContentPane().setForeground(Color.DARK_GRAY);
//				frame.getContentPane().setBackground(Color.DARK_GRAY);
//				frame.setBounds(100, 100, 755, 534);
//				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//				// Setup grid bag layout
//				GridBagLayout gridBagLayout = new GridBagLayout();
//				gridBagLayout.columnWidths = new int[] { 386, 300, 0 };
//				gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0 };
//				gridBagLayout.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
//				gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0,
//						Double.MIN_VALUE };
//				frame.getContentPane().setLayout(gridBagLayout);
//
//				// Menu Bar
//				JMenuBar mb = new JMenuBar();
//				JMenu m1 = new JMenu("Tracker");
//				JMenuItem close = new JMenuItem("Close Program");
//				m1.add(close);
//				m1.add(new JSeparator());
//				JMenuItem about = new JMenuItem("About");
//				m1.add(about);
//				JMenu m2 = new JMenu("Edit");
//				JMenuItem newBook = new JMenuItem("New Book");
//				m2.add(newBook);
//				JMenuItem newStudent = new JMenuItem("New Student");
//				m2.add(newStudent);
//				JMenuItem deleteBook = new JMenuItem("Delete Book");
//				m2.add(deleteBook);
//				JMenuItem deleteStudent = new JMenuItem("Delete Student");
//				m2.add(deleteStudent);
//				JMenu m3 = new JMenu("Tools");
//				JMenuItem searchBook = new JMenuItem("Search Book");
//				m3.add(searchBook);
//				JMenuItem searchStudent = new JMenuItem("Search Student");
//				m3.add(searchStudent);
//				JMenuItem checkInBook = new JMenuItem("Check In Book");
//				m3.add(checkInBook);
//				JMenuItem checkOutBook = new JMenuItem("Check Out Book");
//				m3.add(checkOutBook);
//				mb.add(m1);
//				mb.add(m2);
//				mb.add(m3);
//				frame.add(mb);
//				add(mb, BorderLayout.NORTH);
//		
//		JLabel lblSearchForBooks = new JLabel("Search For Books");
//		lblSearchForBooks.setForeground(Color.GRAY);
//		GridBagConstraints gbc_lblSearchForBooks = new GridBagConstraints();
//		gbc_lblSearchForBooks.insets = new Insets(0, 0, 5, 5);
//		gbc_lblSearchForBooks.gridx = 0;
//		gbc_lblSearchForBooks.gridy = 0;
//		frame.getContentPane().add(lblSearchForBooks, gbc_lblSearchForBooks);
//		
//		JLabel lblSearchForStudents = new JLabel("Search For Students");
//		lblSearchForStudents.setForeground(Color.GRAY);
//		GridBagConstraints gbc_lblSearchForStudents = new GridBagConstraints();
//		gbc_lblSearchForStudents.insets = new Insets(0, 0, 5, 0);
//		gbc_lblSearchForStudents.gridx = 1;
//		gbc_lblSearchForStudents.gridy = 0;
//		frame.getContentPane().add(lblSearchForStudents, gbc_lblSearchForStudents);
//		
//		JPanel panel_1 = new JPanel();
//		panel_1.setBackground(Color.BLACK);
//		panel_1.setLayout(null);
//		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
//		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
//		gbc_panel_1.fill = GridBagConstraints.BOTH;
//		gbc_panel_1.gridx = 0;
//		gbc_panel_1.gridy = 1;
//		frame.getContentPane().add(panel_1, gbc_panel_1);
//		
//		tf1 = new JTextField();
//		tf1.setForeground(Color.LIGHT_GRAY);
//		tf1.setBackground(Color.DARK_GRAY);
//		tf1.setText("Enter a Book Title or ISBN");
//		tf1.setBounds(6, 6, 230, 28);
//		panel_1.add(tf1);
//		tf1.setColumns(10);
//		
//		JButton search1 = new JButton("Search");
//		search1.setBackground(Color.DARK_GRAY);
//		search1.setBounds(237, 7, 117, 29);
//		panel_1.add(search1);
//		
//		JPanel bookImage = new JPanel();
//		bookImage.setBounds(6, 46, 113, 143);
//		panel_1.add(bookImage);
//		
//		JTextPane info1 = new JTextPane();
//		info1.setForeground(Color.LIGHT_GRAY);
//		info1.setBackground(Color.DARK_GRAY);
//		info1.setEditable(false);
//		info1.setText("Author: Yann Martel\nISBN: 9780676973761\nCategory: Fiction\nRating (Out of Five): 4.5\nOwner: Kevin Zhou\nDays Borrowed: 4\nIs Lost?: False");
//		info1.setBounds(131, 74, 223, 115);
//		panel_1.add(info1);
//		
//		JButton signOut = new JButton("Sign Out");
//		signOut.setBounds(6, 201, 117, 29);
//		panel_1.add(signOut);
//		
//		JButton signIn = new JButton("Sign In");
//		signIn.setBounds(6, 230, 117, 29);
//		panel_1.add(signIn);
//		
//		JButton reportLost = new JButton("Report Lost");
//		reportLost.setBounds(6, 258, 117, 29);
//		panel_1.add(reportLost);
//		
//		JLabel bookName = new JLabel("Life of Pi");
//		bookName.setForeground(Color.LIGHT_GRAY);
//		bookName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
//		bookName.setBounds(131, 46, 222, 16);
//		panel_1.add(bookName);
//		
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.BLACK);
//		panel.setLayout(null);
//		GridBagConstraints gbc_panel = new GridBagConstraints();
//		gbc_panel.insets = new Insets(0, 0, 5, 0);
//		gbc_panel.fill = GridBagConstraints.BOTH;
//		gbc_panel.gridx = 1;
//		gbc_panel.gridy = 1;
//		frame.getContentPane().add(panel, gbc_panel);
//		
//		tf2 = new JTextField();
//		tf2.setText("Enter a Name or Student Number");
//		tf2.setBounds(6, 6, 230, 28);
//		panel.add(tf2);
//		tf2.setColumns(10);
//		
//		JButton search2 = new JButton("Search");
//		search2.setBounds(236, 7, 117, 29);
//		panel.add(search2);
//		
//		JTextPane info2 = new JTextPane();
//		info2.setBackground(Color.DARK_GRAY);
//		info2.setForeground(Color.LIGHT_GRAY);
//		info2.setText("Kevin Zhou (555757)\nFines: $1.10");
//		info2.setEditable(false);
//		info2.setBounds(131, 75, 222, 76);
//		panel.add(info2);
//		
//		JButton reduceFines = new JButton("Reduce Fines");
//		reduceFines.setBounds(131, 160, 117, 29);
//		panel.add(reduceFines);
//		
//		JTextPane borrowed1 = new JTextPane();
//		borrowed1.setText("Life of Pi\n4 Days\nNot Overdue");
//		borrowed1.setEditable(false);
//		borrowed1.setBounds(68, 229, 290, 65);
//		panel.add(borrowed1);
//		
//		JPanel borrowed1Image = new JPanel();
//		borrowed1Image.setBounds(6, 229, 50, 65);
//		panel.add(borrowed1Image);
//		
//		JPanel studentImage = new JPanel();
//		studentImage.setBounds(6, 46, 113, 143);
//		panel.add(studentImage);
//		
//		JLabel booksBorrowed = new JLabel("Books Borrowed:");
//		booksBorrowed.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
//		booksBorrowed.setBounds(6, 201, 347, 16);
//		panel.add(booksBorrowed);
//		
//		JLabel stuName = new JLabel("Kevin Zhou (555757)");
//		stuName.setForeground(Color.LIGHT_GRAY);
//		stuName.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
//		stuName.setBounds(131, 46, 222, 16);
//		panel.add(stuName);
//		
//		JTextPane borrowed2 = new JTextPane();
//		borrowed2.setText("Life of Pi\n4 Days\nNot Overdue");
//		borrowed2.setEditable(false);
//		borrowed2.setBounds(68, 304, 290, 65);
//		panel.add(borrowed2);
//		
//		JPanel borrowed2Image = new JPanel();
//		borrowed2Image.setBounds(6, 304, 50, 65);
//		panel.add(borrowed2Image);
//		
//		JTextPane borrowed3 = new JTextPane();
//		borrowed3.setText("Life of Pi\n4 Days\nNot Overdue");
//		borrowed3.setEditable(false);
//		borrowed3.setBounds(68, 381, 290, 65);
//		panel.add(borrowed3);
//		
//		JPanel borrowed3Image = new JPanel();
//		borrowed3Image.setBounds(6, 381, 50, 65);
//		panel.add(borrowed3Image);
//		
//		JButton newDay = new JButton("End Day/Start New Day");
//		GridBagConstraints gbc_newDay = new GridBagConstraints();
//		gbc_newDay.insets = new Insets(0, 0, 0, 5);
//		gbc_newDay.gridx = 0;
//		gbc_newDay.gridy = 2;
//		frame.getContentPane().add(newDay, gbc_newDay);
//		
//		JLabel credits = new JLabel("SLSS Library Book System Tracker | Developed by Kevin Zhou");
//		credits.setForeground(Color.GRAY);
//		GridBagConstraints gbc_credits = new GridBagConstraints();
//		gbc_credits.anchor = GridBagConstraints.EAST;
//		gbc_credits.gridx = 1;
//		gbc_credits.gridy = 2;
//		frame.getContentPane().add(credits, gbc_credits);
//	}
//	
//	private void setBackgroundColor(String string) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
