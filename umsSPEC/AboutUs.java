package umsSPEC;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AboutUs extends JFrame{
	
	JLabel lb1, lb2, imlbl, imlbl1;
	
	public AboutUs() {
		super("SPEC - About Us");
		ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("icons/icon13.jpg"));
		Image im = ic.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(im);
		setType(Type.NORMAL);
		setResizable(false);
		setLayout(null);
		setBounds(358, 208, 620, 410);

		getContentPane().setBackground(new Color(255, 250, 199));
		
		ImageIcon icn = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.png"));
		Image img = icn.getImage().getScaledInstance(150, 165, Image.SCALE_DEFAULT);
		ImageIcon icn1 = new ImageIcon(img);
		imlbl = new JLabel(icn1);
		imlbl.setBounds (400, 90, 151, 151);
		this.add(imlbl);
		
		ImageIcon icn001 = new ImageIcon(ClassLoader.getSystemResource("icons/aboutUS.png"));
		Image img1 = icn001.getImage().getScaledInstance(330, 180, Image.SCALE_DEFAULT);
		ImageIcon icn2 = new ImageIcon(img1);
		imlbl1 = new JLabel(icn2);
		imlbl1.setBounds (30, 80, 330, 180);
		this.add(imlbl1);
		
		
		lb1 = new JLabel("About Us :-");
		lb1.setBounds(30, 20, 130, 31);
		lb1.setBackground(new Color(0, 0, 0, 0));
		lb1.setForeground(new Color(118, 30, 30));
		lb1.setVisible(true);
		lb1.setFont(new Font("Chiller", Font.ROMAN_BASELINE, 30));
		this.add(lb1);
		lb2 = new JLabel("________");
		lb2.setBounds(25, 20, 230, 31);
		lb2.setBackground(new Color(0, 0, 0, 0));
		lb2.setForeground(new Color(118, 30, 30));
		lb2.setVisible(true);
		lb2.setFont(new Font("Chiller", Font.ROMAN_BASELINE, 30));
		this.add(lb2);
		
		ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icons/icon18a.png"));
		Image imicon3 = icon3.getImage().getScaledInstance(14, 14, Image.SCALE_DEFAULT);
		JButton btn3 = new JButton("  Back", new ImageIcon(imicon3));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goBackScene();
			}
		});
		btn3.setBounds(175, 295, 140, 30);
		btn3.setBackground(Color.WHITE);
		btn3.setForeground(Color.BLACK);
		btn3.setVisible(true);
		this.add(btn3);
		
	}
	
	public void goBackScene(){
		this.setVisible(false);
	}

	public static void main(String[] args) {
		new AboutUs().setVisible(true);
	}

}
