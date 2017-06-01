import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.BorderLayout;


public class Demoo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JFrame frame;
	public JLabel backGround;
	public JPasswordField passwordField;
	private JPanel panel;
	private JButton btnOrder;
	private JPanel panel_1;
	static int counter=0;

	public static boolean match(char[] s) 
	{
		
		try {
			File f=new File("source\\pass.ser");
			FileReader fr;
			fr = new FileReader(f);
			FileInputStream fi=new FileInputStream(f);
			ObjectInputStream oi=new ObjectInputStream(fi);
			Password p=new Password();
			p=(Password)oi.readObject();
			fi.close();
			oi.close();
			fr.close();
			
			
			
			if(p.password[0]==s[0]&&p.password[1]==s[1]&&p.password[2]==s[2]&&p.password[3]==s[3])
				{return true;}
			else
			{
				if(f.exists()){
				counter++;}
				if(counter==3)
				{
					f.delete();
					
				}
				return false;
			}
		} catch (FileNotFoundException e) {
			frame.dispose();
			JOptionPane.showMessageDialog(null, "System Crashed !!!\nContact developers...");
		} catch (IOException e) {
			frame.dispose();
			JOptionPane.showMessageDialog(null, "System Crashed !!!\nContact developers...");
		} catch (ClassNotFoundException e) {
			frame.dispose();
			JOptionPane.showMessageDialog(null, "System Crashed !!!\nContact developers...");
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					Demoo window = new Demoo();
					window.frame.setVisible(true);
					window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"System error!!");
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Demoo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, screenWidth, screenHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 102, 153));
		panel.setBounds(95, 393, 489, 194);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setBounds(256, 100, 157, 50);
		btnNewButton.setToolTipText("Click");
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char[] s=new char[4];
				s=passwordField.getPassword();
				boolean result = false;
				
				result = match(s);
				
				if(result==true){
					counter=0;
					frame.dispose();
					MainMenu mainMenuShow=new MainMenu();
					mainMenuShow.frmUserMenu.setVisible(true);
					mainMenuShow.frmUserMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
					
				}
				else
				{
					passwordField.setText("");
					if(counter>=3)
						JOptionPane.showMessageDialog(frame, "System Crashed !!!\nContact developers . . .");		
					else {
							File ft=new File("source//pass.ser");
							if(ft.exists()){
								JOptionPane.showMessageDialog(null,"Wrong!\n"+(3-counter)+" times remaining...");}
							}
					}
					
				}
			});
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(64, 100, 182, 50);
		panel.add(passwordField);
		passwordField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER)
				{
					char[] s=new char[4];
					s=passwordField.getPassword();
					
					
					boolean result = false;
					result = match(s);
					if(result==true){
						
						counter=0;
						frame.dispose();
						MainMenu mainMenuShow=new MainMenu();
						mainMenuShow.frmUserMenu.setVisible(true);
						mainMenuShow.frmUserMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
						
					}
					else
					{
						passwordField.setText("");
						if(counter>=3){
							
							frame.dispose();
							JOptionPane.showMessageDialog(frame, "System Crashed !!!\nContact developers . . .");}
							
						else {
							
							File ft=new File("source//pass.ser");
							if(ft.exists()){
								JOptionPane.showMessageDialog(null,"Wrong!\n"+(3-counter)+" times remaining...");}
					}
				}
					
			}

			}
		});
		passwordField.setToolTipText("Type Here");
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setBackground(Color.WHITE);
		lblEnterPassword.setForeground(new Color(255, 255, 255));
		lblEnterPassword.setBounds(46, 31, 266, 50);
		panel.add(lblEnterPassword);
		lblEnterPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 31));
		
		panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(246, 617, 178, 60);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		btnOrder = new JButton("Order");
		panel_1.add(btnOrder, BorderLayout.CENTER);
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				OrderWindow ow=new OrderWindow();
				ow.frame.setVisible(true);
				ow.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		});
		btnOrder.setToolTipText("Click");
		btnOrder.setForeground(Color.WHITE);
		btnOrder.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		btnOrder.setBackground(new Color(0,102,153));
		
		JLabel lblNewLabel = new JLabel("CODERS");
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(0, 51, 51));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(1280, 709, 70, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDevelopedBy = new JLabel("Developed by");
		lblDevelopedBy.setForeground(new Color(0, 51, 51));
		lblDevelopedBy.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevelopedBy.setBounds(1200, 708, 85, 14);
		frame.getContentPane().add(lblDevelopedBy);
		
		backGround = new JLabel("New label");
		backGround.setIcon(new ImageIcon("source\\loginWindow.jpg"));
		backGround.setFont(new Font("Arabic Typesetting", Font.BOLD, 20));
		backGround.setBounds(0, 0, 1360, 739);
		frame.getContentPane().add(backGround);
	}
}
