package umsSPEC;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window.Type;

import javax.swing.*;

public class Fees extends JFrame{
	
	JLabel fs, bt, bca, mt, mca, s1, s2, s3, s4, s5, s6, s7, s8,
		   bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bc1, bc2, bc3, bc4, bc5, bc6, 
		   mt1, mt2, mt3, mt4, mc1, mc2, mc3, mc4;
	
	public Fees() {
		super("SPEC - Fees Chart");
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.jpg"));
		Image imgicon = icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon);
		setType(Type.NORMAL);
		setResizable(false);
		setBounds(348, 128, 610, 515);
		setLayout(null);
		
		ImageIcon imgic1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon7.png"));
		Image img1 = imgic1.getImage().getScaledInstance(50, 60, Image.SCALE_DEFAULT);
		ImageIcon icn2 = new ImageIcon(img1);
		JLabel lblimg = new JLabel(icn2);
		lblimg.setBounds(20, 15, 50, 60);
		this.add(lblimg);
		
		
		fs = new JLabel("Fees Structure");
		fs.setBounds(220, 20, 200, 57);
		fs.setVisible(true);
		fs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 29));
		fs.setBackground(new Color(0, 0, 0, 0));
		fs.setForeground(Color.black);
		this.add(fs);
		
		bt = new JLabel("B. Tech");
		bt.setBounds(135, 105, 200, 20);
		bt.setVisible(true);
		bt.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		bt.setBackground(new Color(0, 0, 0, 0));
		bt.setForeground(Color.black);
		this.add(bt);
		
		bca = new JLabel("BCA");
		bca.setBounds(255, 105, 200, 20);
		bca.setVisible(true);
		bca.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		bca.setBackground(new Color(0, 0, 0, 0));
		bca.setForeground(Color.black);
		this.add(bca);
		
		mt = new JLabel("M. Tech");
		mt.setBounds(363, 105, 200, 20);
		mt.setVisible(true);
		mt.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		mt.setBackground(new Color(0, 0, 0, 0));
		mt.setForeground(Color.black);
		this.add(mt);

		mca = new JLabel("MCA");
		mca.setBounds(505, 105, 200, 20);
		mca.setVisible(true);
		mca.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		mca.setBackground(new Color(0, 0, 0, 0));
		mca.setForeground(Color.black);
		this.add(mca);
		
		s1 = new JLabel("Semester 1");
		s1.setBounds(8, 150, 200, 19);
		s1.setVisible(true);
		s1.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		s1.setBackground(new Color(0, 0, 0, 0));
		s1.setForeground(Color.black);
		this.add(s1);
		
		s2 = new JLabel("Semester 2");
		s2.setBounds(8, 190, 200, 19);
		s2.setVisible(true);
		s2.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		s2.setBackground(new Color(0, 0, 0, 0));
		s2.setForeground(Color.black);
		this.add(s2);
		
		s3 = new JLabel("Semester 3");
		s3.setBounds(8, 230, 200, 19);
		s3.setVisible(true);
		s3.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		s3.setBackground(new Color(0, 0, 0, 0));
		s3.setForeground(Color.black);
		this.add(s3);
		
		s4 = new JLabel("Semester 4");
		s4.setBounds(8, 270, 200, 19);
		s4.setVisible(true);
		s4.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		s4.setBackground(new Color(0, 0, 0, 0));
		s4.setForeground(Color.black);
		this.add(s4);
		
		s5 = new JLabel("Semester 5");
		s5.setBounds(8, 310, 200, 19);
		s5.setVisible(true);
		s5.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		s5.setBackground(new Color(0, 0, 0, 0));
		s5.setForeground(Color.black);
		this.add(s5);
		
		s6 = new JLabel("Semester 6");
		s6.setBounds(8, 350, 200, 19);
		s6.setVisible(true);
		s6.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		s6.setBackground(new Color(0, 0, 0, 0));
		s6.setForeground(Color.black);
		this.add(s6);
		
		s7 = new JLabel("Semester 7");
		s7.setBounds(8, 390, 200, 19);
		s7.setVisible(true);
		s7.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		s7.setBackground(new Color(0, 0, 0, 0));
		s7.setForeground(Color.black);
		this.add(s7);
		
		s8 = new JLabel("Semester 8");
		s8.setBounds(8, 430, 200, 19);
		s8.setVisible(true);
		s8.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		s8.setBackground(new Color(0, 0, 0, 0));
		s8.setForeground(Color.black);
		this.add(s8);
		
		
		bt1 = new JLabel("Rs. 90,000");
		bt1.setBounds(135, 150, 200, 16);
		bt1.setVisible(true);
		bt1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bt1.setBackground(new Color(0, 0, 0, 0));
		bt1.setForeground(Color.black);
		this.add(bt1);
		
		bt2 = new JLabel("Rs. 70,000");
		bt2.setBounds(135, 190, 200, 16);
		bt2.setVisible(true);
		bt2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bt2.setBackground(new Color(0, 0, 0, 0));
		bt2.setForeground(Color.black);
		this.add(bt2);
		
		bt3 = new JLabel("Rs. 70,000");
		bt3.setBounds(135, 230, 200, 16);
		bt3.setVisible(true);
		bt3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bt3.setBackground(new Color(0, 0, 0, 0));
		bt3.setForeground(Color.black);
		this.add(bt3);

		bt4 = new JLabel("Rs. 70,000");
		bt4.setBounds(135, 270, 200, 16);
		bt4.setVisible(true);
		bt4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bt4.setBackground(new Color(0, 0, 0, 0));
		bt4.setForeground(Color.black);
		this.add(bt4);
		
		bt5 = new JLabel("Rs. 70,000");
		bt5.setBounds(135, 310, 200, 16);
		bt5.setVisible(true);
		bt5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bt5.setBackground(new Color(0, 0, 0, 0));
		bt5.setForeground(Color.black);
		this.add(bt5);
		
		bt6 = new JLabel("Rs. 70,000");
		bt6.setBounds(135, 350, 200, 16);
		bt6.setVisible(true);
		bt6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bt6.setBackground(new Color(0, 0, 0, 0));
		bt6.setForeground(Color.black);
		this.add(bt6);
		
		bt7 = new JLabel("Rs. 70,000");
		bt7.setBounds(135, 390, 200, 16);
		bt7.setVisible(true);
		bt7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bt7.setBackground(new Color(0, 0, 0, 0));
		bt7.setForeground(Color.black);
		this.add(bt7);
		
		bt8 = new JLabel("Rs. 70,000");
		bt8.setBounds(135, 430, 200, 16);
		bt8.setVisible(true);
		bt8.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bt8.setBackground(new Color(0, 0, 0, 0));
		bt8.setForeground(Color.black);
		this.add(bt8);
		
		bc1 = new JLabel("Rs. 60,000");
		bc1.setBounds(245, 150, 200, 16);
		bc1.setVisible(true);
		bc1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bc1.setBackground(new Color(0, 0, 0, 0));
		bc1.setForeground(Color.black);
		this.add(bc1);
		
		bc2 = new JLabel("Rs. 45,000");
		bc2.setBounds(245, 190, 200, 16);
		bc2.setVisible(true);
		bc2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bc2.setBackground(new Color(0, 0, 0, 0));
		bc2.setForeground(Color.black);
		this.add(bc2);
		
		bc3 = new JLabel("Rs. 45,000");
		bc3.setBounds(245, 230, 200, 16);
		bc3.setVisible(true);
		bc3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bc3.setBackground(new Color(0, 0, 0, 0));
		bc3.setForeground(Color.black);
		this.add(bc3);
		
		bc4 = new JLabel("Rs. 45,000");
		bc4.setBounds(245, 270, 200, 16);
		bc4.setVisible(true);
		bc4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bc4.setBackground(new Color(0, 0, 0, 0));
		bc4.setForeground(Color.black);
		this.add(bc4);
		
		bc5 = new JLabel("Rs. 45,000");
		bc5.setBounds(245, 310, 200, 16);
		bc5.setVisible(true);
		bc5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bc5.setBackground(new Color(0, 0, 0, 0));
		bc5.setForeground(Color.black);
		this.add(bc5);
		
		bc6 = new JLabel("Rs. 45,000");
		bc6.setBounds(245, 350, 200, 16);
		bc6.setVisible(true);
		bc6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		bc6.setBackground(new Color(0, 0, 0, 0));
		bc6.setForeground(Color.black);
		this.add(bc6);
		
		mt1 = new JLabel("Rs. 1,00,000");
		mt1.setBounds(360, 150, 200, 16);
		mt1.setVisible(true);
		mt1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mt1.setBackground(new Color(0, 0, 0, 0));
		mt1.setForeground(Color.black);
		this.add(mt1);
		
		mt2 = new JLabel("Rs. 90,000");
		mt2.setBounds(363, 190, 200, 16);
		mt2.setVisible(true);
		mt2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mt2.setBackground(new Color(0, 0, 0, 0));
		mt2.setForeground(Color.black);
		this.add(mt2);
		
		mt3 = new JLabel("Rs. 90,000");
		mt3.setBounds(363, 230, 200, 16);
		mt3.setVisible(true);
		mt3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mt3.setBackground(new Color(0, 0, 0, 0));
		mt3.setForeground(Color.black);
		this.add(mt3);
		
		mt4 = new JLabel("Rs. 90,000");
		mt4.setBounds(363, 270, 200, 16);
		mt4.setVisible(true);
		mt4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mt4.setBackground(new Color(0, 0, 0, 0));
		mt4.setForeground(Color.black);
		this.add(mt4);
		
		mc1 = new JLabel("Rs. 80,000");
		mc1.setBounds(495, 150, 200, 16);
		mc1.setVisible(true);
		mc1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mc1.setBackground(new Color(0, 0, 0, 0));
		mc1.setForeground(Color.black);
		this.add(mc1);
		
		mc2 = new JLabel("Rs. 80,000");
		mc2.setBounds(495, 190, 200, 16);
		mc2.setVisible(true);
		mc2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mc2.setBackground(new Color(0, 0, 0, 0));
		mc2.setForeground(Color.black);
		this.add(mc2);
		
		mc3 = new JLabel("Rs. 80,000");
		mc3.setBounds(495, 230, 200, 16);
		mc3.setVisible(true);
		mc3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mc3.setBackground(new Color(0, 0, 0, 0));
		mc3.setForeground(Color.black);
		this.add(mc3);
		
		mc4 = new JLabel("Rs. 80,000");
		mc4.setBounds(495, 270, 200, 16);
		mc4.setVisible(true);
		mc4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		mc4.setBackground(new Color(0, 0, 0, 0));
		mc4.setForeground(Color.black);
		this.add(mc4);
		
		getContentPane().setBackground(new Color(255, 250, 199));
	}
	
	public static void main(String args[]){
		new Fees().setVisible(true);
	}

}
