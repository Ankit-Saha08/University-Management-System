package umsSPEC;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class StudUpdate extends JFrame implements ActionListener{
	
	JLabel hlbl, ldlbl, imlbl, lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11, lb12, lb13;
	JTextField ldtf, tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12, tf13;
	JButton btn1, btn2, loadBtn;
	JComboBox  cmbx1, cmbx2;
	
	Connection C;
	PreparedStatement pst, pst1;
	ResultSet rs;
	String f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13, rollStr;

	public StudUpdate() {
		super("SPEC - Student Update");
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/icon6.png"));
		Image imgicon = icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon);
		setType(Type.NORMAL);
		setResizable(false);
		setBounds(375, 157, 600, 500);
		setLayout(null);
		
		getContentPane().setBackground(new Color(255, 255, 255));
		
		ImageIcon bgicn = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.png"));
		Image bgim = bgicn.getImage().getScaledInstance(1200, 670, Image.SCALE_DEFAULT);
		ImageIcon bgicon = new ImageIcon(bgim);
		imlbl = new JLabel(bgicon);
		imlbl.setBounds(0, 0, 1200, 670);
		this.add(imlbl);
		
		hlbl = new JLabel("Update Student Details");
		hlbl.setBounds(165, 30, 620, 30);
		hlbl.setBackground(new Color(0, 0, 0, 0));
		hlbl.setForeground(new Color(0, 0, 0));
		hlbl.setVisible(true);
		hlbl.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 25));
		imlbl.add(hlbl);
		
		lb1 = new JLabel("Name");
		lb1.setBounds(30, 95, 70, 18);
		lb1.setBackground(new Color(0, 0, 0, 0));
		lb1.setForeground(new Color(0, 0, 0));
		lb1.setVisible(true);
		lb1.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb1);
		
		tf1 = new JTextField();
		tf1.setBounds(140, 95, 120, 20);
		tf1.setVisible(true);
		tf1.setEnabled(false);
		tf1.setEditable(true);
		imlbl.add(tf1);
		
		lb2 = new JLabel("Age");
		lb2.setBounds(30, 135, 40, 18);
		lb2.setBackground(new Color(0, 0, 0, 0));
		lb2.setForeground(new Color(0, 0, 0));
		lb2.setVisible(true);
		lb2.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb2);
		
		tf2 = new JTextField();
		tf2.setBounds(140, 135, 120, 20);
		tf2.setVisible(true);
		tf2.setEnabled(false);
		tf2.setEditable(true);
		imlbl.add(tf2);
		
		lb3 = new JLabel("Address");
		lb3.setBounds(30, 175, 70, 18);
		lb3.setBackground(new Color(0, 0, 0, 0));
		lb3.setForeground(new Color(0, 0, 0));
		lb3.setVisible(true);
		lb3.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb3);
		
		tf3 = new JTextField();
		JScrollPane sp = new JScrollPane(tf3, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setBounds(140, 167, 120, 35);
		tf3.setVisible(true);
		tf3.setEnabled(false);
		tf3.setEditable(true);
		sp.setViewportView(tf3);
		imlbl.add(sp);
		
		lb4 = new JLabel("Email ID");
		lb4.setBounds(30, 215, 120, 18);
		lb4.setBackground(new Color(0, 0, 0, 0));
		lb4.setForeground(new Color(0, 0, 0));
		lb4.setVisible(true);
		lb4.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb4);
		
		tf4 = new JTextField();
		tf4.setBounds(140, 215, 120, 20);
		tf4.setVisible(true);
		tf4.setEnabled(false);
		tf4.setEditable(true);
		imlbl.add(tf4);
		
		lb5 = new JLabel("Class X(%)");
		lb5.setBounds(30, 255, 120, 18);
		lb5.setBackground(new Color(0, 0, 0, 0));
		lb5.setForeground(new Color(0, 0, 0));
		lb5.setVisible(true);
		lb5.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb5);
		
		tf5 = new JTextField();
		tf5.setBounds(140, 255, 120, 20);
		tf5.setVisible(true);
		tf5.setEnabled(false);
		tf5.setEditable(true);
		imlbl.add(tf5);
		
		lb6 = new JLabel("Roll No.");
		lb6.setBounds(30, 295, 70, 18);
		lb6.setBackground(new Color(0, 0, 0, 0));
		lb6.setForeground(new Color(0, 0, 0));
		lb6.setVisible(true);
		lb6.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb6);
		
		tf6 = new JTextField();
		tf6.setBounds(140, 295, 120, 20);
		tf6.setVisible(true);
		tf6.setEnabled(false);
		tf6.setEditable(true);
		imlbl.add(tf6);
		
		lb7 = new JLabel("Branch");
		lb7.setBounds(30, 335, 70, 18);
		lb7.setBackground(new Color(0, 0, 0, 0));
		lb7.setForeground(new Color(0, 0, 0));
		lb7.setVisible(true);
		lb7.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb7);
		
		String options1[] = {"---", "CSE", "ECE", "EEE", "Mechanical", "Civil", "BCA-CS", "MCA-CS"};
		cmbx1 = new JComboBox(options1);
		cmbx1.setBackground(Color.WHITE);
		cmbx1.setBounds(140, 335, 120, 20);
		cmbx1.setEnabled(false);
		imlbl.add(cmbx1);
		
		lb8 = new JLabel("Father's Name");
		lb8.setBounds(290, 95, 170, 18);
		lb8.setBackground(new Color(0, 0, 0, 0));
		lb8.setForeground(new Color(0, 0, 0));
		lb8.setVisible(true);
		lb8.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb8);
		
		tf8 = new JTextField();
		tf8.setBounds(450, 95, 120, 20);
		tf8.setVisible(true);
		tf8.setEnabled(false);
		tf8.setEditable(true);
		imlbl.add(tf8);
		
		lb9 = new JLabel("DOB(dd/mm/yyyy)");
		lb9.setBounds(290, 135, 140, 18);
		lb9.setBackground(new Color(0, 0, 0, 0));
		lb9.setForeground(new Color(0, 0, 0));
		lb9.setVisible(true);
		lb9.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb9);
		
		tf9 = new JTextField();
		tf9.setBounds(450, 135, 120, 20);
		tf9.setVisible(true);
		tf9.setEnabled(false);
		tf9.setEditable(true);
		imlbl.add(tf9);
		
		lb10 = new JLabel("Aadhar No.");
		lb10.setBounds(290, 175, 120, 18);
		lb10.setBackground(new Color(0, 0, 0, 0));
		lb10.setForeground(new Color(0, 0, 0));
		lb10.setVisible(true);
		lb10.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb10);
		
		tf10 = new JTextField();
		tf10.setBounds(450, 175, 120, 20);
		tf10.setVisible(true);
		tf10.setEnabled(false);
		tf10.setEditable(true);
		imlbl.add(tf10);
		
		lb11 = new JLabel("Phone");
		lb11.setBounds(290, 215, 70, 18);
		lb11.setBackground(new Color(0, 0, 0, 0));
		lb11.setForeground(new Color(0, 0, 0));
		lb11.setVisible(true);
		lb11.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb11);
		
		tf11 = new JTextField();
		tf11.setBounds(450, 215, 120, 20);
		tf11.setVisible(true);
		tf11.setEnabled(false);
		tf11.setEditable(true);
		imlbl.add(tf11);
		
		lb12 = new JLabel("Class XII(%)");
		lb12.setBounds(290, 255, 120, 18);
		lb12.setBackground(new Color(0, 0, 0, 0));
		lb12.setForeground(new Color(0, 0, 0));
		lb12.setVisible(true);
		lb12.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb12);
		
		tf12 = new JTextField();
		tf12.setBounds(450, 255, 120, 20);
		tf12.setVisible(true);
		tf12.setEnabled(false);
		tf12.setEditable(true);
		imlbl.add(tf12);
		
		lb13 = new JLabel("Course");
		lb13.setBounds(290, 295, 70, 18);
		lb13.setBackground(new Color(0, 0, 0, 0));
		lb13.setForeground(new Color(0, 0, 0));
		lb13.setVisible(true);
		lb13.setFont(new Font("Serif", Font.ITALIC, 18));
		imlbl.add(lb13);
		
		String options2[] = {"---", "B. Tech", "BCA", "M. Tech", "MCA"};
		cmbx2 = new JComboBox(options2);
		cmbx2.setBackground(Color.WHITE);
		cmbx2.setBounds(450, 295, 120, 20);
		cmbx2.setEnabled(false);
		imlbl.add(cmbx2);
		
		
		btn1 = new JButton("Update");
		btn1.setFont(new Font("Serif", Font.PLAIN, 15));
		btn1.addActionListener(this);
		btn1.setBackground(Color.BLACK);
		btn1.setForeground(Color.WHITE);
		btn1.setBounds(175, 415, 100, 28);
		btn1.setEnabled(false);
		imlbl.add(btn1);
		
		btn2 = new JButton();
		btn2.setText("Cancel");
		btn2.addActionListener(this);
		btn2.setFont(new Font("Serif", Font.PLAIN, 15));
		btn2.setBackground(Color.BLACK);
		btn2.setForeground(Color.WHITE);
		btn2.setBounds(315, 415, 100, 28);
		btn2.setEnabled(true);
		imlbl.add(btn2);
		
		ldlbl = new JLabel("Enter Roll");
		ldlbl.setBounds(130, 370, 170, 20);
		ldlbl.setBackground(new Color(0, 0, 0, 0));
		ldlbl.setForeground(new Color(0, 0, 0));
		ldlbl.setVisible(true);
		ldlbl.setFont(new Font("monospaced", Font.BOLD | Font.ITALIC, 16));
		imlbl.add(ldlbl);
		
		ldtf = new JTextField();
		ldtf.setBounds(250, 370, 70, 20);
		ldtf.setVisible(true);
		ldtf.setEnabled(true);
		ldtf.setEditable(true);
		imlbl.add(ldtf);
		
		loadBtn = new JButton();
		loadBtn.setText("Load");
		loadBtn.addActionListener(this);
		loadBtn.setFont(new Font("Serif", Font.PLAIN, 15));
		loadBtn.setBackground(Color.BLACK);
		loadBtn.setForeground(Color.WHITE);
		loadBtn.setEnabled(true);
		loadBtn.setBounds(350, 370, 100, 20);
		imlbl.add(loadBtn);
		
	}
	
	public void enable(){
		tf1.setEnabled(true);
		tf2.setEnabled(true);
		tf3.setEnabled(true);
		tf4.setEnabled(true);
		tf5.setEnabled(true);
		tf6.setEnabled(true);
		tf8.setEnabled(true);
		tf9.setEnabled(true);
		tf10.setEnabled(true);
		tf11.setEnabled(true);
		tf12.setEnabled(true);
		cmbx1.setEnabled(true);
		cmbx2.setEnabled(true);
		btn1.setEnabled(true);
	}
	
	public void disable(){
		tf1.setEnabled(false);
		tf2.setEnabled(false);
		tf3.setEnabled(false);
		tf4.setEnabled(false);
		tf5.setEnabled(false);
		tf6.setEnabled(false);
		tf8.setEnabled(false);
		tf9.setEnabled(false);
		tf10.setEnabled(false);
		tf11.setEnabled(false);
		tf12.setEnabled(false);
		cmbx1.setEnabled(false);
		cmbx2.setEnabled(false);
		btn1.setEnabled(false);
	}

	public void actionPerformed(ActionEvent e){
		
		try{
			C = ConnectDB.dbConnector();
		}
		catch(Exception EX){ EX.printStackTrace();}
		
		if (e.getSource()==loadBtn){
			enable();
			try{
				rollStr = ldtf.getText();
				String query = "select * from student where roll = '"+rollStr+"'";
				pst1 = C.prepareStatement(query);
				rs = pst1.executeQuery();
				
				if (rs.next()){
					tf1.setText(rs.getString("name"));
					tf2.setText(rs.getString("age"));
					tf3.setText(rs.getString("address"));
					tf4.setText(rs.getString("email"));
					tf5.setText(rs.getString("class_x"));
					tf6.setText(rs.getString("roll"));
					tf8.setText(rs.getString("fathers_name"));
					tf9.setText(rs.getString("dob"));
					tf10.setText(rs.getString("aadhar"));
					tf11.setText(rs.getString("phone"));
					tf12.setText(rs.getString("class_xii"));
				}
				
			}
			catch (SQLException sqle2){ 
				sqle2.printStackTrace(); 
			}
			finally{
				try{
					rs.close();
					pst1.close();
				}catch (SQLException sqle2){ sqle2.printStackTrace(); }
			}
		}
		else if (e.getSource()==btn1){
			f1 = tf1.getText();
			f2 = tf8.getText();
			f3 = tf9.getText();
			f4 = tf2.getText();
			f5 = tf10.getText();
			f6 = tf4.getText();
			f7 = tf5.getText();
			f8 = tf12.getText();
			f9 = tf11.getText();
			f10 = tf6.getText();
			f11 = cmbx2.getSelectedItem().toString();
			f12 = cmbx1.getSelectedItem().toString();
			f13 = tf3.getText();
			
			try{
				String sql="update student set name='"+f1+"', fathers_name='"+f2+"', dob='"+f3+
						   "', age='"+f4+"', aadhar='"+f5+"', email='"+f6+"', class_x='"+f7+
						   "', class_xii='"+f8+"', phone='"+f9+"', roll='"+f10+"', course='"+f11+
						   "', branch='"+f12+"', address='"+f13+"' where roll='"+rollStr+"'";
				pst = C.prepareStatement(sql);
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Entry Updated to Database");
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
				tf8.setText("");
				tf9.setText("");
				tf10.setText("");
				tf11.setText("");
				tf12.setText("");
				cmbx1.setSelectedIndex(0);
				cmbx2.setSelectedIndex(0);
			}
			catch (Exception exc){ exc.printStackTrace();}

			disable();
		}
		else if (e.getSource()==btn2){
			this.setVisible(false);
		}
		
	}
	
	public static void main(String[] args) {
		new StudUpdate().setVisible(true);
	}
}
