package umsSPEC;

import java.awt.*;

import javax.swing.*;

import java.awt.ActiveEvent;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Details extends JFrame implements ActionListener{

	JButton btn1, btn2, btn3;
	JLabel lb1;
	
	public Details() {
		super("SPEC - Details");
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.jpg"));
		Image imgicon = icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon);
		setType(Type.NORMAL);
		setResizable(false);
		setBounds(348, 278, 610, 255);
		setLayout(null);
		
		lb1 = new JLabel("!!! Choose to View Student / Faculty Details!!!");
		lb1.setBounds(100, 15, 620, 21);
		lb1.setBackground(new Color(0, 0, 0, 0));
		lb1.setForeground(new Color(118, 30, 30));
		lb1.setVisible(true);
		lb1.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 20));
		this.add(lb1);
		
		ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icons/icon3.png"));
		Image imgicon3 = icon3.getImage().getScaledInstance(22, 22, Image.SCALE_DEFAULT);
		btn1 = new JButton("Student Details", new ImageIcon(imgicon3));
		btn1.setBounds(110, 70, 180, 30);
		btn1.addActionListener(this);
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setForeground(Color.BLACK);
		btn1.setVisible(true);
		this.add(btn1);
		
		ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icons/icon4.jpg"));
		Image imgicon4 = icon4.getImage().getScaledInstance(19, 19, Image.SCALE_DEFAULT);
		btn2 = new JButton("Faculty Details", new ImageIcon(imgicon4));
		btn2.setBounds(320, 70, 180, 30);
		btn2.addActionListener(this);
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setForeground(Color.BLACK);
		btn2.setVisible(true);
		this.add(btn2);
		
		ImageIcon icn3 = new ImageIcon(ClassLoader.getSystemResource("icons/icon18a.png"));
		Image imicon3 = icn3.getImage().getScaledInstance(14, 14, Image.SCALE_DEFAULT);
		btn3 = new JButton("  Back", new ImageIcon(imicon3));
		btn3.addActionListener(this);
		btn3.setBounds(245, 125, 140, 30);
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setForeground(Color.BLACK);
		btn3.setVisible(true);
		this.add(btn3);
		
		getContentPane().setBackground(new Color(209, 255, 250));
	}

	public void actionPerformed(ActionEvent a){
	    
		if (a.getSource()==btn1){
			StudentDetails sd = new StudentDetails();
			sd.setVisible(true);
			this.setVisible(false);
		}
	    else if (a.getSource()==btn2){
			new TeacherDetails().setVisible(true);
			this.setVisible(false);
		}
		if (a.getSource()==btn3){
			this.setVisible(false);
		}
			
	}
	
	public static void main(String[] args) {
		new Details().setVisible(true);
	}

}
