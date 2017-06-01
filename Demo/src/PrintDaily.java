import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;





public class PrintDaily implements Printable,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Date nDate=new Date();
	SimpleDateFormat nDtFormat=new SimpleDateFormat("dd.MMM.yyyy");
	SimpleDateFormat monthFormat=new SimpleDateFormat("MMMMMMMMMM");
	SimpleDateFormat dateFormat=new SimpleDateFormat("EEEEEEEEE");
	
	
	
	
	void vectorSetter(Vector<Item> tmp)
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
		//tmp.elementAt(20).name="Chicken Jhal Noon";
		//tmp.elementAt(21).name="Chicken Mash Noon";
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
	
	
	
	
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
			

	      if (pageIndex < 0 || pageIndex >= 1) {
	            return Printable.NO_SUCH_PAGE;
	        }

	        Graphics2D g2d = (Graphics2D) graphics;
	        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

	        if(!(Accounts.totalSelld.getText().equals("0 tk"))){
	        	
	        	Font header = new Font("Segoe Script",Font.BOLD, 22);
		        Font total = new Font("Courier",Font.PLAIN, 10);
		        Font item = new Font("Courier",Font.PLAIN, 10);
		        Font coders = new Font("Verdana",Font.PLAIN, 7);
	        	
		        g2d.setFont(header);
		        g2d.setColor(Color.RED);
		        g2d.drawString("MAAZA" ,43, 15);
		        //g2d.drawLine(10, 20,170,20);
		        g2d.setFont(total);
		        g2d.drawString(nDtFormat.format(new Date()),10, 28);
		        g2d.drawString(dateFormat.format(new Date()),120, 28);
		        g2d.setColor(Color.BLACK);
		       
		        int y=60;
		        int dailyTotal=0;
		        Vector<Item> tmp=new Vector<Item>();
		        vectorSetter(tmp);
		        File folder=new File(monthFormat.format(nDate),nDtFormat.format(nDate));
		        //File fD=new File(fM,nDtFormat.format(nDate));
		        File[]fArr=folder.listFiles();
		        for(int a=0;a<fArr.length;a++){
		        	File f=fArr[a];
		        	try {
		        		FileReader fr=new FileReader(f);
		        		FileInputStream fi=new FileInputStream(f);
		        		ObjectInputStream ois=new ObjectInputStream(fi);
		        		Order o=(Order)ois.readObject();
		        		
		        		
		        		dailyTotal+=o.totalBill;
		        		
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
		        		ois.close();
		        		fi.close();
		        		fr.close();
		        		ois=null;
		        		fi=null;
		        		fr=null;
		        	} catch (FileNotFoundException e) {
		        		// TODO Auto-generated catch block
		        		JOptionPane.showMessageDialog(null,"Printing error !!");
		        	} catch (IOException e) {
		        		// TODO Auto-generated catch block
		        		JOptionPane.showMessageDialog(null,"Printing error !!");
		        	} catch (ClassNotFoundException e) {
		        		// TODO Auto-generated catch block
		        		JOptionPane.showMessageDialog(null,"Printing error !!");
		        	}
		        }
		        g2d.setFont(item);
		        for(int l=0;l<tmp.size();l++)
		        {
		        	if(tmp.elementAt(l).quantity!=0){
		        	g2d.drawString(tmp.elementAt(l).name, 10,y);
		        	
		        	g2d.drawString(tmp.elementAt(l).quantity+"ps",150,y);
		        	y+=13;}
		        }
		        g2d.drawLine(10, (y+13),170,(y+13));
		        g2d.drawString("Daily Total", 25,(y+26));
		        g2d.drawString(dailyTotal+"tk", 110,(y+26));
		        
    	        g2d.setFont(coders);
    	        g2d.drawString("developed by CODERS",90,(y+55));
		        for(int m=0;m<tmp.size();m++)
		        {
		        	tmp.remove(m);
		        }
		        y=35;
		   
		        return Printable.PAGE_EXISTS;
	        }
	        else
	        	JOptionPane.showMessageDialog(null,"Nothing to Print...");
	        return Printable.NO_SUCH_PAGE;
	    }
   
	
	public static void main(String[] args) {
    	   PageFormat format = new PageFormat();
    	   Paper paper = new Paper();

    	  double paperWidth = 3.25;
    	   double paperHeight = 11.69;
    	   double leftMargin = 0.10;
    	   double rightMargin = 0.10;
    	   double topMargin = 0;
    	  double bottomMargin = 0;

    	  paper.setSize(paperWidth * 72.0, paperHeight * 72.0);
    	  paper.setImageableArea(leftMargin * 72.0, topMargin * 72.0,
    	       (paperWidth - leftMargin - rightMargin) * 72.0,
    	        (paperHeight - topMargin - bottomMargin) * 72.0);

    	   format.setPaper(paper);

    	   PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
    	   aset.add(OrientationRequested.PORTRAIT);

    	   PrinterJob printJob = PrinterJob.getPrinterJob();
    	   Printable printable = new PrintDaily();
    	   format = printJob.validatePage(format);
    	   printJob.setPrintable(printable, format);
   
    	   try {
    	      printJob.print(aset);
    	   }
    	   catch (Exception e) {
    	       JOptionPane.showMessageDialog(null,"Printing error !!");
    	   }
    	}

}