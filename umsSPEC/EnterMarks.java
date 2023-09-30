package umsSPEC;

import java.awt.*;

import javax.swing.*;

import java.awt.Window.Type;
import java.awt.event.*;
import java.sql.*;

public class EnterMarks extends JFrame implements ActionListener{
	
	JLabel lb1, lb2, lb3, lb4;
	JTextField rtf, stf1, stf2, stf3, stf4, stf5, mtf1, mtf2, mtf3, mtf4, mtf5;
	JButton btn1, btn2;
	
	Connection C;
	PreparedStatement pst1, pst2;

	public EnterMarks() {
		super("SPEC - Enter Marks");
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon17.png"));
		Image imgicon1 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon1);
		setType(Type.NORMAL);
		setResizable(false);	
		setBounds(355, 165, 600, 440);
		setLayout(null);
		
		getContentPane().setBackground(new Color(224, 246, 249));
		
		lb1 = new JLabel("Enter  Marks  of  a  Student");
		lb1.setVisible(true);
		lb1.setForeground(Color.BLACK);
		lb1.setBackground(new Color(0, 0, 0, 0));
		lb1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 22));
		lb1.setBounds(153, 35, 320, 21);
		this.add(lb1);
		
		lb2 = new JLabel("Enter Roll No. ");
		lb2.setVisible(true);
		lb2.setForeground(Color.BLACK);
		lb2.setBackground(new Color(0, 0, 0, 0));
		lb2.setFont(new Font("monospaced", Font.BOLD | Font.ITALIC, 15));
		lb2.setBounds(167, 94, 320, 15);
		this.add(lb2);
		
		rtf = new JTextField();
		rtf.setBounds(300, 94, 80, 19);
		rtf.setEnabled(true);
		this.add(rtf);
		
		lb3 = new JLabel("Enter Subject ");
		lb3.setVisible(true);
		lb3.setForeground(Color.BLACK);
		lb3.setBackground(new Color(0, 0, 0, 0));
		lb3.setFont(new Font("monospaced", Font.BOLD | Font.ITALIC, 15));
		lb3.setBounds(115, 154, 320, 15);
		this.add(lb3);
		
		lb3 = new JLabel("Enter Marks ");
		lb3.setVisible(true);
		lb3.setForeground(Color.BLACK);
		lb3.setBackground(new Color(0, 0, 0, 0));
		lb3.setFont(new Font("monospaced", Font.BOLD | Font.ITALIC, 15));
		lb3.setBounds(347, 154, 320, 15);
		this.add(lb3);
		
		stf1 = new JTextField();
		stf1.setBounds(100, 194, 160, 20);
		stf1.setEnabled(true);
		this.add(stf1);
		
		stf2 = new JTextField();
		stf2.setBounds(100, 214, 160, 20);
		stf2.setEnabled(true);
		this.add(stf2);
		
		stf3 = new JTextField();
		stf3.setBounds(100, 234, 160, 20);
		stf3.setEnabled(true);
		this.add(stf3);
		
		stf4 = new JTextField();
		stf4.setBounds(100, 254, 160, 20);
		stf4.setEnabled(true);
		this.add(stf4);
		
		stf5 = new JTextField();
		stf5.setBounds(100, 274, 160, 20);
		stf5.setEnabled(true);
		this.add(stf5);
		
		mtf1 = new JTextField();
		mtf1.setBounds(320, 194, 160, 20);
		mtf1.setEnabled(true);
		this.add(mtf1);
		
		mtf2 = new JTextField();
		mtf2.setBounds(320, 214, 160, 20);
		mtf2.setEnabled(true);
		this.add(mtf2);
		
		mtf3 = new JTextField();
		mtf3.setBounds(320, 234, 160, 20);
		mtf3.setEnabled(true);
		this.add(mtf3);
		
		mtf4 = new JTextField();
		mtf4.setBounds(320, 254, 160, 20);
		mtf4.setEnabled(true);
		this.add(mtf4);
		
		mtf5 = new JTextField();
		mtf5.setBounds(320, 274, 160, 20);
		mtf5.setEnabled(true);
		this.add(mtf5);
		
		
		btn1 = new JButton("Submit");
		btn1.setFont(new Font("Serif", Font.PLAIN, 15));
		btn1.addActionListener(this);
		btn1.setBackground(Color.BLACK);
		btn1.setForeground(Color.WHITE);
		btn1.setBounds(165, 340, 100, 28);
		this.add(btn1);
		
		btn2 = new JButton();
		btn2.setText("Cancel");
		btn2.addActionListener(this);
		btn2.setFont(new Font("Serif", Font.PLAIN, 15));
		btn2.setBackground(Color.BLACK);
		btn2.setForeground(Color.WHITE);
		btn2.setBounds(315, 340, 100, 28);
		this.add(btn2);
	}
	
	public void actionPerformed(ActionEvent e){
		
		try{
			C = ConnectDB.dbConnector();
		}
		catch (Exception excp){ excp.printStackTrace();}
		
		if (e.getSource()==btn1){
			
			try{
				String sql1 = "insert into subject values ('"+rtf.getText()+"','"+stf1.getText()+"','"+
							   stf2.getText()+"','"+stf3.getText()+"','"+stf4.getText()
							   +"','"+stf5.getText()+"')";	
				String sql2 = "insert into marks values ('"+rtf.getText()+"','"+mtf1.getText()+"','"+
							   mtf2.getText()+"','"+mtf3.getText()+"','"+mtf4.getText()
							   +"','"+mtf5.getText()+"')";	
				pst1 = C.prepareStatement(sql1);
				pst1.executeUpdate();
				pst2 = C.prepareStatement(sql2);
				pst2.executeUpdate();
				JOptionPane.showMessageDialog(null, "Entry Succesfully added to Database");
				rtf.setText("");
				stf1.setText("");
				stf2.setText("");
				stf3.setText("");
				stf4.setText("");
				stf5.setText("");
				mtf1.setText("");
				mtf2.setText("");
				mtf3.setText("");
				mtf4.setText("");
				mtf5.setText("");
			}
			catch (SQLException sqlexc){ sqlexc.printStackTrace();}
			
		}
		else if (e.getSource()==btn2){
			this.setVisible(false);
		}
		
	}

	public static void main(String[] args) {
		new EnterMarks().setVisible(true);
	}

}