package umsSPEC;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame{// implements ActionListener{
	
	public Home(){
		super("SPEC - Home Page");
		setBounds(70, 10, 1200, 700);
		setType(Type.UTILITY);
		setResizable(false);
		
		ImageIcon imgic = new ImageIcon(ClassLoader.getSystemResource("icons/SPA.jpg"));
		Image img = imgic.getImage().getScaledInstance(1200, 700, Image.SCALE_SMOOTH);
		ImageIcon icn2 = new ImageIcon(img);
		JLabel lbl = new JLabel(icn2);
		this.add(lbl);
		
		JMenuBar mb = new JMenuBar();
		
		JMenu NEW = new JMenu("New");
		NEW.setForeground(Color.BLUE);
		JMenuItem m1 = new JMenuItem("New Student");
		JMenuItem m2 = new JMenuItem("New Faculty");
		
		m1.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon1.png"));
		Image imgicon1 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		m1.setIcon(new ImageIcon(imgicon1));
		m1.setMnemonic('A');
		m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		m1.setBackground(Color.WHITE);
		//m1.addActionListener(this);
		
		m2.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icons/icon2.png"));
		Image imgicon2 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		m2.setIcon(new ImageIcon(imgicon2));
		m2.setMnemonic('B');
		m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		m2.setBackground(Color.WHITE);
		//m2.addActionListener(this);
		
		
		JMenu details = new JMenu("Details");
		details.setForeground(Color.RED);
		JMenuItem m3 = new JMenuItem("Student Details");
		JMenuItem m4 = new JMenuItem("Faculty Details");
		
		m3.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icons/icon3.png"));
		Image imgicon3 = icon3.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		m3.setIcon(new ImageIcon(imgicon3));
		m3.setMnemonic('C');
		m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		m3.setBackground(Color.WHITE);
		//m3.addActionListener(this);
		
		m4.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icons/icon4.png"));
		Image imgicon4 = icon4.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		m4.setIcon(new ImageIcon(imgicon4));
		m4.setMnemonic('D');
		m4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		m4.setBackground(Color.WHITE);
	//	m4.addActionListener(this);
		
		
		JMenu attendance = new JMenu("Attendance");
		attendance.setForeground(Color.BLUE);
		JMenuItem a1 = new JMenuItem("Student Attendance");
		JMenuItem a2 = new JMenuItem("Faculty Attendance");
		JMenuItem a3 = new JMenuItem("Student Attendance Details");
		JMenuItem a4 = new JMenuItem("Faculty Attendance Details");
		
		a1.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icons/icon16.png"));
		Image imgicon5 = icon5.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		a1.setIcon(new ImageIcon(imgicon5));
		a1.setMnemonic('E');
		a1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		a1.setBackground(Color.WHITE);
		//a1.addActionListener(this);
		
		a2.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icons/icon17.png"));
		Image imgicon6 = icon6.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		a2.setIcon(new ImageIcon(imgicon6));
		a2.setMnemonic('F');
		a2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		a2.setBackground(Color.WHITE);
		//a2.addActionListener(this);
		
		a3.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icons/icon15.png"));
		Image imgicon7 = icon7.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		a3.setIcon(new ImageIcon(imgicon7));
		a3.setMnemonic('G');
		a3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
		a3.setBackground(Color.WHITE);
	//	a3.addActionListener(this);
		
		a4.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icons/icon14.png"));
		Image imgicon8 = icon8.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		a4.setIcon(new ImageIcon(imgicon8));
		a4.setMnemonic('H');
		a4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		a4.setBackground(Color.WHITE);
		//a4.addActionListener(this);
		
		
		JMenu exam = new JMenu("Examination");
		exam.setForeground(Color.BLUE);
		JMenuItem e1 = new JMenuItem("Examination Details");
		JMenuItem e2 = new JMenuItem("Enter Marks");
		
		e1.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icons/icon16.png"));
		Image imgicon9 = icon9.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		e1.setIcon(new ImageIcon(imgicon9));
		e1.setMnemonic('I');
		e1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
		e1.setBackground(Color.WHITE);
		//e1.addActionListener(this);
		
		e2.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icons/icon17.png"));
		Image imgicon10 = icon10.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		e2.setIcon(new ImageIcon(imgicon10));
		e2.setMnemonic('J');
		e2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
		e2.setBackground(Color.WHITE);
		//e2.addActionListener(this);
		
		
		JMenu update = new JMenu("Update");
		update.setForeground(Color.BLUE);
		JMenuItem u1 = new JMenuItem("Update Student");
		JMenuItem u2 = new JMenuItem("Update Faculty");
		
		u1.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icons/icon5.png"));
		Image imgicon11 = icon11.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		u1.setIcon(new ImageIcon(imgicon11));
		u1.setMnemonic('K');
		u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
		u1.setBackground(Color.WHITE);
		//u1.addActionListener(this);
		
		u2.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("icons/icon6.png"));
		Image imgicon12 = icon12.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		u2.setIcon(new ImageIcon(imgicon12));
		u2.setMnemonic('L');
		u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, ActionEvent.CTRL_MASK));
		u2.setBackground(Color.WHITE);
		//u2.addActionListener(this);
		
		
		JMenu fees = new JMenu("Fees");
		fees.setForeground(Color.BLUE);
		JMenuItem f1 = new JMenuItem("Student Details");
		
		f1.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon13 = new ImageIcon(ClassLoader.getSystemResource("icons/icon7.png"));
		Image imgicon13 = icon13.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		f1.setIcon(new ImageIcon(imgicon13));
		f1.setMnemonic('M');
		f1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, ActionEvent.CTRL_MASK));
		f1.setBackground(Color.WHITE);
	//	f1.addActionListener(this);
		
		
		JMenu utility = new JMenu("Utility");
		utility.setForeground(Color.BLUE);
		JMenuItem ut1 = new JMenuItem("Calculator");
		JMenuItem ut2 = new JMenuItem("Notepad");
		
		ut1.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("icons/icon10.png"));
		Image imgicon14 = icon14.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		ut1.setIcon(new ImageIcon(imgicon14));
		ut1.setMnemonic('N');
		ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
		ut1.setBackground(Color.WHITE);
	//	ut1.addActionListener(this);
		
		ut2.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon15 = new ImageIcon(ClassLoader.getSystemResource("icons/icon9.png"));
		Image imgicon15 = icon15.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		ut2.setIcon(new ImageIcon(imgicon15));
		ut2.setMnemonic('O');
		ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
		ut2.setBackground(Color.WHITE);
	//	ut2.addActionListener(this);
		
		
		JMenu about = new JMenu("About");
		about.setForeground(Color.BLUE);
		JMenuItem ab1 = new JMenuItem("About Us");
		
		ab1.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("icons/icon13.png"));
		Image imgicon16 = icon16.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		ab1.setIcon(new ImageIcon(imgicon16));
		ab1.setMnemonic('Y');
		ab1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		ab1.setBackground(Color.WHITE);
		//ab1.addActionListener(this);
		
		
		JMenu exit = new JMenu("Exit");
		exit.setForeground(Color.BLUE);
		JMenuItem ex1 = new JMenuItem("Exit Portal");
		
		ex1.setFont(new Font("monospaced", Font.BOLD, 16));
		ImageIcon icon17 = new ImageIcon(ClassLoader.getSystemResource("icons/icon12.png"));
		Image imgicon17 = icon17.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		ex1.setIcon(new ImageIcon(imgicon17));
		ex1.setMnemonic('Z');
		ex1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
		ex1.setBackground(Color.WHITE);
	//	ex1.addActionListener(this);
	
		
		NEW.add(m1);
		NEW.add(m2);
		details.add(m3);
		details.add(m4);
		attendance.add(a1);
		attendance.add(a2);
		attendance.add(a3);
		attendance.add(a4);
		exam.add(e1);
		exam.add(e2);
		update.add(u1);
		update.add(u2);
		fees.add(f1);
		utility.add(ut1);
		utility.add(ut2);
		about.add(ab1);
		exit.add(ex1);
		
		
		mb.add(NEW);
		mb.add(details);
		mb.add(attendance);
		mb.add(exam);
		mb.add(update);
		mb.add(fees);
		mb.add(utility);
		mb.add(about);
		mb.add(exit);
		
		lbl.add(mb);
		setJMenuBar(mb);
		setFont(new Font("Serif", Font.BOLD, 16));
		setLayout(new FlowLayout());
		setVisible(false);
		
		
	}
//	
//	public void actionPerformed(ActionEvent e){
//		
//	}
	
	public static void main(String[] args) {
		new Home().setVisible(true);
	}

}
