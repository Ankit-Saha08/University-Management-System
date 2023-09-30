package umsSPEC;

import java.awt.*;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Utility extends JFrame implements ActionListener{

	JButton btn1, btn2, btn3;
	JLabel lb1;
	
	public Utility() {
		super("SPEC - Utility");
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/icon6.png"));
		Image imgicon = icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon);
		setType(Type.NORMAL);
		setResizable(false);
		setBounds(348, 278, 610, 255);
		setLayout(null);
	
		getContentPane().setBackground(new Color(255, 250, 199)); 
		
		lb1 = new JLabel("!!! Quick Notes / Calculate !!!");
		lb1.setBounds(155, 15, 620, 21);
		lb1.setBackground(new Color(0, 0, 0, 0));
		lb1.setForeground(new Color(118, 30, 30));
		lb1.setVisible(true);
		lb1.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 20));
		this.add(lb1);
		
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon9.png"));
		Image imgicon1 = icon1.getImage().getScaledInstance(23, 23, Image.SCALE_DEFAULT);
		btn1 = new JButton("Notepad", new ImageIcon(imgicon1));
		btn1.setBounds(130, 70, 140, 35);
		btn1.addActionListener(this);
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setForeground(Color.BLACK);
		btn1.setVisible(true);
		this.add(btn1);
		
		ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icons/icon10.png"));
		Image imgicon2 = icon2.getImage().getScaledInstance(34, 34, Image.SCALE_DEFAULT);
		btn2 = new JButton("Calculator", new ImageIcon(imgicon2));
		btn2.setBounds(320, 70, 140, 35);
		btn2.addActionListener(this);
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setForeground(Color.BLACK);
		btn2.setVisible(true);
		this.add(btn2);
		
		ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icons/icon18a.png"));
		Image imicon3 = icon3.getImage().getScaledInstance(14, 14, Image.SCALE_DEFAULT);
		btn3 = new JButton("  Back", new ImageIcon(imicon3));
		btn3.addActionListener(this);
		btn3.setBounds(220, 140, 140, 40);
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setForeground(Color.BLACK);
		btn3.setVisible(true);
		this.add(btn3);
	}

	public void actionPerformed(ActionEvent e){
		
		if (e.getSource()==btn1){
			try{
				Runtime.getRuntime().exec("notepad.exe"); 
				this.setVisible(false);
			}
			catch (Exception exeception){ exeception.printStackTrace();}
		}
		if (e.getSource()==btn2){
			try{
				Runtime.getRuntime().exec("D:\\JAVA_SWING_FX_Projects\\SimpleCalculator.exe");
				this.setVisible(false);
			}
			catch (Exception exeception){ exeception.printStackTrace();}
		}
		if (e.getSource()==btn3)
			this.setVisible(false);
	}
	
	public static void main(String[] args) {
		new Utility().setVisible(true);
	}

}
