package umsSPEC;

import java.awt.*;
import java.awt.Window.Type;
import java.awt.event.*;

import javax.swing.*;

import java.sql.*;

public class StudAttDetails extends JFrame {
	
	JTable tbl;
	JScrollPane jsp;
	
	String colNames[] = {"Roll", "Date", "1stt Half", "2nd Half"};
	String rows[][] = new String[50][4];
	
	Connection C;
	PreparedStatement pst;
	ResultSet rs;
	
	public StudAttDetails(){
		super("SPEC - Student Attendance Details");
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/icon15.png"));
		Image imgicon = icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon);
		setType(Type.NORMAL);
		setResizable(false);
		setBounds(348, 228, 640, 340);
		setLayout(null);
		
	    try{
	    	C = ConnectDB.dbConnector();
	    	pst = C.prepareStatement("select * from attendance_stud");
	    	rs = pst.executeQuery();
	    	
	    	int i=0, j=0;
	    	while (rs.next()){
	    		rows[i][j++] = rs.getString("roll");
	    		rows[i][j++] = rs.getString("date");
	    		rows[i][j++] = rs.getString("first");
	    		rows[i][j++] = rs.getString("second");
	    		
	    		i++;
	    		j=0;
	    	}
	    	
	    	tbl = new JTable(rows, colNames);
	    }
	    catch  (SQLException sqle){
	    	sqle.printStackTrace();
	    }
	    finally{
	    	try{
	    		rs.close();
	    		pst.close();
	    		C.close();
	    	}
	    	catch (SQLException sqle1) { sqle1.printStackTrace(); }
	    }
		
		jsp = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		tbl.setBackground(new Color(224, 246, 249));
		tbl.setRowHeight(18);
		jsp.setBounds (20, 15, 590, 230);
		this.add(jsp);

		ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icons/icon18a.png"));
		Image imicon3 = icon3.getImage().getScaledInstance(14, 14, Image.SCALE_DEFAULT);
		JButton btn3 = new JButton("  Back", new ImageIcon(imicon3));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				goBackScene();
			}
		});
		btn3.setBounds(235, 257, 140, 30);
		btn3.setBackground(Color.WHITE);
		btn3.setForeground(Color.BLACK);
		btn3.setVisible(true);
		this.add(btn3);
		
		getContentPane().setBackground(new Color(224, 246, 249));
	}

	public void goBackScene(){
		this.setVisible(false);
	}
	
	public static void main(String[] args) {
		new StudAttDetails().setVisible(true);
	}

}
