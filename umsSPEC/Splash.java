package umsSPEC;

import java.awt.*;
import java.awt.Window.Type;

import javax.swing.*;

public class Splash extends JFrame implements Runnable{

	Thread t1;
	
	public Splash(String s) {
		setTitle(s);
		ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.png"));
		Image imgicon1 = icon1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		setIconImage(imgicon1);
		setType(Type.NORMAL);
		setResizable(false);
		setLayout(new FlowLayout());
		
		ImageIcon imgic = new ImageIcon(ClassLoader.getSystemResource("icons/SPA.jpg"));
		Image img = imgic.getImage().getScaledInstance(1050, 570, Image.SCALE_SMOOTH);
		ImageIcon icn2 = new ImageIcon(img);
		JLabel lbl = new JLabel(icn2);
		this.add(lbl);
		
		ImageIcon imgic1 = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.png"));
		Image img1 = imgic1.getImage().getScaledInstance(150, 160, Image.SCALE_DEFAULT);
		ImageIcon imicn2 = new ImageIcon(img1);
		JLabel lblimg = new JLabel(imicn2);
		lblimg.setBounds(28, 10, 150, 150);
		lbl.add(lblimg);
		
		JTextArea lb2 = new JTextArea("ST. PAUL'S ENGINEERING COLLEGE");
		lb2.setEditable(false);
		lb2.setForeground(new Color(118, 30, 30));
		lb2.setBackground(new Color(0, 0, 0, 0));
		lb2.setAlignmentX(CENTER_ALIGNMENT);
		lb2.setBounds(235, 65, 1050, 35);
		lb2.setFont(new Font("Lucida Sans", Font.BOLD, 35));
		lb2.setVisible(true);
		lbl.add(lb2);
		
		JTextArea lb2a = new JTextArea("Redirecting to Login...");
		lb2a.setEditable(false);
		lb2a.setForeground(new Color(92, 29, 29));
		lb2a.setAlignmentX(CENTER_ALIGNMENT);
		lb2a.setBounds(380, 280, 250, 30);
		lb2a.setFont(new Font("Comic Sans", Font.BOLD, 23));
		lb2a.setVisible(true);
		lbl.add(lb2a);
		
		t1 = new Thread(this);
		t1.start();
	}
	
	public void run(){
		try{
			Thread.sleep(6000);
			this.setVisible(true);
			new Login().setVisible(true);
			this.setVisible(false);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Splash f = new Splash("SPEC");
		f.setVisible(true);
		int i, x;
		for (i=2, x=1;i<=600;i+=4,x+=1){
			f.setLocation((550-((i+x)/2)), 320-(i/2));
			f.setSize(i+3*x, i+x/2);
			
			try{
				Thread.sleep(10);
			}
			catch (Exception e){}
		}
	}

}
