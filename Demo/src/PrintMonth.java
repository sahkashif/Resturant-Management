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
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;





public class PrintMonth implements Printable,Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

	      if (pageIndex < 0 || pageIndex >= 1) {
	            return Printable.NO_SUCH_PAGE;
	        }

	        Graphics2D g2d = (Graphics2D) graphics;
	        g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

	        
	        int y=50;
	        int value=0;
	        int dayTotal=0;
	        
	        
	        try {
	        	if(!(Accounts.textFieldM.getText().equals(""))&&!(Accounts.totalSellM.getText().equals("0 tk"))){
	        		Font font = new Font("Segoe Script",Font.BOLD, 22);
	        		Font order = new Font("Courier",Font.PLAIN, 10);
	        		Font coders = new Font("Verdana",Font.PLAIN, 7);
	        		g2d.setFont(font);
	    	        g2d.setColor(Color.RED);
	    	        g2d.drawString("MAAZA" ,43, 15);
	    	        g2d.setFont(order);
	    	        g2d.drawString(Accounts.textFieldM.getText(),10,28);
	    	        g2d.setColor(Color.BLACK);
	    	        File folder=new File(Accounts.textFieldM.getText());
	    	        File[]mArr=folder.listFiles();
	    	        for(int bd=0;bd<mArr.length;bd++)
	    	        {
	    	        	File[]fArr=mArr[bd].listFiles();
	    	        	dayTotal=0;
	    	        	for(int in=0;in<fArr.length;in++)
	    	        	{
	    	        		File f=fArr[in];
	    	        		FileReader fr=new FileReader(f);
	    	        		FileInputStream fi=new FileInputStream(f);
	    	        		ObjectInputStream ois=new ObjectInputStream(fi);
	    	        		Order o=(Order)ois.readObject();
	    	        		dayTotal+=o.totalBill;
	    	        		ois.close();
	    	        		fi.close();
	    	        		fr.close();
	    	        		ois=null;
	    	        		fi=null;
	    	        		fr=null;
	    	        	}
	    	        	g2d.drawString(mArr[bd].getName(),10,y);value+=dayTotal;
	    	        	g2d.drawString(dayTotal+" tk", 120,y);y+=13;
				
	    	        }
	    	        g2d.drawLine(10, (y+13),170,(y+13));
	    	        g2d.drawString("Total", 35,(y+26));
	    	        g2d.drawString(value+"tk", 100,(y+26));
	    	        
	    	        g2d.setFont(coders);
	    	        g2d.drawString("developed by CODERS",90,(y+55));
	    	        return Printable.PAGE_EXISTS;
			
	        	}
	        	else if((Accounts.totalSellM.getText().equals("0 tk")))
	        	{
	        		JOptionPane.showMessageDialog(null, "Nothing to Print...");
	        	}
	        	
				
				} catch (FileNotFoundException e) {
					
					JOptionPane.showMessageDialog(null,"Printing error !!");
				} catch (IOException e) {
					
					JOptionPane.showMessageDialog(null,"Printing error !!");
				} catch (ClassNotFoundException e) {
					
					JOptionPane.showMessageDialog(null,"Printing error !!");
				}
	      
	        
	        	
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

    	   PrinterJob printerJob = PrinterJob.getPrinterJob();
    	   Printable printable = new PrintMonth();
    	   format = printerJob.validatePage(format);
    	   printerJob.setPrintable(printable, format);
    	   try {
    	      printerJob.print(aset);
    	   }
    	   catch (Exception e) {
    	       JOptionPane.showMessageDialog(null,"Printing error !!");
    	   }
    	}

}