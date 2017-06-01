import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class Accounts implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public JFrame frmAccounts;

	public Vector<Item> tmp=new Vector<Item>();
	public static JTextField totalSelld;
	public static JTextField textFieldM;
	public static JTextField totalSellM;
	public StyledDocument doc;
	public StyledDocument doc1;
	public JTextPane printAreaD ;
	public JTextPane printAreaM ;
	
	
	/**
	 * Launch the application.
	 */
	
	void vectorSetter()
	{
		for(int i=0;i<55;i++)
		{
			Item I=new Item();
			tmp.add(I);
		}
		tmp.elementAt(0).name="Parota Normal";
		tmp.elementAt(1).name="Parota Tandoori";
		tmp.elementAt(2).name="Tandoori";
		tmp.elementAt(3).name="Vegetables";
		tmp.elementAt(4).name="Paya";
		tmp.elementAt(5).name="Soup";
		tmp.elementAt(6).name="Khashir Kaliza Vuna";
		tmp.elementAt(7).name="Chicken Jhal";
		tmp.elementAt(8).name="Chicken Mash";
		tmp.elementAt(9).name="Buter Dal";
		tmp.elementAt(10).name="Mug Dal";
		tmp.elementAt(11).name="Vuna Khichuri Beef";
		tmp.elementAt(12).name="Vuna Khichuri Chicken";
		tmp.elementAt(13).name="Tea";
		tmp.elementAt(14).name="Tea Parcel";
		tmp.elementAt(15).name="Mutton Kacchi";
		tmp.elementAt(16).name="Morog Polao";
		tmp.elementAt(17).name="Basmoti Vat";
		tmp.elementAt(18).name="Beef Rejala";
		tmp.elementAt(19).name="Beef Kala Vuna";
		tmp.elementAt(20).name="Mola Chocchori";
		tmp.elementAt(21).name="Mixed Vegetables";
		tmp.elementAt(22).name="Taki Vorta";
		tmp.elementAt(23).name="Tomatto Chatni";
		tmp.elementAt(24).name="Chingri Vorta";
		tmp.elementAt(25).name="Seasonal Shak";
		tmp.elementAt(26).name="Green Salad";
		tmp.elementAt(27).name="Special Parota";
		tmp.elementAt(28).name="Tandoori Parota";
		tmp.elementAt(29).name="Special Nan";
		tmp.elementAt(30).name="Garlic Nan";
		tmp.elementAt(31).name="Chicken Grill";
		tmp.elementAt(32).name="Chicken Grill 1/4";
		tmp.elementAt(33).name="Chicken BBQ";
		tmp.elementAt(34).name="Chicken Boti Normal";
		tmp.elementAt(35).name="Chicken Boti Special";
		tmp.elementAt(36).name="Chicken Tikka";
		tmp.elementAt(37).name="Chicken Chap";
		tmp.elementAt(38).name="Shik Kabab";
		tmp.elementAt(39).name="Beef Chap";
		tmp.elementAt(40).name="Mutton Kabab";
		tmp.elementAt(41).name="Korai Halim";
		tmp.elementAt(42).name="Borhani";
		tmp.elementAt(43).name="Payesh";
		tmp.elementAt(44).name="Beef Roll";
		tmp.elementAt(45).name="Elish Kacchi";
		tmp.elementAt(46).name="Shorshe Elish";
		tmp.elementAt(47).name="Pora Chingri Vorta";
		tmp.elementAt(48).name="Pora Tomatto Vorta";
		tmp.elementAt(49).name="Pora Begun Vorta";
		tmp.elementAt(50).name="Water 1/2 Litre";
		tmp.elementAt(51).name="Water 1.5 Litre";
		tmp.elementAt(52).name="Drinks 1/4 Litre";
		tmp.elementAt(53).name="Drinks 1/2 Litre";
		tmp.elementAt(54).name="Drinks 1 Litre";
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accounts window = new Accounts();
					window.frmAccounts.setVisible(true);
					window.frmAccounts.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"System error!!");
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Accounts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		SimpleAttributeSet attribs = new SimpleAttributeSet();
		StyleConstants.setAlignment(attribs , StyleConstants.ALIGN_LEFT);
		StyleConstants.setFontSize(attribs, 15);

		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		frmAccounts = new JFrame();
		frmAccounts.setTitle("Accounts");
		frmAccounts.setResizable(false);
		frmAccounts.setBounds(100, 100,screenWidth, screenHeight);
		frmAccounts.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAccounts.getContentPane().setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAccounts.dispose();
				MainMenu bkMenu=new MainMenu();
				bkMenu.frmUserMenu.setVisible(true);
				bkMenu.frmUserMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Georgia", Font.PLAIN, 22));
		btnNewButton.setBounds(72, 27, 112, 39);
		frmAccounts.getContentPane().add(btnNewButton);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				frmAccounts.dispose();
				Demoo bkLogin=new Demoo();
				bkLogin.frame.setVisible(true);
				bkLogin.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		});
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setFont(new Font("Georgia", Font.PLAIN, 20));
		btnLogOut.setBackground(Color.DARK_GRAY);
		btnLogOut.setBounds(1219, 28, 112, 39);
		frmAccounts.getContentPane().add(btnLogOut);
		
		JPanel panel = new JPanel();
		panel.setBounds(1040, 97, 291, 495);
		panel.setBackground(new Color(0,0,0,25));
		frmAccounts.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 280, 271, 204);
		panel_1.setBackground(new Color(0,0,0,65));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Accounts");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 24, 251, 50);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Daily");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Date d=new Date();
				SimpleDateFormat df=new SimpleDateFormat("dd.MMM.yyyy");
				SimpleDateFormat mf=new SimpleDateFormat("MMMMMMMMMM");
				vectorSetter();
				try {
				
					File folder=new File(mf.format(d),df.format(d));
					if(folder.exists()){
					FileReader fr;
					File[] fArr=folder.listFiles();
					FileInputStream fi;
					ObjectInputStream ois;
					int totalSell=0;
					for(int i=0;i<fArr.length;i++)
					{
						fr=new FileReader(fArr[i]);
						fi=new FileInputStream(fArr[i]);
						ois=new ObjectInputStream(fi);
						Order o=(Order)ois.readObject();
						
						totalSell+=o.totalBill;
						
						for(int j=0;j<o.items.size();j++)
						{
							for(int k=0;k<tmp.size();k++)
							{
								if(o.items.elementAt(j).name.equals(tmp.elementAt(k).name))
								{
									tmp.elementAt(k).quantity+=o.items.elementAt(j).quantity;
									
								}
							}
							
						}
						o=null;
						ois.close();
						fi.close();
						fr.close();
						fr = null;
						fi = null;
						ois = null;
						
						
						
					}
					for(int m=0;m<tmp.size();m++)
					{
						if(tmp.elementAt(m).quantity!=0){
							
							doc.insertString(doc.getLength(),"	"+tmp.elementAt(m).name+"    --------->    "+tmp.elementAt(m).quantity+"ps\n",null);
							
						}
						
					}
					for(int del=0;del<tmp.size();del++)
					{
						tmp.remove(del);
					}
					String s=totalSell+" tk";
					totalSelld.setText(s);	
					totalSell=0;
					
					}
					else
						JOptionPane.showMessageDialog(null,"No such history...");
						
				
				
				} catch (IOException e) {
					
					JOptionPane.showMessageDialog(null,"Database error!!");
				} catch (ClassNotFoundException e) {
					
					JOptionPane.showMessageDialog(null,"Database error!!");
				} catch (BadLocationException e) {
					
					JOptionPane.showMessageDialog(null,"Database error!!");
				}
			
				
				
			}
		});

		
		btnNewButton_1.setFont(new Font("Georgia", Font.PLAIN, 19));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(10, 96, 122, 43);
		panel_1.add(btnNewButton_1);
		
			JButton btnMonthly = new JButton("Monthly");
			btnMonthly.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					
					if(!(textFieldM.getText().equals(""))){
						
					int monthlyTotal=0;
					File month=new File(textFieldM.getText());
					File[] mArr=month.listFiles();
				
					for(int i=0;i<mArr.length;i++)
					{
						File[] fArr=mArr[i].listFiles();
						String day=mArr[i].getName();
						int dayTotal = 0;
						for(int j=0;j<fArr.length;j++)
						{
							try {
								FileReader fr=new FileReader(fArr[j]);
								FileInputStream fi=new FileInputStream(fArr[j]);
								ObjectInputStream ois=new ObjectInputStream(fi);
								Order temp=(Order) ois.readObject();
								monthlyTotal+=temp.totalBill;
								dayTotal+=temp.totalBill;
								temp=null;
								ois.close();
								fi.close();
								fr.close();
								fr = null;
								fi = null;
								ois = null;
							
							} catch (IOException e) {
								
								JOptionPane.showMessageDialog(null,"Database error!!");
							} catch (ClassNotFoundException e) {
								
								JOptionPane.showMessageDialog(null,"Database error!!");
							}
						}
						try {
							doc1.insertString(doc1.getLength(),"	"+day+"   ----->   "+dayTotal+" tk\n",null);
						} catch (BadLocationException e) {
							JOptionPane.showMessageDialog(null,"Database error!!");
						}
					
					}
						totalSellM.setText(monthlyTotal+" tk");
				
					}
					else
						JOptionPane.showMessageDialog(null,"Enter desired month name first....");
				}
		});
		btnMonthly.setFont(new Font("Georgia", Font.PLAIN, 19));
		btnMonthly.setForeground(Color.WHITE);
		btnMonthly.setBackground(Color.DARK_GRAY);
		btnMonthly.setBounds(142, 96, 119, 43);
		panel_1.add(btnMonthly);
		
		JButton btnClearCheckings = new JButton("Clear Checkings");
		btnClearCheckings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tmp=null;
				printAreaD.setText("");
				printAreaM.setText("");
				totalSelld.setText("0 tk");
				totalSellM.setText("0 tk");
				textFieldM.setText("");
				
			}
		});
		btnClearCheckings.setForeground(Color.WHITE);
		btnClearCheckings.setFont(new Font("Georgia", Font.PLAIN, 19));
		btnClearCheckings.setBackground(Color.DARK_GRAY);
		btnClearCheckings.setBounds(10, 150, 251, 43);
		panel_1.add(btnClearCheckings);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("source\\accntLogo.jpg"));
		label.setBounds(10, 11, 271, 123);
		panel.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("source\\Info.jpg"));
		label_1.setBounds(10, 145, 271, 123);
		panel.add(label_1);
		
		JPanel printPanel = new JPanel();
		printPanel.setBounds(72, 97, 521, 567);
		printPanel.setBackground(new Color(0,0,0,65));
		frmAccounts.getContentPane().add(printPanel);
		printPanel.setLayout(null);

		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 505, 341, 51);
		panel_3.setBackground(new Color (0,0,0,25));
		printPanel.add(panel_3);
		panel_3.setLayout(null);
		
		
		JLabel lblNewLabel_2 = new JLabel("Total Sell");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arabic Typesetting", Font.BOLD, 30));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(3, 18, 134, 28);
		panel_3.add(lblNewLabel_2);
		
		totalSelld = new JTextField();
		totalSelld.setText("0 tk");
		totalSelld.setEditable(false);
		totalSelld.setFont(new Font("Times New Roman", Font.BOLD, 20));
		totalSelld.setHorizontalAlignment(SwingConstants.CENTER);
		totalSelld.setBounds(147, 12, 184, 28);
		panel_3.add(totalSelld);
		totalSelld.setColumns(10);
		
		JLabel lblDailyAccounts = new JLabel("DAILY");
		lblDailyAccounts.setBounds(101, 23, 303, 34);
		lblDailyAccounts.setHorizontalAlignment(SwingConstants.CENTER);
		lblDailyAccounts.setForeground(Color.WHITE);
		lblDailyAccounts.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		printPanel.add(lblDailyAccounts);
		
		JButton dailyPrint = new JButton("Print");
		dailyPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PrintDaily.main(null);
			}
		});
		dailyPrint.setBounds(389, 504, 122, 52);
		dailyPrint.setForeground(Color.WHITE);
		dailyPrint.setFont(new Font("Georgia", Font.BOLD, 30));
		dailyPrint.setBackground(Color.DARK_GRAY);
		printPanel.add(dailyPrint);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 82, 501, 353);
		printPanel.add(scrollPane);
		
		printAreaD= new JTextPane();
		printAreaD.setFont(new Font("Arial", Font.PLAIN, 15));
		printAreaD.setEditable(false);
		printAreaD.setParagraphAttributes(attribs,true);
		doc = (StyledDocument) printAreaD.getDocument();
		scrollPane.setViewportView(printAreaD);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(603, 97, 427, 567);
		panel_2.setBackground(new Color (0,0,0,65));
		frmAccounts.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblMonthly = new JLabel("MONTHLY");
		lblMonthly.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonthly.setForeground(Color.WHITE);
		lblMonthly.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblMonthly.setBounds(109, 11, 217, 34);
		panel_2.add(lblMonthly);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(0, 0, 0, 25));
		panel_6.setBounds(10, 504, 275, 52);
		panel_2.add(panel_6);
		
		JLabel label_2 = new JLabel("Total Sell");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Arabic Typesetting", Font.BOLD, 30));
		label_2.setBounds(10, 11, 119, 30);
		panel_6.add(label_2);
		
		totalSellM = new JTextField();
		totalSellM.setText("0 tk");
		totalSellM.setEditable(false);
		totalSellM.setFont(new Font("Times New Roman", Font.BOLD, 20));
		totalSellM.setHorizontalAlignment(SwingConstants.CENTER);
		totalSellM.setColumns(10);
		totalSellM.setBounds(135, 11, 130, 30);
		panel_6.add(totalSellM);
		
		JLabel lblDays = new JLabel("Days");
		lblDays.setHorizontalAlignment(SwingConstants.CENTER);
		lblDays.setForeground(Color.WHITE);
		lblDays.setFont(new Font("Georgia", Font.BOLD, 20));
		lblDays.setBounds(74, 48, 112, 34);
		panel_2.add(lblDays);
		
		JLabel lblSell = new JLabel("Sell");
		lblSell.setHorizontalAlignment(SwingConstants.CENTER);
		lblSell.setForeground(Color.WHITE);
		lblSell.setFont(new Font("Georgia", Font.BOLD, 20));
		lblSell.setBounds(253, 48, 112, 34);
		panel_2.add(lblSell);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(0, 0, 0, 25));
		panel_8.setBounds(10, 447, 275, 52);
		panel_2.add(panel_8);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setForeground(Color.WHITE);
		lblMonth.setFont(new Font("Arabic Typesetting", Font.BOLD, 30));
		lblMonth.setBounds(10, 11, 119, 30);
		panel_8.add(lblMonth);
		
		textFieldM = new JTextField();
		textFieldM.setText("");
		textFieldM.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textFieldM.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM.setBounds(135, 11, 130, 30);
		panel_8.add(textFieldM);
		textFieldM.setColumns(10);
		
		
		
		JButton button = new JButton("Print");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PrintMonth.main(null);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Georgia", Font.BOLD, 30));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(295, 504, 122, 52);
		panel_2.add(button);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 83, 407, 353);
		panel_2.add(scrollPane_1);
		
		printAreaM= new JTextPane();
		printAreaM.setFont(new Font("Arial", Font.PLAIN, 15));
		printAreaM.setParagraphAttributes(attribs,true);
		doc1 = (StyledDocument) printAreaM.getDocument();
		printAreaM.setEditable(false);
		scrollPane_1.setViewportView(printAreaM);
		
		JButton btnNewButton_2 = new JButton("Order");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAccounts.dispose();
				OrderWindow goOrder=new OrderWindow();
				goOrder.frame.setVisible(true);
				goOrder.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("Georgia", Font.BOLD, 30));
		btnNewButton_2.setBounds(1110, 603, 163, 56);
		frmAccounts.getContentPane().add(btnNewButton_2);
		
		JLabel label_3 = new JLabel("Developed by");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setBounds(1201, 712, 85, 14);
		frmAccounts.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("CODERS");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setFont(new Font("Candara", Font.BOLD, 15));
		label_4.setBounds(1280, 714, 70, 14);
		frmAccounts.getContentPane().add(label_4);
		
		JLabel backGround = new JLabel("New label");
		backGround.setForeground(Color.WHITE);
		backGround.setBackground(Color.DARK_GRAY);
		backGround.setFont(new Font("Tahoma", Font.BOLD, 11));
		backGround.setIcon(new ImageIcon("source\\dailyAccounts.jpg"));
		backGround.setBounds(0, 0, 1360, 739);
		frmAccounts.getContentPane().add(backGround);
	}
}
