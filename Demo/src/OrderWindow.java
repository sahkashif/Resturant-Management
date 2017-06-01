import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JScrollPane;


public class OrderWindow implements Serializable{
	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	Date nDate=new Date();
	SimpleDateFormat nDtFormat=new SimpleDateFormat("dd.MMM.yyyy");
	SimpleDateFormat monthFormat=new SimpleDateFormat("MMMMMMMMMM");
	
	public Vector<Item> tmp=new Vector<Item>();
	
	public JFrame frame;
	public JScrollPane scrollPane;
	public JTextPane printArea;
	public StyledDocument document;
	public int Bill=0;
	public static JTextField billPrint;
	public JLabel lblSpecialItems;
	public JLabel lblAfterMorning;
	public JLabel lblTea;
	private JLabel label;
	private JLabel label_1;
	public JButton printBtn;
	public JButton btnDone;
	
	public JCheckBox ParotaNormal;
	public JCheckBox ParotaTandoori;
	public JCheckBox Tandoori;
	public JCheckBox Vegetables;
	public JCheckBox Paya;
	public JCheckBox Soup;
	public JCheckBox KhasirKalizaVuna;
	public JCheckBox ChickenJhal;
	public JCheckBox Kashif;
	public JCheckBox ButerDal;
	public JCheckBox MugDal;
	public JCheckBox GreenSalad;
	public JCheckBox SeasonalShak;
	public JCheckBox ChingriVorta;
	public JCheckBox TomattoChatni;
	public JCheckBox TakiVorta;
	public JCheckBox MixedVegetables;
	public JCheckBox MolaChocchori;
	public JCheckBox ChickenMashNoon;
	public JCheckBox ChickenJhalNoon;
	public JCheckBox BeefKalaVuna;
	public JCheckBox BeefRejala;
	public JCheckBox BasmotiVat;
	public JCheckBox MorogPolao;
	public JCheckBox MuttonKacchi;
	public JCheckBox PoraBegunVorta;
	public JCheckBox ElishKacchi;
	public JCheckBox ShorsheElish;
	public JCheckBox PoraTomattoVorta;
	public JCheckBox VunaKhichuriBeef;
	public JCheckBox VunaKhichuriChicken;
	public JCheckBox ChickenGrill;
	public JCheckBox ChickenGrillqrtr;
	public JCheckBox bbq;
	public JCheckBox BotiNormal;
	public JCheckBox BotiSpecial;
	public JCheckBox ChickenTikka;
	public JCheckBox ChickenChap;
	public JCheckBox ShikKabab;
	public JCheckBox BeefChap;
	public JCheckBox MuttonKabab;
	public JCheckBox KoraiHalim;
	public JCheckBox Borhani;
	public JCheckBox Payesh;
	public JCheckBox BeefRoll;
	public JCheckBox GarlicNan;
	public JCheckBox SpecialNan;
	public JCheckBox TandooriParota;
	public JCheckBox SpecialParota;
	public JCheckBox TeaParcel;
	public JCheckBox Tea;
	public JCheckBox WaterHalfLitre;
	public JCheckBox WaterDerLitre;
	public JCheckBox DrinksHalfLitre;
	public JCheckBox DrinksQrtrLitre;
	public JCheckBox DrinksFullLitre;
	public JCheckBox PoraChingriVorta; 
	
	public JTextField VunaKhichuriBeefTxt;
	public JTextField VunaKhichuriChickenTxt;
	public JTextField PoraBegunVortaTxt;
	public JTextField PoraTomattoVortaTxt;
	public JTextField ShorsheElishTxt;
	public JTextField ElishKacchiTxt;
	public JTextField GreenSaladTxt;
	public JTextField SeasonalShakTxt;
	public JTextField ChingriVortaTxt;
	public JTextField TomattoChatniTxt;
	public JTextField TakiVortaTxt;
	public JTextField MixedVegetablesTxt;
	public JTextField MolaChocchoriTxt;
	public JTextField ChickenMashNoonTxt;
	public JTextField ChickenJhalNoonTxt;
	public JTextField BeefKalaVunaTxt;
	public JTextField BeefRejalaTxt;
	public JTextField BasmotiVatTxt;
	public JTextField MorogPolaoTxt;
	public JTextField MuttonKacchiTxt;
	public JTextField ChickenGrillTxt;
	public JTextField ChickenGrillqrtrTxt;
	public JTextField bbqTxt;
	public JTextField BotiNormalTxt;
	public JTextField BotiSpecialTxt;
	public JTextField ChickenTikkaTxt;
	public JTextField ChickenChapTxt;
	public JTextField ShikKababTxt;
	public JTextField BeefChapTxt;
	public JTextField MuttonKababTxt;
	public JTextField KoraiHalimTxt;
	public JTextField BorhaniTxt;
	public JTextField PayeshTxt;
	public JTextField BeefRollTxt;
	public JTextField TeaTxt;
	public JTextField TeaParcelTxt;
	public JTextField SpecialParotaTxt;
	public JTextField TandooriParotaTxt;
	public JTextField SpecialNanTxt;
	public JTextField GarlicNanTxt;
	public JTextField MugDalTxt;
	public JTextField ButerDalTxt;
	public JTextField KashifTxt;
	public JTextField ChickenJhalTxt;
	public JTextField KhasirKalizaVunaTxt;
	public JTextField SoupTxt;
	public JTextField PayaTxt;
	public JTextField VegetablesTxt;
	public JTextField TandooriTxt;
	public JTextField ParotaTandooriTxt;
	public JTextField ParotaNormalTxt;
	public JTextField WaterHalfLitreTxt;
	public JTextField WaterDerLitreTxt;
	public JTextField DrinksQrtrLitreTxt;
	public JTextField DrinksHalfLitreTxt;
	public JTextField DrinksFullLitreTxt;
	private JTextField PoraChingriVortaTxt;
	
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderWindow window = new OrderWindow();
					window.frame.setVisible(true);
					window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Database error!!");
				}
			}
		});
	}
	

	
	public void clear()
	{
		for(int i=0;i<tmp.size();i++)
		{
			tmp.remove(i);
		}
		
		
		Bill=0;
		
		billPrint.setText("0 tk");
		printArea.setText("");
		ParotaNormal.setSelected(false);
		ParotaNormalTxt.setText("");
		ParotaTandoori.setSelected(false);
		ParotaTandooriTxt.setText("");
		Tandoori.setSelected(false);
		TandooriTxt.setText("");
		Vegetables.setSelected(false);
		VegetablesTxt.setText("");
		Paya.setSelected(false);
		PayaTxt.setText("");
		Soup.setSelected(false);
		SoupTxt.setText("");
		KhasirKalizaVuna.setSelected(false);
		KhasirKalizaVunaTxt.setText("");
		ChickenJhal.setSelected(false);
		ChickenJhalTxt.setText("");
		Kashif.setSelected(false);
		KashifTxt.setText("");
		ButerDal.setSelected(false);
		ButerDalTxt.setText("");
		MugDal.setSelected(false);
		MugDalTxt.setText("");
		VunaKhichuriBeef.setSelected(false);
		VunaKhichuriBeefTxt.setText("");
		VunaKhichuriChicken.setSelected(false);
		VunaKhichuriChickenTxt.setText("");
		Tea.setSelected(false);
		TeaTxt.setText("");
		TeaParcel.setSelected(false);
		TeaParcelTxt.setText("");
		MuttonKacchi.setSelected(false);
		MuttonKacchiTxt.setText("");
		MorogPolao.setSelected(false);
		MorogPolaoTxt.setText("");
		BasmotiVat.setSelected(false);
		BasmotiVatTxt.setText("");
		BeefRejala.setSelected(false);
		BeefRejalaTxt.setText("");
		BeefKalaVuna.setSelected(false);
		BeefKalaVunaTxt.setText("");
		ChickenJhalNoon.setSelected(false);
		ChickenJhalNoonTxt.setText("");
		ChickenMashNoon.setSelected(false);
		ChickenMashNoonTxt.setText("");
		MolaChocchori.setSelected(false);
		MolaChocchoriTxt.setText("");
		MixedVegetables.setSelected(false);
		MixedVegetablesTxt.setText("");
		TakiVorta.setSelected(false);
		TakiVortaTxt.setText("");
		TomattoChatni.setSelected(false);
		TomattoChatniTxt.setText("");
		ChingriVorta.setSelected(false);
		ChingriVortaTxt.setText("");
		SeasonalShak.setSelected(false);
		SeasonalShakTxt.setText("");
		GreenSalad.setSelected(false);
		GreenSaladTxt.setText("");
		SpecialParota.setSelected(false);
		SpecialParotaTxt.setText("");
		TandooriParota.setSelected(false);
		TandooriParotaTxt.setText("");
		SpecialNan.setSelected(false);
		SpecialNanTxt.setText("");
		GarlicNan.setSelected(false);
		GarlicNanTxt.setText("");
		ChickenGrill.setSelected(false);
		ChickenGrillTxt.setText("");
		ChickenGrillqrtr.setSelected(false);
		ChickenGrillqrtrTxt.setText("");
		bbq.setSelected(false);
		bbqTxt.setText("");
		BotiNormal.setSelected(false);
		BotiNormalTxt.setText("");
		BotiSpecial.setSelected(false);
		BotiSpecialTxt.setText("");
		ChickenTikka.setSelected(false);
		ChickenTikkaTxt.setText("");
		ChickenChap.setSelected(false);
		ChickenChapTxt.setText("");
		ShikKabab.setSelected(false);
		ShikKababTxt.setText("");
		BeefChap.setSelected(false);
		BeefChapTxt.setText("");
		MuttonKabab.setSelected(false);
		MuttonKababTxt.setText("");
		KoraiHalim.setSelected(false);
		KoraiHalimTxt.setText("");
		Borhani.setSelected(false);
		BorhaniTxt.setText("");
		Payesh.setSelected(false);
		PayeshTxt.setText("");
		BeefRoll.setSelected(false);
		BeefRollTxt.setText("");
		ElishKacchi.setSelected(false);
		ElishKacchiTxt.setText("");
		ShorsheElish.setSelected(false);
		ShorsheElishTxt.setText("");
		PoraChingriVorta.setSelected(false);
		PoraChingriVortaTxt.setText("");
		PoraTomattoVorta.setSelected(false);
		PoraTomattoVortaTxt.setText("");
		PoraBegunVorta.setSelected(false);
		PoraBegunVortaTxt.setText("");
		WaterHalfLitre.setSelected(false);
		WaterDerLitre.setSelected(false);
		WaterHalfLitreTxt.setText("");
		WaterDerLitreTxt.setText("");;
		DrinksHalfLitre.setSelected(false);
		DrinksQrtrLitre.setSelected(false);
		DrinksQrtrLitreTxt.setText("");;
		DrinksHalfLitreTxt.setText("");;
		DrinksFullLitre.setSelected(false);
		DrinksFullLitreTxt.setText("");;

		
	}
	
	public void store(Order o) throws IOException
	{
		File store=new File("store");
		if(store.isDirectory()){
			File f=new File(store,"tmp.ser");
			FileWriter fw=new FileWriter(f);
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(o);
			oos.close();
			fos.close();
			fw.close();
		}
		else
		{
			store.mkdir();
			File f=new File(store,"tmp.ser");
			FileWriter fw=new FileWriter(f);
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(o);
			oos.close();
			fos.close();
			fw.close();
		}
		
	}
		
	public OrderWindow() {
		initialize();
	}

	
	public void initialize() {
		
		SimpleAttributeSet attribs = new SimpleAttributeSet();
		StyleConstants.setAlignment(attribs , StyleConstants.ALIGN_CENTER);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		frame = new JFrame();
		frame.setBounds(100, 100, screenWidth, screenHeight);
		frame.setTitle("Order");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton orderBkBtn = new JButton("Back");
		orderBkBtn.setForeground(new Color(255, 255, 255));
		orderBkBtn.setBackground(new Color(0, 102, 51));
		orderBkBtn.setToolTipText("Click to go back");
		orderBkBtn.setFont(new Font("Arabic Typesetting", Font.BOLD, 25));
		
		orderBkBtn.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Demoo bkMenu=new Demoo();
				bkMenu.frame.setVisible(true);
				bkMenu.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(41, 62, 958, 638);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(0,0,0,25));
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(1009, 62, 301, 142);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel maaza_logo = new JLabel("New label");
		maaza_logo.setIcon(new ImageIcon("source\\maazaLogo.jpg"));
		maaza_logo.setBounds(0, 0, 301, 142);
		panel_3.add(maaza_logo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(1009, 215, 301, 365);
		frame.getContentPane().add(panel_2);
		panel_2.setBackground(new Color(0,0,0,65));
		panel_2.setLayout(null);
		
		JLabel lblNoonWhole = new JLabel("Noon & Whole Day");
		lblNoonWhole.setBounds(403, 72, 231, 22);
		frame.getContentPane().add(lblNoonWhole);
		lblNoonWhole.setHorizontalAlignment(SwingConstants.LEFT);
		lblNoonWhole.setForeground(Color.WHITE);
		lblNoonWhole.setFont(new Font("Arabic Typesetting", Font.BOLD, 31));
		orderBkBtn.setBounds(41, 19, 92, 32);
		frame.getContentPane().add(orderBkBtn);
		
		JLabel lblNewLabel = new JLabel("Ordered Items");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arabic Typesetting", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(10, 11, 281, 27);
		panel_2.add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 39, 281, 270);
		panel_2.add(scrollPane);
		
		printArea = new JTextPane();
		scrollPane.setViewportView(printArea);
		printArea.setEditable(false);
		printArea.setParagraphAttributes(attribs,true);
		document = (StyledDocument) printArea.getDocument();
		
		billPrint = new JTextField();
		billPrint.setEditable(false);
		billPrint.setText("0 tk");
		billPrint.setFont(new Font("Calibri", Font.PLAIN, 20));
		billPrint.setHorizontalAlignment(SwingConstants.CENTER);
		billPrint.setBounds(49, 317, 200, 37);
		panel_2.add(billPrint);
		billPrint.setColumns(10);
		
		ShorsheElish = new JCheckBox("Shorshe Elish");
		ShorsheElish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ShorsheElish.isSelected()==false)
				{ShorsheElishTxt.setText("");}
			}
		});
		ShorsheElish.setToolTipText("200 tk");
		ShorsheElish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ShorsheElish.setForeground(Color.BLACK);
		ShorsheElish.setFont(new Font("Arial", Font.PLAIN, 15));
		ShorsheElish.setBackground(Color.WHITE);
		ShorsheElish.setBounds(359, 511, 157, 22);
		panel.add(ShorsheElish);
		
		
		JLabel lblMorningWhole = new JLabel("Morning & Whole Day");
		lblMorningWhole.setBackground(Color.WHITE);
		lblMorningWhole.setHorizontalAlignment(SwingConstants.LEFT);
		lblMorningWhole.setForeground(Color.WHITE);
		lblMorningWhole.setFont(new Font("Arabic Typesetting", Font.BOLD, 30));
		lblMorningWhole.setBounds(66, 355, 247, 33);
		panel.add(lblMorningWhole);
		
		JLabel lblEveningNight = new JLabel("Evening & Night");
		lblEveningNight.setHorizontalAlignment(SwingConstants.CENTER);
		lblEveningNight.setForeground(Color.WHITE);
		lblEveningNight.setFont(new Font("Arabic Typesetting", Font.BOLD, 30));
		lblEveningNight.setBounds(671, 6, 221, 22);
		panel.add(lblEveningNight);
		
		lblSpecialItems = new JLabel("Special Items");
		lblSpecialItems.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpecialItems.setForeground(Color.WHITE);
		lblSpecialItems.setFont(new Font("Arabic Typesetting", Font.BOLD, 32));
		lblSpecialItems.setBounds(359, 445, 183, 33);
		panel.add(lblSpecialItems);
		
		ParotaNormal = new JCheckBox("Parota Normal");
		ParotaNormal.setToolTipText("6 tk");
		ParotaNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ParotaNormal.isSelected()==false)
					{ParotaNormalTxt.setText("");}
			}
		});
		ParotaNormal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ParotaNormal.setForeground(Color.BLACK);
		ParotaNormal.setFont(new Font("Arial", Font.PLAIN, 15));
		ParotaNormal.setBackground(Color.WHITE);
		ParotaNormal.setBounds(66, 35, 161, 22);
		panel.add(ParotaNormal);
		
		ParotaTandoori = new JCheckBox("ParotaTandoori", false);
		ParotaTandoori.setToolTipText("10 tk");
		ParotaTandoori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					if(ParotaTandoori.isSelected()==false)
					{ParotaTandooriTxt.setText("");}
			}
		});
		ParotaTandoori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ParotaTandoori.setForeground(Color.BLACK);
		ParotaTandoori.setFont(new Font("Arial", Font.PLAIN, 15));
		ParotaTandoori.setBackground(Color.WHITE);
		ParotaTandoori.setBounds(66, 61, 161, 22);
		panel.add(ParotaTandoori);
		
		Tandoori = new JCheckBox("Tandoori");
		Tandoori.setToolTipText("8 tk");
		Tandoori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Tandoori.isSelected()==false)
				{TandooriTxt.setText("");}
			}
		});
		Tandoori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		Tandoori.setForeground(Color.BLACK);
		Tandoori.setFont(new Font("Arial", Font.PLAIN, 15));
		Tandoori.setBackground(Color.WHITE);
		Tandoori.setBounds(66, 87, 161, 22);
		panel.add(Tandoori);
		
		Vegetables = new JCheckBox("Vegetables");
		Vegetables.setToolTipText("20 tk");
		Vegetables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Vegetables.isSelected()==false)
				{VegetablesTxt.setText("");}
			}
		});
		Vegetables.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		Vegetables.setForeground(Color.BLACK);
		Vegetables.setFont(new Font("Arial", Font.PLAIN, 15));
		Vegetables.setBackground(Color.WHITE);
		Vegetables.setBounds(66, 113, 161, 22);
		panel.add(Vegetables);
		
		Paya = new JCheckBox("Paya");
		Paya.setToolTipText("60 tk");
		Paya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Paya.isSelected()==false)
				{PayaTxt.setText("");}
			}
		});
		Paya.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		Paya.setForeground(Color.BLACK);
		Paya.setFont(new Font("Arial", Font.PLAIN, 15));
		Paya.setBackground(Color.WHITE);
		Paya.setBounds(66, 139, 161, 22);
		panel.add(Paya);
		
		Soup = new JCheckBox("Soup");
		Soup.setToolTipText("60 tk");
		Soup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Soup.isSelected()==false)
				{SoupTxt.setText("");}
			}
		});
		Soup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		Soup.setForeground(Color.BLACK);
		Soup.setFont(new Font("Arial", Font.PLAIN, 15));
		Soup.setBackground(Color.WHITE);
		Soup.setBounds(66, 165, 161, 22);
		panel.add(Soup);
		
		KhasirKalizaVuna = new JCheckBox("Khasir Kaliza Vuna");
		KhasirKalizaVuna.setToolTipText("80 tk");
		KhasirKalizaVuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(KhasirKalizaVuna.isSelected()==false)
				{KhasirKalizaVunaTxt.setText("");}
			}
		});
		KhasirKalizaVuna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		KhasirKalizaVuna.setForeground(Color.BLACK);
		KhasirKalizaVuna.setFont(new Font("Arial", Font.PLAIN, 15));
		KhasirKalizaVuna.setBackground(Color.WHITE);
		KhasirKalizaVuna.setBounds(66, 191, 161, 22);
		panel.add(KhasirKalizaVuna);
		
		ChickenJhal = new JCheckBox("Chicken Jhal");
		ChickenJhal.setToolTipText("100 tk");
		ChickenJhal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ChickenJhal.isSelected()==false)
				{ChickenJhalTxt.setText("");}
			}
		});
		ChickenJhal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ChickenJhal.setForeground(Color.BLACK);
		ChickenJhal.setFont(new Font("Arial", Font.PLAIN, 15));
		ChickenJhal.setBackground(Color.WHITE);
		ChickenJhal.setBounds(66, 217, 161, 22);
		panel.add(ChickenJhal);
		
		Kashif = new JCheckBox("Chicken Mash");
		Kashif.setToolTipText("150 tk");
		Kashif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Kashif.isSelected()==false)
				{KashifTxt.setText("");}
			}
		});
		Kashif.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		Kashif.setForeground(Color.BLACK);
		Kashif.setFont(new Font("Arial", Font.PLAIN, 15));
		Kashif.setBackground(Color.WHITE);
		Kashif.setBounds(66, 243, 161, 22);
		panel.add(Kashif);
		
		ButerDal = new JCheckBox("Buter Dal");
		ButerDal.setToolTipText("20 tk");
		ButerDal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ButerDal.isSelected()==false)
				{ButerDalTxt.setText("");}
			}
		});
		ButerDal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ButerDal.setForeground(Color.BLACK);
		ButerDal.setFont(new Font("Arial", Font.PLAIN, 15));
		ButerDal.setBackground(Color.WHITE);
		ButerDal.setBounds(66, 269, 161, 22);
		panel.add(ButerDal);
		
		MugDal = new JCheckBox("Mug Dal");
		MugDal.setToolTipText("20 tk");
		MugDal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(MugDal.isSelected()==false)
				{MugDalTxt.setText("");}
			}
		});
		MugDal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		MugDal.setForeground(Color.BLACK);
		MugDal.setFont(new Font("Arial", Font.PLAIN, 15));
		MugDal.setBackground(Color.WHITE);
		MugDal.setBounds(66, 295, 161, 22);
		panel.add(MugDal);
		
		VunaKhichuriBeef = new JCheckBox("Vuna Khichuri (Beaf)");
		VunaKhichuriBeef.setToolTipText("120 tk");
		VunaKhichuriBeef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(VunaKhichuriBeef.isSelected()==false)
				{VunaKhichuriBeefTxt.setText("");}
			}
		});
		VunaKhichuriBeef.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		VunaKhichuriBeef.setForeground(Color.BLACK);
		VunaKhichuriBeef.setFont(new Font("Arial", Font.PLAIN, 15));
		VunaKhichuriBeef.setBackground(Color.WHITE);
		VunaKhichuriBeef.setBounds(65, 392, 183, 22);
		panel.add(VunaKhichuriBeef);
		
		VunaKhichuriChicken = new JCheckBox("Vuna Khichuri (Chicken)");
		VunaKhichuriChicken.setToolTipText("130 tk");
		VunaKhichuriChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(VunaKhichuriChicken.isSelected()==false)
				{VunaKhichuriChickenTxt.setText("");}
			}
		});
		VunaKhichuriChicken.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		VunaKhichuriChicken.setForeground(Color.BLACK);
		VunaKhichuriChicken.setFont(new Font("Arial", Font.PLAIN, 15));
		VunaKhichuriChicken.setBackground(Color.WHITE);
		VunaKhichuriChicken.setBounds(65, 418, 183, 22);
		panel.add(VunaKhichuriChicken);
		
		SpecialParota = new JCheckBox("Special Parota");
		SpecialParota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(SpecialParota.isSelected()==false)
				{SpecialParotaTxt.setText("");}
			}
		});
		SpecialParota.setToolTipText("15 tk");
		SpecialParota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		SpecialParota.setBounds(66, 511, 142, 22);
		panel.add(SpecialParota);
		SpecialParota.setForeground(Color.BLACK);
		SpecialParota.setFont(new Font("Arial", Font.PLAIN, 15));
		SpecialParota.setBackground(Color.WHITE);
		
		TandooriParota = new JCheckBox("Tandoori Parota");
		TandooriParota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(TandooriParota.isSelected()==false)
				{TandooriParotaTxt.setText("");}
			}
		});
		TandooriParota.setToolTipText("20 tk");
		TandooriParota.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		TandooriParota.setBounds(66, 537, 142, 22);
		panel.add(TandooriParota);
		TandooriParota.setForeground(Color.BLACK);
		TandooriParota.setFont(new Font("Arial", Font.PLAIN, 15));
		TandooriParota.setBackground(Color.WHITE);
		
		SpecialNan = new JCheckBox("Special Nan");
		SpecialNan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(SpecialNan.isSelected()==false)
				{SpecialNanTxt.setText("");}
			}
		});
		SpecialNan.setToolTipText("15 tk");
		SpecialNan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		SpecialNan.setBounds(66, 563, 142, 22);
		SpecialNan.setForeground(Color.BLACK);
		SpecialNan.setFont(new Font("Arial", Font.PLAIN, 15));
		SpecialNan.setBackground(Color.WHITE);
		panel.add(SpecialNan);
		
		GarlicNan = new JCheckBox("Garlic Nan");
		GarlicNan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GarlicNan.isSelected()==false)
				{GarlicNanTxt.setText("");}
			}
		});
		GarlicNan.setToolTipText("30 tk");
		GarlicNan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		GarlicNan.setBounds(66, 589, 142, 22);
		GarlicNan.setForeground(Color.BLACK);
		GarlicNan.setFont(new Font("Arial", Font.PLAIN, 15));
		GarlicNan.setBackground(Color.WHITE);
		panel.add(GarlicNan);
		
		MuttonKacchi = new JCheckBox("Mutton Kacchi");
		MuttonKacchi.setToolTipText("120 tk");
		MuttonKacchi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(Tea.isSelected()==false)
						{MuttonKacchiTxt.setText("");}
					}
				});
		MuttonKacchi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		MuttonKacchi.setForeground(Color.BLACK);
		MuttonKacchi.setFont(new Font("Arial", Font.PLAIN, 15));
		MuttonKacchi.setBackground(Color.WHITE);
		MuttonKacchi.setBounds(359, 35, 157, 22);
		panel.add(MuttonKacchi);
		
		MorogPolao = new JCheckBox("Morog Polao");
		MorogPolao.setToolTipText("120 tk");	
		MorogPolao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(MorogPolao.isSelected()==false)
						{MorogPolaoTxt.setText("");}
					}
				});	
		
		MorogPolao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		MorogPolao.setForeground(Color.BLACK);
		MorogPolao.setFont(new Font("Arial", Font.PLAIN, 15));
		MorogPolao.setBackground(Color.WHITE);
		MorogPolao.setBounds(359, 61, 157, 22);
		panel.add(MorogPolao);
		
		BasmotiVat = new JCheckBox("Basmoti Vat");
		BasmotiVat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(BasmotiVat.isSelected()==false)
				{BasmotiVatTxt.setText("");}
			}
		});
		BasmotiVat.setToolTipText("40 tk");
		BasmotiVat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		BasmotiVat.setForeground(Color.BLACK);
		BasmotiVat.setFont(new Font("Arial", Font.PLAIN, 15));
		BasmotiVat.setBackground(Color.WHITE);
		BasmotiVat.setBounds(359, 87, 157, 22);
		panel.add(BasmotiVat);
		
		BeefRejala = new JCheckBox("Beef Rejala");
		BeefRejala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(BeefRejala.isSelected()==false)
				{BeefRejalaTxt.setText("");}
			}
		});
		BeefRejala.setToolTipText("90 tk");
		BeefRejala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		BeefRejala.setForeground(Color.BLACK);
		BeefRejala.setFont(new Font("Arial", Font.PLAIN, 15));
		BeefRejala.setBackground(Color.WHITE);
		BeefRejala.setBounds(359, 113, 157, 22);
		panel.add(BeefRejala);
		
		BeefKalaVuna = new JCheckBox("Beef Kala Vuna");
		BeefKalaVuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(BeefKalaVuna.isSelected()==false)
				{BeefKalaVunaTxt.setText("");}
			}
		});
		BeefKalaVuna.setToolTipText("120 tk");
		BeefKalaVuna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		BeefKalaVuna.setForeground(Color.BLACK);
		BeefKalaVuna.setFont(new Font("Arial", Font.PLAIN, 15));
		BeefKalaVuna.setBackground(Color.WHITE);
		BeefKalaVuna.setBounds(359, 139, 157, 22);
		panel.add(BeefKalaVuna);
		
		GreenSalad = new JCheckBox("Green Salad");
		GreenSalad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GreenSalad.isSelected()==false)
				{GreenSaladTxt.setText("");}
			}
		});
		GreenSalad.setToolTipText("15 tk");
		GreenSalad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		GreenSalad.setForeground(Color.BLACK);
		GreenSalad.setFont(new Font("Arial", Font.PLAIN, 15));
		GreenSalad.setBackground(Color.WHITE);
		GreenSalad.setBounds(359, 373, 157, 22);
		panel.add(GreenSalad);
		
		SeasonalShak = new JCheckBox("Seasonal Shak");
		SeasonalShak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(SeasonalShak.isSelected()==false)
				{SeasonalShakTxt.setText("");}
			}
		});
		SeasonalShak.setToolTipText("25 tk");
		SeasonalShak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		SeasonalShak.setForeground(Color.BLACK);
		SeasonalShak.setFont(new Font("Arial", Font.PLAIN, 15));
		SeasonalShak.setBackground(Color.WHITE);
		SeasonalShak.setBounds(359, 347, 157, 22);
		panel.add(SeasonalShak);
		
		ChingriVorta = new JCheckBox("Chingri Vorta");
		ChingriVorta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ChingriVorta.isSelected()==false)
				{ChingriVortaTxt.setText("");}
			}
		});
		ChingriVorta.setToolTipText("20 tk");
		ChingriVorta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ChingriVorta.setForeground(Color.BLACK);
		ChingriVorta.setFont(new Font("Arial", Font.PLAIN, 15));
		ChingriVorta.setBackground(Color.WHITE);
		ChingriVorta.setBounds(359, 321, 157, 22);
		panel.add(ChingriVorta);
		
		TomattoChatni = new JCheckBox("Tomatto Chatni");
		TomattoChatni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(TomattoChatni.isSelected()==false)
				{TomattoChatniTxt.setText("");}
			}
		});
		TomattoChatni.setToolTipText("30 tk");
		TomattoChatni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		TomattoChatni.setForeground(Color.BLACK);
		TomattoChatni.setFont(new Font("Arial", Font.PLAIN, 15));
		TomattoChatni.setBackground(Color.WHITE);
		TomattoChatni.setBounds(359, 295, 157, 22);
		panel.add(TomattoChatni);
		
		TakiVorta = new JCheckBox("Taki Vorta");
		TakiVorta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(BasmotiVat.isSelected()==false)
				{TakiVortaTxt.setText("");}
			}
		});
		TakiVorta.setToolTipText("20 tk");
		TakiVorta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		TakiVorta.setForeground(Color.BLACK);
		TakiVorta.setFont(new Font("Arial", Font.PLAIN, 15));
		TakiVorta.setBackground(Color.WHITE);
		TakiVorta.setBounds(359, 269, 157, 22);
		panel.add(TakiVorta);
		
		MixedVegetables = new JCheckBox("Mixed Vegetables");
		MixedVegetables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(BasmotiVat.isSelected()==false)
				{MixedVegetablesTxt.setText("");}
			}
		});
		MixedVegetables.setToolTipText("25 tk");
		MixedVegetables.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		MixedVegetables.setForeground(Color.BLACK);
		MixedVegetables.setFont(new Font("Arial", Font.PLAIN, 15));
		MixedVegetables.setBackground(Color.WHITE);
		MixedVegetables.setBounds(359, 243, 157, 22);
		panel.add(MixedVegetables);
		
		MolaChocchori = new JCheckBox("Mola Chocchori");
		MolaChocchori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(MolaChocchori.isSelected()==false)
				{MolaChocchoriTxt.setText("");}
			}
		});
		MolaChocchori.setToolTipText("120 tk");
		MolaChocchori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		MolaChocchori.setForeground(Color.BLACK);
		MolaChocchori.setFont(new Font("Arial", Font.PLAIN, 15));
		MolaChocchori.setBackground(Color.WHITE);
		MolaChocchori.setBounds(359, 217, 157, 22);
		panel.add(MolaChocchori);
		
		ChickenMashNoon = new JCheckBox("Chicken Mash");
		ChickenMashNoon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ChickenMashNoon.isSelected()==false)
				{ChickenMashNoonTxt.setText("");}
			}
		});
		ChickenMashNoon.setToolTipText("150 tk");
		ChickenMashNoon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ChickenMashNoon.setForeground(Color.BLACK);
		ChickenMashNoon.setFont(new Font("Arial", Font.PLAIN, 15));
		ChickenMashNoon.setBackground(Color.WHITE);
		ChickenMashNoon.setBounds(359, 191, 157, 22);
		panel.add(ChickenMashNoon);
		
		ChickenJhalNoon = new JCheckBox("Chicken Jhal");
		ChickenJhalNoon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ChickenJhalNoon.isSelected()==false)
				{ChickenJhalNoonTxt.setText("");}
			}
		});
		ChickenJhalNoon.setToolTipText("100 tk");
		ChickenJhalNoon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ChickenJhalNoon.setForeground(Color.BLACK);
		ChickenJhalNoon.setFont(new Font("Arial", Font.PLAIN, 15));
		ChickenJhalNoon.setBackground(Color.WHITE);
		ChickenJhalNoon.setBounds(359, 165, 157, 22);
		panel.add(ChickenJhalNoon);
		
		
		
		
		
		
		
		
		
		
		
		PoraBegunVorta = new JCheckBox("Pora Begun Vorta");
		PoraBegunVorta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(PoraBegunVorta.isSelected()==false)
				{PoraBegunVortaTxt.setText("");}
			}
		});
		PoraBegunVorta.setToolTipText("40 tk");
		PoraBegunVorta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		PoraBegunVorta.setForeground(Color.BLACK);
		PoraBegunVorta.setFont(new Font("Arial", Font.PLAIN, 15));
		PoraBegunVorta.setBackground(Color.WHITE);
		PoraBegunVorta.setBounds(359, 589, 157, 22);
		panel.add(PoraBegunVorta);
		
		PoraBegunVortaTxt = new JTextField();
		PoraBegunVortaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(PoraBegunVorta.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		PoraBegunVortaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		PoraBegunVortaTxt.setToolTipText("Quantity");
		PoraBegunVortaTxt.setColumns(10);
		PoraBegunVortaTxt.setBackground(Color.WHITE);
		PoraBegunVortaTxt.setBounds(544, 589, 46, 22);
		panel.add(PoraBegunVortaTxt);
		
		PoraTomattoVortaTxt = new JTextField();
		PoraTomattoVortaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(PoraTomattoVorta.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		PoraTomattoVortaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		PoraTomattoVortaTxt.setToolTipText("Quantity");
		PoraTomattoVortaTxt.setColumns(10);
		PoraTomattoVortaTxt.setBackground(Color.WHITE);
		PoraTomattoVortaTxt.setBounds(544, 563, 46, 22);
		panel.add(PoraTomattoVortaTxt);
		
		ShorsheElishTxt = new JTextField();
		ShorsheElishTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ShorsheElish.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ShorsheElishTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ShorsheElishTxt.setToolTipText("Quantity");
		ShorsheElishTxt.setColumns(10);
		ShorsheElishTxt.setBackground(Color.WHITE);
		ShorsheElishTxt.setBounds(544, 511, 46, 22);
		panel.add(ShorsheElishTxt);
		
		ElishKacchiTxt = new JTextField();
		ElishKacchiTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ElishKacchi.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ElishKacchiTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ElishKacchiTxt.setToolTipText("Quantity");
		ElishKacchiTxt.setColumns(10);
		ElishKacchiTxt.setBackground(Color.WHITE);
		ElishKacchiTxt.setBounds(544, 485, 46, 22);
		panel.add(ElishKacchiTxt);
		
		ElishKacchi = new JCheckBox("Elish Kacchi");
		ElishKacchi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ElishKacchi.isSelected()==false)
				{ElishKacchiTxt.setText("");}
			}
		});
		ElishKacchi.setToolTipText("520 tk");
		ElishKacchi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ElishKacchi.setForeground(Color.BLACK);
		ElishKacchi.setFont(new Font("Arial", Font.PLAIN, 15));
		ElishKacchi.setBackground(Color.WHITE);
		ElishKacchi.setBounds(359, 485, 157, 22);
		panel.add(ElishKacchi);
		
		PoraTomattoVorta = new JCheckBox("Pora Tomatto Vorta");
		PoraTomattoVorta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(PoraTomattoVorta.isSelected()==false)
				{PoraTomattoVortaTxt.setText("");}
			}
		});
		PoraTomattoVorta.setToolTipText("40 tk");
		PoraTomattoVorta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		PoraTomattoVorta.setForeground(Color.BLACK);
		PoraTomattoVorta.setFont(new Font("Arial", Font.PLAIN, 15));
		PoraTomattoVorta.setBackground(Color.WHITE);
		PoraTomattoVorta.setBounds(359, 563, 157, 22);
		panel.add(PoraTomattoVorta);
		
		
		
		
		
		
		VunaKhichuriBeefTxt = new JTextField();
		VunaKhichuriBeefTxt.setHorizontalAlignment(SwingConstants.CENTER);
		VunaKhichuriBeefTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(VunaKhichuriBeef.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		VunaKhichuriBeefTxt.setToolTipText("Quantity");
		VunaKhichuriBeefTxt.setColumns(10);
		VunaKhichuriBeefTxt.setBackground(Color.WHITE);
		VunaKhichuriBeefTxt.setBounds(254, 392, 46, 22);
		panel.add(VunaKhichuriBeefTxt);
		
		VunaKhichuriChickenTxt = new JTextField();
		VunaKhichuriChickenTxt.setHorizontalAlignment(SwingConstants.CENTER);
		VunaKhichuriChickenTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(VunaKhichuriChicken.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		VunaKhichuriChickenTxt.setToolTipText("Quantity");
		VunaKhichuriChickenTxt.setColumns(10);
		VunaKhichuriChickenTxt.setBackground(Color.WHITE);
		VunaKhichuriChickenTxt.setBounds(254, 418, 46, 22);
		panel.add(VunaKhichuriChickenTxt);
		
		ChickenGrill = new JCheckBox("Chicken Grill");
		ChickenGrill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ChickenGrill.isSelected()==false)
				{ChickenGrillTxt.setText("");}
			}
		});
		ChickenGrill.setToolTipText("300 tk");
		ChickenGrill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ChickenGrill.setForeground(Color.BLACK);
		ChickenGrill.setFont(new Font("Arial", Font.PLAIN, 15));
		ChickenGrill.setBackground(Color.WHITE);
		ChickenGrill.setBounds(663, 35, 167, 22);
		panel.add(ChickenGrill);
		
		ChickenGrillqrtr = new JCheckBox("Chicken Grill 1/4");
		ChickenGrillqrtr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ChickenGrillqrtr.isSelected()==false)
				{ChickenGrillqrtrTxt.setText("");}
			}
		});
		ChickenGrillqrtr.setToolTipText("80 tk");
		ChickenGrillqrtr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ChickenGrillqrtr.setForeground(Color.BLACK);
		ChickenGrillqrtr.setFont(new Font("Arial", Font.PLAIN, 15));
		ChickenGrillqrtr.setBackground(Color.WHITE);
		ChickenGrillqrtr.setBounds(663, 61, 167, 22);
		panel.add(ChickenGrillqrtr);
		
		bbq = new JCheckBox("Chicken Bar-B-Q");
		bbq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(bbq.isSelected()==false)
				{bbqTxt.setText("");}
			}
		});
		bbq.setToolTipText("100 tk");
		bbq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		bbq.setForeground(Color.BLACK);
		bbq.setFont(new Font("Arial", Font.PLAIN, 15));
		bbq.setBackground(Color.WHITE);
		bbq.setBounds(663, 87, 167, 22);
		panel.add(bbq);
		
		BotiNormal = new JCheckBox("Chicken Boti Normal");
		BotiNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(BotiNormal.isSelected()==false)
				{BotiNormalTxt.setText("");}
			}
		});
		BotiNormal.setToolTipText("100 tk");
		BotiNormal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		BotiNormal.setForeground(Color.BLACK);
		BotiNormal.setFont(new Font("Arial", Font.PLAIN, 15));
		BotiNormal.setBackground(Color.WHITE);
		BotiNormal.setBounds(663, 113, 167, 22);
		panel.add(BotiNormal);
		
		BotiSpecial = new JCheckBox("Chicken Boti Special");
		BotiSpecial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(BotiSpecial.isSelected()==false)
				{BotiSpecialTxt.setText("");}
			}
		});
		BotiSpecial.setToolTipText("120 tk");
		BotiSpecial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		BotiSpecial.setForeground(Color.BLACK);
		BotiSpecial.setFont(new Font("Arial", Font.PLAIN, 15));
		BotiSpecial.setBackground(Color.WHITE);
		BotiSpecial.setBounds(663, 139, 167, 22);
		panel.add(BotiSpecial);
		
		ChickenTikka = new JCheckBox("Chicken Tikka");
		ChickenTikka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ChickenTikka.isSelected()==false)
				{ChickenTikkaTxt.setText("");}
			}
		});
		ChickenTikka.setToolTipText("100 tk");
		ChickenTikka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ChickenTikka.setForeground(Color.BLACK);
		ChickenTikka.setFont(new Font("Arial", Font.PLAIN, 15));
		ChickenTikka.setBackground(Color.WHITE);
		ChickenTikka.setBounds(663, 165, 167, 22);
		panel.add(ChickenTikka);
		
		ChickenChap = new JCheckBox("Chicken Chap");
		ChickenChap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ChickenChap.isSelected()==false)
				{ChickenChapTxt.setText("");}
			}
		});
		ChickenChap.setToolTipText("110 tk");
		ChickenChap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ChickenChap.setForeground(Color.BLACK);
		ChickenChap.setFont(new Font("Arial", Font.PLAIN, 15));
		ChickenChap.setBackground(Color.WHITE);
		ChickenChap.setBounds(663, 191, 167, 22);
		panel.add(ChickenChap);
		
		ShikKabab = new JCheckBox("Shik Kabab");
		ShikKabab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ShikKabab.isSelected()==false)
				{ShikKababTxt.setText("");}
			}
		});
		ShikKabab.setToolTipText("75 tk");
		ShikKabab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		ShikKabab.setForeground(Color.BLACK);
		ShikKabab.setFont(new Font("Arial", Font.PLAIN, 15));
		ShikKabab.setBackground(Color.WHITE);
		ShikKabab.setBounds(663, 217, 167, 22);
		panel.add(ShikKabab);
		
		BeefChap = new JCheckBox("Beef Chap");
		BeefChap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(BeefChap.isSelected()==false)
				{BeefChapTxt.setText("");}
			}
		});
		BeefChap.setToolTipText("90 tk");
		BeefChap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		BeefChap.setForeground(Color.BLACK);
		BeefChap.setFont(new Font("Arial", Font.PLAIN, 15));
		BeefChap.setBackground(Color.WHITE);
		BeefChap.setBounds(663, 243, 167, 22);
		panel.add(BeefChap);
		
		MuttonKabab = new JCheckBox("Mutton Kabab");
		MuttonKabab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(MuttonKabab.isSelected()==false)
				{tmp.elementAt(42).checkedValue=false;MuttonKababTxt.setText("");}
			}
		});
		MuttonKabab.setToolTipText("90 tk");
		MuttonKabab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		MuttonKabab.setForeground(Color.BLACK);
		MuttonKabab.setFont(new Font("Arial", Font.PLAIN, 15));
		MuttonKabab.setBackground(Color.WHITE);
		MuttonKabab.setBounds(663, 269, 167, 22);
		panel.add(MuttonKabab);
		
		KoraiHalim = new JCheckBox("Korai Halim");
		KoraiHalim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(KoraiHalim.isSelected()==false)
				{KoraiHalimTxt.setText("");}
			}
		});
		KoraiHalim.setToolTipText("60 tk");
		KoraiHalim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		KoraiHalim.setForeground(Color.BLACK);
		KoraiHalim.setFont(new Font("Arial", Font.PLAIN, 15));
		KoraiHalim.setBackground(Color.WHITE);
		KoraiHalim.setBounds(663, 295, 167, 22);
		panel.add(KoraiHalim);
		
		Borhani = new JCheckBox("Borhani");
		Borhani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Borhani.isSelected()==false)
				{BorhaniTxt.setText("");}
			}
		});
		Borhani.setToolTipText("30 tk");
		Borhani.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		Borhani.setForeground(Color.BLACK);
		Borhani.setFont(new Font("Arial", Font.PLAIN, 15));
		Borhani.setBackground(Color.WHITE);
		Borhani.setBounds(663, 321, 167, 22);
		panel.add(Borhani);
		
		Payesh = new JCheckBox("Payesh");
		Payesh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Payesh.isSelected()==false)
				{PayeshTxt.setText("");}
			}
		});
		Payesh.setToolTipText("30 tk");
		Payesh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		Payesh.setForeground(Color.BLACK);
		Payesh.setFont(new Font("Arial", Font.PLAIN, 15));
		Payesh.setBackground(Color.WHITE);
		Payesh.setBounds(663, 347, 167, 22);
		panel.add(Payesh);
		
		BeefRoll = new JCheckBox("Beef Roll");
		BeefRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(BeefRoll.isSelected()==false)
				{BeefRollTxt.setText("");}
			}
		});
		BeefRoll.setToolTipText("100 tk");
		BeefRoll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		BeefRoll.setForeground(Color.BLACK);
		BeefRoll.setFont(new Font("Arial", Font.PLAIN, 15));
		BeefRoll.setBackground(Color.WHITE);
		BeefRoll.setBounds(663, 373, 167, 22);
		panel.add(BeefRoll);
		
		GreenSaladTxt = new JTextField();
		GreenSaladTxt.setHorizontalAlignment(SwingConstants.CENTER);
		GreenSaladTxt.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(GreenSalad.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		GreenSaladTxt.setToolTipText("Quantity");
		GreenSaladTxt.setColumns(10);
		GreenSaladTxt.setBackground(Color.WHITE);
		GreenSaladTxt.setBounds(544, 373, 46, 22);
		panel.add(GreenSaladTxt);
		
		SeasonalShakTxt = new JTextField();
		SeasonalShakTxt.setHorizontalAlignment(SwingConstants.CENTER);
		SeasonalShakTxt.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(SeasonalShak.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		SeasonalShakTxt.setToolTipText("Quantity");
		SeasonalShakTxt.setColumns(10);
		SeasonalShakTxt.setBackground(Color.WHITE);
		SeasonalShakTxt.setBounds(544, 347, 46, 22);
		panel.add(SeasonalShakTxt);
		
		ChingriVortaTxt = new JTextField();
		ChingriVortaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ChingriVortaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ChingriVorta.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ChingriVortaTxt.setToolTipText("Quantity");
		ChingriVortaTxt.setColumns(10);
		ChingriVortaTxt.setBackground(Color.WHITE);
		ChingriVortaTxt.setBounds(544, 321, 46, 22);
		panel.add(ChingriVortaTxt);
		
		TomattoChatniTxt = new JTextField();
		TomattoChatniTxt.setHorizontalAlignment(SwingConstants.CENTER);
		TomattoChatniTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(TomattoChatni.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		TomattoChatniTxt.setToolTipText("Quantity");
		TomattoChatniTxt.setColumns(10);
		TomattoChatniTxt.setBackground(Color.WHITE);
		TomattoChatniTxt.setBounds(544, 295, 46, 22);
		panel.add(TomattoChatniTxt);
		
		TakiVortaTxt = new JTextField();
		TakiVortaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		TakiVortaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(TakiVorta.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		TakiVortaTxt.setToolTipText("Quantity");
		TakiVortaTxt.setColumns(10);
		TakiVortaTxt.setBackground(Color.WHITE);
		TakiVortaTxt.setBounds(544, 269, 46, 22);
		panel.add(TakiVortaTxt);
		
		MixedVegetablesTxt = new JTextField();
		MixedVegetablesTxt.setHorizontalAlignment(SwingConstants.CENTER);
		MixedVegetablesTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(MixedVegetables.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		MixedVegetablesTxt.setToolTipText("Quantity");
		MixedVegetablesTxt.setColumns(10);
		MixedVegetablesTxt.setBackground(Color.WHITE);
		MixedVegetablesTxt.setBounds(544, 243, 46, 22);
		panel.add(MixedVegetablesTxt);
		
		MolaChocchoriTxt = new JTextField();
		MolaChocchoriTxt.setHorizontalAlignment(SwingConstants.CENTER);
		MolaChocchoriTxt.setToolTipText("Quantity");
		MolaChocchoriTxt.setColumns(10);
		MolaChocchoriTxt.setBackground(Color.WHITE);
		MolaChocchoriTxt.setBounds(544, 217, 46, 22);
		panel.add(MolaChocchoriTxt);
		
		ChickenMashNoonTxt = new JTextField();
		ChickenMashNoonTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ChickenMashNoonTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ChickenMashNoon.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ChickenMashNoonTxt.setToolTipText("Quantity");
		ChickenMashNoonTxt.setColumns(10);
		ChickenMashNoonTxt.setBackground(Color.WHITE);
		ChickenMashNoonTxt.setBounds(544, 191, 46, 22);
		panel.add(ChickenMashNoonTxt);
		
		ChickenJhalNoonTxt = new JTextField();
		ChickenJhalNoonTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ChickenJhalNoonTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ChickenJhalNoon.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ChickenJhalNoonTxt.setToolTipText("Quantity");
		ChickenJhalNoonTxt.setColumns(10);
		ChickenJhalNoonTxt.setBackground(Color.WHITE);
		ChickenJhalNoonTxt.setBounds(544, 165, 46, 22);
		panel.add(ChickenJhalNoonTxt);
		
		BeefKalaVunaTxt = new JTextField();
		BeefKalaVunaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		BeefKalaVunaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(BeefKalaVuna.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		BeefKalaVunaTxt.setToolTipText("Quantity");
		BeefKalaVunaTxt.setColumns(10);
		BeefKalaVunaTxt.setBackground(Color.WHITE);
		BeefKalaVunaTxt.setBounds(544, 139, 46, 22);
		panel.add(BeefKalaVunaTxt);
		
		BeefRejalaTxt = new JTextField();
		BeefRejalaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		BeefRejalaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(BeefRejala.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		BeefRejalaTxt.setToolTipText("Quantity");
		BeefRejalaTxt.setColumns(10);
		BeefRejalaTxt.setBackground(Color.WHITE);
		BeefRejalaTxt.setBounds(544, 113, 46, 22);
		panel.add(BeefRejalaTxt);
		
		BasmotiVatTxt = new JTextField();
		BasmotiVatTxt.setHorizontalAlignment(SwingConstants.CENTER);
		BasmotiVatTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(BasmotiVat.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		BasmotiVatTxt.setToolTipText("6 tk");
		BasmotiVatTxt.setColumns(10);
		BasmotiVatTxt.setBackground(Color.WHITE);
		BasmotiVatTxt.setBounds(544, 87, 46, 22);
		panel.add(BasmotiVatTxt);
		
		MorogPolaoTxt = new JTextField();
		MorogPolaoTxt.setHorizontalAlignment(SwingConstants.CENTER);
		MorogPolaoTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(MorogPolao.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		MorogPolaoTxt.setToolTipText("Quantity");
		MorogPolaoTxt.setColumns(10);
		MorogPolaoTxt.setBackground(Color.WHITE);
		MorogPolaoTxt.setBounds(544, 61, 46, 22);
		panel.add(MorogPolaoTxt);
		
		MuttonKacchiTxt = new JTextField();
		MuttonKacchiTxt.setHorizontalAlignment(SwingConstants.CENTER);
		MuttonKacchiTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(MuttonKacchi.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		MuttonKacchiTxt.setToolTipText("Quantity");
		MuttonKacchiTxt.setColumns(10);
		MuttonKacchiTxt.setBackground(Color.WHITE);
		MuttonKacchiTxt.setBounds(544, 35, 46, 22);
		panel.add(MuttonKacchiTxt);
		
		ChickenGrillTxt = new JTextField();
		ChickenGrillTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ChickenGrill.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ChickenGrillTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ChickenGrillTxt.setToolTipText("Quantity");
		ChickenGrillTxt.setColumns(10);
		ChickenGrillTxt.setBackground(Color.WHITE);
		ChickenGrillTxt.setBounds(860, 35, 46, 22);
		panel.add(ChickenGrillTxt);
		
		ChickenGrillqrtrTxt = new JTextField();
		ChickenGrillqrtrTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ChickenGrillqrtr.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ChickenGrillqrtrTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ChickenGrillqrtrTxt.setToolTipText("Quantity");
		ChickenGrillqrtrTxt.setColumns(10);
		ChickenGrillqrtrTxt.setBackground(Color.WHITE);
		ChickenGrillqrtrTxt.setBounds(860, 61, 46, 22);
		panel.add(ChickenGrillqrtrTxt);
		
		bbqTxt = new JTextField();
		bbqTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(bbq.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		bbqTxt.setHorizontalAlignment(SwingConstants.CENTER);
		bbqTxt.setToolTipText("6 tk");
		bbqTxt.setColumns(10);
		bbqTxt.setBackground(Color.WHITE);
		bbqTxt.setBounds(860, 87, 46, 22);
		panel.add(bbqTxt);
		
		BotiNormalTxt = new JTextField();
		BotiNormalTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(BotiNormal.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		BotiNormalTxt.setHorizontalAlignment(SwingConstants.CENTER);
		BotiNormalTxt.setToolTipText("Quantity");
		BotiNormalTxt.setColumns(10);
		BotiNormalTxt.setBackground(Color.WHITE);
		BotiNormalTxt.setBounds(860, 113, 46, 22);
		panel.add(BotiNormalTxt);
		
		BotiSpecialTxt = new JTextField();
		BotiSpecialTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(BotiSpecial.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		BotiSpecialTxt.setHorizontalAlignment(SwingConstants.CENTER);
		BotiSpecialTxt.setToolTipText("Quantity");
		BotiSpecialTxt.setColumns(10);
		BotiSpecialTxt.setBackground(Color.WHITE);
		BotiSpecialTxt.setBounds(860, 139, 46, 22);
		panel.add(BotiSpecialTxt);
		
		ChickenTikkaTxt = new JTextField();
		ChickenTikkaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ChickenTikka.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ChickenTikkaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ChickenTikkaTxt.setToolTipText("Quantity");
		ChickenTikkaTxt.setColumns(10);
		ChickenTikkaTxt.setBackground(Color.WHITE);
		ChickenTikkaTxt.setBounds(860, 165, 46, 22);
		panel.add(ChickenTikkaTxt);
		
		ChickenChapTxt = new JTextField();
		ChickenChapTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ChickenChap.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ChickenChapTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ChickenChapTxt.setToolTipText("Quantity");
		ChickenChapTxt.setColumns(10);
		ChickenChapTxt.setBackground(Color.WHITE);
		ChickenChapTxt.setBounds(860, 191, 46, 22);
		panel.add(ChickenChapTxt);
		
		ShikKababTxt = new JTextField();
		ShikKababTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ShikKabab.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ShikKababTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ShikKababTxt.setToolTipText("Quantity");
		ShikKababTxt.setColumns(10);
		ShikKababTxt.setBackground(Color.WHITE);
		ShikKababTxt.setBounds(860, 217, 46, 22);
		panel.add(ShikKababTxt);
		
		BeefChapTxt = new JTextField();
		BeefChapTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(BeefChap.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		BeefChapTxt.setHorizontalAlignment(SwingConstants.CENTER);
		BeefChapTxt.setToolTipText("Quantity");
		BeefChapTxt.setColumns(10);
		BeefChapTxt.setBackground(Color.WHITE);
		BeefChapTxt.setBounds(860, 243, 46, 22);
		panel.add(BeefChapTxt);
		
		MuttonKababTxt = new JTextField();
		MuttonKababTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(MuttonKabab.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		MuttonKababTxt.setHorizontalAlignment(SwingConstants.CENTER);
		MuttonKababTxt.setToolTipText("Quantity");
		MuttonKababTxt.setColumns(10);
		MuttonKababTxt.setBackground(Color.WHITE);
		MuttonKababTxt.setBounds(860, 269, 46, 22);
		panel.add(MuttonKababTxt);
		
		KoraiHalimTxt = new JTextField();
		KoraiHalimTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(KoraiHalim.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		KoraiHalimTxt.setHorizontalAlignment(SwingConstants.CENTER);
		KoraiHalimTxt.setToolTipText("Quantity");
		KoraiHalimTxt.setColumns(10);
		KoraiHalimTxt.setBackground(Color.WHITE);
		KoraiHalimTxt.setBounds(860, 295, 46, 22);
		panel.add(KoraiHalimTxt);
		
		BorhaniTxt = new JTextField();
		BorhaniTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(Borhani.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		BorhaniTxt.setHorizontalAlignment(SwingConstants.CENTER);
		BorhaniTxt.setToolTipText("Quantity");
		BorhaniTxt.setColumns(10);
		BorhaniTxt.setBackground(Color.WHITE);
		BorhaniTxt.setBounds(860, 321, 46, 22);
		panel.add(BorhaniTxt);
		
		PayeshTxt = new JTextField();
		PayeshTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(Payesh.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		PayeshTxt.setHorizontalAlignment(SwingConstants.CENTER);
		PayeshTxt.setToolTipText("Quantity");
		PayeshTxt.setColumns(10);
		PayeshTxt.setBackground(Color.WHITE);
		PayeshTxt.setBounds(860, 347, 46, 22);
		panel.add(PayeshTxt);
		
		BeefRollTxt = new JTextField();
		BeefRollTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(BeefRoll.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		BeefRollTxt.setHorizontalAlignment(SwingConstants.CENTER);
		BeefRollTxt.setToolTipText("Quantity");
		BeefRollTxt.setColumns(10);
		BeefRollTxt.setBackground(Color.WHITE);
		BeefRollTxt.setBounds(860, 373, 46, 22);
		panel.add(BeefRollTxt);
		
		lblTea = new JLabel("Drinks");
		lblTea.setHorizontalAlignment(SwingConstants.CENTER);
		lblTea.setForeground(Color.WHITE);
		lblTea.setFont(new Font("Arabic Typesetting", Font.BOLD, 33));
		lblTea.setBounds(687, 406, 173, 22);
		panel.add(lblTea);
		
		Tea = new JCheckBox("Tea");
		Tea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Tea.isSelected()==false)
				{TeaTxt.setText("");}
			}
		});
		Tea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		Tea.setToolTipText("15 tk");
		Tea.setForeground(Color.BLACK);
		Tea.setFont(new Font("Arial", Font.PLAIN, 15));
		Tea.setBackground(Color.WHITE);
		Tea.setBounds(663, 563, 167, 22);
		panel.add(Tea);
		
		TeaTxt = new JTextField();
		TeaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		TeaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(Tea.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		TeaTxt.setToolTipText("Quantity");
		TeaTxt.setColumns(10);
		TeaTxt.setBackground(Color.WHITE);
		TeaTxt.setBounds(860, 563, 46, 22);
		panel.add(TeaTxt);
		
		TeaParcel = new JCheckBox("Tea (Parcel)");
		TeaParcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(TeaParcel.isSelected()==false)
				{TeaParcelTxt.setText("");}
			}
		});
		TeaParcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		TeaParcel.setToolTipText("20 tk");
		TeaParcel.setForeground(Color.BLACK);
		TeaParcel.setFont(new Font("Arial", Font.PLAIN, 15));
		TeaParcel.setBackground(Color.WHITE);
		TeaParcel.setBounds(663, 589, 167, 22);
		panel.add(TeaParcel);
		
		TeaParcelTxt = new JTextField();
		TeaParcelTxt.setHorizontalAlignment(SwingConstants.CENTER);
		TeaParcelTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(TeaParcel.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		TeaParcelTxt.setToolTipText("Quantity");
		TeaParcelTxt.setColumns(10);
		TeaParcelTxt.setBackground(Color.WHITE);
		TeaParcelTxt.setBounds(860, 589, 46, 22);
		panel.add(TeaParcelTxt);
		
		lblAfterMorning = new JLabel("After Morning & Whole Day");
		lblAfterMorning.setBounds(66, 462, 288, 45);
		panel.add(lblAfterMorning);
		lblAfterMorning.setHorizontalAlignment(SwingConstants.LEFT);
		lblAfterMorning.setForeground(Color.WHITE);
		lblAfterMorning.setFont(new Font("Arabic Typesetting", Font.BOLD, 28));
		
		
		
		
		
		
		
		
		
		SpecialParotaTxt = new JTextField();
		SpecialParotaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		SpecialParotaTxt.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(SpecialParota.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		SpecialParotaTxt.setBounds(256, 511, 46, 22);
		panel.add(SpecialParotaTxt);
		SpecialParotaTxt.setToolTipText("Quantity");
		SpecialParotaTxt.setColumns(10);
		SpecialParotaTxt.setBackground(Color.WHITE);
		
		TandooriParotaTxt = new JTextField();
		TandooriParotaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		TandooriParotaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(TandooriParota.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		TandooriParotaTxt.setBounds(256, 537, 46, 22);
		panel.add(TandooriParotaTxt);
		TandooriParotaTxt.setToolTipText("Quantity");
		TandooriParotaTxt.setColumns(10);
		TandooriParotaTxt.setBackground(Color.WHITE);
		
		SpecialNanTxt = new JTextField();
		SpecialNanTxt.setHorizontalAlignment(SwingConstants.CENTER);
		SpecialNanTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(SpecialNan.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		SpecialNanTxt.setBounds(256, 563, 46, 22);
		panel.add(SpecialNanTxt);
		SpecialNanTxt.setToolTipText("Quantity");
		SpecialNanTxt.setColumns(10);
		SpecialNanTxt.setBackground(Color.WHITE);
		
		GarlicNanTxt = new JTextField();
		GarlicNanTxt.setHorizontalAlignment(SwingConstants.CENTER);
		GarlicNanTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(GarlicNan.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		GarlicNanTxt.setBounds(256, 589, 46, 22);
		panel.add(GarlicNanTxt);
		GarlicNanTxt.setToolTipText("Quantity");
		GarlicNanTxt.setColumns(10);
		GarlicNanTxt.setBackground(Color.WHITE);
		
		MugDalTxt = new JTextField();
		MugDalTxt.setHorizontalAlignment(SwingConstants.CENTER);
		MugDalTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(MugDal.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		MugDalTxt.setToolTipText("Quantity");
		MugDalTxt.setColumns(10);
		MugDalTxt.setBackground(Color.WHITE);
		MugDalTxt.setBounds(254, 295, 46, 22);
		panel.add(MugDalTxt);
		
		ButerDalTxt = new JTextField();
		ButerDalTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ButerDalTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ButerDal.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ButerDalTxt.setToolTipText("Quantity");
		ButerDalTxt.setColumns(10);
		ButerDalTxt.setBackground(Color.WHITE);
		ButerDalTxt.setBounds(254, 269, 46, 22);
		panel.add(ButerDalTxt);
		
		KashifTxt = new JTextField();
		KashifTxt.setHorizontalAlignment(SwingConstants.CENTER);
		KashifTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(Kashif.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		KashifTxt.setToolTipText("Quantity");
		KashifTxt.setColumns(10);
		KashifTxt.setBackground(Color.WHITE);
		KashifTxt.setBounds(254, 243, 46, 22);
		panel.add(KashifTxt);
		
		ChickenJhalTxt = new JTextField();
		ChickenJhalTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ChickenJhalTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ChickenJhal.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ChickenJhalTxt.setToolTipText("Quantity");
		ChickenJhalTxt.setColumns(10);
		ChickenJhalTxt.setBackground(Color.WHITE);
		ChickenJhalTxt.setBounds(254, 217, 46, 22);
		panel.add(ChickenJhalTxt);
		
		KhasirKalizaVunaTxt = new JTextField();
		KhasirKalizaVunaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		KhasirKalizaVunaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(KhasirKalizaVuna.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		KhasirKalizaVunaTxt.setToolTipText("Quantity");
		KhasirKalizaVunaTxt.setColumns(10);
		KhasirKalizaVunaTxt.setBackground(Color.WHITE);
		KhasirKalizaVunaTxt.setBounds(254, 191, 46, 22);
		panel.add(KhasirKalizaVunaTxt);
		
		SoupTxt = new JTextField();
		SoupTxt.setHorizontalAlignment(SwingConstants.CENTER);
		SoupTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(Soup.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		SoupTxt.setToolTipText("6 tk");
		SoupTxt.setColumns(10);
		SoupTxt.setBackground(Color.WHITE);
		SoupTxt.setBounds(254, 165, 46, 22);
		panel.add(SoupTxt);
		
		PayaTxt = new JTextField();
		PayaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		
		PayaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(Paya.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		PayaTxt.setToolTipText("Quantity");
		PayaTxt.setColumns(10);
		PayaTxt.setBackground(Color.WHITE);
		PayaTxt.setBounds(254, 139, 46, 22);
		panel.add(PayaTxt);
		
		VegetablesTxt = new JTextField();
		VegetablesTxt.setHorizontalAlignment(SwingConstants.CENTER);
		VegetablesTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(Vegetables.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		VegetablesTxt.setToolTipText("Quantity");
		VegetablesTxt.setColumns(10);
		VegetablesTxt.setBackground(Color.WHITE);
		VegetablesTxt.setBounds(254, 113, 46, 22);
		panel.add(VegetablesTxt);
		
		TandooriTxt = new JTextField();
		TandooriTxt.setHorizontalAlignment(SwingConstants.CENTER);
		TandooriTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(Tandoori.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		TandooriTxt.setToolTipText("Quantity");
		TandooriTxt.setColumns(10);
		TandooriTxt.setBackground(Color.WHITE);
		TandooriTxt.setBounds(254, 87, 46, 22);
		panel.add(TandooriTxt);
		
		ParotaTandooriTxt = new JTextField();
		ParotaTandooriTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ParotaTandooriTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ParotaTandoori.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ParotaTandooriTxt.setToolTipText("Quantity");
		ParotaTandooriTxt.setColumns(10);
		ParotaTandooriTxt.setBackground(Color.WHITE);
		ParotaTandooriTxt.setBounds(254, 61, 46, 22);
		panel.add(ParotaTandooriTxt);
		
		ParotaNormalTxt = new JTextField();
		ParotaNormalTxt.setHorizontalAlignment(SwingConstants.CENTER);
		ParotaNormalTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(ParotaNormal.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		ParotaNormalTxt.setToolTipText("6 tk");
		ParotaNormalTxt.setColumns(10);
		ParotaNormalTxt.setBackground(Color.WHITE);
		ParotaNormalTxt.setBounds(254, 35, 46, 22);
		panel.add(ParotaNormalTxt);
		
		WaterHalfLitre = new JCheckBox("Water 1/2 Litre");
		WaterHalfLitre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		WaterHalfLitre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(WaterHalfLitre.isSelected()==false)
				{WaterHalfLitreTxt.setText("");}
			}
		});
		WaterHalfLitre.setToolTipText("15 tk");
		WaterHalfLitre.setForeground(Color.BLACK);
		WaterHalfLitre.setFont(new Font("Arial", Font.PLAIN, 15));
		WaterHalfLitre.setBackground(Color.WHITE);
		WaterHalfLitre.setBounds(663, 433, 167, 22);
		panel.add(WaterHalfLitre);
		
		WaterDerLitre = new JCheckBox("Water 1.5 Litre");
		WaterDerLitre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		WaterDerLitre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(WaterDerLitre.isSelected()==false)
				{WaterDerLitreTxt.setText("");}
			}
		});
		WaterDerLitre.setToolTipText("20 tk");
		WaterDerLitre.setForeground(Color.BLACK);
		WaterDerLitre.setFont(new Font("Arial", Font.PLAIN, 15));
		WaterDerLitre.setBackground(Color.WHITE);
		WaterDerLitre.setBounds(663, 459, 167, 22);
		panel.add(WaterDerLitre);
		
		WaterHalfLitreTxt = new JTextField();
		WaterHalfLitreTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(WaterHalfLitre.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		WaterHalfLitreTxt.setToolTipText("Quantity");
		WaterHalfLitreTxt.setHorizontalAlignment(SwingConstants.CENTER);
		WaterHalfLitreTxt.setColumns(10);
		WaterHalfLitreTxt.setBackground(Color.WHITE);
		WaterHalfLitreTxt.setBounds(860, 433, 46, 22);
		panel.add(WaterHalfLitreTxt);
		
		WaterDerLitreTxt = new JTextField();
		WaterDerLitreTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(WaterDerLitre.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		WaterDerLitreTxt.setToolTipText("Quantity");
		WaterDerLitreTxt.setHorizontalAlignment(SwingConstants.CENTER);
		WaterDerLitreTxt.setColumns(10);
		WaterDerLitreTxt.setBackground(Color.WHITE);
		WaterDerLitreTxt.setBounds(860, 459, 46, 22);
		panel.add(WaterDerLitreTxt);
		
		DrinksHalfLitre = new JCheckBox("Drinks 1/2 Litre");
		DrinksHalfLitre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(DrinksHalfLitre.isSelected()==false)
				{DrinksHalfLitreTxt.setText("");}
			}
		});
		DrinksHalfLitre.setToolTipText("35 tk");
		DrinksHalfLitre.setForeground(Color.BLACK);
		DrinksHalfLitre.setFont(new Font("Arial", Font.PLAIN, 15));
		DrinksHalfLitre.setBackground(Color.WHITE);
		DrinksHalfLitre.setBounds(663, 511, 167, 22);
		panel.add(DrinksHalfLitre);
		
		DrinksQrtrLitre = new JCheckBox("Drinks 1/4 Litre");
		DrinksQrtrLitre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		DrinksQrtrLitre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(DrinksQrtrLitre.isSelected()==false)
				{DrinksQrtrLitreTxt.setText("");}
			}
		});
		DrinksQrtrLitre.setToolTipText("20 tk");
		DrinksQrtrLitre.setForeground(Color.BLACK);
		DrinksQrtrLitre.setFont(new Font("Arial", Font.PLAIN, 15));
		DrinksQrtrLitre.setBackground(Color.WHITE);
		DrinksQrtrLitre.setBounds(663, 485, 167, 22);
		panel.add(DrinksQrtrLitre);
		
		DrinksQrtrLitreTxt = new JTextField();
		DrinksQrtrLitreTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(DrinksQrtrLitre.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		DrinksQrtrLitreTxt.setToolTipText("Quantity");
		DrinksQrtrLitreTxt.setHorizontalAlignment(SwingConstants.CENTER);
		DrinksQrtrLitreTxt.setColumns(10);
		DrinksQrtrLitreTxt.setBackground(Color.WHITE);
		DrinksQrtrLitreTxt.setBounds(860, 485, 46, 22);
		panel.add(DrinksQrtrLitreTxt);
		
		DrinksHalfLitreTxt = new JTextField();
		DrinksHalfLitre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		DrinksHalfLitreTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(DrinksHalfLitre.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		DrinksHalfLitreTxt.setToolTipText("Quantity");
		DrinksHalfLitreTxt.setHorizontalAlignment(SwingConstants.CENTER);
		DrinksHalfLitreTxt.setColumns(10);
		DrinksHalfLitreTxt.setBackground(Color.WHITE);
		DrinksHalfLitreTxt.setBounds(860, 511, 46, 22);
		panel.add(DrinksHalfLitreTxt);
		
		DrinksFullLitre = new JCheckBox("Drinks 1 Litre");
		DrinksFullLitre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		DrinksFullLitre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(DrinksFullLitre.isSelected()==false)
				{DrinksFullLitreTxt.setText("");}
			}
		});
		DrinksFullLitre.setToolTipText("65 tk");
		DrinksFullLitre.setForeground(Color.BLACK);
		DrinksFullLitre.setFont(new Font("Arial", Font.PLAIN, 15));
		DrinksFullLitre.setBackground(Color.WHITE);
		DrinksFullLitre.setBounds(663, 537, 167, 22);
		panel.add(DrinksFullLitre);
		
		DrinksFullLitreTxt = new JTextField();
		DrinksFullLitreTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(DrinksFullLitre.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
			}
		});
		DrinksFullLitreTxt.setToolTipText("Quantity");
		DrinksFullLitreTxt.setHorizontalAlignment(SwingConstants.CENTER);
		DrinksFullLitreTxt.setColumns(10);
		DrinksFullLitreTxt.setBackground(Color.WHITE);
		DrinksFullLitreTxt.setBounds(860, 537, 46, 22);
		panel.add(DrinksFullLitreTxt);
		
		JLabel lblNewLabel_1 = new JLabel("Early Morning");
		lblNewLabel_1.setBounds(91, 5, 173, 22);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arabic Typesetting", Font.BOLD, 32));
		
		PoraChingriVorta = new JCheckBox("Pora Chingri Vorta");
		PoraChingriVorta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(PoraChingriVorta.isSelected()==false )
				{PoraChingriVortaTxt.setText("");}
			}
		});
		PoraChingriVorta.setToolTipText("120 tk");
		PoraChingriVorta.setForeground(Color.BLACK);
		PoraChingriVorta.setFont(new Font("Arial", Font.PLAIN, 15));
		PoraChingriVorta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		PoraChingriVorta.setBackground(Color.WHITE);
		PoraChingriVorta.setBounds(359, 537, 157, 22);
		panel.add(PoraChingriVorta);
		
		PoraChingriVortaTxt = new JTextField();
		PoraChingriVortaTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char c=arg0.getKeyChar();
				if(PoraChingriVorta.isSelected()==true)
				{
					if(!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)
					{
						arg0.consume();
					}
				}
				else arg0.consume();
				
			}
		});
		PoraChingriVortaTxt.setToolTipText("Quantity");
		PoraChingriVortaTxt.setHorizontalAlignment(SwingConstants.CENTER);
		PoraChingriVortaTxt.setColumns(10);
		PoraChingriVortaTxt.setBackground(Color.WHITE);
		PoraChingriVortaTxt.setBounds(544, 537, 46, 22);
		panel.add(PoraChingriVortaTxt);
		
		label = new JLabel("CODERS");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(153, 0, 0));
		label.setFont(new Font("Candara", Font.BOLD, 15));
		label.setBounds(1247, 713, 70, 14);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("Developed by");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(153, 0, 0));
		label_1.setBounds(1168, 711, 85, 14);
		frame.getContentPane().add(label_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1009, 215, 301, 485);
		panel_1.setBackground(new Color(0,0,0,65));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
				btnDone= new JButton("Done!");
				btnDone.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent arg0) {
						for(int k=0;k<tmp.size();k++)
						{
							tmp.remove(k);
						}
						if(Bill==0)
						{
						
						if(ParotaNormal.isSelected()==true)
						{
							Item I=new Item("Parota Normal",6,Integer.parseInt(ParotaNormalTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nParota Normal   "+Integer.parseInt(ParotaNormalTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {

								JOptionPane.showMessageDialog(null,"Database error!!");
							} 
							
						}
						if(ParotaTandoori.isSelected()==true)
						{
							Item I=new Item("Parota Tandoori",10,Integer.parseInt(ParotaTandooriTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nParpta Tandoori  "+Integer.parseInt(ParotaTandooriTxt.getText())+"ps --> "+I.totalPrice+"tk"),null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}	}
						if(Tandoori.isSelected()==true)
						{
							Item I=new Item("Tandoori",8,Integer.parseInt(TandooriTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nTandoori  "+Integer.parseInt(TandooriTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}	}
						if(Vegetables.isSelected()==true)
						{
							Item I=new Item("Vegetables",20,Integer.parseInt(VegetablesTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nVegetables  "+Integer.parseInt(VegetablesTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}	}
						if(Paya.isSelected()==true)
						{
							Item I=new Item("Paya",60,Integer.parseInt(PayaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
						try {
							document.insertString(document.getLength(), ("\nPaya  "+Integer.parseInt(PayaTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
						} catch (BadLocationException e) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null,"Database error!!");
						}}
						if(Soup.isSelected()==true)
						{
							Item I=new Item("Soup",60,Integer.parseInt(SoupTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nSoup  "+Integer.parseInt(SoupTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		}
						if(KhasirKalizaVuna.isSelected()==true)
						{
							Item I=new Item("Khashir Kaliza Vuna",80,Integer.parseInt(KhasirKalizaVunaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nKhashir Kaliza Vuna  "+Integer.parseInt(KhasirKalizaVunaTxt.getText())+"ps --> "+I.totalPrice), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}
						}
						if(ChickenJhal.isSelected()==true)
						{
							Item I=new Item("Chicken Jhal",100,Integer.parseInt(ChickenJhalTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nChicken Jhal  "+Integer.parseInt(ChickenJhalTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}			}
						if(Kashif.isSelected()==true)
						{
							Item I=new Item("Chicken Mash",150,Integer.parseInt(KashifTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nChicken Mash  "+Integer.parseInt(KashifTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								
								JOptionPane.showMessageDialog(null,"Database error!!");
							}			}
						if(ButerDal.isSelected()==true)
						{
							Item I=new Item("Buter Dal",20,Integer.parseInt(ButerDalTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nButer Dal  "+Integer.parseInt(ButerDalTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}				}
						if(MugDal.isSelected()==true)
						{
							Item I=new Item("Mug Dal",20,Integer.parseInt(MugDalTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nMug Dal   "+Integer.parseInt(MugDalTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}				}
						if(VunaKhichuriBeef.isSelected()==true)
						{
							Item I=new Item("Vuna Khichuri Beef",120,Integer.parseInt(VunaKhichuriBeefTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nVuna Khichuri (Beef) "+Integer.parseInt(VunaKhichuriBeefTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}				}
						if(VunaKhichuriChicken.isSelected()==true)
						{
							Item I=new Item("Vuna Khichuri Chicken",130,Integer.parseInt(VunaKhichuriChickenTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nVuna Khichuri (Chicken) "+Integer.parseInt(VunaKhichuriChickenTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(Tea.isSelected()==true)
						{
							Item I=new Item("Tea",15,Integer.parseInt(TeaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nTea "+Integer.parseInt(TeaTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(TeaParcel.isSelected()==true)
						{
							Item I=new Item("Tea Parcel",20,Integer.parseInt(TeaParcelTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nTea Parcel "+Integer.parseInt(TeaParcelTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(MuttonKacchi.isSelected()==true)
						{
							Item I=new Item("Mutton Kacchi",120,Integer.parseInt(MuttonKacchiTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nMutton Kacchi "+Integer.parseInt(MuttonKacchiTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(MorogPolao.isSelected()==true)
						{
							Item I=new Item("Morog Polao",120,Integer.parseInt(MorogPolaoTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nMorog Polao "+Integer.parseInt(MorogPolaoTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(BasmotiVat.isSelected()==true)
						{
							Item I=new Item("Basmoti Vat",40,Integer.parseInt(BasmotiVatTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nBasmoti Vat "+Integer.parseInt(BasmotiVatTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(BeefRejala.isSelected()==true)
						{
							Item I=new Item("Beef Rejala",90,Integer.parseInt(BeefRejalaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nBeef Rejala "+Integer.parseInt(BeefRejalaTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(BeefKalaVuna.isSelected()==true)
						{
							Item I=new Item("Beef Kala Vuna",120,Integer.parseInt(BeefKalaVunaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nBeef Kala Vuna "+Integer.parseInt(BeefKalaVunaTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(ChickenJhalNoon.isSelected()==true)
						{
							
							Item I=new Item("Chicken Jhal",100,Integer.parseInt(ChickenJhalNoonTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nChicken Jhal  "+Integer.parseInt(ChickenJhalNoonTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(ChickenMashNoon.isSelected()==true)
						{
							Item I=new Item("Chicken Mash",150,Integer.parseInt(ChickenMashNoonTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nChicken Mash  "+Integer.parseInt(ChickenMashNoonTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(MolaChocchori.isSelected()==true)
						{
							Item I=new Item("Mola Chocchori",80,Integer.parseInt(MolaChocchoriTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nMola Chocchori  "+Integer.parseInt(MolaChocchoriTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(MixedVegetables.isSelected()==true)
						{
							Item I=new Item("Mixed Vegetables",25,Integer.parseInt(MixedVegetablesTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nMixed Vegetables  "+Integer.parseInt(MixedVegetablesTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(TakiVorta.isSelected()==true)
						{
							Item I=new Item("Taki Vorta",20,Integer.parseInt(TakiVortaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nTaki Vorta  "+Integer.parseInt(TakiVortaTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(TomattoChatni.isSelected()==true)
						{
							Item I=new Item("Tomatto Chatni",30,Integer.parseInt(TomattoChatniTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nTomatto Chatni  "+Integer.parseInt(TomattoChatniTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(ChingriVorta.isSelected()==true)
						{
							Item I=new Item("Chingri Vorta",20,Integer.parseInt(ChingriVortaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nChingri Vorta  "+Integer.parseInt(ChingriVortaTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(SeasonalShak.isSelected()==true)
						{
							Item I=new Item("Seasonal Shak",25,Integer.parseInt(SeasonalShakTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nSeasonal Shak  "+Integer.parseInt(SeasonalShakTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(GreenSalad.isSelected()==true)
						{
							Item I=new Item("Green Salad",15,Integer.parseInt(GreenSaladTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nGreen Salad  "+Integer.parseInt(GreenSaladTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(SpecialParota.isSelected()==true)
						{
							Item I=new Item("Special Parota",15,Integer.parseInt(SpecialParotaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nSpecial Parota  "+Integer.parseInt(SpecialParotaTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(TandooriParota.isSelected()==true)
						{
							Item I=new Item("Tandoori Parota",20,Integer.parseInt(TandooriParotaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nTandoori Parota  "+Integer.parseInt(TandooriParotaTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(SpecialNan.isSelected()==true)
						{
							Item I=new Item("Special Nan",15,Integer.parseInt(SpecialNanTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nSpecial Nan  "+Integer.parseInt(SpecialNanTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(GarlicNan.isSelected()==true)
						{
							Item I=new Item("Garlic Nan",30,Integer.parseInt(GarlicNanTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nGarlic Nan  "+Integer.parseInt(GarlicNanTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(ChickenGrill.isSelected()==true)
						{
							Item I=new Item("Chicken Grill",300,Integer.parseInt(ChickenGrillTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nChicken Grill  "+Integer.parseInt(ChickenGrillTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						
						//bismillah
						
						if(ChickenGrillqrtr.isSelected()==true)
						{
							Item I=new Item("Chicken Grill 1/4",80,Integer.parseInt(ChickenGrillqrtrTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nChicken Grill 1/4   "+Integer.parseInt(ChickenGrillqrtrTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(bbq.isSelected()==true)
						{
							Item I=new Item("Chicken BBQ",100,Integer.parseInt(bbqTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nChicken BBQ  "+Integer.parseInt(bbqTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(BotiNormal.isSelected()==true)
						{
							Item I=new Item("Chicken Boti Normal",100,Integer.parseInt(BotiNormalTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							
							try {
								document.insertString(document.getLength(), ("\nChicken Boti Normal   "+Integer.parseInt(BotiNormalTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(BotiSpecial.isSelected()==true)
						{
							Item I=new Item("Chicken Boti Special",120,Integer.parseInt(BotiSpecialTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							
							try {
								document.insertString(document.getLength(), ("\nChicken Boti Special   "+Integer.parseInt(BotiSpecialTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(ChickenTikka.isSelected()==true)
						{
							Item I=new Item("Chicken Tikka",100,Integer.parseInt(ChickenTikkaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nChicken Tikka  "+Integer.parseInt(ChickenTikkaTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(ChickenChap.isSelected()==true)
						{
							Item I=new Item("Chicken Chap",110,Integer.parseInt(ChickenChapTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nChicken Chap  "+Integer.parseInt(ChickenChapTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(ShikKabab.isSelected()==true)
						{
							Item I=new Item("Shik Kabab",75,Integer.parseInt(ShikKababTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nShik Kabab  "+Integer.parseInt(ShikKababTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(BeefChap.isSelected()==true)
						{
							Item I=new Item("Beef Chap",90,Integer.parseInt(BeefChapTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nBeef Chap  "+Integer.parseInt(BeefChapTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(MuttonKabab.isSelected()==true)
						{
							Item I=new Item("Mutton Kabab",90,Integer.parseInt(MuttonKababTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nMutton Kabab   "+Integer.parseInt(MuttonKababTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(KoraiHalim.isSelected()==true)
						{
							Item I=new Item("Korai Halim",60,Integer.parseInt(KoraiHalimTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nKorai Halim   "+Integer.parseInt(KoraiHalimTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(Borhani.isSelected()==true)
						{
							Item I=new Item("Borhani",30,Integer.parseInt(BorhaniTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nBorhani   "+Integer.parseInt(BorhaniTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(Payesh.isSelected()==true)
						{
							Item I=new Item("Payesh",30,Integer.parseInt(PayeshTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nPayesh   "+Integer.parseInt(PayeshTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(BeefRoll.isSelected()==true)
						{
							Item I=new Item("Beef Roll",100,Integer.parseInt(BeefRollTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nBeef Roll   "+Integer.parseInt(BeefRollTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(ElishKacchi.isSelected()==true)
						{
							Item I=new Item("Elish Kacchi",520,Integer.parseInt(ElishKacchiTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nElish Kacchi   "+Integer.parseInt(ElishKacchiTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(ShorsheElish.isSelected()==true)
						{
							Item I=new Item("Shorshe Elish",180,Integer.parseInt(ShorsheElishTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nShorshe Elish   "+Integer.parseInt(ShorsheElishTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(PoraChingriVorta.isSelected()==true)
						{
							Item I=new Item("Pora Chingri Vorta",120,Integer.parseInt(PoraChingriVortaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nPora Chingri Vorta   "+Integer.parseInt(PoraChingriVortaTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(PoraTomattoVorta.isSelected()==true)
						{
							Item I=new Item("Pora Tomatto Vorta",40,Integer.parseInt(PoraTomattoVortaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nPora Tomatto Vorta   "+Integer.parseInt(PoraTomattoVortaTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(PoraBegunVorta.isSelected()==true)
						{
							Item I=new Item("Pora Begun Vorta",40,Integer.parseInt(PoraBegunVortaTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nPora Begun Vorta   "+Integer.parseInt(PoraBegunVortaTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(WaterHalfLitre.isSelected()==true)
						{
							Item I=new Item("Water 1/2 Litre",15,Integer.parseInt(WaterHalfLitreTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nWater 1/2 Litre   "+Integer.parseInt(WaterHalfLitreTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(WaterDerLitre.isSelected()==true)
						{
							Item I=new Item("Water 1.5 Litre",25,Integer.parseInt(WaterDerLitreTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nWater 1.5 Litre   "+Integer.parseInt(WaterDerLitreTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(DrinksQrtrLitre.isSelected()==true)
						{
							Item I=new Item("Drinks 1/4 Litre",20,Integer.parseInt(DrinksQrtrLitreTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nDrinks 1/4 Litre   "+Integer.parseInt(DrinksQrtrLitreTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(DrinksHalfLitre.isSelected()==true)
						{
							Item I=new Item("Drinks 1/2 Litre",35,Integer.parseInt(DrinksHalfLitreTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nDrinks 1/2 Litre   "+Integer.parseInt(DrinksHalfLitreTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						if(DrinksFullLitre.isSelected()==true)
						{
							Item I=new Item("Drinks 1 Litre",65,Integer.parseInt(DrinksFullLitreTxt.getText()),true);
							tmp.add(I);
							Bill+=I.totalPrice;
							try {
								document.insertString(document.getLength(), ("\nDrinks 1 Litre   "+Integer.parseInt(DrinksFullLitreTxt.getText())+"ps --> "+I.totalPrice+" tk"), null);
							} catch (BadLocationException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,"Database error!!");
							}		
						}
						billPrint.setText(Bill+" tk");}
					}

				});
				
				btnDone.setFont(new Font("Arabic Typesetting", Font.PLAIN, 25));
				btnDone.setBackground(new Color(60, 179, 113));
				btnDone.setForeground(new Color(255, 255, 255));
				btnDone.setBounds(51, 376, 96, 37);
				panel_1.add(btnDone);
				
				JButton btnCancel = new JButton("Cancel");
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						Bill=0;
						clear();
					}
				});
				btnCancel.setForeground(Color.WHITE);
				btnCancel.setFont(new Font("Arabic Typesetting", Font.PLAIN, 25));
				btnCancel.setBackground(new Color(165, 42, 42));
				btnCancel.setBounds(155, 376, 96, 37);
				panel_1.add(btnCancel);
				
				
				
				printBtn = new JButton("Print");
				printBtn.addActionListener (new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						Order crntOrder=new Order();
						crntOrder.orderDate=new Date();
						crntOrder.items=tmp;
						
						crntOrder.totalBill=Bill;
						try {
							File month=new File(monthFormat.format(nDate));
							if(month.isDirectory()){
							File dir=new File(month,nDtFormat.format(nDate));
							if(dir.isDirectory())
							{
								store(crntOrder);
								File[]fArr=dir.listFiles();
								crntOrder.orderNo=fArr.length+1;
								File f=new File(dir,nDtFormat.format(nDate)+" -- "+crntOrder.orderNo+".ser");
								FileWriter fw=new FileWriter(f);
								FileOutputStream fo=new FileOutputStream(f);
								ObjectOutputStream oos=new ObjectOutputStream(fo);
								oos.writeObject(crntOrder);
								oos.close();
								fo.close();
								fw.close();
								oos=null;
								fo=null;
								fw=null;
							}
							else
							{
								store(crntOrder);
								dir.mkdir();
								crntOrder.orderNo=1;
								File f=new File(dir,nDtFormat.format(nDate)+" -- "+crntOrder.orderNo+".ser");
								FileWriter fw=new FileWriter(f);
								FileOutputStream fo=new FileOutputStream(f);
								ObjectOutputStream oos=new ObjectOutputStream(fo);
								oos.writeObject(crntOrder);
								oos.close();
								fo.close();
								fw.close();
								oos=null;
								fo=null;
								fw=null;
							}}
							else
							{
								store(crntOrder);
								month.mkdir();
								File dir=new File(month,nDtFormat.format(nDate));
								dir.mkdir();
								crntOrder.orderNo=1;
								File f=new File(dir,nDtFormat.format(nDate)+" -- "+crntOrder.orderNo+".ser");
								FileWriter fw=new FileWriter(f);
								FileOutputStream fo=new FileOutputStream(f);
								ObjectOutputStream oos=new ObjectOutputStream(fo);
								oos.writeObject(crntOrder);
								oos.close();
								fo.close();
								fw.close();
								oos=null;
								fo=null;
								fw=null;
							}
						} catch (IOException e) {
							
							JOptionPane.showMessageDialog(null,"Database error!!");
						}
						
						PrintDemo.main(null);
				    	   
				    	
				    	Bill=0;
						clear();
					
					}
				});
				printBtn.setFont(new Font("Arabic Typesetting", Font.PLAIN, 25));
				printBtn.setForeground(new Color(255, 255, 255));
				printBtn.setBackground(new Color(25, 25, 112));
				printBtn.setBounds(51, 424, 200, 37);
				panel_1.add(printBtn);
				
				JLabel BackgroundLabel = new JLabel("New label");
				BackgroundLabel.setIcon(new ImageIcon("source\\orderWindow.jpg"));
				BackgroundLabel.setBounds(0, 0, 1360, 739);
				BackgroundLabel.setBackground(Color.WHITE);
				frame.getContentPane().add(BackgroundLabel);
		
		
	}
}
