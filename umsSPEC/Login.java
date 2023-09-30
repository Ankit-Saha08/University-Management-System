package umsSPEC;

import javax.swing.*;

import java.sql.*;
import java.awt.*;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
	
	JLabel lb1, lb2;
	JTextField tf1;
	JPasswordField pf1;
	JButton btn1, btn2;
	Connection C;
	PreparedStatement pst;
	public static Login logInObj = new Login();
	
	public Login(){
		super("SPEC - Login");
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.png"));
		Image imgicon1 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon1);
		setType(Type.NORMAL);
		setResizable(false);
		setBounds(345, 195, 570, 300);
		setLayout(null);
		
		try{
			C = ConnectDB.dbConnector();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		ImageIcon imgic = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
		Image img = imgic.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon icn2 = new ImageIcon(img);
		JLabel lblim = new JLabel(icn2);
		lblim.setBounds(340, 35, 175, 195);
		this.add(lblim);
		
		lb1 = new JLabel();
		lb1.setText("Username");
		lb1.setForeground(new Color(153, 0, 0));
		lb1.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		lb1.setBackground(new Color(102, 204, 255));
		lb1.setBounds(50, 50, 100, 30);
		this.add(lb1);
		
		lb2 = new JLabel("Password");
		lb2.setForeground(new Color(153, 0, 0));
		lb2.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
		lb2.setBackground(new Color(102, 204, 255));
		lb2.setBounds(50, 100, 100, 30);
		this.add(lb2);
		
		tf1 = new JTextField();
		tf1.setEnabled(true);
		tf1.setEditable(true);
		tf1.setBounds(140, 50, 150, 30);
		this.add(tf1);
		
		pf1 = new JPasswordField();
		pf1.setEnabled(true);
		pf1.setEditable(true);
		pf1.setBounds(140, 100, 150, 30);
		this.add(pf1);
		
		btn1 = new JButton("Login");
		btn1.setFont(new Font("Serif", Font.PLAIN, 15));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uName = tf1.getText();
				String pass = pf1.getText();
				if (uName.length()==0){
					JOptionPane.showMessageDialog(null, "Username can't be empty");
					tf1.setText("");
					pf1.setText("");
				}
				else if (pass.length()==0){
					JOptionPane.showMessageDialog(null, "Password can't be empty");
					tf1.setText("");
					pf1.setText("");
				}
				else{
					tf1.setText("");
					pf1.setText("");
					String sql = "select * from sign_up";
					try{
						pst = C.prepareStatement(sql);
						ResultSet rs = pst.executeQuery();
						while (rs.next()){
							String userName = rs.getString("username");
							String password = rs.getString("password");
							if ((userName.equals(uName)) && (password.equals(pass))){
								switchScene(); //to redirect to HomePage if login is successful
								break;
							}
							else
								continue;
						}
					}
					catch(Exception ex){
						ex.printStackTrace();
					}
				}
			}
		});
		btn1.setBackground(Color.BLACK);
		btn1.setForeground(Color.WHITE);
		btn1.setBounds(95, 168, 70, 19);
		this.add(btn1);
		
		btn2 = new JButton();
		btn2.setText("Exit");
		btn2.setFont(new Font("Serif", Font.PLAIN, 15));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thanks for Visiting SPEC Online Portal");
				System.exit(0);
			}
		});
		btn2.setBackground(Color.BLACK);
		btn2.setForeground(Color.WHITE);
		btn2.setBounds(195, 168, 70, 19);
		this.add(btn2);
		
		getContentPane().setBackground(new Color(209, 255, 250));
	}
	
	public void switchScene(){
		this.setVisible(false);
		HomePage homeObj = new HomePage();
		homeObj.setVisible(true);
	}
	
	public static void main(String[] args) {
		logInObj.setVisible(true);
	}

}
