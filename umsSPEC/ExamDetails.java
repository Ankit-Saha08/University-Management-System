package umsSPEC;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Window.Type;
import java.awt.event.*;
import java.sql.*;

public class ExamDetails extends JFrame implements ActionListener{
	
	   private JPanel contentPane;
	   private JTable table;
	   private JTextField search;
	   private JButton b1;
	
	   Connection C;
	   PreparedStatement pst;

	   public ExamDetails() {
			super("SPEC - Examination Details");
			ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon16.png"));
			Image imgicon1 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
			setIconImage(imgicon1);
			setType(Type.NORMAL);
			setResizable(false);	
			setSize(1250, 510);
        	setLocation(50, 100);
        
			contentPane = new JPanel();
	        contentPane.setBackground(new Color(0, 0, 0, 0));
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setBounds(79, 133, 1080, 282);
	        contentPane.add(scrollPane);

	        table = new JTable(50, 13);
	        table.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent arg0) {
	               int row = table.getSelectedRow();
	               search.setText(table.getModel().getValueAt(row, 9).toString());
	            }
	        });
	        table.setBackground(new Color(224, 246, 249));
	        table.setForeground(Color.DARK_GRAY);
	        table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
	        scrollPane.setViewportView(table);

	        b1 = new JButton("Result");
	        b1.addActionListener(this);
	        b1.setBorder(new LineBorder(new Color(255, 20, 147), 2, true));
	        b1.setForeground(new Color(199, 21, 133));
	        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	        b1.setBounds(330, 89, 60, 19);
	        contentPane.add(b1);

	       
	        JLabel l1 = new JLabel("Check Result");
	        l1.setForeground(new Color(107, 142, 35));
	        l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
	        l1.setBounds(500, 10, 400, 35);
	        contentPane.add(l1);

	       
	        search = new JTextField();
	        search.setBackground(new Color(255, 240, 245));
	        search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
	        search.setForeground(new Color(47, 79, 79));
	        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
	        search.setBounds(189, 89, 130, 20);
	        contentPane.add(search);
	        search.setColumns(10);

	        JLabel l3 = new JLabel("Back");
	        l3.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	                setVisible(false);
	            }
	        });
	        l3.setForeground(Color.GRAY);
	        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	        l3.setBounds(97, 89, 72, 19);
	        contentPane.add(l3);

	        JPanel panel = new JPanel();
	        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true), "Book-Details",
	        				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
	        panel.setBounds(40, 54, 1150, 400);
	        contentPane.add(panel);
	        panel.setBackground(new Color(232, 253, 255));
	        
	        Book();
	   
	        getContentPane().setBackground(new Color(224, 246, 249));
	}

	public void actionPerformed(ActionEvent e){
		
		try{
			C  = ConnectDB.dbConnector();
			if (e.getSource()==b1){
				new ViewMarks(search.getText()).setVisible(true);
				this.setVisible(false);
			}
		}
		catch (SQLException sqle1){ sqle1.printStackTrace(); }
		
	}
	
	public void Book(){
		try{
			C = ConnectDB.dbConnector();
			pst = C.prepareStatement("select * from student");
			ResultSet rs = pst.executeQuery();
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			pst.close();
			C.close();
		}
		catch (Exception EXC){EXC.printStackTrace();}
	}
	
	public static void main(String[] args) {
		new ExamDetails().setVisible(true);
	}

}
