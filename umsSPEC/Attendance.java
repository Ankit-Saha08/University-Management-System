package umsSPEC;

import java.awt.*;

import javax.swing.*;

import java.awt.ActiveEvent;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Attendance extends JFrame implements ActionListener {

	JButton btn1, btn2, btn3, btn4, btn5;
	JLabel lb1;
	
	public Attendance() {
		super("SPEC - Attendance");
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.jpg"));
		Image imgicon = icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon);
		setType(Type.NORMAL);
		setResizable(false);
		setBounds(348, 278, 610, 260);
		setLayout(null);
		
		lb1 = new JLabel("!!! Attendance Section !!!");
		lb1.setBounds(169, 15, 620, 21);
		lb1.setBackground(new Color(0, 0, 0, 0));
		lb1.setForeground(new Color(118, 30, 30));
		lb1.setVisible(true);
		lb1.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 20));
		this.add(lb1);
		
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon16.png"));
		Image imgicon1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		btn1 = new JButton("Student Attendance", new ImageIcon(imgicon1));
		btn1.setBounds(30, 70, 250, 30);
		btn1.addActionListener(this);
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setForeground(Color.BLACK);
		btn1.setVisible(true);
		this.add(btn1);
		
		ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icons/icon17.png"));
		Image imgicon2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		btn2 = new JButton("Teacher Attendance", new ImageIcon(imgicon2));
		btn2.setBounds(300, 70, 250, 30);
		btn2.addActionListener(this);
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setForeground(Color.BLACK);
		btn2.setVisible(true);
		this.add(btn2);
		
		ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icons/icon15.png"));
		Image imgicon11 = icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		btn4 = new JButton("Student Attendance Details", new ImageIcon(imgicon11));
		btn4.setBounds(30, 120, 250, 30);
		btn4.addActionListener(this);
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setForeground(Color.BLACK);
		btn4.setVisible(true);
		this.add(btn4);
		
		ImageIcon icon22 = new ImageIcon(ClassLoader.getSystemResource("icons/icon15.png"));
		Image imgicon22 = icon22.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		btn5 = new JButton("Teacher Attendance Details", new ImageIcon(imgicon22));
		btn5.setBounds(300, 120, 250, 30);
		btn5.addActionListener(this);
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setForeground(Color.BLACK);
		btn5.setVisible(true);
		this.add(btn5);
		
		ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icons/icon18a.png"));
		Image imicon3 = icon3.getImage().getScaledInstance(14, 14, Image.SCALE_DEFAULT);
		btn3 = new JButton("  Back", new ImageIcon(imicon3));
		btn3.addActionListener(this);
		btn3.setBounds(210, 167, 140, 30);
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setForeground(Color.BLACK);
		btn3.setVisible(true);
		this.add(btn3);						
		
		getContentPane().setBackground(new Color(209, 255, 250));
	}

	public void actionPerformed(ActionEvent a){
	    
		if (a.getSource()==btn1){
			new StudentAttendance().setVisible(true);
			this.setVisible(false);
		}
	    if (a.getSource()==btn2){
			new TeacherAttendance().setVisible(true);
			this.setVisible(false);
		}
	    if (a.getSource()==btn4){
			new StudAttDetails().setVisible(true);
			this.setVisible(false);
		}
	    if (a.getSource()==btn5){
			new TeachAttDetails().setVisible(true);
			this.setVisible(false);
		}
		if (a.getSource()==btn3)
			this.setVisible(false);
			
	}
	
	

	public static void main(String[] args) {
		new Attendance().setVisible(true);

	}

}
