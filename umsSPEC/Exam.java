package umsSPEC;

import java.awt.*;

import javax.swing.*;

import java.awt.ActiveEvent;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exam extends JFrame implements ActionListener{

	JButton btn1, btn2, btn3;
	JLabel lb1;
	
	public Exam() {
		super("SPEC - Examination");
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.jpg"));
		Image imgicon = icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon);
		setType(Type.NORMAL);
		setResizable(false);
		setBounds(348, 278, 610, 255);
		setLayout(null);
		
		lb1 = new JLabel("!!! Choose to Enter Marks / View Exam Details !!!");
		lb1.setBounds(65, 15, 620, 21);
		lb1.setBackground(new Color(0, 0, 0, 0));
		lb1.setForeground(new Color(118, 30, 30));
		lb1.setVisible(true);
		lb1.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 20));
		this.add(lb1);
		
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon17.png"));
		Image imgicon1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		btn1 = new JButton("Enter Marks", new ImageIcon(imgicon1));
		btn1.setBounds(130, 70, 140, 30);
		btn1.addActionListener(this);
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setForeground(Color.BLACK);
		btn1.setVisible(true);
		this.add(btn1);
		
		ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icons/icon16.png"));
		Image imgicon2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		btn2 = new JButton("Exam Details", new ImageIcon(imgicon2));
		btn2.setBounds(300, 70, 140, 30);
		btn2.addActionListener(this);
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setForeground(Color.BLACK);
		btn2.setVisible(true);
		this.add(btn2);
		
		ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icons/icon18a.png"));
		Image imicon3 = icon3.getImage().getScaledInstance(14, 14, Image.SCALE_DEFAULT);
		btn3 = new JButton("  Back", new ImageIcon(imicon3));
		btn3.addActionListener(this);
		btn3.setBounds(210, 125, 140, 30);
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setForeground(Color.BLACK);
		btn3.setVisible(true);
		this.add(btn3);
		
		getContentPane().setBackground(new Color(209, 255, 250));
	}

	public void actionPerformed(ActionEvent a){
	    
		if (a.getSource()==btn1){
			new EnterMarks().setVisible(true);
			this.setVisible(false);
		}
	    if (a.getSource()==btn2){
			new ExamDetails().setVisible(true);
			this.setVisible(false);
		}
		if (a.getSource()==btn3)
			this.setVisible(false);
			
	}
	
	public static void main(String[] args) {
		new Exam().setVisible(true);
	}

}