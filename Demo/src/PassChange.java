import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.border.MatteBorder;
import java.awt.BorderLayout;
import java.awt.Window.Type;
import javax.swing.border.EtchedBorder;


public class PassChange implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JFrame frame;
	private JTextField Field_2;
	private JTextField Field_3;
	private JPasswordField Field_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassChange window = new PassChange();
					window.frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Database error!!");
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PassChange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel.setBounds(105, 55, 177, 147);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Password");
		lblNewLabel.setForeground(new Color(153, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 55, 155, 37);
		panel.add(lblNewLabel);
		
		JLabel CurrentPassword = new JLabel("Current Password");
		CurrentPassword.setForeground(new Color(153, 0, 0));
		CurrentPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		CurrentPassword.setFont(new Font("Cambria", Font.PLAIN, 14));
		CurrentPassword.setBounds(10, 11, 155, 37);
		panel.add(CurrentPassword);
		
		JLabel lblRetypeNewPassword = new JLabel("Re-type New Password");
		lblRetypeNewPassword.setForeground(new Color(153, 0, 0));
		lblRetypeNewPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRetypeNewPassword.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblRetypeNewPassword.setBounds(10, 97, 155, 37);
		panel.add(lblRetypeNewPassword);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel_1.setBounds(304, 55, 177, 147);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		Field_2 = new JTextField();
		Field_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Field_2.setHorizontalAlignment(SwingConstants.CENTER);
		Field_2.setColumns(10);
		Field_2.setBounds(10, 56, 157, 32);
		panel_1.add(Field_2);
		
		Field_3 = new JTextField();
		Field_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Field_3.setHorizontalAlignment(SwingConstants.CENTER);
		Field_3.setColumns(10);
		Field_3.setBounds(10, 101, 157, 32);
		panel_1.add(Field_3);
		
		Field_1 = new JPasswordField();
		Field_1.setHorizontalAlignment(SwingConstants.CENTER);
		Field_1.setBounds(10, 11, 157, 32);
		panel_1.add(Field_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(211, 234, 166, 45);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Done");
		panel_2.add(btnNewButton, BorderLayout.CENTER);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char[] s=new char[4];
				s=Field_1.getPassword();
				
				
				boolean result = false;
				result = Demoo.match(s);
				if(result==true){
					if(Field_3.getText().equals(Field_2.getText())){
						String p=Field_3.getText();
						char[]newPass=new char[4];
						for(int i=0;i<4;i++)
						{
							newPass[i]=p.charAt(i);
						}
						Password np=new Password();
						np.password=newPass;
						File replace=new File("source\\pass.ser");
						FileWriter fr;
						try {
							fr = new FileWriter(replace);
							FileOutputStream fo=new FileOutputStream(replace);
							ObjectOutputStream oos=new ObjectOutputStream(fo);
							oos.writeObject(np);
				
							
							oos.close();
							fo.close();
							fr.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null,"Database error!!");
						}
						
						Field_1.setText("");
						Field_2.setText("");
						Field_3.setText("");
						JOptionPane.showMessageDialog(null,"Password Successfully Updated!");
						frame.dispose();
						
						
					}
					else
						{JOptionPane.showMessageDialog(frame,"Please re-type correctly!");Field_3.setText("");}
					
					
				}
				else
				{
					
					JOptionPane.showMessageDialog(frame,"Current Password Wrong!");
					Field_1.setText("");
					Field_2.setText("");
					Field_3.setText("");
					}
				
			}
		});
		btnNewButton.setForeground(new Color(102, 0, 0));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Georgia", Font.BOLD, 20));
		
		JLabel label = new JLabel("Developed by");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(153, 0, 0));
		label.setBounds(421, 298, 85, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("CODERS");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(153, 0, 0));
		label_1.setFont(new Font("Candara", Font.BOLD, 15));
		label_1.setBounds(498, 300, 70, 14);
		frame.getContentPane().add(label_1);
		frame.setBounds(100, 100, 584, 352);
		frame.setFocusable(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
