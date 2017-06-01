import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.EtchedBorder;


public class MainMenu {

	public JFrame frmUserMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frmUserMenu.setVisible(true);
					window.frmUserMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"System error!!");
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		frmUserMenu = new JFrame();
		frmUserMenu.setTitle("User Menu");
		frmUserMenu.setBounds(100, 100,screenWidth, screenHeight);
		//frame.setSize(1366, 768);
		frmUserMenu.setResizable(false);
		frmUserMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmUserMenu.getContentPane().setLayout(null);
		
		JPanel orderPanel = new JPanel();
		orderPanel.setBounds(997, 539, 184, 96);
		orderPanel.setBackground(new Color(0,0,0,65));
		frmUserMenu.getContentPane().add(orderPanel);
		orderPanel.setLayout(null);
		
		JLabel lblTakeOrder = new JLabel("Take Order");
		lblTakeOrder.setHorizontalAlignment(SwingConstants.CENTER);
		lblTakeOrder.setForeground(Color.WHITE);
		lblTakeOrder.setFont(new Font("Arabic Typesetting", Font.BOLD, 27));
		lblTakeOrder.setBounds(10, 11, 156, 35);
		orderPanel.add(lblTakeOrder);
		
		JButton button_1 = new JButton("Go!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmUserMenu.dispose();
				OrderWindow orderWindow=new OrderWindow();
				orderWindow.frame.setVisible(true);
				orderWindow.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Georgia", Font.BOLD, 18));
		button_1.setBackground(new Color(153, 0, 0));
		button_1.setBounds(32, 50, 120, 35);
		orderPanel.add(button_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(new Color(0,0,0,65));
		panel.setForeground(new Color(240, 255, 240));
		panel.setBounds(176, 114, 1005, 388);
		frmUserMenu.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MAAZA");
		lblNewLabel_1.setForeground(new Color(102, 0, 0));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 99));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(219, 60, 535, 160);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("YOUR TASTE, WE CARE");
		lblNewLabel_3.setForeground(new Color(102, 0, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(280, 188, 412, 32);
		panel.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(1059, 46, 122, 38);
		frmUserMenu.getContentPane().add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("Log Out");
		panel_2.add(btnNewButton_1, BorderLayout.CENTER);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(153, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				frmUserMenu.dispose();
				Demoo LogOut=new Demoo();
				LogOut.frame.setVisible(true);
				LogOut.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		});
		btnNewButton_1.setFont(new Font("Arabic Typesetting", Font.BOLD, 20));
		
		JPanel accountsCheckPanel = new JPanel();
		accountsCheckPanel.setBounds(789, 539, 198, 96);
		accountsCheckPanel.setBackground(new Color(0,0,0,65));
		frmUserMenu.getContentPane().add(accountsCheckPanel);
		accountsCheckPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Check Accounts");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arabic Typesetting", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 11, 141, 35);
		accountsCheckPanel.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Go!");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmUserMenu.dispose();
				Accounts showAcc=new Accounts();
				showAcc.frmAccounts.setVisible(true);
				showAcc.frmAccounts.setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(153, 0, 0));
		btnNewButton_2.setFont(new Font("Georgia", Font.BOLD, 18));
		btnNewButton_2.setBounds(39, 50, 120, 35);
		accountsCheckPanel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(566, 539, 213, 96);
		frmUserMenu.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0,0,0,65));
		
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblChangePassword.setForeground(Color.WHITE);
		lblChangePassword.setFont(new Font("Arabic Typesetting", Font.BOLD, 27));
		lblChangePassword.setBounds(26, 11, 162, 35);
		panel_1.add(lblChangePassword);
		
		JButton button = new JButton("Go!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PassChange ps=new PassChange();
				ps.frame.setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Georgia", Font.BOLD, 18));
		button.setBackground(new Color(153, 0, 0));
		button.setBounds(46, 50, 120, 35);
		panel_1.add(button);
		
		JLabel label = new JLabel("CODERS");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Candara", Font.BOLD, 15));
		label.setBounds(1280, 714, 70, 14);
		frmUserMenu.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Developed by");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setBounds(1203, 714, 85, 14);
		frmUserMenu.getContentPane().add(label_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("source\\UserWindow.jpg"));
		lblNewLabel_2.setFont(new Font("Impact", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(0, 0, 1360, 739);
		frmUserMenu.getContentPane().add(lblNewLabel_2);
	}
}
