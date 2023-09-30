package umsSPEC;

import java.awt.*;

import javax.swing.*;

import java.awt.Window.Type;
import java.awt.event.*;
import java.sql.*;

public class StudentAttendance extends JFrame implements ActionListener{
	
	JLabel lb1, lb2,  lb3, lb4;
	JButton btn1, btn2;
	Choice chc, cfh, clh;
	
	Connection C;
	PreparedStatement pst;
	ResultSet rs;
	
	public StudentAttendance(){
		super("SPEC - Student Attendance");
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/icon16.png"));
		Image imgicon = icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon);
		setType(Type.NORMAL);
		setResizable(false);	
		setBounds(475, 190, 340, 370);
		setLayout(new GridLayout(4, 2, 50, 50));
		
		lb1 = new JLabel("Select Roll Number");
		lb1.setSize(400, 18);
		lb1.setLocation(175, 15);
		lb1.setVisible(true);
		lb1.setBackground(new Color(0, 0, 0, 0));
		lb1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		this.add(lb1);
		
		
		chc = new Choice();
		this.add(chc);
		try{
			C = ConnectDB.dbConnector();
			String sql = "select * from student";
			pst = C.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while (rs.next()){
				chc.add(rs.getString("roll"));
			}
		}
		catch (Exception excp){ 
			excp.printStackTrace(); 
		}
		finally{
			try {
				rs.close();
				pst.close();
			} catch (SQLException e) { e.printStackTrace(); }
		}
		
		cfh = new Choice();
		clh = new Choice();
		
		
		lb2 = new JLabel("First Half");
		lb2.setSize(400, 18);
		lb2.setLocation(175, 15);
		lb2.setVisible(true);
		lb2.setBackground(new Color(0, 0, 0, 0));
		lb2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		this.add(lb2);
		cfh.add("Present");
		cfh.add("Absent");
		this.add(cfh);
		
		
		lb3 = new JLabel("Second Half");
		lb3.setSize(400, 18);
		lb3.setLocation(175, 15);
		lb3.setVisible(true);
		lb3.setBackground(new Color(0, 0, 0, 0));
		lb3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		this.add(lb3);
		clh.add("Present");
		clh.add("Absent");
		this.add(clh);

		
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
		
		
		getContentPane().setBackground(new Color(224, 246, 249));
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if (e.getSource()==btn1){
			
			 String  date = new java.util.Date().toString();
			 String sql1 = "insert into attendance_stud values ('"+cfh.getSelectedItem()+"', '"+
					 	    clh.getSelectedItem()+"', '"+chc.getSelectedItem()+"', '"+
							date+"')";
			 
			 try {
				pst = C.prepareStatement(sql1);
				pst.executeUpdate();
			} catch (SQLException e1) {	e1.printStackTrace(); }
			 
			 JOptionPane.showMessageDialog(null, "Attendance of roll-"+chc.getSelectedItem()+" confirmed");
		}
		else if (e.getSource()==btn2){
			this.setVisible(false);
		}
	}

	public static void main(String[] args) {
		new StudentAttendance().setVisible(true);
	}

}
