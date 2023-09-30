package umsSPEC;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class HomePage extends JFrame implements ActionListener {
	
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	JTextArea lb2, lb2a;
	JLabel lbl;

	public HomePage(){
		super("SPEC - Home Page");
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.png"));
		Image img = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(img);
		setType(Type.NORMAL);
		setResizable(false);
		setBounds(105, 10, 1160, 700);
		setLayout(null);
		
		ImageIcon imgic = new ImageIcon(ClassLoader.getSystemResource("icons/SPA.jpg"));
		Image image = imgic.getImage().getScaledInstance(690, 315, Image.SCALE_DEFAULT);
		ImageIcon icn1 = new ImageIcon(image);
		lbl = new JLabel(icn1);
		lbl.setBounds(248, 210, 690, 315);
		this.add(lbl);
		
		ImageIcon imgic1 = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.png"));
		Image img1 = imgic1.getImage().getScaledInstance(150, 165, Image.SCALE_DEFAULT);
		ImageIcon icn2 = new ImageIcon(img1);
		JLabel lblimg = new JLabel(icn2);
		lblimg.setBounds(65, 25, 150, 150);
		this.add(lblimg);
		
		lb2 = new JTextArea("ST. PAUL'S ENGINEERING COLLEGE");
		lb2.setEditable(false);
		lb2.setForeground(new Color(118, 30, 30));
		lb2.setBackground(new Color(0, 0, 0, 0));
		lb2.setAlignmentX(CENTER_ALIGNMENT);
		lb2.setBounds(310, 60, 1050, 35);
		lb2.setFont(new Font("Lucida Sans", Font.BOLD, 35));
		lb2.setVisible(true);
		this.add(lb2);
		
		lb2a = new JTextArea("!!! Welcome to SPEC Online Portal !!!");
		lb2a.setEditable(false);
		lb2a.setForeground(new Color(92, 29, 29));
		lb2a.setBackground(new Color(0, 0, 0, 0));
		lb2a.setAlignmentX(CENTER_ALIGNMENT);
		lb2a.setBounds(428, 130, 525, 20);
		lb2a.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		lb2a.setVisible(true);
		this.add(lb2a);
		
		btn1 = new JButton();
		btn1.setText("New");
		btn1.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btn1.setBorder(BorderFactory.createBevelBorder(0));
		btn1.addActionListener(this);
		btn1.setBackground(new Color(14, 145, 149));
		btn1.setForeground(Color.BLACK);
		btn1.setBounds(95, 45, 90, 30);
		lbl.add(btn1);
		
		btn2 = new JButton();
		btn2.setText("Details");
		btn2.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btn2.setBorder(BorderFactory.createBevelBorder(0));
		btn2.addActionListener(this);
		btn2.setBackground(new Color(14, 145, 149));
		btn2.setForeground(Color.BLACK);
		btn2.setBounds(295, 45, 90, 30);
		lbl.add(btn2);
		
		btn3 = new JButton();
		btn3.setText("Attendance");
		btn3.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btn3.setBorder(BorderFactory.createBevelBorder(0));
		btn3.addActionListener(this);
		btn3.setBackground(new Color(14, 145, 149));
		btn3.setForeground(Color.BLACK);
		btn3.setBounds(485, 45, 140, 30);
		lbl.add(btn3);
		
		btn4 = new JButton();
		btn4.setText("Examination");
		btn4.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btn4.setBorder(BorderFactory.createBevelBorder(0));
		btn4.addActionListener(this);
		btn4.setBackground(new Color(14, 145, 149));
		btn4.setForeground(Color.BLACK);
		btn4.setBounds(65, 145, 140, 30);
		lbl.add(btn4);
		
		btn5 = new JButton();
		btn5.setText("Update");
		btn5.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btn5.setBorder(BorderFactory.createBevelBorder(0));
		btn5.addActionListener(this);
		btn5.setBackground(new Color(14, 145, 149));
		btn5.setForeground(Color.BLACK);
		btn5.setBounds(275, 145, 140, 30);
		lbl.add(btn5);
	
		btn6 = new JButton();
		btn6.setText("Fees");
		btn6.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btn6.setBorder(BorderFactory.createBevelBorder(0));
		btn6.addActionListener(this);
		btn6.setBackground(new Color(14, 145, 149));
		btn6.setForeground(Color.BLACK);
		btn6.setBounds(515, 145, 90, 30);
		lbl.add(btn6);
		
		btn7 = new JButton();
		btn7.setText("Utility");
		btn7.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btn7.setBorder(BorderFactory.createBevelBorder(0));
		btn7.addActionListener(this);
		btn7.setBackground(new Color(14, 145, 149));
		btn7.setForeground(Color.BLACK);
		btn7.setBounds(95, 235, 90, 30);
		lbl.add(btn7);
		
		btn8 = new JButton();
		btn8.setText("About");
		btn8.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btn8.setBorder(BorderFactory.createBevelBorder(0));
		btn8.addActionListener(this);
		btn8.setBackground(new Color(14, 145, 149));
		btn8.setForeground(Color.BLACK);
		btn8.setBounds(295, 235, 90, 30);
		lbl.add(btn8);
		
		btn9 = new JButton();
		btn9.setText("Exit");
		btn9.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		btn9.setBorder(BorderFactory.createBevelBorder(0));
		btn9.addActionListener(this);
		btn9.setBackground(new Color(14, 145, 149));
		btn9.setForeground(Color.BLACK);
		btn9.setBounds(515, 235, 90, 30);
		lbl.add(btn9);
	
		
		getContentPane().setBackground(new Color(224, 246, 249));
	
	}
	
	public void actionPerformed(ActionEvent e){
		
		if (e.getSource()==btn1)
			new New().main(null);
		else if (e.getSource()==btn2)
			new Details().setVisible(true);
		else if (e.getSource()==btn3)
			new Attendance().setVisible(true);
		else if (e.getSource()==btn4)
			new Exam().setVisible(true);
		else if (e.getSource()==btn5)
			new Update().setVisible(true);
		else if (e.getSource()==btn6)
			new Fees().setVisible(true);
		else if (e.getSource()==btn7)
			new Utility().setVisible(true);
		else if (e.getSource()==btn8)
			new AboutUs().setVisible(true);
		else if (e.getSource() == btn9){
			JOptionPane.showMessageDialog(null, "Thanks for Visiting SPEC Online Portal");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		HomePage hp = new HomePage();
		hp.setVisible(true);
	}

}
