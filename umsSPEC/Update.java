package umsSPEC;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Update extends JFrame implements ActionListener{
		
		JLabel lb1;
		JButton btn1, btn2, btn3;
		
		public Update() {
			super("SPEC - Update");
			ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.jpg"));
			Image imgicon = icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
			setIconImage(imgicon);
			setType(Type.NORMAL);
			setResizable(false);
			setBounds(348, 278, 610, 255);
			setLayout(null);
		
			getContentPane().setBackground(new Color(255, 250, 199));
			
			lb1 = new JLabel("!!! Choose to Update Student / Faculty !!!");
			lb1.setBounds(105, 15, 620, 21);
			lb1.setBackground(new Color(0, 0, 0, 0));
			lb1.setForeground(new Color(118, 30, 30));
			lb1.setVisible(true);
			lb1.setFont(new Font("Comic Sans", Font.CENTER_BASELINE, 20));
			this.add(lb1);
			
			ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon6.png"));
			Image imgicon1 = icon1.getImage().getScaledInstance(23, 23, Image.SCALE_DEFAULT);
			btn1 = new JButton("Student Update", new ImageIcon(imgicon1));
			btn1.setBounds(120, 70, 160, 35);
			btn1.addActionListener(this);
			btn1.setBackground(Color.LIGHT_GRAY);
			btn1.setForeground(Color.BLACK);
			btn1.setVisible(true);
			this.add(btn1);
			
			ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icons/icon5.png"));
			Image imgicon2 = icon2.getImage().getScaledInstance(23, 23, Image.SCALE_DEFAULT);
			btn2 = new JButton("Teacher Update", new ImageIcon(imgicon2));
			btn2.setBounds(320, 70, 160, 35);
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
				new StudUpdate().setVisible(true);
				this.setVisible(false);
			}
			if (e.getSource()==btn2){
				new TeachUpdate().setVisible(true);
				this.setVisible(false);
			}
			if (e.getSource()==btn3)
				this.setVisible(false);
		}

		public static void main(String[] args) {
			new Update().setVisible(true);
		}
}
