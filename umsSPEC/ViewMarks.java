package umsSPEC;

import java.awt.*;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

import javax.swing.*;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class ViewMarks extends JFrame implements ActionListener{

	JPanel p1, p2;
	JTextArea t1, mtxt, stxt;
	JButton btn1, btn2;
	JLabel lbl, lbl1, lbl2, lbl3, lbl4, lbl5, lbl6;
	
	Connection C;
	PreparedStatement pst, pst1, pst2;
	ResultSet rs, rs1, rs2;
	
	String NAME, ROLL, COURSE, BRANCH, s1, s2, s3, s4, s5;
	int m1, m2, m3, m4, m5, total;
	float percent;
	
	public ViewMarks(String searchStr) {
		super("SPEC - Display Marks");
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon16.png"));
		Image imgicon1 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon1);
		setType(Type.NORMAL);
		setResizable(false);	
		setBounds(375, 145, 640, 490);
		setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		p1.setBackground(new Color(224, 246, 249));
		p2.setBackground(new Color(224, 246, 249));
		
		lbl = new JLabel("EXAMINATION RESULT ");
		lbl.setVisible(true);
		lbl.setFont(new Font("Serif", Font.ITALIC, 30));
		p1.add(lbl);
		
		t1 = new JTextArea(50, 15);
		JScrollPane jsp = new JScrollPane(t1);
		t1.setFont(new Font("Serif",  Font.BOLD | Font.ITALIC, 17));
		t1.setBackground(new Color(224, 246, 249));
		t1.setForeground(new Color(118, 30, 30));
		
		
		btn1 = new JButton("Print");
		btn1.setFont(new Font("Serif", Font.PLAIN, 15));
		btn1.addActionListener(this);
		btn1.setBackground(Color.BLACK);
		btn1.setForeground(Color.WHITE);
		p2.add(btn1);
		
		btn2 = new JButton();
		btn2.setText("Cancel");
		btn2.addActionListener(this);
		btn2.setFont(new Font("Serif", Font.PLAIN, 15));
		btn2.setBackground(Color.BLACK);
		btn2.setForeground(Color.WHITE);
		p2.add(btn2);
		
		marks(searchStr);
		
		this.add(p1, "North");
		this.add(jsp, "Center");
		this.add(p2, "South");
		
	}

	public void marks(String rollStr){
		
		try{
			
			String sql = "select name, roll, course, branch from student where roll = "+rollStr;
			String sql1 = "select * from subject where roll = "+rollStr;
			String sql2 = "select * from marks where roll = "+rollStr;
			C  = ConnectDB.dbConnector();
			pst = C.prepareStatement(sql);
			pst1 = C.prepareStatement(sql1);
			pst2 = C.prepareStatement(sql2);
			rs = pst.executeQuery();
			rs1 = pst1.executeQuery();
			rs2 = pst2.executeQuery();
		
			if (rs.next()){
				NAME = rs.getString("name");
				ROLL = rs.getString("roll");
				COURSE = rs.getString("course");
				BRANCH = rs.getString("branch"); 
			}
			t1.setEditable(false);
			t1.setText("Result of  "+NAME.toUpperCase()+" ,  roll no. "+ROLL+" , from  "+COURSE+" - "+BRANCH);
			
			if (NAME==null){
				JOptionPane.showMessageDialog(null, "Result of roll "+rollStr+" unavailable");
			}

			if (rs1.next()){
				s1 = rs1.getString(2);
				s2 = rs1.getString(3);
				s3 = rs1.getString(4);
				s4 = rs1.getString(5);
				s5 = rs1.getString(6);
			}
			
			if (rs2.next()){
				m1 = Integer.parseInt(rs2.getString(2));
				m2 = Integer.parseInt(rs2.getString(3));
				m3 = Integer.parseInt(rs2.getString(4));
				m4 = Integer.parseInt(rs2.getString(5));
				m5 = Integer.parseInt(rs2.getString(6));
			}
			
			total = m1 + m2 + m3 + m4 + m5;
			percent = (float)total/5;
			
			
			t1.setText(t1.getText()+"\n-----------------------------------------------------------------------------\n\n"
					   +s1+"     =     "+m1+"\n\n"+s2+"     =     "+m2+"\n\n"+
					   s3+"     =     "+m3+"\n\n"+s4+"     =     "+m4+"\n\n"+s5+"     =     "+m5+
					   "\n\n---------------------------------------------------------------------------\n"
					   +"TOTAL = "+total+"                 PERCENTAGE = "+percent);
			
		}
		catch (SQLException sqle1){ 
			sqle1.printStackTrace(); 
		}
		finally{
			try{
				rs.close();
				rs1.close();
				pst.close();
				pst1.close();
				C.close();
			}
			catch (SQLException sqle1){ sqle1.printStackTrace(); }
		}
		
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		
		if (e.getSource()==btn1){
			try {
				t1.setText("                               EXAMINATION  RESULT\n\n"+t1.getText());
				t1.print();
				new ExamDetails().setVisible(true);
				this.setVisible(false);
			} catch (PrinterException e1) {
				e1.printStackTrace();
			}
		}
		else if (e.getSource()==btn2){
			new ExamDetails().setVisible(true);
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		new ViewMarks("15").setVisible(true);
	}
}
