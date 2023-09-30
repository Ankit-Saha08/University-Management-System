package umsSPEC;

import java.awt.*;
import java.awt.Window.Type;
import java.awt.event.*;

import javax.swing.*;

import java.sql.*;

public class StudentDetails extends JFrame implements ActionListener{

	JLabel lb1, ldlbl;
	JTextField ldtf;
	JButton loadBtn;
	JTable tbl;
	JScrollPane jsp;
	
	private Connection C;
	private PreparedStatement pst;
	private ResultSet rs;
	
	String x[] = {"Name", "Father's Name", "DOB", "Age", "Aadhar", "Email ID", "Class X(%)",
				"Class XII(%)", "Phone", "Roll", "Course", "Branch", "Address"};
	String y[][] = new String[50][13];
	
	public StudentDetails() {
		super("SPEC - Student Details");
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon3.png"));
		Image imgicon1 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon1);
		setType(Type.NORMAL);
		setResizable(false);	
		setBounds(195, 137, 1000, 500);
		setLayout(null);
		
		lb1 = new JLabel("View Student Details");
		lb1.setSize(400, 30);
		lb1.setLocation(355, 15);
		lb1.setVisible(true);
		lb1.setBackground(new Color(0, 0, 0, 0));
		lb1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 29));
		this.add(lb1);
		
		try{
			C = ConnectDB.dbConnector();
			String query = "select * from student";
			pst = C.prepareStatement(query);
			rs = pst.executeQuery();
			
			int i=0, j=0;
			while (rs.next()){
				y[i][j++] = rs.getString(1);
				y[i][j++] = rs.getString(2);
				y[i][j++] = rs.getString(3);
				y[i][j++] = rs.getString(4);
				y[i][j++] = rs.getString(5);
				y[i][j++] = rs.getString(6);
				y[i][j++] = rs.getString(7);
				y[i][j++] = rs.getString(8);
				y[i][j++] = rs.getString(9);
				y[i][j++] = rs.getString(10);
				y[i][j++] = rs.getString(11);
				y[i][j++] = rs.getString(12);
				y[i][j++] = rs.getString(13);
				
				i++;
				j=0;
			}
			
			tbl = new JTable(y, x);
		}
		catch (Exception exception){ 
			exception.printStackTrace(); 
		}
		finally{
			try {
				rs.close();
				pst.close();
			} catch (SQLException e) {e.printStackTrace();}
		}
		
		
		jsp = new JScrollPane(tbl);
		tbl.setBackground(new Color(224, 246, 249));
		tbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tbl.setRowHeight(18);
		tbl.getColumnModel().getColumn(0).setPreferredWidth(110);
		tbl.getColumnModel().getColumn(1).setPreferredWidth(120);
		tbl.getColumnModel().getColumn(2).setPreferredWidth(80);
		tbl.getColumnModel().getColumn(3).setPreferredWidth(40);
		tbl.getColumnModel().getColumn(4).setPreferredWidth(100);
		tbl.getColumnModel().getColumn(5).setPreferredWidth(100);
		tbl.getColumnModel().getColumn(6).setPreferredWidth(80);
		tbl.getColumnModel().getColumn(7).setPreferredWidth(80);
		tbl.getColumnModel().getColumn(8).setPreferredWidth(80);
		tbl.getColumnModel().getColumn(9).setPreferredWidth(40);
		tbl.getColumnModel().getColumn(10).setPreferredWidth(50);
		tbl.getColumnModel().getColumn(11).setPreferredWidth(50);
		tbl.getColumnModel().getColumn(12).setPreferredWidth(220);
		jsp.setBounds(20,65, 950, 300);
		this.add(jsp);
		
		ldlbl = new JLabel("Enter Roll");
		ldlbl.setBounds(140, 400, 170, 25);
		ldlbl.setBackground(new Color(0, 0, 0, 0));
		ldlbl.setForeground(new Color(0, 0, 0));
		ldlbl.setVisible(true);
		ldlbl.setFont(new Font("monospaced", Font.BOLD | Font.ITALIC, 14));
		this.add(ldlbl);
		
		
		ldtf = new JTextField();
		ldtf.setBounds(250, 400, 70, 25);
		ldtf.setVisible(true);
		ldtf.setEnabled(true);
		ldtf.setEditable(true);
		this.add(ldtf);
		
		loadBtn = new JButton();
		loadBtn.setText("Delete");
		loadBtn.addActionListener(this);
		loadBtn.setFont(new Font("Serif", Font.PLAIN, 15));
		loadBtn.setBackground(Color.BLACK);
		loadBtn.setForeground(Color.WHITE);
		loadBtn.setEnabled(true);
		loadBtn.setBounds(350, 400, 100, 25);
		this.add(loadBtn);
		

		tbl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0){
				int row = tbl.getSelectedRow();
				ldtf.setText(tbl.getModel().getValueAt(row, 9).toString());
			}
		});
		
		
		getContentPane().setBackground(new Color(224, 246, 249));
	}

	public void actionPerformed(ActionEvent e){
		String sql = "delete from student where roll = "+ldtf.getText();
		try{
			pst = C.prepareStatement(sql);
			pst.executeUpdate();
	
			JOptionPane.showMessageDialog(null, "Roll "+ldtf.getText()+" deleted from Database");
			ldtf.setText("");
			
			this.setVisible(false);
			new StudentDetails().setVisible(true);
			
		}
		catch (SQLException sqle) { sqle.printStackTrace(); }
	}
	
	
	public static void main(String[] args) {
		new StudentDetails().setVisible(true);
	}

}
